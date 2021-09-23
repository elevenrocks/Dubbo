<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/9/22
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"; %>--%>
<html>
<head>

    <title>注册中心使用::</title>
</head>
<body>
<div align="center">
    <h1>用户信息</h1>
    <div>用户Id:${user.id}</div>
    <div>用户名:${user.name}</div>
    <div>用户年龄:${user.age}</div>
    <div>用户数量:${count}</div>
    <h1>用户信息</h1>
    <div>用户Id:${user1.id}</div>
    <div>用户名:${user1.name}</div>
    <div>用户年龄:${user1.age}</div>
    <div>用户数量:${count1}</div>
</div>
</body>
</html>
