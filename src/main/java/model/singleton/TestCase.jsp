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

<%@ page pageEncoding="GB2312" language="java" import="model.singleton.*" %>
 
<br />
<br />
<h4>
<% 
//���ö���ʽ����ģʽ�����������ʵ��    
  out.println("1.����ʽ����ģʽ�������ʵ��:");
  out.println("*****************************************");
  for(int x=0;x<5;x++)
  { 
    int y=x+1;
   out.println("�� "+y+" ��"+"�õ��Ķ���ֵΪ"+JackSingleton.getInstance());
  }
 %><br>
 <%
//��������ʽ����ģʽ�����������ʵ��    
  out.println("2.��������ģʽ�������ʵ��:");
  out.println("*****************************************");
  for(int x=0;x<5;x++)
  { 
    int y=x+1;
   out.println("�� "+y+" ��"+"�õ��Ķ���ֵΪ"+JackSingletonOne.getInstance());
  } 
  %><br>
  <%
//��ʹ�õ���ģʽ�����������ʵ��   
  out.println("3.�ǵ���ģʽ�������ʵ����");
  out.println("*****************************************");  
  for(int x=0;x<5;x++)
  {
       int z=x+1;
       NoName noName=new NoName();
       out.println("�� "+z+" ��"+"�õ��Ķ���ֵΪ"+noName);
  }
 //}
 %><br>
</h4>

<br />
<br />
<br />

<h4>

</BODY>
</HTML>




