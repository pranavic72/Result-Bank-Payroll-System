<%-- 
    Document   : bank_mydata
    Created on : Jan 17, 2022, 2:19:02 AM
    Author     : DELL
--%>

<%-- 
    Document   : emp_empdata
    Created on : Jan 8, 2022, 3:18:01 PM
    Author     : DELL
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link rel="stylesheet" type="text/css" href="styles.css"/>-->

        <title>Banking System</title>
        <style>
            body{
                text-align: center;
                align-content: center;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }
            .data{
                font-size: 25px; 
                display:table-cell; 
                border-radius: 5px 5px 5px 5px;
                padding: 20px 10px 165px 10px;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }


            td{
                padding: 10px 10px 10px 10px;
            }

            table.data {
                text-align: center;
                width: 100%;
                background-color: #ffffff;
                border-collapse: collapse;
                border-width: 0px;
                border-color: #000000;
                border-style: solid;
                color: #000000;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }

            table.data td, table.data th {
                width: 200px;
                /*                border-width: 2px; */
                border-color: #000000;
                border-style: solid;
                padding: 10px;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }

            table.data th {
                background-color: coral;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }
            .btn {

                border-radius: 3px;
                border: solid;
                border-color: black;
                font-family: Arial;
                color: #000000;
                font-size: 25px;
                padding: 7px;
                background: #00ffbb;
                border: solid #000000 0px;
                text-decoration: none;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                margin-left: auto;
                margin-right: auto;
            }

            .btn:hover {
                background: #14e3a8;
                text-decoration: none;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                margin-left: auto;  background: #14e3a8;

                margin-right: auto;
            }
            #insert{
                border: none;
            }



        </style>
    </head>
    <body>
        <%@include file="bank_header.jsp" %>
        <div>
            <h1> Employee Details </h1>

            <%
                

                try {
                    String id = request.getParameter("id");
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                    String query = "select * from customers where id=" + id;
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {


            %>
            <div align="center">
                <table class="data">
                    <tr>
                        <th colspan="4">User Data </th>
                    </tr>
                    <tr>
                        <td>ID:<%= id%></td>
                        <td colspan="3">Name: <%= rs.getString("fname") + " " + rs.getString("lname")%></td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                        <td><%= rs.getString("username")%></td>
                        <td>Email:</td>
                        <td><%= rs.getString("email")%></td>
                    </tr>
                    <tr>
                        <td>Account No:</td>
                        <td> <%= rs.getString("accno")%> </td>
                        <td>Balance:</td>
                        <td> Rs. <%= rs.getString("balance")%>/- </td>
                    </tr>
                    <tr>
                        <td>Phone:</td>
                        <td> <%= rs.getString("phone")%></td>
                        <td>Zip Code:</td>
                        <td><%= rs.getString("zip")%></td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td> <%= rs.getString("address")%></td>
                        <td>State:</td>
                        <td><%= rs.getString("state")%></td>
                    </tr>
                    <tr>
                        <td id="insert"></td>
                        <td id="insert"></td>
                        <td id="insert"></td>
                        <td id="insert"><a href='bank_update.jsp?id=<%= rs.getString("id")%>' class="btn">Edit</a><a href="javascript:history.back()" class="btn">Back</a></td></tr>
                </table>


                <%
                        }
                    } catch (Exception e) {
                        out.println(e);
                    }
 
//                        out.println(add);
                        try {
                            String id = request.getParameter("id");
                            String fn = request.getParameter("fn");
                            String ln = request.getParameter("ln");
                            String un = request.getParameter("un");
                            String em = request.getParameter("em");
                            String acc = request.getParameter("acc");
                            String bal = request.getParameter("bal");
                            String ph = request.getParameter("ph");
                            String zip = request.getParameter("zip");
                            String add = request.getParameter("add");

                            if (fn != null && ln != null & em != null && ph != null && zip != null & add != null) {
                                Class.forName("com.mysql.jdbc.Driver");
                                java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");

                                Statement st2 = conn.createStatement();
                                String query2 = "update customers set fname='" + fn + "', lname='" + ln + "', email='" + em + "', phone='" + ph + "', zip='" + zip + "', address='" + add + "' where id=" + id;
                                st2.executeUpdate(query2);
                            
                            response.sendRedirect("bank_mydata.jsp?id="+id);
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }

                    %>
                %>

            </div>

            <%@include file="bank_footer.jsp" %>
    </body>
</html>

