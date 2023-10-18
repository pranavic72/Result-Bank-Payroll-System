<%-- 
    Document   : bank_register
    Created on : Jan 16, 2022, 9:25:26 PM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Random"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles.css"/>
        <title>Banking System</title>
    </head>
    <body>
        <%@include file="bank_header.jsp" %>
        <form action="bank_register.jsp" method='post'>
            <div align="center">
                <h1>User Register</h1>
                <fieldset>
                    <table>                       
                        <tr>

                            <td>
                                <label>First Name:</label><br>
                                <input type="text" class="data" name="fname"/>
                            </td>  
                            <td>
                                <label>Last Name:</label><br>
                                <input type="text" class="data" name="lname"/><br/>
                            </td>
                            <td>
                                <label>Username:</label><br>
                                <input type="text" class="data" name="username"/><br/>
                            </td>
                            <td>
                                <label>Phone</label><br>
                                <input type="text" class="data" name="phone"/><br/>
                            </td> 
                        </tr>
                        <tr>
                            <td>
                                <label>Password</label><br>
                                <input type="password" class="data" name="pass"/>
                            </td>  
                            <td>
                                <label>Confirm Password</label><br>
                                <input type="password" class="data" name="conpass"/><br/>
                            </td>  
                            <td>
                                <label>Email</label><br>
                                <input type="email" class="data" name="email"/><br/>
                            </td> 
<!--                            <td>
                                <label>Date of Birth </label><br>
                                <input type="date" class="data" name="dob"/><br/>
                            </td>-->
                        </tr>
                        <tr>

                            <td>
                                <label>Zip Code </label><br>
                                <input type="text" class="data" name="zip"/><br/>
                            </td>
                            <td>
                                <label>Address </label><br>
                                <input type="text" class="data" name="address"/><br/>
                            </td>
                            <td><label>State</label><br>
                                <input type="text" class="data" name="state"/><br/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4" align="center">
                                <input type="submit" class="btn" value="Submit"/>
                            </td>
                        </tr>


                    </table>
                </fieldset>
            </div>
        </form>
        <%
            try {
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String username = request.getParameter("username");
                String phone = request.getParameter("phone");
                String pass = request.getParameter("pass");
                String conpass = request.getParameter("conpass");
                String email = request.getParameter("email");
                //String dob = request.getParameter("dob");
                String zip = request.getParameter("zip");
                String address = request.getParameter("address");
                String state = request.getParameter("state");
                double balance = 0;

                Random rand = new Random();
                int accno = rand.nextInt(1000000) + 1000000;
                //out.println(accno);
                //if (pass == conpass) {
                    String url = "jdbc:mysql://localhost:3306/bank";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, "root", "");
                    Statement st = conn.createStatement();
                    
                    String query = "Insert into customers(fname,lname,username,password,email,accno,balance,phone,zip,address,state) values('"+fname+"','"+lname+"','"+username+"','"+pass+"','"+email+"',"+accno+","+balance+",'"+phone+"','"+zip+"','"+address+"','"+state+"')";
                    //Statement st1 = conn.createStatement();
                    //String query = "INSERT INTO employee2(salutation,fname,lname,dob,phone,email,password,designation,dateofjoin,bankname,accno,branch,department,hourly,hoursworked,leaves) VALUES('" + salutation + "','" + fname + "','" + lname + "','" + dob + "','" + phone + "','" + email + "','" + password + "','" + designation + "','" + dateofjoin + "','" + bankname + "','" + accno + "','" + branch + "','" + department + "','" + hourly + "','" + hoursworked + "','" + leaves + "')";
                    //String query = "INSERT INTO customers(fname,lname,username,password,email,accno,balance,phone,zip,address,state) value ('"+fname+"','"+lname+"','"+username+"','"+pass+"','"+email+"','"+accno+"','"+balance+"','"+phone+"','"+zip+"','"+address+"','"+state+"')";
//                String query="select * from customers where id=1001";
//                ResultSet rs = st.executeQuery(query);
//                while(rs.next())
//                {
//                    out.println(rs.getString("phone"));
//                }
                    st.executeUpdate(query);
                    //response.sendRedirect("emp_showemp.jsp?email=admin@admin.com&password=admin@1234");

                //}
            } catch (Exception e) {
                out.println(e);
            }
        %>
        <br><br><br><br><br><br><br><br>
        <%@include file="emp_footer.jsp" %>
    </body>
</html>
