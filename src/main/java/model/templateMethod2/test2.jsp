<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	ģ�淽��ģʽ��չ
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.templateMethod2.*" %>
<br />
<br />
<h4>
<% 
//�汾1�����쵼�õ�,WAR����
Decorator demod1=new WarDecorator(new FirstEdition());
 %><br>
  <% 
 out.print("�汾1�����쵼�õ�,WAR������");
 %><br>
 <% 
 out.print(demod1.add()+" ");
 out.print(demod1.del()+" ");
 out.print(demod1.export()+" ");
 out.print(demod1.search()+" ");
 out.print(demod1.leadin()+" ");
 out.print(demod1.update()+" ");
 %><br>
  <% //�汾2����Ա���õ�,EAR������
  Decorator demod2=new EarDecorator(new SecondEdition());
 %><br>
   <% 
 out.print("�汾2����Ա���õ�,EAR������");
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




