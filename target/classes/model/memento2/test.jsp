<HTML>
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	���䱸��¼
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
out.println("�ָ���:"+String.valueOf(applicant.setState("��2��"))); //�ı������˶����״̬ 
principal.saveProcessor(applicant.createProcessor());//��������¼���󣬲��洢�����˶���״̬  
%>	
<br >
  <% 
  out.println("����ǰ�汾:"+String.valueOf(applicant.setState("����"))) ;  //��������˶���״̬   	 
  applicant.restoreProcessor(principal.retrieveProcessor()); //�ָ������˶���״̬    
  %>	
 <br >
</h4>
</BODY>
</HTML>




