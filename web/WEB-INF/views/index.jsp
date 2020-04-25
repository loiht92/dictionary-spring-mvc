<%--
  Created by IntelliJ IDEA.
  User: holoi
  Date: 4/25/20
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/dictionary">
  EnglishWord :
    <input name="englishWord" type="text" placeholder="EnglishWord" >
    <input type="submit" value="dictionary" name="dictionary">

</form>
</body>
</html>
