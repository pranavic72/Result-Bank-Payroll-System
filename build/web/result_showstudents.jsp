<%-- 
    Document   : result_showstudents
    Created on : Jan 11, 2022, 12:02:43 AM
    Author     : DELL
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--        <link rel="stylesheet" type="text/css" href="styles.css"/>-->
        <title>Online Result</title>
        <style>
/*            div{
                margin:auto;
                padding: 1% 15% 1% 15%;
            }            
            .data{
                font-size: 20px; 
                display:table-cell; 
                border-radius: 5px 5px 5px 5px;
                position: absolute;
                                        top: 20%;
                padding: auto;

                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }


            td{
                padding: 10px
            }

            table.data {
                                    position: absolute;
                width: auto;
                                padding: 50%;
                background-color: #ffffff;
                border-collapse: collapse;
                border-width: 0px;
                border-color: #000000;
                text-align: center;
                border-style: solid;
                color: #000000;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }

            table.data td, table.data th {
                width: auto;

                 border-width: 2px; 
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
                font-size: 20px;
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
            }*/
 body{
                text-align: center;
                align-content: center;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }
            .data{
                font-size: 20px; 
                display:table-cell; 
                border-radius: 5px 5px 5px 5px;
                padding: 15px 10px 37px 10px;
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
                font-size: 20px;
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
        
        <div align="center">
            <%@include file="result_header.jsp" %>
            <table class="data">
                <thead>
                     <tr>
                        <td id="insert">
                            <a href="result_addnewstudent.jsp" class="btn">Add New Student </a>
                        </td>
                         <td id="insert"></td>
                            <td id="insert"></td>
                            <td id="insert"></td>
                            <td id="insert">
                            <td id="insert">
                            <td id="insert">
                                <a href="result_admincontroller.jsp" class="btn">Back</a>
                            </td>
                    </tr>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Course</th>
                        <th>Email</th>
                        <th>Phone</th>
                        <th>Address</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineresult", "root", "");
                            String query = "select * from students";
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery(query);

                            while (rs.next()) {
                                String id = rs.getString("id");
                                String fname = rs.getString("fname");
                                String lname = rs.getString("lname");
                                String course = rs.getString("course");
                                String batch = rs.getString("batch");
                                String email = rs.getString("email");
                                String phone = rs.getString("phone");
                                String address = rs.getString("address");
                                String name = fname + " " + lname;
                                String courseb = course + " " + batch;


                    %>
                    <tr>
                        <td><%= id%></td>
                        <td><%= name%></td>
                        <td><%= courseb%></td>
                        <td><%= email%></td>
                        <td><%= phone%></td>
                        <td><%= address%></td>
                        <td>
                            <a href='result_update.jsp?u=<%=rs.getString("id")%>' class="btn">Edit</a>
                            <a href='result_delete.jsp?u=<%=rs.getString("id")%>' class="btn">Delete</a>
<!--                            <a href='result_resultupdate10.jsp?u= //rs.getString("id")' class="btn">lol work </a>-->
                        </td>


                    </tr>
                    
                    <%
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                    %>

                </tbody>
            </table>
        </div>
                    <%@include file="result_footer.jsp" %>      
    </body>

</html>
