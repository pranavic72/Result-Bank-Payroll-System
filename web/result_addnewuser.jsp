<%-- 
    Document   : result_addnewuser
    Created on : Jan 11, 2022, 5:21:37 PM
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
        <form action="result_addnewuser.jsp" method='get'>
            <div align="center">
                <h1>Add New User</h1>
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
                            <td><label>Type</label><br>
                                <select  class="data" name="type">
                                    <option></option>
                                    <option name="type1" value="trim1"> Admin </option>
                                    <option name="type2" value="trim2"> Student</option>

                                    <option name="type3" value="trim3"> Professor </option>

                                </select>
                            </td>  
 
                        
                        <td>
                            <label>Email:</label><br>
                            <input type="email" class="data" name="email"/><br/>
                        </td>  
                        
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
                
                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String type = request.getParameter("type");
                String email = request.getParameter("email");
                String[] pass = email.split("@");
                String password = pass[0];
                
                if(type.equals("Admin")){
                    String query="insert into users(fname,lname,type,email,password) values('"+fname+"','"+lname+"','"+type+"','"+email+"','"+password+"')";
                    st.executeUpdate(query);
                }
                else if(type.equals("Professor")){
                    String query="insert into users(fname,lname,type,email,password) values('"+fname+"','"+lname+"','"+type+"','"+email+"','"+password+"')";
                    st.executeUpdate(query);
                }
                else if(type.equals("Student")){
                    //query="insert into users(fname,lname,type,email,password) values('"+fname+"','"+lname+"','"+type+"','"+email+"','"+password+"')";
                    response.sendRedirect("result_addnewuser.jsp");
                }
               
                
                else {
                    out.println("error");
                }
                
                

//                if () {
//                    String url = "jdbc:mysql://localhost:3306/onlineresult";
//                    Class.forName("com.mysql.jdbc.Driver");
//                    Connection conn = DriverManager.getConnection(url, "root", "");
//                    Statement st = conn.createStatement();
//                    //Statement st1 = conn.createStatement();
//                    String query = "INSERT INTO students(fname,lname,course,batch,email,phone,address) VALUES('" + fname + "','" + lname + "','" + course + "','" + batch + "','" + email + "','" + phone + "','" + address + "')";
//                    String query2 = "Insert into users(fname,lname,type,email,password) values ('" + fname + "','" + lname + "','" + type + "','" + email + "','" + password + "')";
                    
                    //st.executeUpdate(query2);
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
                    response.sendRedirect("result_admincontroller.jsp");
                }
             catch (Exception e) {
                
            }

        %>
        <br><br><br><br><br><br><br><br><br><br><br><br><br>
        <%@include file="result_footer.jsp" %>
    </body>
</html>
