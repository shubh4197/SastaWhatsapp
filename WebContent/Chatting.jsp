<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${sessionScope.gname}</h1>
<form action="Post" method="post">
<input name="message" type="text"/>
<input type="submit" value="Send"/>
</form>
<c:forEach var="zip" items="${sessionScope.messageList}">
<hr>
${zip.user.fname}:${zip.message}
<hr>
</c:forEach>
</body>
</html>