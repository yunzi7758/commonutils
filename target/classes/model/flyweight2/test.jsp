<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	����Ԫģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.flyweight2.*" %>
 
<br />
<br />
<h4>
<% 
ShareFactory factory=new ShareFactory();   
Share share=(Share) factory.factory("������");   
//share.work("����");   
%>

<% out.println("���̶����ϲ�ͬ�����̾�Ϊ����:"+share.work("����"));	%><br >
</h4>
</BODY>
</HTML>




