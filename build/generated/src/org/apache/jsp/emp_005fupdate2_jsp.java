package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class emp_005fupdate2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            div{\n");
      out.write("                margin:auto;\n");
      out.write("                padding: 1% 25% 1% 25%;\n");
      out.write("            }            \n");
      out.write("            .data{\n");
      out.write("                font-size: 20px; \n");
      out.write("                display:table-cell; \n");
      out.write("                border-radius: 5px 5px 5px 5px;\n");
      out.write("                position: absolute;\n");
      out.write("                /*                        top: 20%;*/\n");
      out.write("                padding: auto;\n");
      out.write("\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            td{\n");
      out.write("                padding: 10px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.data {\n");
      out.write("                /*                    position: absolute;*/\n");
      out.write("                width: auto;\n");
      out.write("                /*                padding: 50%;*/\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border-width: 0px;\n");
      out.write("                border-color: #000000;\n");
      out.write("                text-align: center;\n");
      out.write("                border-style: solid;\n");
      out.write("                color: #000000;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.data td, table.data th {\n");
      out.write("                width: auto;\n");
      out.write("\n");
      out.write("                /* border-width: 2px; */\n");
      out.write("                border-color: #000000;\n");
      out.write("                border-style: solid;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.data th {\n");
      out.write("                background-color: coral;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            .btn {\n");
      out.write("\n");
      out.write("                border-radius: 3px;\n");
      out.write("                border: solid;\n");
      out.write("                border-color: black;\n");
      out.write("                font-family: Arial;\n");
      out.write("                color: #000000;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 7px;\n");
      out.write("                background: #00ffbb;\n");
      out.write("                border: solid #000000 0px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                background: #14e3a8;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("                margin-left: auto;  background: #14e3a8;\n");
      out.write("\n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("            #insert{\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            .input{\n");
      out.write("                font-size: 20px; \n");
      out.write("                display:table-cell;\n");
      out.write("                border:none;\n");
      out.write("\n");
      out.write("                text-align: center;\n");
      out.write("                border-radius: 5px 5px 5px 5px;\n");
      out.write("                //padding: 10% 20% 10% 20%;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .input:focus{\n");
      out.write("                font-size: 20px; \n");
      out.write("                display:table-cell;\n");
      out.write("                border:none;\n");
      out.write("                background-color:red;\n");
      out.write("                color:white;\n");
      out.write("\n");
      out.write("                text-align: center;\n");
      out.write("                border-radius: 5px 5px 5px 5px;\n");
      out.write("                //padding: 10% 20% 10% 20%;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            try {
                String u = request.getParameter("u");
                int id = Integer.parseInt(u);
//                        String id = request.getParameter("id");
//                        
//                        String fn = request.getParameter("fname");

                String url = "jdbc:mysql://localhost:3306/payroll";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
//                        String data = "select * from students where id='"+request.getParameter("id")+"'";
                String data = "select * from employee where id ='" + id + "'";
                ResultSet rs = st.executeQuery(data);
                while (rs.next()) {

        
      out.write("\n");
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form action=\"emp_update.jsp\" method='post'>\n");
      out.write("                <table class=\"data\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"4\">Employee ID: ");
      out.print( rs.getString("id"));
      out.write("\n");
      out.write("                            <input type=\"hidden\" class=\"data\" name=\"id\" value=\"");
      out.print( rs.getString("id"));
      out.write("\"/></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td colspan=\"2\"> \n");
      out.write("                            <input type=\"text\" name=\"salu\" class=\"input\" value=\"");
      out.print(rs.getString("salutation"));
      out.write("\">\n");
      out.write("                            <input type=\"text\"  class=\"input\" name=\"fn\" value=\"");
      out.print( rs.getString("fname"));
      out.write("\">\n");
      out.write("                            <input type=\"text\" class=\"input\" name=\"ln\" value=\"");
      out.print( rs.getString("lname"));
      out.write("\">\n");
      out.write("                        </td>\n");
      out.write("                        <td>Phone:<br><input type=\"text\" class=\"input\" name=\"ph\" value=\"");
      out.print( rs.getString("phone"));
      out.write("\"></td>\n");
      out.write("                        <td>Acc No:<br><input type=\"text\" class=\"input\" name=\"acc\" value=\"");
      out.print( rs.getString("accno"));
      out.write("\"> </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Department:<br> <input type=\"text\"  class=\"input\" name=\"dept\" value=\"");
      out.print( rs.getString("department"));
      out.write("\"></td>\n");
      out.write("                        <td>Designation:<br><input type=\"text\" name=\"desig\" class=\"input\" value=\"");
      out.print( rs.getString("designation"));
      out.write("\"> </td>\n");
      out.write("\n");
      out.write("                        <td>Branch:<br><input type=\"text\"  class=\"input\" name=\"br\" value=\"");
      out.print(rs.getString("branch"));
      out.write("\"></td>\n");
      out.write("                        <td>Bank Name:<br><input type=\"text\" name=\"bank\" class=\"input\" value=\"");
      out.print(rs.getString("bankname"));
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Hourly Wage: <input type=\"text\" name='h' class=\"input\" value='");
      out.print( rs.getString("hourly"));
      out.write("'></td>\n");
      out.write("                        <td>Hours Worked:<input type=\"text\" name='hw' class=\"input\" value='");
      out.print(rs.getString("hoursworked"));
      out.write("'> </td>\n");
      out.write("                        <td>Leaves Taken:<input type=\"text\" name='l' class=\"input\" value='");
      out.print( rs.getString("leaves"));
      out.write("'></td>\n");
      out.write("\n");
      out.write("                        ");
        }
                            } catch (Exception e) {
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <td align=\"center\"><input type=\"submit\" class=\"btn\" value=\"Submit\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
 
            try {
                String id = request.getParameter("id");
                String salutation = request.getParameter("salu");
                String fname = request.getParameter("fn");
                String lname = request.getParameter("ln");
                String phone = request.getParameter("ph");
                String accno = request.getParameter("acc");
                String department = request.getParameter("dept");
                String designation = request.getParameter("desig");
                String branch = request.getParameter("branch");
                String bankname = request.getParameter("bankname");
                String hourly = request.getParameter("h");
                String hoursworked = request.getParameter("hw");
                String leaves = request.getParameter("l");
//                String[] pass = email.split("@");
//                String password = pass[0];
//                String type = "Student";

                if (salutation != null && fname != null && lname != null && phone != null && accno != null && department != null && designation != null && branch != null && bankname != null && hourly != null && hoursworked != null && leaves != null  ) {
                    String url = "jdbc:mysql://localhost:3306/payroll";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, "root", "");
                    Statement st2 = conn.createStatement();
                    //String query ="INSERT INTO students(fname,lname,course,batch,email,phone,address) VALUES('"+fname+"','"+lname+"','"+course+"','"+batch+"','"+email+"','"+phone+"','"+address+"')";
                    String query = "update employee set salutation='" + salutation + "', fname='" + fname + "', lname='" + lname + "', phone='" + phone + "', accno='" + accno + "', department='" + department + "', designation='" + designation + "', branch='" + branch + "', bankname='" + bankname + "', hourly='" + hourly + "', hoursworked='" + hoursworked + "', leaves='" + leaves + "' WHERE id=" + id + "";

                    //String query2 = "update users set fname='"+fname+"',lname='"+lname+"', type='"+type+"', email='" +email+ ", password='"+password+" where email=" +email+" and password="+password+"";
                    st2.executeUpdate(query);
//                    String query1 = "select * from students where id = '" + id + "'";
//                    //Statement st1=conn.createStatement();
//                    ResultSet rs = st.executeQuery(query1);
//                    while (rs.next()) {
//                        String sid = rs.getString("id");
//                        String fn = rs.getString("fname");
//                        String ln = rs.getString("lname");
//                        String em = rs.getString("email");
//                        
//                        out.println(fn);
//                        out.println(ln);
//                        out.println(em);
//                        
////                        out.println("email");
//                        String[] pass = em.split("@");
//                        String password = pass[0];
//                        out.println(password);
//                        String type = "Student";
//                        String query2 = "update users set sid ='"+sid+"',fname='" + fn + "',lname='" + ln + "', type='" + type + "', email='" + em + "', password='" + password + "' where  sid ="+sid+"";
//
//                      st.executeUpdate(query2);
//                    PreparedStatement st = null;
//                    String query = "INSERT INTO students(fname,lname,course, batch, email, phone, address VALUES(?,?,?,?,?,?,?)";
//                    st = conn.prepareStatement(query);
//                    st.setString(1, fname);
//                    st.setString(2, lname);
//                    st.setString(3, course);
//                    st.setString(4, batch);
//                    st.setString(5, email);
//                    st.setString(6, phone);
//                    st.setString(7, address);
                        //response.sendRedirect("emp_showemp.jsp");
                    
                }
            } catch (Exception e) {
                out.println(e);
            }

        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
