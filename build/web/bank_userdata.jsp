<%-- 
    Document   : studentdata
    Created on : Dec 15, 2021, 5:32:16 PM
    Author     : DELL
--%>

<%@page import="javax.naming.spi.DirStateFactory.Result"%>
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
        <title>Banking System</title>
        <link rel="stylesheet" type="text/css" href="styles.css"/>
    </head>
    <body style ='text-align: center; '>
        <%@include file="bank_header.jsp" %>

        <div>
            <h1> User Details </h1>
            <%
                String id = request.getParameter("id");

                try {

                    String url = "jdbc:mysql://localhost:3306/bank";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, "root", "");
                    Statement st1 = conn.createStatement();
                    String login = "select * from customers where id = " + id + "";
                    ResultSet rs1 = st1.executeQuery(login);

                    while (rs1.next()) {
                        //String type=rs1.getString("type");

//                    if (type.equals("Student") || type.equals("Admin")){
//                        
//                        String query = "select * from students where email='" + email + "'";
//                    Statement st = conn.createStatement();
//                    ResultSet rs = st.executeQuery(query);
//                    while (rs.next()) {

            %>
            <form action="bank_userdata.jsp" method="post">
                <input type="hidden" class="data" name ="fname" id="input" value=" <%= rs1.getString("fname")%>" /> 
                <input type="hidden" class="data" name ="lname" id="input"  value=" <%= rs1.getString("lname")%>" /> 

                <fieldset>

                    <table>
                        <tr> 
                            <td>ID</td>
                            <td><input type="text" class="data" name ="id" id="input" readonly="readonly" value="<%= id%> " /></td>
                        </tr>

                        <tr> 
                            <td> Name </td>
                            <td><input type="text" class="data" name ="name" id="input" readonly="readonly" value=" <%= rs1.getString("fname") + " " + rs1.getString("lname")%>" /> </td>
                        </tr>   


                        <tr> 
                            <td>Account No: </td>
                            <td><input type="text" class="data" name ="accno" id="input" readonly="readonly" value=" <%= rs1.getString("accno")%>"/></td>
                        </tr>

                        <tr> 
                            <td>Balance</td>
                            <td><input type="text" class="data" name ="balance" id="input" readonly="readonly" value=" <%= rs1.getString("balance")%>" /></td>
                        </tr>


                        <tr>
                            <td><label> Transaction: </label></td>
                            <td><select  class="data" name="transaction">
                                    <option name="withdraw" value="withdraw"> Withdraw </option>
                                    <option name="deposit" value="deposit"> Deposit </option>
                                </select></td>

                        <tr> 
                            <td>Amount</td>
                            <td><input type="text" class="data" name ="amount" id="input" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Show" class="btn"/></td>

                        </tr>
                    </table>
                    <%
                            }
                        } catch (Exception e) {

//                            out.println(e);
                        }


                    %>

                </fieldset>  

            </form>
        </div>
        <%            try {
                String transaction = request.getParameter("transaction");
                String acc = request.getParameter("accno");
                String bal = request.getParameter("balance");
                String amo = request.getParameter("amount");

                double balance = Double.parseDouble(bal);
                // int accno = Integer.parseInt(acc);
                double amount = Double.parseDouble(amo);
                double new_balance;
//                out.println(new_balance);
                //out.println(accno);
                // String id = request.getParameter("id");
//                double amount = Double.parseDouble(request.getParameter("amount"));
//                double balance;

                String query = "";
                String query1 = "";

                String url = "jdbc:mysql://localhost:3306/bank";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                Statement st2 = conn.createStatement();
                if (transaction.equals("deposit")) {
                    new_balance = balance + amount;
                    query = "Update customers set balance='" + new_balance + "' where id =" + id + "";
//                    query1 = "insert into transactions(accno,balance,type,date,time) values(" + accno + "," + new_balance + ",'" + transaction + "', CURRENT_DATE(), CURRENT_TIME())";

                    st.executeUpdate(query);
                    query1 = "INSERT INTO transactions (accno, balance, type, date, time) VALUES ('" + acc + "', '" + new_balance + "', 'Deposit', CURRENT_DATE(), CURRENT_TIME())";

                    st2.executeUpdate(query1);
                } else if (transaction.equals("withdraw")) {
                    new_balance = balance - amount;
                    query = "Update customers set balance='" + new_balance + "' where id =" + id + "";
                    st.executeUpdate(query);
                    //query1 = "insert into transactions(accno,balance,type) values('" + accno + "','" + new_balance + "','" + transaction + "')";
//                    query1 = "insert into transactions(accno,balance,type,date,time) values(" + accno + "," + new_balance + ",'" + transaction + "', CURRENT_DATE(), CURRENT_TIME())";
                    query1 = "INSERT INTO transactions (accno, balance, type, date, time) VALUES ('" + acc + "', '" + new_balance + "', 'Withdraw', CURRENT_DATE(), CURRENT_TIME())";

                    st2.executeUpdate(query1);
                }

//                Statement st2 = conn.createStatement();
//                String query1 = "insert into transactions(accno,balance,type,date,time) values(" + accno + "," + new_balance + ",'" + transaction + "', CURRENT_DATE(), CURRENT_TIME())";
                response.sendRedirect("bank_mydata.jsp?id="+id);
            } catch (Exception e) {
//                out.println(e);
            }

        %>
    </body>
    <br>
    <%@include file="result_footer.jsp" %>
</html>
