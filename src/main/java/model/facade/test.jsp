<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	����ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.facade.*" %>
 
<br />
<br />
<h4>
<% 
//���ŷ�����Ա-������
PublicAgent publicAgent = new PublicAgent();

%>
<% out.println("���ŷ���:"+publicAgent.sendElectricity());	%><br >

</h4>
</BODY>
</HTML>




