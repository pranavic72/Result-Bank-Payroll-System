<%-- 
    Document   : result_resultupdate2
    Created on : Jan 12, 2022, 8:12:58 PM
    Author     : DELL
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
    
    String id = request.getParameter("id");
    String trim = request.getParameter("trim");
    String sub1 = request.getParameter("sub1");
    String sub2 = request.getParameter("sub2");
    String sub3 = request.getParameter("sub3");
    String sub4 = request.getParameter("sub4");
    String sub5 = request.getParameter("sub5");
    
    out.println(id);
    out.println(trim);
    out.println(sub1);
    out.println(sub2);
//    String url = "jdbc:mysql://localhost:3306/onlineresult";
//    Class.forName("com.mysql.jdbc.Driver");
//    Connection conn = DriverManager.getConnection(url, "root", "");
//    //String update = "update "+trim+"set sub1='"+sub1+", sub2='"+sub2+"', sub3='"+sub3+"', sub4='"+sub4+"',sub5='"+sub5+"' where id='"+id+"'";
//    String update = "update trim1 set sub1=?, sub2=?, sub3=?, sub4=?, sub5=? where id=" + id + "";
//    PreparedStatement ps = conn.prepareStatement(update);
//    ps.setString(1, sub1);
//    ps.setString(2, sub2);
//    ps.setString(3, sub3);
//    ps.setString(4, sub4);
//    ps.setString(5, sub5);
    
//    response.sendRedirect("result_profcontrol.jsp");
%>