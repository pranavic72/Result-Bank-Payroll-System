<%-- 
    Document   : result_admincontroller
    Created on : Jan 11, 2022, 5:13:35 PM
    Author     : DELL
--%>

<%-- 
    Document   : admin
    Created on : Dec 27, 2021, 5:35:34 PM
    Author     : DELL
--%>

<%--<%@page import="javax.mail.Transport.send(Message)"%>--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Result</title>
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <style>
            fieldset{
                height:190px;
                width:500px;
                
            }
            label{
                font-size: 30px;
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
            #students,#users, #results{
                border: none;
            }
        </style>
    </head>
    <body>
        <%@include file="result_header.jsp" %>
        <form action="result_admin.jsp" method='post'>
            <div align="center">
                
                <h1>View </h1>
                <fieldset>

                    <table>                       
                        <tr>
                            <td><label>Users:</label></td>
                            <td id="users">
                                <a href="result_showusers.jsp" class="btn">View</a>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Students:</label></td>
                            <td id="students">
                                <a href="result_showstudents.jsp" class="btn">View</a>
                            </td>
                        </tr>
                        <tr>
                        <tr>
                            <td><label>Results:</label></td>
                            <td id="results">
                                <a href="result_profcontrol.jsp" class="btn">View</a>
                            </td>
                        </tr>
                        
                    </table>
                </fieldset>
            </div>
        </form>
        <%
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            try {

                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String query = "select * from users where email='" + email + "' and password='" + password + "'";
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    String type = rs.getString("type");
                    String em = rs.getString("email");
                    String pw = rs.getString("password");

                    if (type.equals("Admin")) {
                        response.sendRedirect("result_admincontrol.jsp");

                    } else {
                        out.println("You are not an admin");
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        %>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <%@include file="result_footer.jsp" %>
    </body>
</html>
