<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	模版方法模式扩展
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.templateMethod2.*" %>
<br />
<br />
<h4>
<% 
//版本1，给领导用的,WAR发布
Decorator demod1=new WarDecorator(new FirstEdition());
 %><br>
  <% 
 out.print("版本1，给领导用的,WAR发布。");
 %><br>
 <% 
 out.print(demod1.add()+" ");
 out.print(demod1.del()+" ");
 out.print(demod1.export()+" ");
 out.print(demod1.search()+" ");
 out.print(demod1.leadin()+" ");
 out.print(demod1.update()+" ");
 %><br>
  <% //版本2，给员工用的,EAR发布。
  Decorator demod2=new EarDecorator(new SecondEdition());
 %><br>
   <% 
 out.print("版本2，给员工用的,EAR发布。");
 %><br>
 <% 
 out.print(demod2.add()+" ");
 out.print(demod2.del()+" ");
 out.print(demod2.export()+" ");
 out.print(demod2.search()+" ");
 out.print(demod2.leadin()+" ");
 out.print(demod2.update()+" ");
 %><br>
</h4>
<br />
<br />
<br />
<h4>
</BODY>
</HTML>




