<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	����ģʽ
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
	out.print("first��GM ����ɫģ�͡�");
 %><br>
  <%  context = new Context(new GM()); //ȡ�û�ɫģ��
	out.print(context.work());//����  
	%><br>
 <% 
//second
 out.print("second��ES ��ָ��ƽ������");
 %><br>
  <%  context = new Context(new ES());
  out.print(context.work());//����
  %><br>
 <% //third
 out.print("third, TE ���������Ʒ���");
  %><br>
   <%  context = new Context(new TE());
   out.print(context.work());//����
   /*
    * ����Ԥ��ģ�͹��࣬������Ҫ�˽���������
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




