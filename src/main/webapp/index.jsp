<%@ page import="vn.edu.iuh.fit.lab_w02.backend.repositories.EmployeeRepository" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.models.Employee" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.enums.EmployeeStatus" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.repositories.ProductRepository" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.models.Product" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.enums.ProductStatus" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.models.ProductImage" %>
<%@ page import="vn.edu.iuh.fit.lab_w02.backend.repositories.CustomerRepository" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    //EmployeeRepository repository = new EmployeeRepository();
    //Employee emp = new Employee("teo", new DateTime(2023, 4, 23, 0, 0, 0), "teo@mail.com",
         //   "2349235", "12 NVB", EmployeeStatus.ACTIVE);
    //repository.insertEmp(emp);

    //out.print(emp);*/

    /*ProductRepository productRepository = new ProductRepository();
     Product product = new Product("xoai", "xoai ngot", "kg", "ba dua", ProductStatus.ACTIVE);

    ProductImage productImage = new ProductImage();
    productImage.setAlternative("xxx xxx");
    productImage.setPath("/images/zzz.jpg");

    product.getProductImageList().add(productImage);

    productRepository.insert(product);*/

    //out.print("OK");
    //out.print(productRepository.getAllProduct());
    CustomerRepository customerRepository = new CustomerRepository();

%>
    <a href="Products.jsp">List products</a> <br>
    <a href="Customers.jsp">List Customers</a> <br>
    <a href="Employees.jsp">List Employees</a> <br>
    <a href="Orders.jsp">List Orders</a> <br>

</body>
</html>