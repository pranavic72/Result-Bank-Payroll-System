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
       
    </head>
    <body>
        <%@include file="result_header.jsp" %>
        <form action="result_admin.jsp" method='post'>
            <div align="center">
                <h1>Admin Login </h1>
                <fieldset>

                    <table>                       
                        <tr>
                            <td><label>Enter Email</label></td>
                            <td><input type="text" class="data" name="email"/><br/></td>  
                        </tr>
                        <tr><td><label>Enter Password:</label></td>
                            <td><input type="password" class="data" name="password"/><br/></td>  
                        </tr>
                        <tr>
                            <td colspan="2" align="center"><input type="submit" class="btn" value="Login"/></td>
                        </tr>
                    </table>
                </fieldset>
            </div>
        </form>
        <%
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            
             try {
                
                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String query = "select * from users where email='" + email + "' and password='" + password + "'";
                ResultSet rs=st.executeQuery(query);
                
                while (rs.next()){
                    String type=rs.getString("type");
                    String em=rs.getString("email");
                    String pw=rs.getString("password");
                    
                    if (type.equals("Admin")){
                        response.sendRedirect("result_admincontroller.jsp");

                    }
                    else if (type.equals("Professor")){
                        response.sendRedirect("result_profcontrol.jsp");
                    }
                    
                    else
                    {
                        out.println("You are not an admin");
                    }
                }
                
             }
             
             catch(Exception e){
                 e.printStackTrace();
             }
            
            %>
            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            <%@include file="result_footer.jsp" %>
    </body>
</html>
