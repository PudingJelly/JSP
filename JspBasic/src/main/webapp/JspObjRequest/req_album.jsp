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
	}
	tr {
		text-align: center;
	}
</style>

<body>

	<div align="center">
		<form action="req_album_result.jsp">
			<table border="1">

				<tr>
					<th></th>
					<th>앨범 커버</th>
					<th>가수</th>
					<th>노래 제목</th>
					<th>발매일</th>
				</tr>

				<tr>
					<td>
						<input type="radio" name="sing" value="Ditto">
					</td>
					<td>
						<img alt="뉴진스" src="Ditto-Newjeans.jpg" width="100" height="100">
					</td>
					<td>NewJeans(뉴진스)</td>
					<td>Ditto</td>
					<td>2022.12.19</td>
				</tr>

				<tr>
					<td>
						<input type="radio" name="sing" value="After LIKE">
					</td>
					<td>
						<img alt="아이브" src="After like-IVE.jpg" width="100" height="100">
					</td>
					<td>IVE(아이브)</td>
					<td>After LIKE</td>
					<td>2022.08.22</td>
				</tr>
				<tr>
					<td colspan="5">
						<input type="submit" value="확인">
					</td>
				</tr>
			</table>
		</form>
	</div>



</body>
</html>