package com.hebut.sevrlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet{
	
	public static String PROJECT_REDIRECT;
	public static String PROJECT_FORWARD;
	
	@Override
	public void init() throws ServletException {
		PROJECT_REDIRECT = "r:"+getServletContext().getContextPath();
		PROJECT_FORWARD = "f:";
		System.out.println(PROJECT_FORWARD+PROJECT_REDIRECT);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String methodName = request.getParameter("method");
		Class clazz = this.getClass();
		try {
			if(methodName == null) {
				System.out.println("methon输入错误！");
				return;
			}
			Method method = clazz.getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
			
			String path = (String) method.invoke(this,request,response);
			System.out.println("path="+path);
			//得到子控制器返回的路径
			//有三种情况
			//1.Ajax 
			//2.页面跳转（重定向），页面地址以 r:开头 
			//3.转发，页面地址以 f:开头 
			if(path == null) {
				return;
			}
			else if ("r:".equals(path.substring(0, 2))) {
				response.sendRedirect(path.substring(2));
			}
			else if("f:".equals(path.substring(0, 2))){
				//转发可以带数据给前端页面
				request.getRequestDispatcher(path.substring(2)).forward(request, response);
			}
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} 
	}
}
