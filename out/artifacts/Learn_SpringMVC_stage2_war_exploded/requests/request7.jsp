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
    <title>参数类型转换</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/myConvert1">
    年龄: <input type="text" name="age" placeholder="请输入年龄"><br>
    生日: <input type="text" name="dob" placeholder="请输入生日"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
