package com.hebut.sevrlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hebut.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class UserSevrlet
 */
@WebServlet("/UserSevrlet")
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public String login(HttpServletRequest request,HttpServletResponse response)
	{
		String userId=request.getParameter("UserId");
		String phone=request.getParameter("Phone");
		String email=request.getParameter("Email");
		String password=request.getParameter("Password");
		
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		if(userDaoImpl.login(userId,password) == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);
			System.out.println(PROJECT_REDIRECT+"html/jsp/jspTest.jsp");
			return PROJECT_REDIRECT+"/html/index.html";
		}
		else {
			System.out.println(PROJECT_FORWARD+"index.jsp");
			return PROJECT_REDIRECT+"/index.jsp";
		}
	}

}
