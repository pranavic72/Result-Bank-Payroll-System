<%-- 
    Document   : admincontrol
    Created on : Dec 27, 2021, 5:58:38 PM
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
        <title>Online Result</title>
        <link rel="stylesheet" type="text/css" href="styles.css"/>
    </head>
    <body>
        <h2>Welcome Admin!</h2> 
        <form action="result_admincontrol.jsp" method="post">
            <fieldset>
                <h1> Student Details </h1>
                <table>
                    <tr> 
                        <td>ID</td>
                        <td><input type="text" class="data" name ="id" id="input"  /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Show" class="btn"/></td>
                    </tr>
                    <%
                        try {
                            String id = request.getParameter("id");
                            Class.forName("com.mysql.jdbc.Driver");
                            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineresult", "root", "");
                            String query = "select * from students where id='" + id + "'";
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery(query);
                            while (rs.next()) {

                                String fname = rs.getString("fname");
                                String lname = rs.getString("lname");
                                String course = rs.getString("course");
                                String batch = rs.getString("batch");
                                String phone = rs.getString("phone");
                                String address = rs.getString("address");
                                String name = fname + " " + lname;


                    %>
                   
                    <form action="result_login.jsp" method="post" name="form1">

                        <tr> 
                            <td></td>
                            <td><input type="hidden" class="data" name ="id" id="input" value="<%=id%>" /></td>
                        </tr>

                        <tr> 
                            <td>Name </td>
                            <td><%= name%></td>
                            <td><input type="hidden" class="data" name ="fname" id="input" value="<%=fname%>"></td>
                        </tr>
                        <tr>
                  
                            <input type="hidden" class="data" name ="lname" id="input" value="<%=lname%>"></td>
                  
                            <td>Course</td>
                            <td><%= course%></td>
                            <td><input type="hidden" class="data" name ="course" id="input" value=" <%= course%>"></td>
                        </tr>
                        <tr> 
                            <td>Batch</td>
                            <td><%= batch%></td>
                            <td><input type="hidden" class="data" name ="batch" id="input" value=" <%= batch%>" ></td>
                        </tr>
                        <tr> 
                            <td>Phone No</td>
                            <td><%= phone%></td>
                            <td><input type="hidden" class="data" name ="phone" id="input" value=" <%= phone%>" ></td>
                        </tr>
                        <tr> 
                            <td>Address</td>
                            <td><%= address%></td>
                            <td><input type="hidden" class="data"  name ="address" id="input" value=" <%= address%>" ></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Back to Admin" class="btn" onclick="form1.action = 'result_admin.jsp'"/></td>
                            <td><input type="reset" class="btn" value="Reset"/></td>
                        </tr>
                </table>
                <%
                        }
                    } catch (Exception e) {
                    }
                %>

            </fieldset>  
        </form>
    </body>
</html>
