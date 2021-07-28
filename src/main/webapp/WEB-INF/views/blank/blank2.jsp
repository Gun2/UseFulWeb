<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<!-- 공통 헤드 -->
<c:import url="/import/head" />
<!-- chat -->
<script src="<c:url value="/js/simple-chat.js"/>"></script>

<!-- ajax(s) -->
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<!-- ajax(e) -->

</head>
<body class="left-menu">

	<!-- menu -->
	<c:import url="/import/menu" />

	<div>
		<h1 align="center">
			<B><U>Security Login</U></B>
		</h1>
		<form role="form" method="post" autocomplete="off" action="/blank2/login">
		<p>
		<label for="USERID">아아디</label>
		<input type="text" id="USERID" name="USERID"/>
		</p>
		<p>
		<lable for="USERPASS">패스워드</lable>
		<input type="password" id="USERPASS" name="USERPASS"/>
		</p>
		<p><button type="submit"> 로그인 </button></p>
		</form>
	</div>

	<!-- end wrapper -->



	<script>		
		window.onload = function() {

		}
	</script>
	
</body>
</html>