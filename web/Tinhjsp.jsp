<%-- 
    Document   : Tinhjsp
    Created on : Aug 1, 2024, 10:52:59 PM
    Author     : Admin
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Bai 1</h1>
        <form action="tinh" method="post">
            enter radius: <input type="type" name="r"/></br>
            <input type="submit" name="SUBMIT"/>
        </form>
        <% 
            DecimalFormat f = new DecimalFormat("##.##");
            if(request.getAttribute("sent")!=null){
                double s =(double) request.getAttribute("sent");
        %>   
        <h2> dien tich: <%= f.format(s) %></h2>
        <%  
        }
        %>
      
    </body>
</html>
