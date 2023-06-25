
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
	<div>Welcome ${name}</div>
	<hr>
	

	<div>Your todos are</div>
	<table class="table">
	<thead>
	<tr>
	<th>id</th>
	<th>title</th>
	<th>User</th>
	<th>dueDate</th>
	<th>Priority</th>
	<th>  </th>
	<th>  </th>
	</tr>
	
	</thead>
	<tbody>
	<c:forEach items="${todos}" var="todo">
	<tr>
	<td>${todo.id}</td>
	<td>${todo.title}</td>
	<td>${todo.user}</td>
	<td>${todo.dueDate}</td>
	<td>${todo.priority}</td>
	<td><a   href="delete-to-do?id=${todo.id}" class="btn btn-warning"> DELETE </a></td>
	<td><a   href="update-to-do?id=${todo.id}" class="btn btn-success"> UPDATE </a></td>
	</tr>
	</c:forEach>
	</tbody>
	
	
	</table>
	<a href="add-todo"><h4>Add My todo</h4></a>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</div>
</body>




</html>