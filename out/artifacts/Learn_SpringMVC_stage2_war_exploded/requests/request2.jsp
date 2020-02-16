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
    <title>使用处理器形参的方式接收参数</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/second">
    商品名称:<input type="text" name="goods_name" placeholder="请输入商品名称"><br>
    商品价格:<input type="text" name="goods_price" placeholder="请输入商品价格"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
