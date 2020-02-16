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
    <title>包装类接收参数</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/fifth">
    商品名称:<input type="text" name="goods_name" placeholder="请输入商品名称"><br>
    商品价格:<input type="text" name="goods_price" placeholder="请输入商品价格"><br>
    适用范围:
    <input type="checkbox" name="goods_scale" value="篮球">篮球
    <input type="checkbox" name="goods_scale" value="足球">足球
    <input type="checkbox" name="goods_scale" value="乒乓球">乒乓球
    <hr>
    宠物:<br>
    宠物名称:<input type="text" name="pat.pat_name" placeholder="请输入宠物名称"><br>
    宠物年龄:<input type="text" name="pat.pat_age" placeholder="请输入宠物年龄"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
