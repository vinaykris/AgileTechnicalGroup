<%@ page import="java.util.ArrayList" %>
<%@ page import="example.Product" %>
<html>

<head>

</head>

<body>

<table>

    <tr>
        <th>Full Name</th>
        <th>Category</th>
        <th>Price</th>
        <th>Manufacturer</th>
    </tr>
    <% ArrayList list = (ArrayList) request.getAttribute("products");
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
    %>

    <tr>
        <td><%=((Product) list.get(i)).getProductName()%>
        </td>
        <td><%=((Product) list.get(i)).getCategory()%>
        </td>
        <td><%=((Product) list.get(i)).getPrice()%>
        </td>
        <td><%=((Product) list.get(i)).getDescription()%>
        </td>

    </tr>
    <%
            }
        }
    %>
</table>

<hr>
<form method="post" action="">

    <label> FullName: </label>
    <input type="text" name="fullName"/> </br>
    <label> Category: </label>
    <input type="text" name="category"/> </br>
    <label> Price: </label>
    <input type="text" name="price"/> </br>
    <label> Manufacturer: </label>
    <input type="text" name="manufacturer"/> </br>
    <input type="submit" value="Add">

</form>
</body>
</html>