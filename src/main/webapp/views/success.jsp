<%--
  Created by IntelliJ IDEA.
  User: wb
  Date: 2021/7/29
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
登录成功
当前用户：${user.username}<br/>
<a href="${pageContext.request.contextPath}/logout">退出</a>

</body>
</html>
