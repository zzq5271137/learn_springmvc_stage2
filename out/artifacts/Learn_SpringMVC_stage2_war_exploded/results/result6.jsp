<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/16
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List集合接收参数</title>
</head>
<body>
<h1>结果页</h1>
<h1>List集合接收参数</h1>
<h1>商品名称: ${goods.goods_name}</h1>
<h1>商品价格: ${goods.goods_price}</h1>
<h1>
    适用范围:
    <br>
    <c:forEach items="${goods.goods_scale}" var="scale">
        ${scale}<br>
    </c:forEach>
</h1>
<h1>宠物名称:${goods.pat.pat_name}</h1>
<h1>宠物年龄:${goods.pat.pat_age}</h1>
<h1>
    组件:
    <br>
    <c:forEach items="${goods.components}" var="component" varStatus="status">
        <h1>
            组件${status.count}: ${component.component_name}(${component.component_price}元)
        </h1>
    </c:forEach>
</h1>

</body>
</html>
