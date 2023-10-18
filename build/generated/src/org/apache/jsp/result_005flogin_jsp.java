package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class result_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Result</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("\r\n");
      out.write("        <form action=\"result_studentdata.jsp\" method='get'>\r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("                <h1>Login </h1>\r\n");
      out.write("                <fieldset>\r\n");
      out.write("\r\n");
      out.write("                    <table>                       \r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td><label>Enter Email</label></td>\r\n");
      out.write("                            <td><input type=\"text\" class=\"data\" name=\"email\"/></td>  \r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr><td><label>Enter Password:</label></td>\r\n");
      out.write("                            <td><input type=\"password\" class=\"data\" name=\"password\"/></td>  \r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td colspan=\"2\" align=\"center\"><input type=\"submit\" class=\"btn\" value=\"Login\"/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("    ");
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
      out.write("\r\n");
      out.write("</html>\r\n");
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
