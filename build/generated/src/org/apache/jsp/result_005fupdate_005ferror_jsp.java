package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public final class result_005fupdate_005ferror_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <form action=\"result_addnewstudent.jsp\" method='post'>\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <h1>Update</h1>\n");
      out.write("                ");


                    try {
                        String u = request.getParameter("u");
                        int id = Integer.parseInt(u);
//                        String id = request.getParameter("id");
//                        
//                        String fn = request.getParameter("fname");

                        String url = "jdbc:mysql://localhost:3306/onlineresult";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(url, "root", "");
                        Statement stat = conn.createStatement();
//                        String data = "select * from students where id='"+request.getParameter("id")+"'";
                        String data = "select * from students where id ='"+id+"'";
                        ResultSet res = stat.executeQuery(data);
                        while (res.next()) {

                
      out.write("\n");
      out.write("                <fieldset>\n");
      out.write("                    <table>                       \n");
      out.write("                        <tr>\n");
      out.write("<!--                            <td>-->\n");
      out.write("<!--                                <label>ID:</label><br>-->\n");
      out.write("                        <input type=\"hidden\" class=\"data\" name=\"id\" value=\"");
      out.print( res.getString("id"));
      out.write("\"/>\n");
      out.write("<!--                            </td>  -->\n");
      out.write("                            <td>\n");
      out.write("                                <label>First Name:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"fname\" value=\"");
      out.print( res.getString("fname"));
      out.write("\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Last Name:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"lname\" value=\"");
      out.print( res.getString("lname"));
      out.write("\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Course</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"course\" value=\"");
      out.print( res.getString("course"));
      out.write("\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Batch</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"batch\" value=\"");
      out.print( res.getString("batch"));
      out.write("\"/><br/>\n");
      out.write("                            </td>  \n");
      out.write("                        </tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label>Email:</label><br>\n");
      out.write("                            <input type=\"email\" class=\"data\" name=\"email\" value=\"");
      out.print( res.getString("email"));
      out.write("\"/><br/>\n");
      out.write("                        </td>  \n");
      out.write("                        <td>\n");
      out.write("                            <label>Phone:</label><br>\n");
      out.write("                            <input type=\"text\" class=\"data\" name=\"phone\" value=\"");
      out.print( res.getString("phone"));
      out.write("\"/><br/>\n");
      out.write("                        </td>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\"><label>Address:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"address\" value=\"");
      out.print( res.getString("address"));
      out.write("\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                            ");
        }
                                } catch (Exception e) {
                                }
                            
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\"><input type=\"submit\" class=\"btn\" value=\"Submit\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
