package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class result_005fadmincontroller_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"/>\n");
      out.write("        <style>\n");
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
      out.write("            #students,#users, #results{\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"result_admin.jsp\" method='post'>\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <h1>View </h1>\n");
      out.write("                <fieldset>\n");
      out.write("\n");
      out.write("                    <table>                       \n");
      out.write("                        <tr>\n");
      out.write("                            <td><label>Users:</label></td>\n");
      out.write("                            <td id=\"users\">\n");
      out.write("                                <a href=\"result_showusers.jsp\" class=\"btn\">View</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><label>Students:</label></td>\n");
      out.write("                            <td id=\"students\">\n");
      out.write("                                <a href=\"result_showstudents.jsp\" class=\"btn\">View</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><label>Results</label></td>\n");
      out.write("                            <td id=\"results\">\n");
      out.write("                                <a href=\"result_showstudents.jsp\" class=\"btn\">View</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        ");

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            try {

                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String query = "select * from users where email='" + email + "' and password='" + password + "'";
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    String type = rs.getString("type");
                    String em = rs.getString("email");
                    String pw = rs.getString("password");

                    if (type.equals("Admin")) {
                        response.sendRedirect("result_admincontrol.jsp");

                    } else {
                        out.println("You are not an admin");
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        
      out.write("\n");
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
