<HTML>
<!--
	��������ģʽʵ��ʱ���ͻ�����Ҫ����ʵ�����Ǹ�������ʵ�������ࡣ��ˣ�������Ҫѡ���жϵ����⡣
     Ȼ�������������Ѽ򵥹������ڲ��߼��ж��Ƶ��˿ͻ��˴��������С�  
     ������Ա��Ҫ��ӵĹ��ܣ��������޸Ĺ����࣬���������޸Ŀͻ��ˡ�
	@author jianghc  
-->

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	��������ģʽ
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.factorymethod.*" %>
<jsp:useBean id="IF" scope="session" class="model.factorymethod.IndustryFactory"/>
<jsp:useBean id="BF" scope="session" class="model.factorymethod.BecilityFactory"/>
 
<br />
<br />
<h4>
<% 
	XiaoMing becility=BF.CreateXiaoMing();   
	out.println("Becility");   
%>
</h4>
<% out.println("SkillOne: " + becility.SkillOne()); %><br />
<% out.println("SkillTwo: " + becility.SkillTwo()); %><br />
<% out.println("Industry: " + becility.Industry()); %>
<br />
<br />
<br />

<h4>
<% 
	XiaoMing Industry=IF.CreateXiaoMing();   
	out.println("Industry");   
%>
</h4>
<% out.println("SkillOne: " + Industry.SkillOne()); %><br />
<% out.println("SkillTwo: " + Industry.SkillTwo()); %><br />
<% out.println("Industry: " + Industry.Industry()); %>
</BODY>
</HTML>




