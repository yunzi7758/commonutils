<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	װ��ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.decorator2.*" %>
 
<br />
<br />
<h4>
<% 
//�������
		// ���˱���
		ExamineeRecord er;
		er = new YearExamineeRecord();  //Ա�����п������     
		//���ſ�����߷�
		er = new TiptopPointDecorator(er);
		//��������
		er = new OrderDecorator(er);
		//���������ʾ
		//er.record();
		//er.signature("Ԭ��");  //����������	
%>
<% out.println("�鿴�������:"+er.record());	%><br >

<%out.println("ǩ��"+er.signature("�"));%><br />		
</h4>
</BODY>
</HTML>




