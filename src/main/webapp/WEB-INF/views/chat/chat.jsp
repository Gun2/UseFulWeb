<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<!-- 공통 헤드 -->
  	<c:import url="/import/head"/>
    <!-- chat -->
    <script src="<c:url value="/js/simple-chat.js"/>"></script>
    <!-- websocket -->
     <script src="<c:url value="/js/simple-websocket.js"/>"></script>
</head>
<body class="left-menu">  
    
    <!-- menu -->
    <c:import url="/import/menu"/>
 
    <div id="wrapper">
        <div class="section bgcolor noover">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="tagline-message">
                            <h3><mark class="rotate">Hi </mark> 유용한 기능을 개발해봅시다</h3>
                        </div>
                    </div><!-- end col -->
                </div><!-- end row -->
            </div><!-- end container -->
        </div><!-- end section -->

        

        <section class="section lb">
            <div class="container">
                <div class="section-title text-center">
                    <h3>실시간 채팅</h3>
                    <p>Ip 기반으로 구성된 실시간 채팅 웹 애플리케이션 입니다.</p>
                </div><!-- end title -->
				<div id="chatApp" class="chat-app" style="width:100%;height:500px;">
			    	<div style="width:100%;height:100%;display:table;">
			    		<div style="display:table-cell;vertical-align:middle;text-align:center">
			    			<div class="lds-ring"><div></div><div></div><div></div><div></div></div>
			    		</div>
			    	</div>
				</div>
            </div>
        </section>    

        <section class="section bgcolor">
            <div class="container">
                <a href="#">
                <div class="row callout">
                    <div class="col-md-4 text-center">
                        <h3><sup></sup>Chat</h3>
                        <h4>로그인 없는 채팅</h4>
                    </div><!-- end col -->

                    <div class="col-md-8">
                        <p class="lead" style="font-size:20px;">로그인까지 구현하면 시간이 많이걸리니까 그냥 IP대상으로 만들었어요.</p>
                    </div>
                </div><!-- end row -->
                </a>
            </div><!-- end container -->  
        </section>

        <footer class="section footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-12">
                        <div class="widget clearfix">
                            <div class="newsletter-widget">
                                <p>You can opt out of our newsletters at any time.<br> See our <a href="#">privacy policy</a>.</p>
                                
                            </div><!-- end newsletter -->
                        </div><!-- end widget -->
                    </div><!-- end col -->

                    <div class="col-lg-2 col-md-4">
                        <div class="widget clearfix">
                            <div class="list-widget">   
                                <ul>
                                    <li><a href="page-about.html">About us</a></li>
                                    <li><a href="page-about-me.html">About me</a></li>
                                    <li><a href="page-services.html">Our Services</a></li>
                                    <li><a href="page-team.html">Our Team</a></li>
                                    <li><a href="page-contact-01.html">Contact us</a></li>
                                </ul>
                            </div><!-- end list-widget -->
                        </div><!-- end widget -->
                    </div><!-- end col -->

                    <div class="col-lg-2 col-md-4">
                        <div class="widget clearfix">
                            <div class="list-widget">   
                                <ul>
                                    <li><a href="page-contact-02.html">Get In Touch</a></li>
                                    <li><a href="page-faqs.html">FAQ's</a></li>
                                    <li><a href="page-testimonials.html">Testimonials</a></li>
                                    <li><a href="page-elements-html">Elements</a></li>
                                    <li><a href="page-404.html">Not Found</a></li>
                                </ul>
                            </div><!-- end list-widget -->
                        </div><!-- end widget -->
                    </div><!-- end col -->

                    <div class="col-lg-2 col-md-4">
                        <div class="widget clearfix">
                            <div class="list-widget">   
                                <ul>
                                    <li><a href="shop-checkout.html">Checkout</a></li>
                                    <li><a href="shop-cart.html">Shopping Cart</a></li>
                                    <li><a href="shop-account.html">My Account</a></li>
                                    <li><a href="shop-login.html">Login / Register</a></li>
                                </ul>
                            </div><!-- end list-widget -->
                        </div><!-- end widget -->
                    </div><!-- end col -->
                </div><!-- end row -->
            </div><!-- end container -->
        </footer><!-- end footer -->

        <div class="section copyrights">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-3">
                        <div class="cop-logo">
                            <img src="/images/logo-normal.png" alt="">
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-9 text-right">
                        <div class="cop-links">
                            <ul class="list-inline">
                                <li>&copy; 2018 Genius | Design: <a href="https://html.design">HTML Design</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div><!-- end wrapper -->

    <script>
    	function getRecentChat(){
			$.ajax({  
				type: 'get',  
				url: '/api/msg/recent.do',  
				async: true,
				data: {},  
				success: function(data){
					console.log(`getRecentChat`);
					console.log(data);
					createChat(data.myIp, data.msgList);
				},
				error: function(request, status, error){
					alert('채팅 접속에 실패했습니다.');
					
				},
				dataType: "json"  
			});  
    	}
    	
    	function postChat(msg){
			$.ajax({  
				type: 'post',  
				url: '/api/msg/chat.do',  
				async: true,
				data: {msg:msg},  
				success: function(data){
					if(data == 1){
						
					}else{
						alert('채팅 입력에 실패했습니다.')
					}
				},
				dataType: "text"  
			});  
    	}
    	var test;
    	function createChat(sender, recentChat){
    	    var ws = new SimpleWebSocket("ws://"+location.host+"/ws/chat.do", {
    	    	onopen : function(event) {
    	    		console.log("onopen");
    	    		console.log(event);
    	    	},
    	    	onmessage : function(event) {
    	    		console.log("onmessage");
    	    		console.log(event);
    	    		if(event.data){
    	    			var data = JSON.parse(event.data);
    	    			if(data.type == "chat"){
    	    				console.log(data);
    	    				simpleChat.insert(data.sender, data.message, msToDateString(data.date));
    	    			}
    	    		}
    	    	},
    	    	onclose : function(event){
    	    		console.log("onmessage");
    	    		console.log(event);
    	    	}
    	    });
    	    
    	    if(!ws){
    	    	alert("소켓 연결에 실패했습니다.");
    	    	return;
    	    }
    	    
        	var simpleChat = new SimpleChat(document.getElementById('chatApp'), {
        		onMsgPost : function(input){
        			if(input.value && input.value.length > 0){
        				var chat = {
            					sender : sender,
            					message : input.value
            			}
        				ws.send(JSON.stringify(chat));
        				input.value = "";
        			}
        		}
        	});
        	recentChat.reverse().forEach( r => {
        		simpleChat.insert(r.own, r.msg, r.sdate.substr(0,19));
        	})
    		

    	    test = ws;
    	}
    	
        
        window.onload = function(){
        	getRecentChat();
        }
        
        function msToDateString(m){
        	var myDate = new Date(m);
        	return (myDate.getFullYear() + '-' +('0' + (myDate.getMonth()+1)).slice(-2)+ '-' +  ('0' + myDate.getDate()).slice(-2) + ' '+myDate.getHours()+ ':'+('0' + (myDate.getMinutes())).slice(-2)+ ':'+myDate.getSeconds());
        }
    </script>

</body>
</html>