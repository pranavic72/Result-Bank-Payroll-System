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
        <title>Banking System</title>
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <style>
            fieldset{
                height:250px;
                width:500px;
                padding-bottom: 75px;
                padding-top: 20px;

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


        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            try {

                String url = "jdbc:mysql://localhost:3306/bank";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String query = "select * from customers where username='" + username + "' and password='" + password + "'";
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
//                    String type = rs.getString("type");
                    String un = rs.getString("username");
                    String pw = rs.getString("password");
//                    out.println(un);
//                    out.println(rs.getString("fname"));
                    
                    if (un.equals(username) && pw.equals(password)) {
        %>
        <form action="result_admin.jsp" method='post'>
            <div align="center">

                <h1>Welcome <%=rs.getString("fname")+" " + rs.getString("lname") %> </h1>
                <fieldset>

                    <table>                       
                        <tr>
                            <td><label>View Data: </label></td>
                            <td id="users">
                                <a href='bank_mydata.jsp?id=<%=rs.getString("id")%>' class="btn">View</a>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Update My Details: </label></td>
                            <td id="users">
                                <a href='bank_update.jsp?id=<%=rs.getString("id")%>' class="btn">View</a>
                            </td>
                        </tr>
                        <tr>
                            <td><label>Cash Transaction:</label></td>
                            <td id="students">
                                <a href='bank_userdata.jsp?id=<%=rs.getString("id")%>' class="btn">View</a>
                            </td>
                        </tr>
                        <tr>
                        <tr>
                            <td><label>View Transactions:</label></td>
                            <td id="results">
                                <a href='bank_transactions.jsp?an=<%=rs.getString("accno")%>' class="btn">View</a>
                            </td>
                        </tr>

                    </table>
                </fieldset>
            </div>
        </form>
        <% //                                    } else {
//                        out.println("You are not a registered user");
//                    }
//                }

                }
                    else{
                        out.println("You are not a registered user");
                    }
                }
            }catch (Exception e) {
                out.println(e);
            }

        %>
        <br><br><br><br><br><br><br><br><br><br><br>
        <%@include file="result_footer.jsp" %>
    </body>
</html>
