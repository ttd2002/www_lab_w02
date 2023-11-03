<%@ page import="vn.edu.iuh.fit.lab_w02.backend.services.CustomerServices" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.models.Customer" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.services.ProductService" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.models.Product" %><%--
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
    <title>Products</title>
</head>
<body>
<%

    ProductService services = new ProductService();
    List<Product> lst_pro =  services.getAllProduct();
%>
<div class="container">
    <h2>Customers</h2>
    <%
        if (lst_pro != null){


    %>
    <table class="table">
        <thead>
        <tr>
            <th>product_id</th>
            <th>product_name</th>
            <th>desc</th>
            <th>unit</th>
            <th>manu</th>
            <th>status</th>
            <th><a href="InsertProduct.jsp">Insert Product</a></th>

        </tr>
        </thead>
        <tbody>
        <%
            for (Product pro : lst_pro){
                long id = pro.getProduct_id();
                String delete_String = "controls?action=delete_Produc&id="+id;
                String update_String = "controls?action=loadFormPro&ProId="+id;
        %>
        <tr>
            <td><%=id%></td>
            <td><%=pro.getName()%></td>
            <td><%=pro.getDescription()%></td>
            <td><%=pro.getUnit()%></td>
            <td><%=pro.getManufacturer()%></td>
            <td><%=pro.getStatus()%></td>
            <th><a href=<%=update_String%>>update</a></th>
            <th><a href=<%=delete_String%>>delete</a></th>

        </tr>
        <%}%>
        </tbody>
    </table>
    <%}%>
</div>
</body>
</html>
