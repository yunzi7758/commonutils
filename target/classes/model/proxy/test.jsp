<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	����ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.proxy.*" %>
 
<br />
<br />
<h4>
<% 
//����λ���lidong
ITraining training = new LidongTraining("�");
//Ȼ���ٶ���һ��������
ITraining proxy = new ManProxy(training);
//��ʼ��ѵ������ʱ���
%>
<% out.println("��ʼʱ�䣺2011-8-2 13:00");	%><br >
<%out.println(proxy.meeting("lidong", "team"));//�μ���ѵ�����
out.println(proxy.joinTraining());//�μ���ѵ
out.println(proxy.joinExam());//����
 %><br >
<% out.println("����ʱ�䣺2011-8-2 15:30");	%><br >
</h4>
</BODY>
</HTML>




