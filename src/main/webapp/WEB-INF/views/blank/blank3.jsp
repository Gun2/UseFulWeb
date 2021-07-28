<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<!-- 공통 헤드 -->
<c:import url="/import/head" />
<!-- chat -->
<script src="<c:url value="/js/simple-chat.js"/>"></script>
 <style>
 .test{
 }
 
  </style>

</head>
<body class="left-menu">

	<!-- menu -->

	<c:import url="/import/menu" />
	<div id="wrapper">
	
		<p>
			<a href="/board/list">게시물 목록</a><br />
			<a href="/board/write">게시물 작성</a><br />
			<a href="/board/signup">회원가입</a><br />
			
		</p>
		
	</div>
	
	<script>
		window.onload = function() {

		}
	</script>

</body>
</html>