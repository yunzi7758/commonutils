<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	对象适配器模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.adapter.objectadapter.*" %>
 
<br />
<br />
<h4>
<% 
//		创建一个对象
	        ProduceShoe p = new ProduceShoe(null);   
	        p.getShoe();   
	        p.getDress();   
		%>
</h4>
<% out.println("公司产品:"+  p.getShoe());	
  out.println(  p.getDress());%><br />
</BODY>
</HTML>




