<HTML>
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	中介者模式
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.mediator.*" %> 
<br />
<br />
<h4>
<%
// 具体中介者对象   
ConcreteMediator cm = new ConcreteMediator();   
   
// 使两个具体同事类了解中介者对象   
Jiangjia jj1 = new Jiangjia(cm);   
Zhangyu zy2 = new Zhangyu(cm);   
   
// 使中介者了解各个具体同事类对象   
cm.setJiangjia(jj1);   
cm.setZhangyu(zy2);   
   
%>
<% 
out.println("蒋佳:"+String.valueOf(jj1.send("瞧我男朋友，长的很帅噢！"))); 
%>	
<br >
  <% 
  out.println("张余:"+String.valueOf(zy2.send("切，我的男朋友比你的更帅！")));	 
  %>	
 <br >
</h4>
</BODY>
</HTML>




