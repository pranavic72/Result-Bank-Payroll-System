<%-- 
    Document   : emp_showpayroll
    Created on : Jan 13, 2022, 12:43:54 AM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--        <link rel="stylesheet" type="text/css" href=".css"/>-->

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
                padding: 15px 10px 10px 10px;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
            }


            td{
                padding: 10px 10px 10px 10px;
            }

            table.data {
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
                width: 200px;
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
                font-size: 20px;
    /*                padding: 7px;*/
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


            
        </style>
    </head>
    <body>
        <%@include file="emp_header.jsp" %>
        <div>
            <h1> Employee Payslip </h1>
            <%
                String u = request.getParameter("u");
                int id = Integer.parseInt(u);
                 try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root", "");
                    String query = "select * from employee2 where id='" + id + "'";
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
                        double hourly = rs.getDouble("hourly");
                        int hoursworked = rs.getInt("hoursworked");
                        int leaves = rs.getInt("leaves");
                        String name = salutation + ". " +fname +" "+lname;
                        
            
            %>
            <div align="center">
            <table class="data">
              <tr>
                <th colspan="4">Employee Details</th>
              </tr>
              <tr>
                  <td>ID:<%= id%></td>
                <td colspan="3">Name: <%= name%></td>
              </tr>
              <tr>
                <td>Phone:</td>
                <td><%= phone %></td>
                <td>Branch:</td>
                <td><%= branch %></td>
              </tr>
              <tr>
                <td>Department:</td>
                <td> <%= department%> </td>
                <td>Designation:</td>
                <td> <%= designation%> </td>
              </tr>
              <tr>
                <td>Acc no</td>
                <td> <%= accno%></td>
                <td>Bank Name:</td>
                <td><%= bankname %></td>
              </tr>
              <%
                        double hra, statetax, pf, cedu, grosspay,insurance,netpay, bonus, weekly,monthly,incometax;
                        double leave_penalty;
//                        weekly = hourly * 20;
//                        monthly = weekly * 4;
//                        hra = monthly/4;
//                         grosspay = monthly + hra;
//                        statetax=grosspay * 0.04;
//                        incometax = grosspay * 0.03;
//                        insurance = grosspay * 0.02;
//                        netpay = grosspay - statetax - insurance - incometax;
                       
                       weekly = hourly * hoursworked;
                       monthly = weekly * 4;
                      
                       hra=monthly/4;
                       grosspay = monthly + hra;
                       statetax = grosspay * 0.04;
                       incometax=grosspay* 0.03;
                       insurance=grosspay * 0.02;
                       if (leaves>2){
                        leave_penalty = Math.ceil(monthly * 0.01);
                       }
                       else{
                           leave_penalty = 0;
                       }
                       netpay=grosspay - statetax - insurance - incometax -leave_penalty;
                        
                          
                    %>
                    <tr>
                        <th colspan="4">Total Salary</th>
                    </tr>
              <tr>
                  <td>Hourly Wage:</td>
                  <td> Rs. <%= hourly%>/hr</td>
                <td>Weekly Wage:</td>
                  <td>Rs. <%= weekly%>/hr</td>
              </tr>
              <tr>
                  
                <td colspan="2">Gross Pay: </td>
                  <td colspan="2">Rs. <%= grosspay %></td>
              </tr>
              <tr>
                  <td>House Rent Allowance:</td>
                  <td>Rs. <%= hra%></td>
                   <td>Tax Deduction: </td>
                  <td>Rs. <%= statetax + incometax%></td>
                
              </tr>
              <tr>
                 <td>Employee Insurance: </td>
                  <td>Rs. <%= insurance%></td>
                  <td>Leave Penalty: </td>
                  <td>Rs. <%= leave_penalty%></td>
                
              </tr>
            
              <tr>
                  <td colspan="2">Net Salary: </td>
                  <td colspan="2">Rs. <%= netpay %></td>
                  <!--<td><button onclick="history.back()" class="btn">Go Back </button></td>-->
                
             
            </table>
              
            <%        
                    } 
                 }
                 catch(Exception e){
                     out.println(e);
                 }
                
            %>
            
        </div>
                             <!--<br><br><br><br><br><br><br><br><br><br><br>-->

            <%@include file="emp_footer.jsp" %>
    </body>
</html>
