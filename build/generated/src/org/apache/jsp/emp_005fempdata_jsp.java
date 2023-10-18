package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public final class emp_005fempdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("        <style>\n");
      out.write("              \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>Employee Data</h1>\n");
      out.write("            ");

                String email = request.getParameter("email");
                String password = request.getParameter("password");
                 try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root", "");
                    String query = "select * from employee where email='" + email + "' and password='" + password + "'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {

                        String id = rs.getString("id");
                        String salutation = rs.getString("salutation");
                        String fname = rs.getString("fname");
                        String lname = rs.getString("lname");
                        String dob = rs.getString("dob");
                        String phone = rs.getString("phone");
                        String designation = rs.getString("designation");
                        String dateofjoin = rs.getString("dateofjoin");
                        String bankname = rs.getString("bankname");
                        String accno = rs.getString("accno");
                        String branch = rs.getString("branch");
                        String department = rs.getString("department");
                        String hourly = rs.getString("hourly");
                        String name = salutation + ". " +fname +" "+lname;
                        
            
            
      out.write("\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <table class=\"data\">\n");
      out.write("              <tr>\n");
      out.write("                <th colspan=\"4\">Employee Details</th>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td>ID:");
      out.print( id);
      out.write("</td>\n");
      out.write("                <td colspan=\"3\">Name: ");
      out.print( name);
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Phone:</td>\n");
      out.write("                <td>");
      out.print( phone );
      out.write("</td>\n");
      out.write("                <td>Branch:</td>\n");
      out.write("                <td>");
      out.print( branch );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Department:</td>\n");
      out.write("                <td> ");
      out.print( department);
      out.write(" </td>\n");
      out.write("                <td>Designation:</td>\n");
      out.write("                <td> ");
      out.print( designation);
      out.write(" </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Date of Joining:</td>\n");
      out.write("                <td> ");
      out.print( dateofjoin);
      out.write("</td>\n");
      out.write("                <td>Bank Name:</td>\n");
      out.write("                <td>");
      out.print( bankname );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td colspan=\"3\">Acc No:");
      out.print( accno );
      out.write(" </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href='emp_showpayroll.jsp?u=");
      out.print(rs.getString("id"));
      out.write("' class=\"btn\">Payroll</a>\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("            </table>\n");
      out.write("              \n");
      out.write("            ");
        
                    }
                 }
                 catch(Exception e){
                     out.println(e);
                 }
                
            
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
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
