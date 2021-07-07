<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

    <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <!-- Mobile Meta -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    
    <!-- Site Meta -->
    <title>유용한웹</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Site Icons -->
    <link rel="shortcut icon" href="<c:url value='/images/favicon.ico'/>" type="image/x-icon" />
    <link rel="apple-touch-icon" href="<c:url value='/images/apple-touch-icon.png'/>">

	<!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700" rel="stylesheet"> 

	<!-- Custom & Default Styles -->
	<link rel="stylesheet" href="<c:url value='/css/bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/font-awesome.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/carousel.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">

	<!--[if lt IE 9]>
		<script src="js/vendor/html5shiv.min.js"></script>
		<script src="js/vendor/respond.min.js"></script>
	<![endif]-->

</head>
<body class="left-menu">  
    
    <div class="menu-wrapper">
        <div class="mobile-menu">
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="index.html"><img src="/images/logo-normal.png" alt=""></a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Home <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Pages <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Portfolio <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Shop <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Blog <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li>
                            <li><a href="#">Contact</a></li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="https://html.design">Download <i class="fa fa-shopping-bag"></i></a></li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div><!--/.container-fluid -->
            </nav>
        </div><!-- end mobile-menu -->

        <header class="vertical-header">
            <div class="vertical-header-wrapper">
                <nav class="nav-menu">
                    <div class="logo">
                        <a href="index.html"><img src="/images/logo.png" alt=""></a>
                    </div><!-- end logo -->

                    <div class="margin-block"></div>

                    <ul class="primary-menu">
                        <li class="child-menu"><a href="#">Home <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Pages <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Portfolio <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="#">Menu Example 01 <i class="fa fa-angle-right"></i></a> 
                                        <div class="subsub-menu-wrapper">  
                                            <ul class="subsub-menu center-content">
                                                <li><a href="#">Menu Example 01</a></li>
                                                <li><a href="#">Menu Example 02</a></li>
                                                <li><a href="#">Menu Example 03</a></li>
                                                <li><a href="#">Menu Example 04</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li><a href="#">Menu Example 02 <i class="fa fa-angle-right"></i></a> 
                                        <div class="subsub-menu-wrapper">  
                                            <ul class="subsub-menu center-content">
                                                <li><a href="#">Menu Example 01</a></li>
                                                <li><a href="#">Menu Example 02</a></li>
                                                <li><a href="#">Menu Example 03</a></li>
                                                <li><a href="#">Menu Example 04</a></li>
                                                <li><a href="#">Menu Example 05</a></li>
                                                <li><a href="#">Menu Example 06</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li><a href="#">Menu Example 03 <i class="fa fa-angle-right"></i></a> 
                                        <div class="subsub-menu-wrapper">  
                                            <ul class="subsub-menu center-content">
                                                <li><a href="#">Menu Example 01</a></li>
                                                <li><a href="#">Menu Example 02</a></li>
                                                <li><a href="#">Menu Example 03</a></li>
                                                <li><a href="#">Menu Example 04</a></li>
                                                <li><a href="#">Menu Example 05</a></li>
                                                <li><a href="#">Menu Example 06</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li><a href="#">Menu Example 04 <i class="fa fa-angle-right"></i></a> 
                                        <div class="subsub-menu-wrapper">  
                                            <ul class="subsub-menu center-content">
                                                <li><a href="#">Menu Example 01</a></li>
                                                <li><a href="#">Menu Example 02</a></li>
                                                <li><a href="#">Menu Example 03</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Shop <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Blog <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a href="#">Contact</a></li>
                        <li><a href="https://html.design">Download <i class="fa fa-shopping-bag"></i></a></li>
                    </ul>
                    
                    <div class="margin-block"></div>

                    <div class="menu-search">
                        <form>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="What you are looking?">
                                <button class="btn btn-primary"><i class="fa fa-search"></i></button>
                            </div>
                        </form>
                    </div><!-- end menu-search -->

                    <div class="margin-block"></div>

                    <div class="menu-social">
                        <ul class="list-inline text-center">
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                        </ul>
                    </div><!-- end menu -->
                </nav><!-- end nav-menu -->
            </div><!-- end vertical-header-wrapper -->
        </header><!-- end header -->
    </div><!-- end menu-wrapper -->

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

    <!-- jQuery Files -->
    <script src="<c:url value="/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/js/carousel.js"/>"></script>
    <script src="<c:url value="/js/parallax.js"/>"></script>
    <script src="<c:url value="/js/rotate.js"/>"></script>
    <script src="<c:url value="/js/custom.js"/>"></script>
    <script src="<c:url value="/js/masonry.js"/>"></script>
    <script src="<c:url value="/js/masonry-4-col.js"/>"></script>
    <!-- chat -->
    <script src="<c:url value="/js/simple-chat.js"/>"></script>
    <!-- VIDEO BG PLUGINS -->
    <script src="<c:url value="/videos/libs/swfobject.js"/>"></script> 
    <script src="<c:url value="/videos/libs/modernizr.video.js"/>"></script> 
    <script src="<c:url value="/videos/libs/video_background.js"/>"></script> 
    <script>
    	var simpleChat = new SimpleChat(document.getElementById('chatApp'), {
    		onMsgPost : function(input){
    			console.log(input);
    		}
    	});
		window.onload = function(){
			
		}
    </script>

</body>
</html>