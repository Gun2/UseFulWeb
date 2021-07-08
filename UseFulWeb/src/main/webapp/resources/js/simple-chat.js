/**
 * 
 */

class SimpleChat {
  constructor(targetEl, option={}) {
	  this._targetEl = targetEl;
	  this._option = {
			  onMsgPost : function(){},
			  ...option
	  };
	  this.create();
  }
  create(){
	  var chatAreaDiv = document.createElement("div");
	  chatAreaDiv.className="chat-area";
	  chatAreaDiv.style.height = "80%";
	  var chatInputArea = document.createElement('div');
	  chatInputArea.className = "chat-input-area";
	  
	  var onMsgPost = this._option.onMsgPost;
	  var input = document.createElement('input');
	  input.type = "text";
	  input.className = "form-control";
	  input.placeholder = "Enter the message..";
	  input.addEventListener('keydown', function(e){
		  if(e.keyCode == 13){
			  onMsgPost(input);
		  }
	  })
	  
	  var button = document.createElement('button');
	  button.type = "submit";
	  button.className = "btn btn-primary";
	  var icon = document.createElement('i');
	  icon.className = "fa fa-paper-plane-o";
	  button.append(icon);
	  
	  button.addEventListener('click', function(){
		  onMsgPost(input);
	  });
	  chatInputArea.append(input);
	  chatInputArea.append(button);
	  
	  this._targetEl.innerHTML = "";
	  this._targetEl.append(chatAreaDiv);
	  this._targetEl.append(chatInputArea);
	  this._chatAreaDiv = chatAreaDiv;
	  this._chatButton = button;
	  this._chatInput = input;
	  
  }
  
  /*
   * 
   * 
   * 
<div id="chatApp" class="chat-app" style="width:100%;height:400px;">
					<div class="chat-area">
						<div class="chat-div">
							<div class="chat-name">
								127.0.0.1
							</div>
							<div class="chat-msg">
								안녕하세요aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdasdadadasdasdasdasdasdasdasdasdasdasdasdaaaaaaaaaaaaaaaaaaaaaaaa
							</div>
							<div class="chat-date">
								2013-11-10 12:13:00
							</div>
						</div>
					</div>
				</div>
				<div class="chat-input-area">
					<input type="text" class="form-control" placeholder="메시지 입력">
					<button type="submit" class="btn btn-primary"><i class="fa fa-paper-plane-o"></i></button>
				</div>



   */
}