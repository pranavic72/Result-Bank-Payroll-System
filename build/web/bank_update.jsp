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


            .input{
                font-size: 25px; 
                display:table-cell;
                border:none;
                width:145px;
                text-align: center;
                border-radius: 5px 5px 5px 5px;
                //padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }
            .input:focus{
                font-size: 25px; 
                display:table-cell;
                border:none;
                background-color:red;
                color:white;
                width:145px;
                text-align: center;
                border-radius: 5px 5px 5px 5px;
                //padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }
        </style>
    </head>
    <body>
        <%@include file="bank_header.jsp" %>
        <div>
            <h1> Employee Details </h1>

            <%
                String id = request.getParameter("id");

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                    String query = "select * from customers where id=" + id;
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {


            %>
            <div align="center">
                <form action="bank_mydata.jsp" method='get'>
                    <table class="data">
                        <tr>
                            <th colspan="4">User Data </th>
                        </tr>
                        <tr>
                            <td>ID:<%= id%></td>
                        <input style="width: 100px;" type="hidden"  class="input" name="id" value="<%= rs.getString("id")%>">

                        <td colspan="3">Name:
                            <input style="width: 100px;" type="text"  class="input" name="fn" value="<%= rs.getString("fname")%>">
                            <input style="width: 140px;" type="text" class="input" name="ln" value="<%= rs.getString("lname")%>">

                        </td>
                        </tr>
                        <tr>
                            <td>Username:</td>
                            <td>                            
                                <input style="width: 110px;" type="text"  class="input" name="un" value="<%= rs.getString("username")%>">

                            </td>
                            <td>Email:</td>
                            <td>                            
                                <input style="width: auto;" type="text"  class="input" name="em" value="<%= rs.getString("email")%>">
                            </td>
                        </tr>
                        <tr>
                            <td>Account No:</td>
                            <td>                            
                                <%= rs.getString("accno")%>
                                <input style="width: 100px;" type="hidden"  class="input" name="ac" value="<%= rs.getString("accno")%> readonly">
                            </td>
                            <td>Balance:</td>
                            <td>                             
                                <%= rs.getString("balance")%>
                                <input style="width: 100px;" type="hidden"  class="input" name="bal" value="<%= rs.getString("balance")%>">
                            </td>
                        </tr>
                        <tr>
                            <td>Phone:</td>
                            <td>                             
                                <input style="width: 200px;" type="text"  class="input" name="ph" value="<%= rs.getString("phone")%>">
                            </td>
                            <td>Zip Code:</td>
                            <td>                            
                                <input style="width: 100px;" type="text"  class="input" name="zip" value="<%= rs.getString("zip")%>">
                            </td>
                        </tr>
                        <tr>
                            <td>Address:</td>
                            <td> 
                                <input style="width: 100px;" type="text"  class="input" name="add" value="<%= rs.getString("address")%>">
                            </td>
                            <td>State:</td>
                            <td>
                                <input style="width: 200px;" type="text"  class="input" name="st" value="<%= rs.getString("state")%>">


                            </td>


                        </tr>
                        <tr>
                            <td align="center" colspan="4"><b><input type="submit" class="btn" value="Submit"/></b>
                                    <%}
                                        } catch (Exception e) {
                                            out.println(e);
                                        }
                                    %>
                            </td>
                        </tr>
                    </table>


                   

            </div>

            <%@include file="bank_footer.jsp" %>
    </body>
</html>

