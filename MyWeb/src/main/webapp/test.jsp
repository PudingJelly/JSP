<%@page import="com.myweb.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%

        for(int i=1; i<=300; i++){
            String writer = "김테스트" + i;
            String title = "테스트 입니다." + i;
            String content = "테스트 중이니까 조용히 하세요!" + i;
            BoardDAO.getInstance().regist(writer, title, content);
        }

    %>
	

</body>
</html>

































