<%@ page import="java.util.Optional" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.models.Customer" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/19/2023
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Customer</title>
</head>
<body>
<%
    Optional<Customer> cust = (Optional<Customer>) request.getAttribute("cust");

%>
<div class="container">
    <h2>Insert Cusomer</h2>
    <form action="controls?action=update_customer" method="post">

        <div class="form-group">
            <label for="id">Customer id:</label>
            <input type="text" class="form-control" id="id" value="<%=cust.get().getId()%>"  name="Custid" readonly>
        </div>
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" value="<%=cust.get().getName()%>"  name="name">
        </div>
        <div class="form-group">
            <label for="email">email:</label>
            <input type="email" class="form-control" id="email"  value="<%=cust.get().getEmail()%>" name="email">
        </div>
        <div class="form-group">
            <label for="phone">phone:</label>
            <input type="text" class="form-control"  id="phone" value="<%=cust.get().getPhone()%>" name="phone">
        </div>
        <div class="form-group">
            <label for="address">address:</label>
            <input type="text" class="form-control"  id="address"  value="<%=cust.get().getAddress()%>" name="address">
        </div>
        <button type="submit" class="btn btn-default">Update</button>
        <button class="btn btn-default"><a href="Customers.jsp">Back to List</a></button>
    </form>
</div>
</body>
</html>
