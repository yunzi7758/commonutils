<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	解释器模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.interpreter.*" %>
 
<br />
<br />
<h4>
<% 
Context context = new Context();
VariableDesc vd1 = new VariableDesc("X");
VariableDesc vd2 = new VariableDesc("Y");
VariableDesc vdTure = new VariableDesc("true");
VariableDesc vdFalse = new VariableDesc("false");
context.Opinion("true", true);
context.Opinion("false", false);
context.Opinion("X", false);
context.Opinion("Y", true);
//----AND 表达式----
JudgmentDesc description1 = new AndDesc(
    new AndDesc(vdTure, vd2),
    new AndDesc(vd2, new NoDesc(vd1))
);
boolean outcome1 = description1.Opinion(context);
//System.out.println("结果: AND 的逻辑为 " + outcome1);

%>

<% out.println("结果: AND 的逻辑为 " + outcome1);	%><br >
<%//----Or 表达式----
JudgmentDesc description2 = new OrDesc(
		   new OrDesc(vdTure, vd1),
		   new OrDesc(vd2, new NoDesc(vd1))
		);
		boolean outcome2 = description2.Opinion(context);
		//System.out.println("结果: OR 的逻辑为" + outcome2);
		//------------------
%>
<% out.println("结果: OR 的逻辑为" + outcome2);	%><br >
</h4>
</BODY>
</HTML>




