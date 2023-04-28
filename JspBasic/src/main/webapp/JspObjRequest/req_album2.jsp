<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
	table {
		width: 800px;
		height: 400px;
	}
	
	tr {
		text-align: center;
	}
</style>

<body>

	<div align="center">
			<table border="1">
				<tr>
					<th>앨범 커버</th>
					<th>가수</th>
					<th>노래 제목</th>
					<th>발매일</th>
				</tr>
				<tr>
					<td>
						<img alt="뉴진스" src="Ditto-Newjeans.jpg" width="100" height="100">
					</td>
					<td>NewJeans(뉴진스)</td>
					<td>
						<a href="req_album_result.jsp?sing=Ditto">Ditto</a>
					</td>
					<td>2022.12.19</td>
				</tr>
				<tr>
					<td>
						<img alt="아이브" src="After like-IVE.jpg" width="100" height="100">
					</td>
					<td>IVE(아이브)</td>
					<td>
						<a href="req_album_result.jsp?sing=After LIKE">After LIKE</a>
					</td>
					<td>2022.08.22</td>
				</tr>				
			</table>
	</div>



</body>
</html>