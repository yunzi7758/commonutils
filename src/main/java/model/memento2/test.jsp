<HTML>
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	黑箱备忘录
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.memento2.*" %> 
<br />
<br />
<h4>
<%
  Applicant applicant = new Applicant();
  Principal principal = new Principal(); 
%>
<% 
out.println("恢复至:"+String.valueOf(applicant.setState("第2版"))); //改变申请人对象的状态 
principal.saveProcessor(applicant.createProcessor());//创建备忘录对象，并存储申请人对象状态  
%>	
<br >
  <% 
  out.println("将当前版本:"+String.valueOf(applicant.setState("覆盖"))) ;  //变更申请人对象状态   	 
  applicant.restoreProcessor(principal.retrieveProcessor()); //恢复申请人对象状态    
  %>	
 <br >
</h4>
</BODY>
</HTML>




