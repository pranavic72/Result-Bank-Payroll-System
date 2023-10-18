<%-- 
    Document   : result_showstudentdata
    Created on : Jan 12, 2022, 5:23:57 PM
    Author     : DELL
--%>
<%-- 
    Document   : studentdata
    Created on : Dec 15, 2021, 5:32:16 PM
    Author     : DELL
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Result</title>
        <link rel="stylesheet" type="text/css" href="styles.css"/>
    </head>
    <body style ='text-align: center; '>
        <%@include file="result_header.jsp" %>
        <div>
            <h1> Student Details </h1>
            <%
//                String id = request.getParameter("id");
//                String password = request.getParameter("password");
                String u = request.getParameter("u");
                        int id = Integer.parseInt(u);
                try {
                
                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String query = "select * from students where id='" + id + "'";
                ResultSet rs=st.executeQuery(query);
                
                while (rs.next()){
                    //String id = rs.getString("id");
                        String fname = rs.getString("fname");
                        String lname = rs.getString("lname");
                        String course = rs.getString("course");
                        String batch = rs.getString("batch");
                    
                    
       
                        


            %>
            <form action="result_showresults.jsp" method="post">
                <fieldset>
                    
                    <table>
                        <tr> 
                            <td>ID</td>
                            <td><input type="text" class="data" name ="id" id="input" readonly="readonly" value="<%= id%> " /></td>
                        </tr>
                        
                        <tr> 
                            <td> Name </td>
                            <td><input type="text" class="data" name ="name" id="input" readonly="readonly" value=" <%= fname + " " + lname%>" /> </td>
                                <input type="hidden" class="data" name ="fname" id="input" readonly="readonly" value=" <%= fname %>" /> 
                                <input type="hidden" class="data" name ="lname" id="input" readonly="readonly" value=" <%= lname%>" /> 
                        </tr>

                        <tr> 
                            <td>Course</td>
                            <td><input type="text" class="data" name ="course" id="input" readonly="readonly" value=" <%= course%>"/></td>
                        </tr>

                        <tr> 
                            <td>Batch</td>
                            <td><input type="text" class="data" name ="batch" id="input" readonly="readonly" value=" <%= batch%>" /></td>
                        </tr>

                        
                        <tr>
                            <td><label> Show results of</label></td>
                            <td><select  class="data" name="trim" placeholder="Select one">
                                    <option name="trim1" value="trim1"> Trimester 1</option>
                                    <option name="trim2" value="trim2"> Trimester 2</option>

                                    <option name="trim3" value="trim3"> Trimester 3</option>

                                    <option name="trim4" value="trim4"> Trimester 4</option>

                                    <option name="trim5" value="trim5"> Trimester 5</option>

                                    

                                </select>


                        <tr>
                            <td><input type="submit" value="Show" class="btn"/></td>
                        </tr>
                    </table>


                </fieldset>  
                <%
                    }
                    
                   
                        }
                     catch (Exception e) {

                        out.println(e);
                    }


                %>
            </form>
        </div>
            <br><br><br><br>
                <%@include file="result_footer.jsp" %>
    </body>
</html>
