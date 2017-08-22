<%@ page contentType="text/html;charset=GB2312"%> 
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>迪米特法则</title>
</head>

<body>
<%@ page pageEncoding="GB2312" language="java" import="principle.lkp2.*" %>

<%
   SomeMan jack = new SomeMan();   
   jack.setLinkMan(new LinkMan());        
   out.println(jack.getLinkMan().playWithSomeGirl());
%><br />

</body>
</html>

