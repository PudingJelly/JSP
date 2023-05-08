package com.myweb.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.service.GetListService;
import com.myweb.board.service.IBoardService;
import com.myweb.board.service.ResistService;


@WebServlet("*.board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	private IBoardService sv;
    
	public BoardController() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getMethod().equals("POST")) {
			request.setCharacterEncoding("utf-8");
		}
		
		String uri = request.getRequestURI();
		uri = uri.substring(request.getContextPath().length() + 1, uri.lastIndexOf("."));
		System.out.println("uri: " + uri);
		
		switch(uri) {
		
		case "write" :
			System.out.println("글쓰기 페이지로 이동 요청!");
			response.sendRedirect("board/board_write.jsp");
			break;
		
		case "regist" :
			System.out.println("글 등록 요청이 들어옴!");
			sv = new ResistService();
			sv.execute(request, response);
			
			/*
			 왜 board_list.jsp로 바로 리다이렉트를 하면 안될까?
			 board_list.jsp에는 데이터베이스로부터 전체 글 목록을 가져오는
			 로직을 작성하지 않을 것이기 때문입니다. (jsp는 단순히 보여지는 역할만 수행)
			 컨트롤러로 글 목록 요청이 다시 들어올 수 있게끔
			 sendRedirect()를 사용하여 자동 목록 재 요청이 들어오게 하는 겁니다.
			 */
			response.sendRedirect("/MyWeb/list.board");
			
			break;
			
		case "list" :
			System.out.println("글 목록 요청이 들어옴!");
			sv = new GetListService();
			sv.execute(request, response);
			
			
			break;
		}
	}

}
