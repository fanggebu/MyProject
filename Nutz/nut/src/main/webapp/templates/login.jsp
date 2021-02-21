<%--
  Created by IntelliJ IDEA.
  User: AIERXUAN
  Date: 2019/8/26
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="${request.getContextPath()}${pageContext.request.contextPath}/doLogin">
        <input type="text" name="username">
        <input type="password" name="password">
        <input type="submit" value="登录">
    </form>

</body>
</html>
