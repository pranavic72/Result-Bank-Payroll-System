package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class bank_005fwelcomeuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/result_header.jsp");
    _jspx_dependants.add("/result_footer.jsp");
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
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
      out.write("        <title>Banking System</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"/>\n");
      out.write("        <style>\n");
      out.write("            fieldset{\n");
      out.write("                height:250px;\n");
      out.write("                width:500px;\n");
      out.write("                padding-bottom: 75px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .btn {\n");
      out.write("\n");
      out.write("                border-radius: 3px;\n");
      out.write("                border: solid;\n");
      out.write("                border-color: black;\n");
      out.write("                font-family: Arial;\n");
      out.write("                color: #000000;\n");
      out.write("                font-size: 25px;\n");
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
      out.write("            #students,#users, #results{\n");
      out.write("                border: none;\n");
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
      out.write("                        <li><a href=\"result_index.jsp\">Home</a></li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <li><a href=\"result_login.jsp\">Student</a></li>\n");
      out.write("                        <li><a href=\"result_admin.jsp\">Admin</a></li>\n");
      out.write("                        <li><a href=\"result_index.jsp\">Log out</a></li>\n");
      out.write("                        <li><a href=\"java_index.jsp\">Exit </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            try {

                String url = "jdbc:mysql://localhost:3306/bank";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String query = "select * from customers where username='" + username + "' and password='" + password + "'";
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
//                    String type = rs.getString("type");
                    String un = rs.getString("username");
                    String pw = rs.getString("password");
//                    out.println(un);
//                    out.println(rs.getString("fname"));
                    
                    if (un.equals(username) && pw.equals(password)) {
        
      out.write("\n");
      out.write("        <form action=\"result_admin.jsp\" method='post'>\n");
      out.write("            <div align=\"center\">\n");
      out.write("\n");
      out.write("                <h1>Welcome ");
      out.print(rs.getString("fname")+" " + rs.getString("lname") );
      out.write(" </h1>\n");
      out.write("                <fieldset>\n");
      out.write("\n");
      out.write("                    <table>                       \n");
      out.write("                        <tr>\n");
      out.write("                            <td><label>View Data: </label></td>\n");
      out.write("                            <td id=\"users\">\n");
      out.write("                                <a href='bank_mydata.jsp?id=");
      out.print(rs.getString("id"));
      out.write("' class=\"btn\">View</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><label>Update My Details: </label></td>\n");
      out.write("                            <td id=\"users\">\n");
      out.write("                                <a href='bank_update.jsp?id=");
      out.print(rs.getString("id"));
      out.write("' class=\"btn\">View</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><label>Cash Transaction:</label></td>\n");
      out.write("                            <td id=\"students\">\n");
      out.write("                                <a href='bank_userdata.jsp?id=");
      out.print(rs.getString("id"));
      out.write("' class=\"btn\">View</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><label>View Transactions:</label></td>\n");
      out.write("                            <td id=\"results\">\n");
      out.write("                                <a href='bank_transactions.jsp?an=");
      out.print(rs.getString("accno"));
      out.write("' class=\"btn\">View</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        ");
 //                                    } else {
//                        out.println("You are not a registered user");
//                    }
//                }

                }
                    else{
                        out.println("You are not a registered user");
                    }
                }
            }catch (Exception e) {
                out.println(e);
            }

        
      out.write("\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br>\n");
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
      out.write("<!--<br><br><br><br><br>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("<br><br>-->\n");
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
