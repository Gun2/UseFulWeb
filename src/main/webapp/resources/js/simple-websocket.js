/**
 * 
 */

class SimpleWebSocket {
  	constructor(url, option) {
		option = {
			onopen : function(){},
			onmessage : function(){},
			onclose : function(){},
			...option
		}
		
		var ws = new WebSocket(url);
	            
        ws.onopen = function(event){
            if(event.data === undefined){
          		return;
            }
            //writeResponse(event.data);
			option.onopen(event);
        };
        
        ws.onmessage = function(event){
			option.onmessage(event);
        };
        
        ws.onclose = function(event){
            option.onclose(event);
        }
		
		this._ws = ws;
	}
	
	#_send(txt){
		this._ws.send(txt);
	}
	send = this.#_send.bind(this);
	
	#_closeSocket(){
		this._ws.close();
	}
	closeSocket = this.#_closeSocket.bind(this);
}


/*

	    var ws;
	    
        function openSocket(){
            if(ws !== undefined && ws.readyState !== WebSocket.CLOSED ){
                writeResponse("WebSocket is already opened.");
                return;
            }
            //웹소켓 객체 만드는 코드
            ws = new WebSocket("ws://"+location.host+"/ws/chat.do");
            
            ws.onopen = function(event){
                if(event.data === undefined){
              		return;
                }
                writeResponse(event.data);
            };
            
            ws.onmessage = function(event){
                console.log('writeResponse');
                console.log(event.data)
                //console.log(event.data);
            };
            
            ws.onclose = function(event){
                console.log("대화 종료");
            }
            
        }
        
        function send(text){
            ws.send(text);
        }
        
        function closeSocket(){
            ws.close();
        }
        
        function writeResponse(text){
            messages.innerHTML += "<br/>"+text;
        }

        function clearText(){
            console.log(messages.parentNode);
            messages.parentNode.removeChild(messages)
      	}

*/