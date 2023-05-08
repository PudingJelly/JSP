package com.myweb.board.model;

import java.lang.invoke.MethodHandles.Lookup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.myweb.board.controller.BoardController;


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
		String sql = "INSERT INTO my_board (board_id, writer, title, content)"
					+ "VALUES (board_seq.NEXTVAL, ?, ?, ?)";
		try(Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<BoardVO> listBoard() {
		List<BoardVO> articles = new ArrayList<>();
		String sql = "SELECT * FROM my_board";
		try(Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while(rs.next()) {
				BoardVO vo = new BoardVO(
							rs.getInt("board_id"),
							rs.getString("writer"),
							rs.getString("title"),
							rs.getString("content"),
							rs.getTimestamp("reg_date").toLocalDateTime(),
							rs.getInt("hit")
							);
				articles.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return articles;
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
