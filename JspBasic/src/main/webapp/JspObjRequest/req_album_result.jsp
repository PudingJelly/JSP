<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("UTF-8");
	
	String sing = request.getParameter("sing");
		
    %>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h1>선택하신 앨범 정보</h1>
		<hr>
		<% if(sing.equals("Ditto")){ %>
			<p>
				당신이 선택하신 앨범은 NewJeans(뉴진스)의 <strong><%=sing %></strong>입니다.
			</p>
		<hr>
		<h3>타이틀 곡 뮤직 비디오</h3>
		<iframe width="800" height="600" src="https://www.youtube.com/embed/QJPk1K1QF-U" title="NewJeans (뉴진스) &#39;Ditto&#39; Performance Video (Fix ver.)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>		
		<% } else if(sing.equals("After LIKE")) { %>
			<p>
				당신이 선택하신 앨범은 IVE의 <strong><%=sing %></strong>입니다.
			</p>
		<hr>
		<h3>타이틀 곡 뮤직 비디오</h3>
		<iframe width="800" height="600" src="https://www.youtube.com/embed/F0B7HDiY-10" title="IVE 아이브 &#39;After LIKE&#39; MV" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
		<% } %>
	</div>

</body>
</html>