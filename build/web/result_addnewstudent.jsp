<%-- 
    Document   : result_addnewstudent
    Created on : Jan 11, 2022, 12:00:39 AM
    Author     : DELL
--%>

<%--<%@page import="java.sql.PreparedStatement"%>--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <title>Online Result</title>
    </head>
    <body>
        <%@include file="result_header.jsp" %>
        <form action="result_addnewstudent.jsp" method='post'>
            <div align="center">
                <h1>Add New Student</h1>
                <fieldset>
                    <table>                       
                        <tr>
                            <td>
                                <label>First Name:</label><br>
                                <input type="text" class="data" name="fname"/>
                            </td>  
                            <td>
                                <label>Last Name:</label><br>
                                <input type="text" class="data" name="lname"/><br/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Course</label><br>
                                <input type="text" class="data" name="course"/>
                            </td>  
                            <td>
                                <label>Batch</label><br>
                                <input type="text" class="data" name="batch"/><br/>
                            </td>  
                        </tr>
                        <td>
                            <label>Email:</label><br>
                            <input type="email" class="data" name="email"/><br/>
                        </td>  
                        <td>
                            <label>Phone:</label><br>
                            <input type="text" class="data" name="phone"/><br/>
                        </td>
                        <tr>
                            <td colspan="2"><label>Address:</label><br>
                                <input type="text" class="data" name="address"/><br/>
                            </td>

                        </tr>
                        <tr>
                            <td colspan="2" align="center"><input type="submit" class="btn" value="Submit"/></td>
                        </tr>
                    </table>
                </fieldset>
            </div>
        </form>
        <%
//            String id = request.getParameter("id");
            try {
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String course = request.getParameter("course");
                String batch = request.getParameter("batch");
                String email = request.getParameter("email");

                String phone = request.getParameter("phone");
                String address = request.getParameter("address");
                String[] pass = email.split("@");
                String password = pass[0];
                String type="Student";

                if (fname != null && lname != null && course != null && batch != null && email != null && phone != null && address != null) {
                    String url = "jdbc:mysql://localhost:3306/onlineresult";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, "root", "");
                    Statement st = conn.createStatement();
                    //Statement st1 = conn.createStatement();
                    String query = "INSERT INTO students(fname,lname,course,batch,email,phone,address) VALUES('" + fname + "','" + lname + "','" + course + "','" + batch + "','" + email + "','" + phone + "','" + address + "')";
                    String query2 = "Insert into users(fname,lname,type,email,password) values ('" + fname + "','" + lname + "','" + type + "','" + email + "','" + password + "')";
                    st.executeUpdate(query);
                    st.executeUpdate(query2);
//                    PreparedStatement st = null;
//                    String query = "INSERT INTO students(fname,lname,course, batch, email, phone, address VALUES(?,?,?,?,?,?,?)";
//                    st = conn.prepareStatement(query);
//                    st.setString(1, fname);
//                    st.setString(2, lname);
//                    st.setString(3, course);
//                    st.setString(4, batch);
//                    st.setString(5, email);
//                    st.setString(6, phone);
//                    st.setString(7, address);
                    response.sendRedirect("result_showstudents.jsp");
                }
            } catch (Exception e) {
//                out.println(e);
            }

        %>
        <br><br><br>
        <%@include file="result_footer.jsp" %>
    </body>
</html>
