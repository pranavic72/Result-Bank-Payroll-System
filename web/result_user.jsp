<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : update
    Created on : Dec 27, 2021, 8:16:31 PM
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
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <title>Online Result</title>
    </head>
    <body>
        <%@include file="result_header.jsp" %>
        <form action="result_user.jsp" method='get'>
            <div align="center">
                <h1>Update</h1>
                <%

                    try {
                        String u = request.getParameter("u");
//                        int id = Integer.parseInt(u);
//                        String id = request.getParameter("id");
//                        
//                        String fn = request.getParameter("fname");

                        String url = "jdbc:mysql://localhost:3306/onlineresult";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(url, "root", "");
                        Statement stat = conn.createStatement();
//                        String data = "select * from students where id='"+request.getParameter("id")+"'";
                        String data = "select * from users where id ='" + u + "'";
                        ResultSet res = stat.executeQuery(data);
                        while (res.next()) {

                %>
                <fieldset>
                    <table>  
                        <input type="text" class="data" name="id" value="<%= u%>"/>

                        <tr>


                            <td>
                                <label>First Name:</label><br>
                                <input type="text" class="data" name="fname" value="<%= res.getString("fname")%>"/><br/>
                            </td>
                            <td>
                                <label>Last Name:</label><br>
                                <input type="text" class="data" name="lname" value="<%= res.getString("lname")%>"/><br/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Type</label><br>
                                <input type="text" class="data" name="type" value="<%= res.getString("type")%>"/><br/>

                            </td>  
                            <td>
                                <label>Email:</label><br>
                                <input type="email" class="data" name="email" value="<%= res.getString("email")%>"/><br/>
                            </td>  
                        </tr>
                        
                            <%        }
                                } catch (Exception e) {
                                }
                            %>
                        
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
                String id = request.getParameter("id");
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String type = request.getParameter("type");
                //String batch = request.getParameter("batch");
                String email = request.getParameter("email");
                //String phone = request.getParameter("phone");
                //String address = request.getParameter("address");
                String[] pass = email.split("@");
                String password = pass[0];
               // String type = "Student";

                    String url = "jdbc:mysql://localhost:3306/onlineresult";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, "root", "");
                    Statement st2 = conn.createStatement();
                    //String query ="INSERT INTO students(fname,lname,course,batch,email,phone,address) VALUES('"+fname+"','"+lname+"','"+course+"','"+batch+"','"+email+"','"+phone+"','"+address+"')";
                    String query2 = "update users set fname='" + fname + "', lname='" + lname + "', type='" + type + "', email='" + email + "', password='" + password + "' WHERE id=" + id + "";

                    //String query2 = "update users set fname='"+fname+"',lname='"+lname+"', type='"+type+"', email='" +email+ ", password='"+password+" where email=" +email+" and password="+password+"";
                    st2.executeUpdate(query2);
////                    String query1 = "select * from students where id = '" + id + "'";
////                    //Statement st1=conn.createStatement();
////                    ResultSet rs = st.executeQuery(query1);
////                    while (rs.next()) {
////                        String sid = rs.getString("id");
////                        String fn = rs.getString("fname");
////                        String ln = rs.getString("lname");
////                        String em = rs.getString("email");
////
////                        out.println(fn);
////                        out.println(ln);
////                        out.println(em);
////
//////                        out.println("email");
////                        String[] pass = em.split("@");
////                        String password = pass[0];
////                        out.println(password);
////                        String type = "Student";
////                        String query2 = "update users set sid ='" + sid + "',fname='" + fn + "',lname='" + ln + "', type='" + type + "', email='" + em + "', password='" + password + "' where  sid =" + sid + "";
//
//                        st.executeUpdate(query2);
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
                        response.sendRedirect("result_showusers.jsp");
                    //}
                //}
            } catch (Exception e) {
               // out.println(e);
            }

        %>
        <br><br><br>
        <%@include file="result_footer.jsp" %>
    </body>

</html>