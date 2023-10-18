<%-- 
    Document   : emp_admin
    Created on : Jan 13, 2022, 5:13:15 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        

        <title>Payroll System</title>
    </head>
    <body>
        <%@include file="emp_header.jsp" %>
        <form action="emp_showemp.jsp" method='post'>
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
 <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <%@include file="emp_footer.jsp" %>
    </body>
</html>
