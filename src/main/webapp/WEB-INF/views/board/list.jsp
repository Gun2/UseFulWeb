<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<c:import url="/import/head" />
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table.type11 {
	border-collapse: separate;
	border-spacing: 1px;
	text-align: center;
	line-height: 1.5;
	margin: 20px 10px;
}

table.type11 th {
	width: 155px;
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	color: #fff;
	background: #ce4869;
	text-align: center;
}

table.type11 td {
	width: 155px;
	padding: 10px;
	vertical-align: top;
	border-bottom: 1px solid #ccc;
	background: #eee;
}

table {
	width: 60%;
	height: auto;
	margin-left: auto;
	margin-right: auto;
	text-align: center;
}

a.button {
	-webkit-appearance: button;
	-moz-appearance: button;
	appearance: button;
	text-decoration: none;
	color: initial;
}
</style>



</head>
<body class="left-menu">

	<c:import url="/import/menu" />
	<div id="wrapper">

		<table class="type11">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성일</th>
					<th>작성자</th>
					<th>조회수</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${list}" var="list">
					<tr>
						<td>${list.bno}</td>
						<td><a href="/board/view?bno=${list.bno}">${list.title}</a></td>
						<td>${list.regDate}</td>
						<td>${list.writer}</td>
						<td>${list.viewCnt}</td>
					</tr>
				</c:forEach>

			</tbody>

		</table>
		<a href="/board/write" type = "submit" class="btn btn-danger">게시물작성</a>
	</div>
</body>
</html>