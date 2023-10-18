<%-- 
    Document   : sample
    Created on : Jan 11, 2022, 12:41:08 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
//            String email="pranavi.c@somaiya.edu";
//            String[] pass = email.split("@");
//            out.println(pass[0]);
            Random rand = new Random();
            int n = rand.nextInt(100000000) + 1000000000;
            out.println(n);
////            
//            for (String retval: email.split("@")){
//                out.println(retval);
//            }
            %>
    </body>
</html>
