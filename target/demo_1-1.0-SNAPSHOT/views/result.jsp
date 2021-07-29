<%--
  Created by IntelliJ IDEA.
  User: wb
  Date: 2021/7/29
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result.jsp</title>
</head>
<body>
<form method="post" action="/demo_1/paramType/test1">
  姓名：<input name="name" value="Wanghuan"><br/>
  年龄:<input name="age" value="30"><br/>
  <input type="submit" value="提交">
</form>
<br/><br/>
<form method="post" action="/demo_1/paramType/tes2">
    姓名：<input name="name" value="Wang"><br/>
    年龄:<input name="age" value="30"><br/>
    <input type="submit" value="提交">
</form>
<br/>
<br/>
<form method="post" action="/demo_1/paramType/test3">
    姓名：<input name="pname" value="wanghuan"><br/>
    年龄:<input name="page" value="30"><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
