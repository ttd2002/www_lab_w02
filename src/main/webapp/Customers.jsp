<%@ page import="vn.edu.iuh.fit.lab_w02.backend.services.CustomerServices" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.models.Customer" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/19/2023
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
<%
    CustomerServices services = new CustomerServices();
    List<Customer> lst_cust =  services.getAll();
%>
<div class="container">
    <h2>Customers</h2>
    <table class="table">
        <thead>
        <tr>
            <th>cust_id</th>
            <th>cust_name</th>
            <th>email</th>
            <th>phone</th>
            <th>address</th>
            <th><a href="Insert_Customer.jsp">Insert customer</a></th>

        </tr>
        </thead>
        <tbody>
        <%
            for (Customer cus : lst_cust){
            long id = cus.getId();
            String delete_String = "controls?action=delete_Customer&id="+id;
            String update_String = "controls?action=loadForm&CustId="+id;
        %>
        <tr>
            <td><%=id%></td>
            <td><%=cus.getName()%></td>
            <td><%=cus.getEmail()%></td>
            <td><%=cus.getPhone()%></td>
            <td><%=cus.getAddress()%></td>
            <th><a href=<%=update_String%>>update</a></th>
            <th><a href=<%=delete_String%>>delete</a></th>

        </tr>
        <%}%>
        </tbody>
    </table>
</div>
</body>
</html>
