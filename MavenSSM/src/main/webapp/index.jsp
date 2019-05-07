<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8" >
    <title>home</title>
</head>
<body>
<h2>Hello World!</h2>
<p>
    <%
        SimpleDateFormat  formatter =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now=new Date();
    %>
    系统当前时间:
    <%=formatter.format(now)%>
</p>
</body>
</html>
