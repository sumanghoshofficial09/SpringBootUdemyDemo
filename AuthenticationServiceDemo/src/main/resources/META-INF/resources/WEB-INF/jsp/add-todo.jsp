<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Add Todo Page</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<%@ include file="common/navigation.jspf" %>
<div class="container">
<h5>Add Todo here</h5>
<hr>
<%-- <pre>${error}</pre>
 --%><form:form  method="post"   modelAttribute="todo">
<form:input type="hidden"   path="id" />
<table class="table">
<thead>
<tr>

<th>title</th>
<th>dueDate</th>
<th>priority</th>

</tr>
</thead>
<tbody>
<tr><td><form:input   path="title" required="required" /></td><td><form:input type="date" path="dueDate" required="required"  value="${todo.dueDate}"/><td><form:input  path="priority" required="required" /></td><form:errors path="priority" cssClass="error" />
</tr>
<tr><td><input type="submit" name="submit" class="btn btn-success" color="green"/></td></tr>
</tbody>

</table>
 
</form:form>
</div>

</body>


</html>