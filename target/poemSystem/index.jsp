<%--
  Created by IntelliJ IDEA.
  User: 邱贤锋
  Date: 2020/3/28
  Time: 16:32
  To change this template use File | Settings | File Templates.
<%--
  Created by IntelliJ IDEA.
  User: southwind
  Date: 2019-03-21
  Time: 09:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Titlexxxx</title>U
</head>
<body>
<c:forEach items="${list}" var="user">
    ${user.id}--${user.username}--${user.password}<br/>
</c:forEach>
</body>
</html>