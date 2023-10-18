package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class result_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <h1>Add New Student</h1>\n");
      out.write("                <fieldset>\n");
      out.write("                    <table>                       \n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>ID:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"id\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>First Name:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"fname\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Last Name:</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"lname\"/><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label>Course</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"course\"/>\n");
      out.write("                            </td>  \n");
      out.write("                            <td>\n");
      out.write("                                <label>Batch</label><br>\n");
      out.write("                                <input type=\"text\" class=\"data\" name=\"batch\"/><br/>\n");
      out.write("                            </td>  \n");
      out.write("                        </tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label>Email:</label><br>\n");
      out.write("                            <input type=\"email\" class=\"data\" name=\"email\"/><br/>\n");
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
      out.write("        ");

//            String id = request.getParameter("id");
            try {
                String id = request.getParameter("id");
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String course = request.getParameter("course");
                String batch = request.getParameter("batch");
                String email = request.getParameter("email");
                String phone = request.getParameter("phone");
                String address = request.getParameter("address");

                if (fname != null && lname != null && course != null && batch != null && email != null && phone != null && address != null) {
                    String url = "jdbc:mysql://localhost:3306/onlineresult";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, "root", "");
                    Statement st = conn.createStatement();
                    //String query ="INSERT INTO students(fname,lname,course,batch,email,phone,address) VALUES('"+fname+"','"+lname+"','"+course+"','"+batch+"','"+email+"','"+phone+"','"+address+"')";
                    String query = "update students set fname='" + fname + ", lname='" + lname + ", course='" + course + ", batch='" + batch + ", phone='" + phone + ", address='" + address + "' WHERE id='" + id + "'";

                    st.executeUpdate(query);
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
                    response.sendRedirect("result_showstudents.jsp");
                }
            } catch (Exception e) {
                out.println(e);
            }

        
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
