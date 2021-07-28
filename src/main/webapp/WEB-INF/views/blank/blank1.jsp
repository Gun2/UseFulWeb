<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<!-- 공통 헤드 -->
<c:import url="/import/head" />
<!-- chat -->
<script src="<c:url value="/js/simple-chat.js"/>"></script>
<style>
#wrap {
	width: 1000px;
	margin: auto;
}

table {
	width: 90%;
	border-collapse: collapse;
	line-height: 26px;
	margin: auto;
}

table td, th {
	border-top: 1px solid black;
	border-bottom: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	padding: 10px;
}

th {
	background: rgb(221, 221, 221);
}

a {
	text-decoration: none;
	color: black;
}

a:hover {
	text-decoration: underline;
}

.pagination {
	display: block;
	text-align: center;
}

.pagination>li>a {
	float: none;
	margin-left: -5px;
}
</style>
</head>
<body class="left-menu">

	<!-- menu -->
	<c:import url="/import/menu" />

	<div id="wrapper">
		<div id="test">
			<h1 align="center">
				<B><U>Lotto First Place</U></B>
			</h1>
			<table>
				<tr>
					<td colspan="5" style="border: white; text-align: right;"></td>
				</tr>
				<tr>
					<th>회차</th>
					<th>1번</th>
					<th>2번</th>
					<th>3번</th>
					<th>4번</th>
					<th>5번</th>
					<th>6번</th>
					<th>총 금액</th>
					<th>1등 금액</th>
					<th>날짜</th>
				</tr>

				<c:forEach items="${list}" var="lotto">
					<tr>
						<td>${lotto.lt_drw_no}</td>
						<td>${lotto.lt_drwt_no_1}</td>
						<td>${lotto.lt_drwt_no_2}</td>
						<td>${lotto.lt_drwt_no_3}</td>
						<td>${lotto.lt_drwt_no_4}</td>
						<td>${lotto.lt_drwt_no_5}</td>
						<td>${lotto.lt_drwt_no_6}</td>
						<td><fmt:formatNumber value="${lotto.lt_tot_sell_amnt}" pattern="#,###"/>원</td>
						<td><fmt:formatNumber value="${lotto.lt_first_win_amnt}" pattern="#,###"/>원</td>
						<td>${lotto.lt_drw_date}</td>
					</tr>
				</c:forEach>

			</table>
			<!-- paging{s} -->
			<div class="pagination">
				<c:if test="${page.prev}">
					<span>[<a
						href="/blank1?num=${page.startPageNum - 1}">이전</a>
					</li>]
					</span>
				</c:if>
				<c:forEach begin="${page.startPageNum}" end="${page.endPageNum}"
					var="num">
					<span> <c:if test="${select !=num}">
							<a class="active" href="/blank1?num=${num}">${num}</a>
						</c:if> <c:if test="${select ==num}">
							<b>${num}</b>
						</c:if>
					</span>
				</c:forEach>

				<c:if test="${page.next}">
					<span>[<a
						href="/blank1?num=${page.endPageNum +1}">다음</a>]
					</span>
				</c:if>
			</div>
			<!-- paging{e} -->
			<!-- Search{s} -->
			<div>
				<select name="searchType">
					<option value="lt_drw_no"
						<c:if test = "${page.searchType eq 'lt_drw_no'}">selected</c:if>>회차</option>
				</select> 
				<input type="text" name="keyword" value="<c:out value="${page.keyword}"/>"/>
				<button type="button" id="searchBtn">검색</button>
			</div>
			<!-- Search{e} -->
		</div>

	</div>
	<!-- end wrapper -->

	<script>
	document.getElementById("searchBtn").onclick = function () {
	    
		  let searchType = document.getElementsByName("searchType")[0].value;
		  let keyword =  document.getElementsByName("keyword")[0].value;
		  
		  location.href = "/blank1?num=1" + "&searchType=" + searchType + "&keyword=" + keyword;
		 };
	</script>

</body>
</html>