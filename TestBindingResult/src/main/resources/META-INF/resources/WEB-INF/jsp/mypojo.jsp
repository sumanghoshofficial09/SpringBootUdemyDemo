<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>This is Add pojo Page</title>
</head>
<body>
<form:form  method="post" modelAttribute="mypojo">
 <div>
            <label for="name">Name:</label>
<form:input   path="name"/>
 <form:errors path="name" cssClass="error" />
 </div>

<input type="submit" /> ${msg}
<a href="listpojo">List Pojo</a>

</form:form>
</body>
</html>