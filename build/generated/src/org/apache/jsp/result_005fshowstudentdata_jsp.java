package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public final class result_005fshowstudentdata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body style ='text-align: center; '>\n");
      out.write("        <div>\n");
      out.write("            ");

//                String id = request.getParameter("id");
//                String password = request.getParameter("password");
                String u = request.getParameter("u");
                        int id = Integer.parseInt(u);
                try {
                
                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String query = "select * from students where id='" + id + "'";
                ResultSet rs=st.executeQuery(query);
                
                while (rs.next()){
                    //String id = rs.getString("id");
                        String fname = rs.getString("fname");
                        String lname = rs.getString("lname");
                        String course = rs.getString("course");
                        String batch = rs.getString("batch");
                    
                    
       
                        


            
      out.write("\n");
      out.write("            <form action=\"result_showresults.jsp\" method=\"post\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <h1> Student Details </h1>\n");
      out.write("                    <table>\n");
      out.write("                        <tr> \n");
      out.write("                            <td>ID</td>\n");
      out.write("                            <td><input type=\"text\" class=\"data\" name =\"id\" id=\"input\" readonly=\"readonly\" value=\"");
      out.print( id);
      out.write(" \" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr> \n");
      out.write("                            <td> Name </td>\n");
      out.write("                            <td><input type=\"text\" class=\"data\" name =\"name\" id=\"input\" readonly=\"readonly\" value=\" ");
      out.print( fname + " " + lname);
      out.write("\" /> </td>\n");
      out.write("                                <input type=\"hidden\" class=\"data\" name =\"fname\" id=\"input\" readonly=\"readonly\" value=\" ");
      out.print( fname );
      out.write("\" /> \n");
      out.write("                                <input type=\"hidden\" class=\"data\" name =\"lname\" id=\"input\" readonly=\"readonly\" value=\" ");
      out.print( lname);
      out.write("\" /> \n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr> \n");
      out.write("                            <td>Course</td>\n");
      out.write("                            <td><input type=\"text\" class=\"data\" name =\"course\" id=\"input\" readonly=\"readonly\" value=\" ");
      out.print( course);
      out.write("\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr> \n");
      out.write("                            <td>Batch</td>\n");
      out.write("                            <td><input type=\"text\" class=\"data\" name =\"batch\" id=\"input\" readonly=\"readonly\" value=\" ");
      out.print( batch);
      out.write("\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><label> Show results of</label></td>\n");
      out.write("                            <td><select  class=\"data\" name=\"trim\" placeholder=\"Select one\">\n");
      out.write("                                    <option name=\"trim1\" value=\"trim1\"> Trimester 1</option>\n");
      out.write("                                    <option name=\"trim2\" value=\"trim2\"> Trimester 2</option>\n");
      out.write("\n");
      out.write("                                    <option name=\"trim3\" value=\"trim3\"> Trimester 3</option>\n");
      out.write("\n");
      out.write("                                    <option name=\"trim4\" value=\"trim4\"> Trimester 4</option>\n");
      out.write("\n");
      out.write("                                    <option name=\"trim5\" value=\"trim5\"> Trimester 5</option>\n");
      out.write("\n");
      out.write("                                    <option name=\"trimall\" value=\"trimall\"> All</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"Show\" class=\"btn\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </fieldset>  \n");
      out.write("                ");

                    }
                    
                   
                        }
                     catch (Exception e) {

                        out.println(e);
                    }


                
      out.write("\n");
      out.write("            </form>\n");
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
