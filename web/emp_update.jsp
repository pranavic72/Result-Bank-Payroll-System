<%-- 
    Document   : emp_update
    Created on : Jan 13, 2022, 5:33:51 AM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payroll System</title>

        <style>

            div{
                margin:auto;
                padding: 1% 25% 1% 25%;
            }            
            .data{
                font-size: 20px; 
                display:table-cell; 
                border-radius: 5px 5px 5px 5px;
                position: absolute;
                /*                        top: 20%;*/
                padding: auto;

                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }


            td{
                padding: 10px
            }

            table.data {
                /*                    position: absolute;*/
                width: auto;
                /*                padding: 50%;*/
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
                width: auto;

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
            .btn {

                border-radius: 3px;
                border: solid;
                border-color: black;
                font-family: Arial;
                color: #000000;
                font-size: 20px;
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
            #insert{
                border: none;
            }
            .input{
                font-size: 20px; 
                display:table-cell;
                border:none;

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

                text-align: center;
                border-radius: 5px 5px 5px 5px;
                //padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }

        </style>

    </head>
    <body>
        <%
            try {
                String u = request.getParameter("u");
                int id = Integer.parseInt(u);

                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root", "");
                String query = "select * from employee where id='" + id + "'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {

                    String salutation = rs.getString("salutation");
                    String fname = rs.getString("fname");
                    String lname = rs.getString("lname");
                    String dob = rs.getString("dob");
                    String phone = rs.getString("phone");
                    String designation = rs.getString("designation");
                    String dateofjoin = rs.getString("dateofjoin");
                    String bankname = rs.getString("bankname");
                    String accno = rs.getString("accno");
                    String branch = rs.getString("branch");
                    String department = rs.getString("department");
                    String hourly = rs.getString("hourly");
                    String hoursworked = rs.getString("hoursworked");
                    String leaves = rs.getString("leaves");
                    String name = salutation + ". " + fname + " " + lname;

        %>
        <div align="center">
            <form action="emp_update.jsp" method='post'>
                <table class="data">
                    <tr>
                        <th colspan="4">Employee ID: <%= id%></th>
                    </tr>
                    <tr>

                        <td colspan="2"> 
                            <input type="text" name="salu" class="input" value="<%=salutation%>">
                            <input type="text"  class="input" name="fn" value="<%= fname%>">
                            <input type="text" class="input" name="ln" value="<%= lname%>">
                        </td>
                        <td>Phone:<br><input type="text" class="input" name="ph" value="<%= phone%>"></td>
                        <td>Acc No:<br><input type="text" class="input" name="acc" value="<%= accno%>"> </td>

                    </tr>
                    <tr>
                        <td>Department:<br> <input type="text"  class="input"name="dept" value="<%= department%>"></td>
                        <td>Designation:<br><input type="text" name="desig" class="input" value="<%= designation%>"> </td>

                        <td>Branch:<br><input type="text"  class="input"name="br" value="<%= branch%>"></td>
                        <td>Bank Name:<br><input type="text" name="bank" class="input" value="<%= bankname%>"></td>
                    </tr>

                    <tr>
                        <td>Hourly Wage: <input type="text" name='hw' class="input" value='<%= hourly%>'></td>
                        <td>Hours Worked:<input type="text" name='hworked' class="input" value='<%= hoursworked%>'> </td>
                        <td>Leaves Taken:<input type="text" name='l' class="input" value='<%= leaves%>'></td>
                        <td>
                            <input type="submit" value='Update'/>
                            
                        </td>
                    </tr>
                </table>


                <%
                        }
                      
//                            String sal = request.getParameter("sal");
//                            String fn = request.getParameter("fn");
//                            String ln = request.getParameter("ln");
//                            String ph = request.getParameter("ph");
//                            String acc = request.getParameter("acc");
//                            String dept = request.getParameter("dept");
//                            String desig = request.getParameter("desig");
//                            String br = request.getParameter("br");
//                            String bank = request.getParameter("bank");
//                            String hw = request.getParameter("hw");
//                            String hworked = request.getParameter("hworked");
//                            String l = request.getParameter("l");
//
//                            if (sal != null && fn != null && ln != null && ph != null && acc != null && dept != null && desig != null && br != null && bank != null && hw != null && hworked != null && l != null) {
//                                //Class.forName("com.mysql.jdbc.Driver");
//                                //java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root", "");
////                                String url1 = "jdbc:mysql://localhost:3306/payroll";
////                                Class.forName("com.mysql.jdbc.Driver");
////                                Connection conn1 = DriverManager.getConnection(url1, "root", "");
////                                Statement st2 = conn1.createStatement();
////                                String update = "update employee set salutation='" + sal + "', fname='" + fn + "', lname='" + ln + "', phone='" + ph + "', accno='" + acc + "', department='" + dept + "', designation='" + desig + "', bankname='" + bank + "',branch='" + br + "',hourly='" + hw + "', hoursworked='" + hworked + "', leaves='" + l + "' where id='" + id + "'";
////
////                                st2.executeUpdate(update);
//                                
//                                out.println(sal);
//                                out.println(bank);
//                                out.println(hw);
//                                out.println(hworked);
//                                out.println(l);
//                                out.println(desig);
                                

                            }
                       

                    } catch (Exception e) {
                        out.println(e);
                    }

                %>
                <br><br><br>
                </form>
                </body>
                </html>
