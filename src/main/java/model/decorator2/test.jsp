<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	装饰模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.decorator2.*" %>
 
<br />
<br />
<h4>
<% 
//考核情况
		// 考核报告
		ExamineeRecord er;
		er = new YearExamineeRecord();  //员工现有考核情况     
		//部门考核最高分
		er = new TiptopPointDecorator(er);
		//考核排名
		er = new OrderDecorator(er);
		//考核情况显示
		//er.record();
		//er.signature("袁东");  //评价人姓名	
%>
<% out.println("查看考核情况:"+er.record());	%><br >

<%out.println("签字"+er.signature("李东"));%><br />		
</h4>
</BODY>
</HTML>




