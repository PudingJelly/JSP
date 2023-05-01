<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	// 쿠키는 대용량 저장이 불가능
    	// 저장 타입도 제한이 되어있음
    	
    	// # 쿠키 생성 방법
    	// 1. 쿠키 객체를 생성 - 생성자의 매개값으로 쿠키의 이름과 저장할 데이터를 입력(String)
    	
    	String id = "acc1234";
    	
    	Cookie idCoo = new Cookie("id_cookie", id);
    	Cookie nameCoo = new Cookie("name_cookid", "홍길동");
    	
    	// 2. 쿠키 클래스의 setter 메서드로 쿠키의 속성을 설정.
    	nameCoo.setMaxAge(60*60); // 쿠키의 유효시간 설정(초): 1시간 -> 60*60
    	idCoo.setMaxAge(20); 
    	
    	// 3. http 응당 시 response 객체에 생성된 쿠키를 탑재해서 클라이언트로 전송.
    	response.addCookie(nameCoo);
    	response.addCookie(idCoo);    
    	
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="cookie_check.jsp">내가 만든 쿠키 확인!</a>






</body>
</html>