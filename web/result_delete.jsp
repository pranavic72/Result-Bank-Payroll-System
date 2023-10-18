<%-- 
    Document   : result_delete
    Created on : Jan 11, 2022, 4:06:49 AM
    Author     : DELL
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

//            String id = request.getParameter("id");
    String u = request.getParameter("u");
    int id = Integer.parseInt(u);

    String url = "jdbc:mysql://localhost:3306/onlineresult";
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, "root", "");
    Statement st = conn.createStatement();
    //String query ="INSERT INTO students(fname,lname,course,batch,email,phone,address) VALUES('"+fname+"','"+lname+"','"+course+"','"+batch+"','"+email+"','"+phone+"','"+address+"')";
    //String query = "update students set fname='" + fname + "', lname='" + lname + "', course='" + course + "', batch='" + batch + "', phone='" + phone + "', address='" + address + "' WHERE id=" + id + "";
    String query = "delete from students where id=" + id + "";
    st.executeUpdate(query);
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

%>

