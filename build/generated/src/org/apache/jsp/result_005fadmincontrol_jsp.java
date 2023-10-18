package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public final class result_005fadmincontrol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Welcome Admin!</h2> \n");
      out.write("        <form action=\"admincontrol.jsp\" method=\"post\">\n");
      out.write("            <fieldset>\n");
      out.write("                <h1> Student Details </h1>\n");
      out.write("                <table>\n");
      out.write("                    <tr> \n");
      out.write("                        <td>ID</td>\n");
      out.write("                        <td><input type=\"text\" class=\"data\" name =\"id\" id=\"input\"  /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Show\" class=\"btn\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        try {
                            String id = request.getParameter("id");
                            Class.forName("com.mysql.jdbc.Driver");
                            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineresult", "root", "");
                            String query = "select * from students where id='" + id + "'";
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery(query);
                            while (rs.next()) {

                                String fname = rs.getString("fname");
                                String lname = rs.getString("lname");
                                String course = rs.getString("course");
                                String batch = rs.getString("batch");
                                String phone = rs.getString("phone");
                                String address = rs.getString("address");


                    
      out.write("\n");
      out.write("                   \n");
      out.write("                    <form action=\"login.jsp\" method=\"post\" name=\"form1\">\n");
      out.write("\n");
      out.write("                        <tr> \n");
      out.write("                            <td></td>\n");
      out.write("                            <td><input type=\"hidden\" class=\"data\" name =\"id\" id=\"input\" value=\"");
      out.print(id);
      out.write("\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr> \n");
      out.write("                            <td> First Name </td>\n");
      out.write("                            <td><input type=\"hidden\" class=\"data\" name =\"fname\" id=\"input\" value=\"");
      out.print(fname);
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr> \n");
      out.write("                            <td>Last Name </td>\n");
      out.write("                            <td><input type=\"hidden\" class=\"data\" name =\"lname\" id=\"input\" value=\"");
      out.print(lname);
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr> \n");
      out.write("                            <td>Course</td>\n");
      out.write("                            <td><input type=\"hidden\" class=\"data\" name =\"course\" id=\"input\" value=\" ");
      out.print( course);
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr> \n");
      out.write("                            <td>Batch</td>\n");
      out.write("                            <td><input type=\"hidden\" class=\"data\" name =\"batch\" id=\"input\" value=\" ");
      out.print( batch);
      out.write("\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr> \n");
      out.write("                            <td>Phone No</td>\n");
      out.write("                            <td><input type=\"hidden\" class=\"data\" name =\"phone\" id=\"input\" value=\" ");
      out.print( phone);
      out.write("\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr> \n");
      out.write("                            <td>Address</td>\n");
      out.write("                            <td><input type=\"hidden\" class=\"data\"  name =\"address\" id=\"input\" value=\" ");
      out.print( address);
      out.write("\" ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"Back to Admin\" class=\"btn\" onclick=\"form1.action = 'admin.jsp'\"/></td>\n");
      out.write("                            <td><input type=\"reset\" class=\"btn\" value=\"Reset\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                </table>\n");
      out.write("                ");

                        }
                    } catch (Exception e) {
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </fieldset>  \n");
      out.write("        </form>\n");
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
