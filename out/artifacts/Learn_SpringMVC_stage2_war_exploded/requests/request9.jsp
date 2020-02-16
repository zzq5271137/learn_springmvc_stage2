<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/16
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>POST请求中文乱码问题</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/chinese" method="post">
    姓名: <input type="text" name="name" placeholder="请输入姓名"><br>
    年龄: <input type="text" name="age" placeholder="请输入年龄"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
