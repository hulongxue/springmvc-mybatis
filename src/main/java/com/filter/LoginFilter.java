package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{
	
	private  FilterConfig config; 
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init");  
        config=filterConfig;  
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//在DispatcherServlet之前执行  
		System.out.println("############LoginFilter doFilterInternal executed############");  
		String para=config.getInitParameter("nofilterpath");  
        System.out.println(para);  
		
		HttpServletRequest req = (HttpServletRequest) request;
	    HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession(true);
		String userName = (String) session.getAttribute("userName");
		if(req.getRequestURI().indexOf("login")!=-1) {
			chain.doFilter(request, response);  
			return;
		}
		if(userName==null||"".equals(userName)) {
			//跳转到登陆页面
		      res.sendRedirect(req.getContextPath()+"/login.html");
		}else {
			 //已经登陆,继续此次请求
			chain.doFilter(request, response);  
		}
        //在视图页面返回给客户端之前执行，但是执行顺序在Interceptor之后  
        System.out.println("############LoginFilter doFilter after############");

	}

	@Override
	public void destroy() {
		System.out.println("############LoginFilter destroy############");
	}

}
