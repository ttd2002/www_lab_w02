<%--
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
    <title>Insert Product</title>
</head>
<body>
<div class="container">
    <h2>Insert Product</h2>
    <form action="controls?action=Insert_product" method="post">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
        </div>
        <div class="form-group">
            <label for="decs">Decsription:</label>
            <input type="text" class="form-control" id="decs" placeholder="Enter decs" name="decs">
        </div>
        <div class="form-group">
            <label for="unit">Unit:</label>
            <input type="text" class="form-control" id="unit" placeholder="Enter unit" name="unit">
        </div>
        <div class="form-group">
            <label for="manu">Manufacturer:</label>
            <input type="text" class="form-control" id="manu" placeholder="Enter manu" name="manu">
        </div>
        <button type="submit" class="btn btn-default">Insert</button>
        <button type="reset" class="btn btn-default">Clear</button>
    </form>
</div>
</body>
</html>
