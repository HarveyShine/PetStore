<%@page import="pet.utils.JsonUtils"%>
<%@page import="pet.service.UserService"%>
<%@page import="pet.utils.SpringUtils"%>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
	//1. 获取参数（password最好使用MD5加密）
	String userPhoneNumber = request.getParameter("userPhoneNumber");
	String password = request.getParameter("password");
	//2.实例化userService
	BeanFactory factory = SpringUtils.getBeanFactory();
	UserService userService = factory.getBean(UserService.class);
	//3.获取登录状态
	String state = userService.checkLongin(userPhoneNumber, password);
	String jsonStr = JsonUtils.objectToJson(state);
	//3-通过reponse对象返回
	out.write(jsonStr);
%>