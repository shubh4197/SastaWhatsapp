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
<h1>Welcome ${user.fname}</h1>
<form action="CreateGroupServlet" method="post">
<input name="name" type="text"/>
<br>
<c:forEach var="zip" items="${userList}">
<input type="checkbox" name="last" value="${zip.fname}">${zip.fname}
<br>
</c:forEach>
<input type="submit" value="Create Group"/>
</form>
<table>
<tr><td>Group Name</td></tr>
<c:forEach items="${sessionScope.groupList}" var="zip">
<tr><td>${zip.gname}</td><td><a href="ChatServlet?id=${zip.gname}">Check Group</a></td></tr>
</c:forEach>
</table>

</body>
</html>