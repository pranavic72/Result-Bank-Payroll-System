package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.util.Random;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class bank_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/bank_header.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("                        <li><a href=\"bank_index.jsp\">Home</a></li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <li><a href=\"bank_register.jsp\">Register</a></li>\n");
      out.write("                        <li><a href=\"bank_login.jsp\">Log in</a></li>\n");
      out.write("                        <li><a href=\"bank_admin.jsp\">Admin</a></li>\n");
      out.write("                        <li><a href=\"bank_index.jsp\">Log out</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"bank_register.jsp\" method='post'>\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <h1>Add New Employee</h1>\n");
      out.write("                <fieldset>\n");
      out.write("                    <table>                       \n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <label>First Name:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"fname\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Last Name:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"lname\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Username:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"username\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Phone</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"phone\"/><br/>\n");
      out.write("                            </td> \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Password</label><br>\n");
      out.write("                                <input type=\"password\" class=\"data\" name=\"pass\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Confirm Password</label><br>\n");
      out.write("                                <input type=\"password\" class=\"data\" name=\"conpass\"/><br/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Email</label><br>\n");
      out.write("                                <input type=\"email\" class=\"data\" name=\"email\"/><br/>\n");
      out.write("                            </td> \n");
      out.write("<!--                            <td>\n");
      out.write("                                <label>Date of Birth </label><br>\n");
      out.write("                                <input type=\"date\" class=\"data\" name=\"dob\"/><br/>\n");
      out.write("                            </td>-->\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <label>Zip Code </label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"zip\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Address </label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"address\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td><label>State</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"state\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"submit\" class=\"btn\" value=\"Submit\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        ");

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
