<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<c:import url="/import/head" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="left-menu">
	<c:import url="/import/menu" />
	<div id="wrapper">
		<table>
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
		<div>
			<c:forEach begin="1" end="${pageNum}" var="num">
				<span> <a href="/board/listPage?num=${num}">${num}</a>
				</span>
			</c:forEach>
		</div>
		<a href="/board/write">게시물 작성</a>
	</div>
</body>
</html>