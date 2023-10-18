<%-- 
    Document   : emp_insert
    Created on : Jan 16, 2022, 3:10:34 AM
    Author     : DELL
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css"/>

        <title>Payroll System</title>
        <style>
            select{
                border: 2px solid black;
                width:223px;
            }

            input[type="text"],[type="date"],[type="email"]{
                border: 2px solid black;
                width: 200px;
            }
        </style>
    </head>
    <body>
        <%@include file="emp_header.jsp" %>
        <form action="emp_insert.jsp" method='post'>
            <div align="center">
                <h1>Add New Employee</h1>
                <fieldset>
                    <table>                       
                        <tr>
                            <td>
                                <label>Salutation</label><br>
                                <select name="salutation" class="data">
                                    <option></option>
                                    <option name="mr"> Mr</option>
                                    <option name="ms"> Ms</option>
                                </select>
                            </td>  
                            <td>
                                <label>First Name:</label><br>
                                <input type="text" class="data" name="fname"/>
                            </td>  
                            <td>
                                <label>Last Name:</label><br>
                                <input type="text" class="data" name="lname"/><br/>
                            </td>
                            <td>
                                <label>Date of Birth:</label><br>
                                <input type="date" class="data" name="dob"/><br/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Phone:</label><br>
                                <input type="text" class="data" name="phone"/>
                            </td>  
                            <td>
                                <label>Email</label><br>
                                <input type="email" class="data" name="email"/><br/>
                            </td>  
                            <td>
                                <label>Designation:</label><br>
                                <input type="text" class="data" name="designation"/><br/>
                            </td> 
                            <td>
                                <label>Date of Joining:</label><br>
                                <input type="date" class="data" name="dateofjoin"/><br/>
                            </td> 
                        </tr>

                        <td>
                            <label>Bank Name: </label><br>
                            <input type="text" class="data" name="bankname"/><br/>
                        </td>
                        <td>
                            <label>Account No: </label><br>
                            <input type="text" class="data" name="accno"/><br/>
                        </td>
                        <td>
                            <label>Branch: </label><br>
                            <input type="text" class="data" name="branch"/><br/>
                        </td>
                        <td><label>Department:</label><br>
                            <input type="text" class="data" name="department"/><br/>
                        </td>
                        <tr>

                            <td><label>Hourly Wage:</label><br>
                                <input type="text" class="data" name="hourly"/><br/>
                            </td>
                            <td><label>Hours Worked:</label><br>
                                <input type="text" class="data" name="hoursworked"/><br/>
                            </td>
                            <td><label>Leaves Taken:</label><br>
                                <input type="text" class="data" name="leaves"/><br/>
                            </td>
                            <td colspan="1" align="center"><input type="submit" class="btn" value="Submit"/>
                                </td>

                        </tr>
                       

                    </table>
                </fieldset>
                 <button onclick="window.history.back()" class="btn">Go Back </button>
            </div>
        </form>
        <%
            try{
            String salutation = request.getParameter("salutation");
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String dob = request.getParameter("dob");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String designation = request.getParameter("designation");
            String dateofjoin = request.getParameter("dateofjoin");
            String bankname = request.getParameter("bankname");
            String accno = request.getParameter("accno");
            String branch = request.getParameter("branch");
            String department = request.getParameter("department");
            String hourly = request.getParameter("hourly");
            String hoursworked = request.getParameter("hoursworked");
            String leaves = request.getParameter("leaves");
            String[] pass = email.split("@");
            String password = pass[0];

            String url = "jdbc:mysql://localhost:3306/payroll";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();
            //Statement st1 = conn.createStatement();
            String query = "INSERT INTO employee2(salutation,fname,lname,dob,phone,email,password,designation,dateofjoin,bankname,accno,branch,department,hourly,hoursworked,leaves) VALUES('"+salutation+"','" + fname + "','" + lname + "','" + dob + "','" + phone + "','" + email + "','" + password + "','" + designation + "','" + dateofjoin + "','" + bankname + "','" + accno + "','" + branch +  "','" + department + "','" + hourly + "','" + hoursworked + "','" + leaves +"')";
            st.executeUpdate(query);
            response.sendRedirect("emp_showemp.jsp?email=admin@admin.com&password=admin@1234");
            }
            catch(Exception e){
                
            }
        %>
        <br><br><br><br><br><br><br>
        <%@include file="emp_footer.jsp" %>
    </body>
</html>
