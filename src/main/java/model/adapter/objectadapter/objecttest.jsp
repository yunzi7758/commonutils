<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	����������ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.adapter.objectadapter.*" %>
 
<br />
<br />
<h4>
<% 
//		����һ������
	        ProduceShoe p = new ProduceShoe(null);   
	        p.getShoe();   
	        p.getDress();   
		%>
</h4>
<% out.println("��˾��Ʒ:"+  p.getShoe());	
  out.println(  p.getDress());%><br />
</BODY>
</HTML>




