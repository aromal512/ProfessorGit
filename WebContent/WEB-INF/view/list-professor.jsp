<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Professors</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
		<h2>Professors List</h2>
		</div>
	</div>
	
	<div id="container">
		
		<!-- Add Customer Button:  -->
		<input type="button"  button type="button" class="btn btn-primary" value="Add Professor"
		onclick="window.location.href='showformforadd';return false;"/>
		
		<!-- Add html table here -->
		<table>
			<tr>
				<th>Professor Id</th>
				<th>Manager ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Deptno</th>
				<th>Salary</th>
				<th>Joining Date</th>
				<th>Date of Birth</th>
				<th>Gender</th>
				
			</tr>
			
			<!-- loop over and print our professors -->
			<c:forEach var="tempPr" items="${professors }">
			
				<!-- construct an updateLink with professor Id -->
				<c:url var="updateLink" value="/professor/showformforupdate">
				<c:param name="professorId" value="${tempPr.professorId }"/>
				</c:url>
				
				<!-- construct an deleteLink with customer id -->
				<c:url var="deleteLink" value="/professor/delete">
				<c:param name="professorId" value="${tempPr.professorId }"/>
				</c:url>
				
			<tr>
				<td>${tempPr.professorId}</td>
				<td>${tempPr.managerId}</td>
				<td>${tempPr.firstName}</td>
				<td>${tempPr.lastName}</td>
				<td>${tempPr.deptNo}</td>
				<td>${tempPr.salary}</td>
				<td>${tempPr.joiningDate}</td>
				<td>${tempPr.dateofBirth}</td>
				<td>${tempPr.gender}</td>
				<td>
					<a href="${updateLink}">Edit</a>
					<a href="${deleteLink}"
					onclick="if (!(confirm('Are you sure?'))) return false">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	
	</div>
</body>
</html>