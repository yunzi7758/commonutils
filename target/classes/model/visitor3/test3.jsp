<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	访问者模式扩展下半部分
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.visitor3.*" %>
<br />
<br />
<h4>
<% 
ObjectStructure obj = new ObjectStructure();  //依赖ObjectStructure                                            
%><br>
 <% 
//具体元素的实例化                                                     
 obj.increase(new Horse()); 
 obj.increase(new Moke());
 obj.increase(new Mule());      //新增一种具体元素mule  
 %><br>
<%                                                                             
//在处理身高时，各元素的不同反应
IVisitor stature = new Stature();           //依赖Visitor接口 
%><br>
<% 
out.print(obj.show(stature)+" ");   
%><br>
<% 
//在处理体重时，各元素的不同反应                                                                                                             
IVisitor weight = new Weight();          //依赖Visitor接口        
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




