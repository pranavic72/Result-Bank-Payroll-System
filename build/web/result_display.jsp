<%-- 
    Document   : Display
    Created on : Dec 26, 2021, 7:56:59 PM
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
        <title>Online Result</title>
        <style>
            body{
	text-align: center;
	align-content: center;
	font-family: "Trebuchet MS", Helvetica, sans-serif;
}

            .data{
                        font-size: 25px; 
                        display:table-cell; 
                        border-radius: 5px 5px 5px 5px;
                        padding: 2% 20% 5% 20%;
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

            </style>
    </head>
    <body>
        
        <%@include file="result_header.jsp" %>
        <%
            String id = request.getParameter("id");
            String fname = request.getParameter("fname");
            String lname=request.getParameter("lname");
            String course = request.getParameter("course");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String trim = request.getParameter("trim");
            String name = fname + " " + lname;
          

            try {
                String query = "";
                String head = "";
                
                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                if (trim.equals("trim1")) {
                    head="First";
                    query = "select * from trim1 where id='" + id + "'";
                } 
                else if (trim.equals("trim2")) {
                    head="Second";
                    query = "select * from trim2 where id='" + id + "'";
                } 
                else if (trim.equals("trim3")) {
                    head="Third";
                    query = "select * from trim3 where id='" + id + "'";
                } 
                else if (trim.equals("trim4")) {
                    head="Fourth";
                    query = "select * from trim4 where id='" + id + "'";
                } 
                else if (trim.equals("trim5")) {
                    head="Fifth";
                    query = "select * from trim5 where id='" + id + "'";
                } 
                else if (trim.equals("trimall")) {
                    head="Final";
                    query = "select * from trimall where id='" + id + "'";
                } 
                else {
                    out.println("Data not found");
                }
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    String status = rs.getString("status");
                    int subj1 = rs.getInt("sub1");
                    int subj2 = rs.getInt("sub2");
                    int subj3 = rs.getInt("sub3");
                    int subj4 = rs.getInt("sub4");
                    int subj5 = rs.getInt("sub5");
                    int total = subj1 + subj2 + subj3 + subj4 + subj5;
        %>
        <h1>Student Results</h1>
           <div align="center">
              <table class="data">
                   
                  <tr>
                    <th colspan="6">Trimester: <%= head %></th>
                  </tr>
                  <tr>
                    <td colspan="3">ID: <%= id%></td>
                    <td colspan="3">Name:<%= name %></td>
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
                    <td><%= subj1%></td>
                    <td><%= subj2%></td>
                    <td><%= subj3%></td>
                    <td><%= subj4%></td>
                    <td><%= subj5%></td>
                  </tr>
                  <tr>
                    <td colspan="2">Total Marks: <%= total %>/500</td>
                    <%
                        String grade="";

                        if(total < 150){
                            grade = "E";
                            //request.setAttribute("grade", grade);
                        }
                        else if(total >= 150 && total <=170){
                            grade = "D";
                        }
                        else if(total >=170 && total <=200){
                            grade = "D+";
                        }
                        else if(total >=201 && total <=240){
                            grade = "C-";
                        }
                        else if(total >=241 && total<=270){
                            grade = "C";
                        }
                        else if(total >=271 && total <=310){
                            grade = "C+";
                        }
                        else if(total >=311 && total<=340){
                            grade = "B-";
                        }
                        else if(total >=341 && total <=380){
                            grade = "B";
                        }
                        else if(total >=381 && total <=420){
                            grade = "B+";
                        }
                        else if(total >=421 && total <=450){
                            grade = "A";
                        }
                        else if (total >=451 && total <=500){
                            grade = "A+";
                        }
                       request.setAttribute("grade",grade);
                    %>
                    <td colspan="2">Final Grade: <%= grade %></td>
                    <td colspan="2">Result: <%= status %></td>
                  </tr>
                  <tr>
                    <%
                        float avg = total/5;
                        float cgpa = avg/10;
                    %>   
                    <td colspan="6">CGPA: <%= cgpa %></td>
                  </tr>
                </tbody>
            </table> 
<button onclick="history.back()" class="btn">Go Back </button>
                    </div>
            <%
                    }
                } catch (Exception e) {
                }

            %>
            
            <br><br>
            <%@include file="result_footer.jsp" %>
</body>
</html>
