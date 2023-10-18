<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        
    </head>
    <body>
        <%@include file="emp_header.jsp" %>
        <form action="emp_empdata.jsp" method='post'>
            <div align="center">
                <h1>Login </h1>
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
