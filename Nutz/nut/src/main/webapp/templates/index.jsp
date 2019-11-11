<%--
  Created by IntelliJ IDEA.
  User: AIERXUAN
  Date: 2019/8/27
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%> <!--数据格式化标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql"%> <!--数据库相关标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%> <!--常用函数标签库-->
<%@ page isELIgnored="false"%> <!--支持EL表达式，不设的话，EL表达式不会解析--> 
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath%>/assets/bootstrap/css/bootstrap.min.css">
</head>

<script src="/assets/bootstrap/js/bootstrap.js"></script>
<script src="/assets/js/jquery-1.11.1.min.js"></script>
<body>
<p id="p">vv</p>
<button></button>
<table class="table table-bordered">
    <caption>123是表格</caption>
    <thead>
    <tr>
        <th>名称</th>
        <th>城市</th>
        <th>邮编</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Tanmay</td>
        <td>Bangalore</td>
        <td>560001</td>
    </tr>
    <tr>
        <td>Sachin</td>
        <td>Mumbai</td>
        <td>400003</td>
    </tr>
    <tr>
        <td>Uma</td>
        <td>Pune</td>
        <td>411027</td>
    </tr>
    </tbody>
</table>
</body>
<script>

    $("#p").on("click", function(){
        alert( $(this).text() );
    });
</script>
</html>
