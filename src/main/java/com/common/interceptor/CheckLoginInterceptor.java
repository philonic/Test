package com.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zhang.entity.User;

public class CheckLoginInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// 获取信息
				User user = (User) request.getSession().getAttribute("user");
				String privUrl = request.getServletPath(); // 如：/test.jsp
				// 如果未登录
				if (user == null) {
					// 如果是去登录，就放行
					if (privUrl.startsWith("/user/login")) {// 包括"/user/loginUI.action", "/user/login.action"
						return true;
					} 
					// 如果不是去登录，就转到登录页面
					else {
						request.getRequestDispatcher("/WEB-INF/jsp/user/loginUI.jsp").forward(request, response);
						return false; // 转到登录页面后不放行，即不会执行访问的action所发出的sql语句
					}
				}
				// 如果已登录，就判断权限
				else {
					// 如果有权限，就放行
//					Collection<String> allPrivilegeUrls = (Collection<String>) request.getSession().getServletContext().getAttribute("allPrivilegeUrls");
//					if (JudgePrivilegeUtils.hasPrivilegeByUrl(user, privUrl, allPrivilegeUrls)) {
						return true;
					}
					// 如果没有权限，转到没权限错误提示页面
//					else {
//						request.getRequestDispatcher("/noPrivilegeError.jsp").forward(request, response);
//						return false; // 转到没权限错误提示页面后不放行，即不会执行访问的action所发出的sql语句
//					}
				}
	}