package com.myweb.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;
import com.myweb.commons.PageVO;

public class GetListService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		PageVO paging = new PageVO();
		BoardDAO dao = BoardDAO.getInstance();

		// 사용자가 처음 게시판에 들어올 때는 페이지 선택을 하지 않기 때문에
		// 생성자가 기본값을 지정해 줍니다.
		// 페이지 정보가 파라미터 값으로 넘어올 경우에만 getParameter를 하겠습니다.
		if(request.getParameter("page") != null) {
			paging.setPage(Integer.parseInt(request.getParameter("page")));
			paging.setCpp(Integer.parseInt(request.getParameter("cpp")));
		}
		
		System.out.println(paging);		
		
		List<BoardVO> boardList = dao.listBoard(paging);
		
		
		
		
		
		// 왜 session을 사용하지 않고 request를 사용하는가?
		// 데이터베이스로부터 받아온 글 목록은 일시적인 데이터입니다.
		// 글 목록은 언제든 변할 수 있습니다.
		// 그러한 데이터를 굳이 session에 담아서 유지할 필요가 있을까요?
		// 응답이 나가고 나서 자동으로 소멸할 수 있도록 request에 담아서 
		// 화면으로 전달하고자 합니다.
		request.setAttribute("boardList", boardList);
		
		
		
		
	}

}
