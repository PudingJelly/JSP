package com.myweb.board.service;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String category = request.getParameter("category");
		String keyword = request.getParameter("keyword");
		List<BoardVO> list = BoardDAO.getInstance().searchBoard(keyword, category);
		
		if(list.size() == 0) {
			response.setContentType("text/html; charset=UTF-8");
			
			String htmlCode = "<script>\r\n"
                    + "                alert('검색 결과에 따른 게시물이 없습니다.');\r\n"
                    + "                location.href='/MyWeb/list.board';\r\n"
                    + "                </script>";
		}
		
	}

}
