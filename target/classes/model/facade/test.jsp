<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	门面模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.facade.*" %>
 
<br />
<br />
<h4>
<% 
//上门服务人员-代办人
PublicAgent publicAgent = new PublicAgent();

%>
<% out.println("上门服务:"+publicAgent.sendElectricity());	%><br >

</h4>
</BODY>
</HTML>




