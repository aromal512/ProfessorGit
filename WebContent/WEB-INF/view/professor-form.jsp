<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="wrapper">
		<div id="header">
		<h2>Professor Application</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Save Professor</h3>
		<hr>
		<form:form action="saveprofessor" modelAttribute ="professor" method="POST">
		
		<!-- ProfessorId -->
		<form:hidden path="professorId"/>
		
		<table>
			<tbody>
			<tr>
				<td><label>Manager Id:</label></td>
				<td><form:input path="managerId"/></td>
			</tr>
			<tr>
				<td><label>First Name:</label></td>
				<td><form:input path="firstName"/></td>
			</tr>
			<tr>
				<td><label>Last Name:</label></td>
				<td><form:input path="lastName"/></td>
			</tr>
			<tr>
				<td><label>DeptNo:</label></td>
				<td><form:input path="deptNo"/></td>
			</tr>
			<tr>
				<td><label>Salary:</label></td>
				<td><form:input path="salary"/></td>
			</tr>
			<tr>
				<td><label>Joining Date:</label></td>
				<td><form:input path="joiningDate"/></td>
			</tr>
			<tr>
				<td><label>Date of Birth:</label></td>
				<td><form:input path="dateofBirth"/></td>
			</tr>
			<tr>
				<td><label>Gender:</label></td>
				<td><form:input path="gender"/></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save"/></td>
			</tr>
			</tbody>
		</table>
		
		
		</form:form>
		<hr>
		<p>
			<a href="list">Back to list</a>
	
	</div>

</body>
</html>