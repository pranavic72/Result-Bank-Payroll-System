package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class result_005fresultupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write('\n');
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

            String id = request.getParameter("id");
            String trim = request.getParameter("trim");
            String fname = request.getParameter("fname");
            String lname=request.getParameter("lname");
            String course = request.getParameter("course");
            String batch = request.getParameter("batch");
            
           try {
                String query = "";
                String head = "";
                
                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                
                query="select * from "+trim+" where id='"+id+"'";
                
                ResultSet rs = st.executeQuery(query);
                
                while (rs.next()){
                          String status = rs.getString("status");
                    int subj1 = rs.getInt("sub1");
                    int subj2 = rs.getInt("sub2");
                    int subj3 = rs.getInt("sub3");
                    int subj4 = rs.getInt("sub4");
                    int subj5 = rs.getInt("sub5");
                    int total = subj1 + subj2 + subj3 + subj4 + subj5;
        
      out.write("    \n");
      out.write("            \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"result_addnewstudent.jsp\" method='post'>\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <h1>Update Student Results</h1>\n");
      out.write("                <fieldset>\n");
      out.write("                    <table>                       \n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>ID: ");
      out.print( id );
      out.write("</label><br>\n");
      out.write("                                <input type=\"hidden\" class=\"data\" name=\"fname\" value=\"");
      out.print(id);
      out.write("\"/>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <label>First Name: ");
      out.print( fname );
      out.write("</label><br>\n");
      out.write("                                <input type=\"hidden\" class=\"data\" name=\"fname\" value=\"");
      out.print(fname);
      out.write("\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Last Name: ");
      out.print(lname);
      out.write("</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"lname\" value=\"");
      out.print(lname);
      out.write("\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Course");
      out.print(course+batch);
      out.write("</label><br>\n");
      out.write("                                <input type=\"hidden\" class=\"data\" name=\"course\" value=\"");
      out.print(course+batch);
      out.write("\"/>\n");
      out.write("                            </td>  \n");
      out.write(" \n");
      out.write("                        </tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label>Status</label><br>\n");
      out.write("                            <input type=\"text\" class=\"data\" name=\"status\" value=\"");
      out.print(status);
      out.write("\"/><br/>\n");
      out.write("                        </td>  \n");
      out.write("                        <td>\n");
      out.write("                            <label>Phone:</label><br>\n");
      out.write("                            <input type=\"text\" class=\"data\" name=\"phone\"/><br/>\n");
      out.write("                        </td>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\"><label>Address:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"address\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\"><input type=\"submit\" class=\"btn\" value=\"Submit\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("                ");

                }
                } catch (Exception e) {
                }

            
      out.write("             \n");
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
