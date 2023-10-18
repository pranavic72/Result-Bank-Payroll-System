<%-- 
    Document   : result_index
    Created on : Jan 12, 2022, 11:45:13 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <title>Java Projects</title>
        <style>
            .heads{
                padding: 10% 10px 266px 10px;
            }
            h1{
                font-size: 60px;
            }
            .btn {

                border-radius: 3px;
                border: solid;
                border-color: black;
                font-family: Arial;
                color: #000000;
                font-size: 40px;
                padding: 7px;
                background: #00ffbb;
                border: solid #000000 0px;
                text-decoration: none;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                margin-left: auto;
                margin-right: auto;
            }

            .btn:hover {
                background: #14e3a8;
                text-decoration: none;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                margin-left: auto;  background: #14e3a8;

                margin-right: auto;
            }
        </style>
    </head>
    <body>
        <%@include file="java_header.jsp" %>
        <h1>Welcome to Java Projects</h1>
        
        <div class="heads">
        <a href="emp_index.jsp" class="btn">Payroll System</a>
        <a href="result_index.jsp" class="btn">Online Result</a>
        <a href="bank_index.jsp" class="btn">Banking System</a>
        
        </div>
        
        <footer>
            
        <%@include file="emp_footer.jsp" %>
        </footer>
        </body>
</html>
