<HTML>
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	�۲���ģʽ
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.observer.*" %> 
<br />
<br />
<h4>
<%
//����ԭ��100Ԫ
Book book = new Book(100);
%>
<% 
out.println("ͨ��EMAIL���͸���������ע���û�:"+String.valueOf(new EmailObserver(book)));//���� observer
%>	
<br >
<% 
out.println("JAVA���˼��۸��Ϊ:"+String.valueOf(book.updatePrice(85)+"Ԫ")); //���Ӳ�Ʒ�۸� 
%>	
 <br >
</h4>
</BODY>
</HTML>




