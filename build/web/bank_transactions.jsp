<%-- 
    Document   : bank_transactions
    Created on : Jan 17, 2022, 1:52:35 AM
    Author     : DELL
--%>

<%-- 
    Document   : emp_showemp
    Created on : Jan 13, 2022, 5:14:12 AM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Banking System</title>
        <%@include file="bank_header.jsp" %>
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
                padding: 15px 10px 327px 10px;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }


            td{
                padding: 10px 10px 10px 10px;
            }

            table.data {
                text-align: center;
                width: 200%;
                background-color: #ffffff;
                border-collapse: collapse;
                border-width: 0px;
                border-color: #000000;
                border-style: solid;
                color: #000000;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }

            table.data td, table.data th {
                width: auto;
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
                text-decoration: bold;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                margin-left: auto;
                margin-right: auto;
            }

            .btn:hover {
                background: #14e3a8;
                text-decoration: bold;
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
        <div align="center">
            <h1>User Data </h1>
            <table class="data">
                <thead>
                    <tr>
                        <td id="insert">
<!--                            <a href="_insert.jsp" class="btn">Add New User </a>-->
                        </td>
                        <td id="insert"></td>
                        <td id="insert"></td>
                        <td id="insert"></td>
                        
                        <td id="insert">
                            <a href="javascript:history.back()" class="btn">Back</a>
                        </td>
                    </tr>
                    <tr>
                        <!--<th>Name</th>-->
                        <th>Account No</th>
                        <th>Balance</th>
                        <th>Type</th>
                        <th>Date</th>
                        <th>Time</th>
                    </tr>
                </thead>
                <tbody>
                    
                    <%
                       
                        
                        try {

                            String accno = request.getParameter("an");

                            //if (email.equals("admin@admin.com") && password.equals("admin@1234")) {
                            
                            Class.forName("com.mysql.jdbc.Driver");
                            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                            String query = "select * from transactions where accno="+accno;
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery(query);
                            while (rs.next()) {

                                
//                                String fname = rs.getString("fname");
//                                String lname = rs.getString("lname");
                                String balance = rs.getString("balance");
                                String type = rs.getString("type");
                                String date = rs.getString("date");
                                String time = rs.getString("time");
//                                String phone = rs.getString("phone");
//                                String designation = rs.getString("designation");
//                                String department = rs.getString("department");
//                                double hourly = rs.getDouble("hourly");
//                                int hoursworked = rs.getInt("hoursworked");
//                                int leaves = rs.getInt("leaves");
//                                String name = fname + " " + lname;


                    %>
                    <tr>
                        <td><%= accno%></td>
                        
                        <td><%= balance%></td>
                        <td><%= type%></td>
                        <td><%= date%></td>
                        <td><%= time%></td>




                    </tr>

                    <%
//                            }
//                            }
//                            else{
//                                out.println("You are not admin");
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                    %>

                </tbody>
            </table>
        </div>
                    
    </body>
    
    <%@include file="emp_footer.jsp" %>
</html>
