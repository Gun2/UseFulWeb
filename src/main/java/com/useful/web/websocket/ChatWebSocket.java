package com.useful.web.websocket;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;

import com.useful.web.HomeController;
import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.service.MsgService;
import com.useful.web.service.impl.MsgServiceImpl;

@Controller
@ServerEndpoint(value="/ws/chat.do")
public class ChatWebSocket {
	 private static final List<Session> sessionList = new ArrayList<Session>();
	 private static final Logger logger = LoggerFactory.getLogger(ChatWebSocket.class);
	 
	 public static MsgService msgService;
	 
	 @Autowired
	 public void setMsgService(MsgService msgService) {
		 ChatWebSocket.msgService = msgService;
	 }

	 
    @OnOpen
    public void onOpen(Session session) {
        logger.info("Open session id:"+session.getId());
        try {
            final Basic basic = session.getBasicRemote();
            JSONObject jo = new JSONObject();
            jo.put("type", "init");
            jo.put("data", "success");
            basic.sendText(jo.toString());
        }catch (Exception e) {
            // TODO: handle exception
        	e.printStackTrace();
        }
        sessionList.add(session);
    }
    
    /*
     * @param self
     * @param sender
     * @param message
     */
    private void sendAllSessionToMessage(Session self, JSONObject object) {
    	
        try {
            for(Session session : ChatWebSocket.sessionList) {
                if(!self.getId().equals(session.getId())) {
                    session.getBasicRemote().sendText(object.toString());
                }
            }
        }catch (Exception e) {
            // TODO: handle exception
        	e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }
    
    /*
     * @param message
     * @param session
     */
    @OnMessage
    public void onMessage(String message,Session session) {
    	
        try {
            final Basic basic=session.getBasicRemote();
            //sender, message
            JSONObject jo = new JSONObject(message);
            jo.put("type", "chat");
            jo.put("date", System.currentTimeMillis());
            basic.sendText(jo.toString());
            sendAllSessionToMessage(session, jo);
            //db chat 로그 저장
            ChatDTO dto = new ChatDTO();
            dto.setOwn(jo.get("sender").toString());
            dto.setMsg(jo.get("message").toString());
            msgService.insertChat(dto);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
    
    @OnError
    public void onError(Throwable e,Session session) {
        
    }
    
    @OnClose
    public void onClose(Session session) {
        logger.info("Session "+session.getId()+" has ended");
        sessionList.remove(session);
    }
    
}
