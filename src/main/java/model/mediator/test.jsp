<HTML>
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	�н���ģʽ
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.mediator.*" %> 
<br />
<br />
<h4>
<%
// �����н��߶���   
ConcreteMediator cm = new ConcreteMediator();   
   
// ʹ��������ͬ�����˽��н��߶���   
Jiangjia jj1 = new Jiangjia(cm);   
Zhangyu zy2 = new Zhangyu(cm);   
   
// ʹ�н����˽��������ͬ�������   
cm.setJiangjia(jj1);   
cm.setZhangyu(zy2);   
   
%>
<% 
out.println("����:"+String.valueOf(jj1.send("���������ѣ����ĺ�˧�ޣ�"))); 
%>	
<br >
  <% 
  out.println("����:"+String.valueOf(zy2.send("�У��ҵ������ѱ���ĸ�˧��")));	 
  %>	
 <br >
</h4>
</BODY>
</HTML>




