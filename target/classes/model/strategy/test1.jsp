<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	策略模式
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.strategy.*" %>
<br />
<br />
<h4>
<% 
Context context;
 %><br>
 <% 
//first
	out.print("first，GM 即灰色模型。");
 %><br>
  <%  context = new Context(new GM()); //取得灰色模型
	out.print(context.work());//运行  
	%><br>
 <% 
//second
 out.print("second，ES 即指数平滑法。");
 %><br>
  <%  context = new Context(new ES());
  out.print(context.work());//运行
  %><br>
 <% //third
 out.print("third, TE 即趋势外推法。");
  %><br>
   <%  context = new Context(new TE());
   out.print(context.work());//运行
   /*
    * 由于预测模型过多，张玉重要了解了三个。
    */ 
    %><br>
<br>
</h4>
<br />
<br />
<br />
<h4>
</BODY>
</HTML>




