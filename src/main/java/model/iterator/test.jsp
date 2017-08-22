<HTML>
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	迭代器模式
	</TITLE>
</HEAD>
<BODY BGCOLOR="white">
<%@ page pageEncoding="GB2312" language="java" import="model.iterator.*" %> 
<br />
<br />
<h4>
<% 
//定义一个List，存放所有的项目对象
ICost cost = new Cost();
//采购支出
cost.add("采购",10,100000);
//人力支出
cost.add("人力",100,10000000);
//纳税支出
cost.add("纳税",10000,1000000000);
//这边30个项目
for(int i=4;i<34;i++){
	cost.add("第"+i+"个支出",i*5,i*1000000);
}
//遍历一下ArrayList，把所有的数据都取出
ICostIterator projectIterator = cost.iterator();
while(projectIterator.hasNext()){
	ICost p = (ICost)projectIterator.next();
%>
<% 
  out.println(p.getProjectInfo());	
} 
  %><br >
</h4>
</BODY>
</HTML>




