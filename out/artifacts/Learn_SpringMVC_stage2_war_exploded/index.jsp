<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/16
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn SpringMVC stage 2</title>
</head>
<body>
<h1>Learn SpringMVC stage 2</h1>

<a href="${pageContext.request.contextPath}/requests/request1.jsp">
    使用原生HttpServletRequest接收参数
</a>

<hr>

<a href="${pageContext.request.contextPath}/requests/request2.jsp">
    使用处理器形参的方式接收参数
</a>

<hr>

<a href="${pageContext.request.contextPath}/requests/request3.jsp">
    使用JavaBean的方式接收参数
</a>

<hr>

<a href="${pageContext.request.contextPath}/requests/request4.jsp">
    数组接收参数
</a>

<hr>

<a href="${pageContext.request.contextPath}/requests/request5.jsp">
    包装类接收参数
</a>

<hr>

<a href="${pageContext.request.contextPath}/requests/request6.jsp">
    List集合接收参数
</a>

<hr>

<a href="${pageContext.request.contextPath}/requests/request7.jsp">
    参数类型转换
</a>

<hr>

<a href="${pageContext.request.contextPath}/requests/request8.jsp">
    自定义参数类型转换
</a>

<hr>

<a href="${pageContext.request.contextPath}/requests/request9.jsp">
    POST请求中文乱码问题
</a>

</body>
</html>
