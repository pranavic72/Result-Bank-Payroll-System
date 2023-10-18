package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class emp_005finsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/emp_header.jsp");
    _jspx_dependants.add("/emp_footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"/>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            select{\n");
      out.write("                border: 2px solid black;\n");
      out.write("                width:223px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"text\"],[type=\"date\"],[type=\"email\"]{\n");
      out.write("                border: 2px solid black;\n");
      out.write("                width: 200px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\"> \n");
      out.write("        <title>Online Result</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"body\">\n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("\n");
      out.write("            <header class=\"nav_bar\">\n");
      out.write("                <h1></h1>\n");
      out.write("                <nav>\n");
      out.write("                    <ul class=\"nav_links\">\n");
      out.write("                        <li><a href=\"emp_index.jsp\">Home</a></li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <li><a href=\"emp_login.jsp\">Employee</a></li>\n");
      out.write("                        <li><a href=\"emp_admin.jsp\">Admin</a></li>\n");
      out.write("                        <li><a href=\"emp_index.jsp\">Log out</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <form action=\"emp_insert.jsp\" method='post'>\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <h1>Add New Employee</h1>\n");
      out.write("                <fieldset>\n");
      out.write("                    <table>                       \n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Salutation</label><br>\n");
      out.write("                                <select name=\"salutation\" class=\"data\">\n");
      out.write("                                    <option></option>\n");
      out.write("                                    <option name=\"mr\"> Mr</option>\n");
      out.write("                                    <option name=\"ms\"> Ms</option>\n");
      out.write("                                </select>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>First Name:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"fname\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Last Name:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"lname\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Date of Birth:</label><br>\n");
      out.write("                                <input type=\"date\" class=\"data\" name=\"dob\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Phone:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"phone\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Email</label><br>\n");
      out.write("                                <input type=\"email\" class=\"data\" name=\"email\"/><br/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Designation:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"designation\"/><br/>\n");
      out.write("                            </td> \n");
      out.write("                            <td>\n");
      out.write("                                <label>Date of Joining:</label><br>\n");
      out.write("                                <input type=\"date\" class=\"data\" name=\"dateofjoin\"/><br/>\n");
      out.write("                            </td> \n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            <label>Bank Name: </label><br>\n");
      out.write("                            <input type=\"text\" class=\"data\" name=\"bankname\"/><br/>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <label>Account No: </label><br>\n");
      out.write("                            <input type=\"text\" class=\"data\" name=\"accno\"/><br/>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <label>Branch: </label><br>\n");
      out.write("                            <input type=\"text\" class=\"data\" name=\"branch\"/><br/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><label>Department:</label><br>\n");
      out.write("                            <input type=\"text\" class=\"data\" name=\"department\"/><br/>\n");
      out.write("                        </td>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td><label>Hourly Wage:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"hourly\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td><label>Hours Worked:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"hoursworked\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td><label>Leaves Taken:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"leaves\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td colspan=\"1\" align=\"center\"><input type=\"submit\" class=\"btn\" value=\"Submit\"/>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("                 <button onclick=\"window.history.back()\" class=\"btn\">Go Back </button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <br><br><br><br><br><br><br>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("footer {\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 3px;\n");
      out.write("  background-color: coral;\n");
      out.write("  color: black;\n");
      out.write("  \n");
      out.write("\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("      font-size: 30px;\n");
      out.write("  font-weight: 800;\n");
      out.write("  height: 20px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    \n");
      out.write("    <p>Copywrite @ Pranavi Chintakindi</p>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
