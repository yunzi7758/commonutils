<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	桥接模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.bridge.*" %>
 
<br />
<br />
<h4>
<% 
       HouseImp villaimp = new VillaImp();
       ExtensionHouse ext = new ExtensionHouse();
       ext.setHouseImp(villaimp);
       ext.method("Show1:");
		%>
</h4>
<% out.println("房子类别:"+ ext.method("Show1:"));	%><br />
  <% 
       HouseImp flatimp = new FlatImp();
       ext.setHouseImp(flatimp);
       ext.method("Show2:"); 
		%>
		 <% out.println(  ext.method("Show2:"));%><br />
</BODY>
</HTML>




