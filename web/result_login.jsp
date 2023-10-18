<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
    <head>
        <title>Online Result</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>
    <body>
        <%@include file="result_header.jsp" %>
        <form action="result_studentdata.jsp" method='get'>
            <div align="center">
                <h1>Login </h1>
                <fieldset>

                    <table>                       
                        <tr>
                            <td><label>Enter Email</label></td>
                            <td><input type="text" class="data" name="email"/></td>  
                        </tr>
                        <tr><td><label>Enter Password:</label></td>
                            <td><input type="password" class="data" name="password"/></td>  
                        </tr>
                        <tr>
                            <td colspan="2" align="center"><input type="submit" class="btn" value="Login"/></td>
                        </tr>
                    </table>
                </fieldset>
            </div>
        </form>

    </body>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    <%@include file="result_footer.jsp" %>
</html>
