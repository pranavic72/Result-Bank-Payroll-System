<%-- 
    Document   : result_resultupdate3
    Created on : Jan 12, 2022, 9:15:33 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String u = request.getParameter("u");
//            String trim = request.getParameter("t");
            int s1 = Integer.parseInt(request.getParameter("s1"));
//                        String s2 = request.getParameter("s2");
//                        String s3 = request.getParameter("s3");
//                        String s4 = request.getParameter("s4");
//                        String s5 = request.getParameter("s5");
//                        String fn = request.getParameter("fn");
//                        String ln = request.getParameter("ln");
//                        String status = request.getParameter("st");
//                        String name = fn+ln;
//                        
            //int sub1 = Integer.parseInt(s1);
//                        int sub2 = Integer.parseInt(s2);
//                        int sub3 = Integer.parseInt(s3);
//                        int sub4 = Integer.parseInt(s4);
//                        int sub5 = Integer.parseInt(s5);
            int id = Integer.parseInt(u);

            out.println(id);
            out.println(s1);
//                        
//                        out.println(s2);
//                        out.println(s3);
//                        out.println(s4);
//                        out.println(s5);
//                        out.println(fn);
//                        out.println(ln);
//                        out.println(trim);
//                        out.println(status);

        %>
    </body>
</html>
