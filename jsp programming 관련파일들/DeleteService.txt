package com.myweb.user.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.user.model.UserDAO;
import com.myweb.user.model.UserVO;

public class DeleteService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		//회원탈퇴 로직
		String id = ((UserVO)request.getSession().getAttribute("user")).getUserId();
		String pw = request.getParameter("check_pw");

		UserDAO dao = UserDAO.getInstance();
		
		//비번이 유효한지 체크하자(UserCheck메서드를통해)
		response.setContentType("text/html; charset=UTF-8"); //이거안쓰면 alert못씀
		String htmlCode;
		PrintWriter out = null; //finally에서 클로스할꺼니까 null
		
		
		try {
			out = response.getWriter();
			if(dao.userCheck(id, pw) == 0) { //1부터든 0이든 맘대로. (0이오면 사용자가 입력한 비번이 틀렸다 라고 가정해주자)
				//비번이 틀렸으니
				htmlCode = "<script>\r\n"
                        + "                alert('비밀번호가 틀렸습니다.');\r\n"
                        + "                location.href='/MyWeb/myPage.user';\r\n"
                        + "                </script>";
				
				
			} else {
				//비번이 제대로 썼다면(즉, 리턴값이 1이왔다면)
				dao.deleteUser(id);
				//삭제가 완료됐으면 탈퇴한 회원이 로그인 유지되면 안되니까 세션만료시키자
				request.getSession().invalidate();
				htmlCode = "<script>\r\n"
                        + "                alert('비밀번호가 틀렸습니다.');\r\n"
                        + "                location.href='/MyWeb';\r\n" //홈화면으로돌려버려
                        + "                </script>";
			
			}
			
			out.print(htmlCode); 
			out.flush(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
	}
}