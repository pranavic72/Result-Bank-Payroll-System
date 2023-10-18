<%-- 
    Document   : bank_cash
    Created on : Jan 16, 2022, 11:43:35 PM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Banking System</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            String transaction = request.getParameter("transaction");
            String bal = request.getParameter("balance");
            String amo = request.getParameter("amount");

            double balance = Double.parseDouble(bal);
            double amount = Double.parseDouble(amo);

            out.println(id);
            out.println(balance);
            out.println(amount);
            out.println(transaction);
            double new_balance = balance + amount;
            //balance = + amount;
            out.println("new balance"+new_balance);

//            try {
//
//                String url = "jdbc:mysql://localhost:3306/bank";
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection conn = DriverManager.getConnection(url, "root", "");
//                Statement st = conn.createStatement();
//                String query = "";
//                
//                if 
//                
//
//            } catch (Exception e) {
//                out.println(e);
//            }
        %>
    </body>
</html>
