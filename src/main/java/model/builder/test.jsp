<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	������ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.builder.*" %>
 
<br />
<br />
<h4>
<% 
//		����һ�������߶���
		SiemensWasherBuilder builder = new SiemensWasherBuilder();
//		����һ�������ߣ���Ϊ������һ��������
		SiemensDirector directorOne = new SiemensDirector(builder);	
//		�����߽�֪ͨ������ȥ������Ʒ
//		����������У������߽�����ݵ����ߵ�����ȥ������֯��������Ʒ����
		directorOne.contruct();		
//		�Ӿ��彨�����м�����Ʒ�����ص��Ǳ�������ӣ���
		SiemensWasher siemensWasher = builder.retrieveWasher();			
		%>
</h4>
<% out.println(siemensWasher);	 %><br />
</BODY>
</HTML>




