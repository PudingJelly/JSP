package com.myweb.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.user.model.UserVO;


@WebServlet("*.user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserController() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uri = request.getRequestURI();
		uri = uri.substring(request.getContextPath().length() + 1, uri.lastIndexOf("."));
		
		System.out.println("정제된 uri: " + uri);
		
		switch (uri) {
		case "joinPage" :
			System.out.println("회원 가입 페이지로 이동 요청!");
			response.sendRedirect("user/user_join.jsp");
			break;
		
		case "join" :
			System.out.println("회원 가입 요청이 들어옴!");
			String id = request.getParameter("id");
			
			
			
			UserVO vo = new UserVO(
						
					);
			
			break;
		}
		
	}

}
