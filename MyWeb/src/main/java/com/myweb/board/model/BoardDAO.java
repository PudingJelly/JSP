package com.myweb.board.model;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class BoardDAO implements IBoardDAO {

	private DataSource ds;
	
	private BoardDAO() {
		//커넥션 풀 땡겨오기
		try {
			InitialContext ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/myOracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}		
	}	
	
	private static BoardDAO dao = new BoardDAO();

	public static BoardDAO getInstance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	@Override
	public void regist(String writer, String title, String content) {

	}

	@Override
	public List<BoardVO> listBoard() {
		return null;
	}

	@Override
	public BoardVO contentBoard(int bId) {
		return null;
	}

	@Override
	public void updateBoard(String title, String content, int bId) {

	}

	@Override
	public void deleteBoard(int bId) {

	}

}
