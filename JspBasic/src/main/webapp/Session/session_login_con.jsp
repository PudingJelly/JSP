<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	response.setCharacterEncoding("utf-8");
    	
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String nick = request.getParameter("nick");
    	
    	if(id.equals("abc1234") && pw.equals("aaa1111")) {
    		session.setAttribute("user_id", id);
    		session.setAttribute("user_nick", nick);
    		response.sendRedirect("session_welcome.jsp");
    	} else {
    %>		
    	<script>
			alert('로그인에 실패했습니다.');
			// == sendRedirect
			location.href="session_login.jsp";
		</script>
    <% } %>
    	
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>