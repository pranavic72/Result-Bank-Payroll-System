<%-- 
    Document   : emp_update2
    Created on : Jan 16, 2022, 1:52:50 AM
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
        <!--                        <link rel="stylesheet" type="text/css" href="styles.css"/>-->
        <!--                        <link rel="stylesheet" type="text/css" href="emp_css.css"/>-->

        <title>Payroll System</title>

        <style>

            body{
                text-align: center;
                align-content: center;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }
            .data{
                font-size: 20px; 
                display:table-cell; 
                border-radius: 5px 5px 5px 5px;
                padding: 60px 10px 203px 10px;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }


            td{
                padding: 10px 10px 10px 10px;
            }

            table.data {
                font-size:25px;
                text-align: center;
                width: 100%;
                background-color: #ffffff;
                border-collapse: collapse;
                border-width: 0px;
                border-color: #000000;
                border-style: solid;
                color: #000000;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }

            table.data td, table.data th {
                width: auto;
                /*                border-width: 2px; */
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
                font-size: 25px;
                padding: 7px;
                background: #00ffbb;
                border: solid #000000 0px;
                text-decoration: bold;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                margin-left: auto;
                margin-right: auto;
            }

            .btn:hover {
                background: #14e3a8;
                text-decoration: bold;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                margin-left: auto;  background: #14e3a8;

                margin-right: auto;
            }
            #insert{
                border: none;
            }
            .input{
                font-size: 25px; 
                display:table-cell;
                border:none;
                width:145px;
                text-align: center;
                border-radius: 5px 5px 5px 5px;
                //padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }
            .input:focus{
                font-size: 25px; 
                display:table-cell;
                border:none;
                background-color:red;
                color:white;
                width:145px;
                text-align: center;
                border-radius: 5px 5px 5px 5px;
                //padding: 10% 20% 10% 20%;
                font-family: "Trebuchet MS", Helvetica, sans-serif;

            }

        </style>

    </head>
    <body>

        <%@include file="emp_header.jsp" %>
        <div align="center">
            <h1> Update Employee Details </h1>
            <form action="emp_update2.jsp" method='post'>
                <%
                    try {
                        String id = request.getParameter("id");
                        //int id = Integer.parseInt(u);
//                        int id = Integer.parseInt(u);
//                        String id = request.getParameter("id");
//                        
//                        String fn = request.getParameter("fname");

                        String url = "jdbc:mysql://localhost:3306/payroll";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(url, "root", "");
                        Statement st = conn.createStatement();
//                        String data = "select * from students where id='"+request.getParameter("id")+"'";
                        String data = "select * from employee2 where id ='" + id + "'";
                        ResultSet rs = st.executeQuery(data);
                        while (rs.next()) {

                %>
                <table class="data">
                    <tr>
                        <th colspan="4">Employee ID: <%= rs.getString("id")%>
                            <input type="hidden" class="data" name="id" value="<%= rs.getString("id")%>"/> 
                        </th>
                    </tr>
                    <tr>

                        <td colspan="2">Name: 
                            <input style="width: 50px;" type="text" name="salu" class="input" value="<%=rs.getString("salutation")%>">
                            <input style="width: 100px;" type="text"  class="input" name="fn" value="<%= rs.getString("fname")%>">
                            <input style="width: 140px;" type="text" class="input" name="ln" value="<%= rs.getString("lname")%>">
                        </td>
                        <td>Phone:<br><input type="text" class="input" name="ph" value="<%= rs.getString("phone")%>"></td>
                        <td>Acc No:<br><input type="text" class="input" name="acc" value="<%= rs.getString("accno")%>"> </td>

                    </tr>
                    <tr>
                        <td>Department:<br> <input type="text"  class="input" name="dept" value="<%= rs.getString("department")%>"></td>
                        <td>Designation:<br><input style="width: 190px;" type="text" name="desig" class="input" value="<%= rs.getString("designation")%>"> </td>

                        <td>Branch:<br><input type="text"  class="input" name="br" value="<%=rs.getString("branch")%>"></td>
                        <td>Bank Name:<br><input type="text" name="bank" class="input" value="<%=rs.getString("bankname")%>"></td>
                    </tr>

                    <tr>
                        <td>Hourly Wage: <input type="text" name='h' class="input" value='<%= rs.getString("hourly")%>'></td>
                        <td>Hours Worked:<input type="text" name='hw' class="input" value='<%=rs.getString("hoursworked")%>'> </td>
                        <td>Leaves Taken:<input type="text" name='l' class="input" value='<%= rs.getString("leaves")%>'></td>



                        <td align="center"><b><input type="submit" class="btn" value="Submit"/></b>
                            <a href='emp_showpayroll.jsp?u=<%=rs.getString("id")%>' class="btn">Payroll</a></td>
                    </tr>
                </table>
            </form>
        </div>


        <%
                }

                //String id = request.getParameter("id");
                String salutation = request.getParameter("salu");
                String fname = request.getParameter("fn");
                String lname = request.getParameter("ln");
                String phone = request.getParameter("ph");
                String accno = request.getParameter("acc");
                String department = request.getParameter("dept");
                String designation = request.getParameter("desig");
                String branch = request.getParameter("br");
                String bankname = request.getParameter("bank");
                String hourly = request.getParameter("h");
                String hoursworked = request.getParameter("hw");
                String leaves = request.getParameter("l");
//                String[] pass = email.split("@");
//                String password = pass[0];
//                String type = "Student";

//                if (id!= null && salutation != null && fname != null && lname != null && phone != null && accno != null && department != null && designation != null && branch != null && bankname != null && hourly != null && hoursworked != null && leaves != null) {
                if (id != null && hourly != null && hoursworked != null && leaves != null) {

                    String url2 = "jdbc:mysql://localhost:3306/payroll";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection(url2, "root", "");
                    Statement st2 = con.createStatement();
//                    //String query ="INSERT INTO students(fname,lname,course,batch,email,phone,address) VALUES('"+fname+"','"+lname+"','"+course+"','"+batch+"','"+email+"','"+phone+"','"+address+"')";
                    String query = "update employee2 set salutation='" + salutation + "', fname='" + fname + "', lname='" + lname + "', phone='" + phone + "', accno='" + accno + "', department='" + department + "', designation='" + designation + "', branch='" + branch + "', bankname='" + bankname + "', hourly='" + hourly + "', hoursworked='" + hoursworked + "', leaves='" + leaves + "' WHERE id=" + id + "";
//                    String query = "update employee set hourly='" + hourly + "', hoursworked='" + hoursworked + "', leaves='" + leaves + "' WHERE id=" + id + "";
//
//                    String query2 = "update users set fname='"+fname+"',lname='"+lname+"', type='"+type+"', email='" +email+ ", password='"+password+" where email=" +email+" and password="+password+"";
                    st2.executeUpdate(query);

                }

            } catch (Exception e) {
                out.println(e);
            }

        %>

    </body>
    <%@include file="emp_footer.jsp" %>
</html>
