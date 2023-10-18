<%-- 
    Document   : Display
    Created on : Dec 26, 2021, 7:56:59 PM
    Author     : DELL
--%>

<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Result</title>
        <style>
            .data{
                font-size: 20px; 
                display:table-cell; 
                border-radius: 5px 5px 5px 5px;
                padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }

            .data{
                font-size: 20px; 
                display:table-cell; 
                border-radius: 5px 5px 5px 5px;
                padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                background-color: aqua;

            }
            .input{
                font-size: 20px; 
                display:table-cell;
                border:none;
                width:80px;
                text-align: center;
                border-radius: 5px 5px 5px 5px;
                //padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }
            .input:focus{
                font-size: 20px; 
                display:table-cell;
                border:none;
                background-color:red;
                color:white;
                width:80px;
                text-align: center;
                border-radius: 5px 5px 5px 5px;
                //padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }


            td{
                padding: 20px 20px 20px 20px;
            }

            table.data {
                width: 100%;
                background-color: #ffffff;
                border-collapse: collapse;
                border-width: 0px;
                border-color: #000000;
                text-align: center;
                border-style: solid;
                color: #000000;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }

            table.data td, table.data th {
                width: 200px;
                /* border-width: 2px; */
                border-color: #000000;
                border-style: solid;
                padding: 10px;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }

            table.data th {
                background-color: coral;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }


        </style>
    </head>
    <body>
        <%
             try {
            
                        String id = request.getParameter("id");
                        String trim = request.getParameter("trim");
//                        String s1 = request.getParameter("s1");
//                        String s2 = request.getParameter("s2");
//                        String s3 = request.getParameter("s3");
//                        String s4 = request.getParameter("s4");
//                        String s5 = request.getParameter("s5");
//                        String fn = request.getParameter("fn");
//                        String ln = request.getParameter("ln");
//                        String status = request.getParameter("st");
//                        String name = fn+ln;
                        
//                        int sub1 = Integer.parseInt(s1);
//                        int sub2 = Integer.parseInt(s2);
//                        int sub3 = Integer.parseInt(s3);
//                        int sub4 = Integer.parseInt(s4);
//                        int sub5 = Integer.parseInt(s5);
                        //int id = Integer.parseInt(u);
                        
//                        out.println(sub1);
//                        out.println(s2);
//                        out.println(s3);
//                        out.println(s4);
//                        out.println(s5);
//                        out.println(fn);
//                        out.println(ln);
//                        out.println(trim);
//                        out.println(status);
                        

           
                String query = "";
                String head = "";

                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                if (trim.equals("trim1")) {
                    head = "First";
                    query = "select * from trim1 where id='" + id + "'";
                } else if (trim.equals("trim2")) {
                    head = "Second";
                    query = "select * from trim2 where id='" + id + "'";
                } else if (trim.equals("trim3")) {
                    head = "Third";
                    query = "select * from trim3 where id='" + id + "'";
                } else if (trim.equals("trim4")) {
                    head = "Fourth";
                    query = "select * from trim4 where id='" + id + "'";
                } else if (trim.equals("trim5")) {
                    head = "Fifth";
                    query = "select * from trim5 where id='" + id + "'";
                } else if (trim.equals("trimall")) {
                    head = "Final";
                    query = "select * from trimall where id='" + id + "'";
                } else {
                    out.println("Data not found");
                }
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    String status = rs.getString("status");
                    int sub1 = rs.getInt("sub1");
                    int sub2 = rs.getInt("sub2");
                    int sub3 = rs.getInt("sub3");
                    int sub4 = rs.getInt("sub4");
                    int sub5 = rs.getInt("sub5");
                   int total = sub1 + sub2 + sub3 + sub4 + sub5;
        %>
        <div align="center">

            <table class="data">

                <tr>
                    <th colspan="6">Trimester:</th>
                </tr>
                <tr>
                    <td colspan="3">ID: <%= id%></td>
                    <td colspan="3">Name:</td>
                </tr>
                <tr>
                    <td>Subject</td>
                    <td>Advanced Java</td>
                    <td>Web Technology</td>
                    <td>Database Application</td>
                    <td>Business Statistics</td>
                    <td>Design &amp; Algorithms</td>
                </tr>
                <tr>
                    <td>Marks</td>

                    <td>
                        <form action='result_update.jsp' method="post">
                            <input type="text" class="input" name="sub1" value="<%= sub1%>"/>
                    </td>
                    <td>
                        <input type="text" class="input" name="sub2" value="<%= sub2%>"/>
                    </td>
                    <td>
                        <input type="text" class="input" name="sub3" value="<%= sub3%>"/>
                    </td>
                    <td>
                        <input type="text" class="input" name="sub4" value="<%= sub4%>"/>
                    </td>
                    <td>
                        <input type="text" class="input" name="sub5" value="<%= sub5%>"/>

                    </td>

                </tr>
                <tr>
                    <td colspan="2">Total Marks: <%= total%>/500</td>
                    <%

                        String grade = "";

                        if (total < 150) {
                            grade = "E";
                            //request.setAttribute("grade", grade);
                        } else if (total >= 150 && total <= 170) {
                            grade = "D";
                        } else if (total >= 170 && total <= 200) {
                            grade = "D+";
                        } else if (total >= 201 && total <= 240) {
                            grade = "C-";
                        } else if (total >= 241 && total <= 270) {
                            grade = "C";
                        } else if (total >= 271 && total <= 310) {
                            grade = "C+";
                        } else if (total >= 311 && total <= 340) {
                            grade = "B-";
                        } else if (total >= 341 && total <= 380) {
                            grade = "B";
                        } else if (total >= 381 && total <= 420) {
                            grade = "B+";
                        } else if (total >= 421 && total <= 450) {
                            grade = "A";
                        } else if (total >= 451 && total <= 500) {
                            grade = "A+";
                        }
                        request.setAttribute("grade", grade);


                    %>
                    <td colspan="2">Final Grade: <%= grade%></td>
                    <td colspan="2">Result: <%= status%></td>
                </tr>
                <tr>
                    <%
                        float avg = total / 5;
                        float cgpa = avg / 10;
                
                    %>   
                    <td colspan="5">CGPA: <%= cgpa%></td>
                    <td><input class="data" type="submit" value="Update"></td>
                          
                </tr>
                <%
                }
            }
            catch(Exception e)
            {
            
            }
                %>
                
                </tbody>
            </form>
            </table>
            


        </div>
<!--        // //            
//            try {
//                String sub1 = request.getParameter("sub1");
//                String sub2 = request.getParameter("sub2");
//                String sub3 = request.getParameter("sub3");
//                String sub4 = request.getParameter("sub4");
//                String sub5 = request.getParameter("sub5");
//                if (id != null && trim != null && sub1 != null && sub2 != null && sub3 != null && sub4 != null && sub5 != null) {
//                    String url1 = "jdbc:mysql://localhost:3306/onlineresult";
//                    Class.forName("com.mysql.jdbc.Driver");
//                    Connection conn1 = DriverManager.getConnection(url1, "root", "");
//                    Statement st2 = conn1.createStatement();
//                    //String update = "update "+trim+"set sub1='"+sub1+", sub2='"+sub2+"', sub3='"+sub3+"', sub4='"+sub4+"',sub5='"+sub5+"' where id='"+id+"'";
//                    String update = "update " + trim + " set sub1='" + sub1 + "',sub2='" + sub2 + "',sub3='" + sub3 + "',sub4='" + sub4 + "',sub5='" + sub5 + "' where id=" + id + "";
//
//                    st2.executeUpdate(update);
//
//                }
//
//            } catch (Exception e) {
//                out.println(e);
//            }-->

       
    </body>
</html>
