<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	������ģʽ��չ�°벿��
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.visitor3.*" %>
<br />
<br />
<h4>
<% 
ObjectStructure obj = new ObjectStructure();  //����ObjectStructure                                            
%><br>
 <% 
//����Ԫ�ص�ʵ����                                                     
 obj.increase(new Horse()); 
 obj.increase(new Moke());
 obj.increase(new Mule());      //����һ�־���Ԫ��mule  
 %><br>
<%                                                                             
//�ڴ������ʱ����Ԫ�صĲ�ͬ��Ӧ
IVisitor stature = new Stature();           //����Visitor�ӿ� 
%><br>
<% 
out.print(obj.show(stature)+" ");   
%><br>
<% 
//�ڴ�������ʱ����Ԫ�صĲ�ͬ��Ӧ                                                                                                             
IVisitor weight = new Weight();          //����Visitor�ӿ�        
 %><br>
  <% 
  out.print(obj.show(weight)+" ");   
 %><br>
  <br>
</h4>
<br />
<br />
<h4>
</BODY>
</HTML>




