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