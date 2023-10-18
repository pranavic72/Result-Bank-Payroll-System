package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Statement;
import java.sql.DriverManager;

public final class result_005fshowstudents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!--        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"/>-->\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            div{\n");
      out.write("                margin:auto;\n");
      out.write("                padding: 1% 15% 1% 15%;\n");
      out.write("            }            \n");
      out.write("            .data{\n");
      out.write("                font-size: 20px; \n");
      out.write("                display:table-cell; \n");
      out.write("                border-radius: 5px 5px 5px 5px;\n");
      out.write("                position: absolute;\n");
      out.write("                /*                        top: 20%;*/\n");
      out.write("                padding: auto;\n");
      out.write("\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            td{\n");
      out.write("                padding: 10px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.data {\n");
      out.write("                /*                    position: absolute;*/\n");
      out.write("                width: auto;\n");
      out.write("                /*                padding: 50%;*/\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                border-width: 0px;\n");
      out.write("                border-color: #000000;\n");
      out.write("                text-align: center;\n");
      out.write("                border-style: solid;\n");
      out.write("                color: #000000;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.data td, table.data th {\n");
      out.write("                width: auto;\n");
      out.write("\n");
      out.write("                /* border-width: 2px; */\n");
      out.write("                border-color: #000000;\n");
      out.write("                border-style: solid;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.data th {\n");
      out.write("                background-color: coral;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("            }\n");
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
      out.write("            #insert{\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <table class=\"data\">\n");
      out.write("                <thead>\n");
      out.write("                     <tr>\n");
      out.write("                        <td id=\"insert\">\n");
      out.write("                            <a href=\"result_addnewstudent.jsp\" class=\"btn\">Add New Student </a>\n");
      out.write("                        </td>\n");
      out.write("                         <td id=\"insert\"></td>\n");
      out.write("                            <td id=\"insert\"></td>\n");
      out.write("                            <td id=\"insert\"></td>\n");
      out.write("                            <td id=\"insert\">\n");
      out.write("                            <td id=\"insert\">\n");
      out.write("                            <td id=\"insert\">\n");
      out.write("                                <a href=\"result_admincontroller.jsp\" class=\"btn\">Back</a>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Course</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Phone</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineresult", "root", "");
                            String query = "select * from students";
                            Statement st = conn.createStatement();
                            ResultSet rs = st.executeQuery(query);

                            while (rs.next()) {
                                String id = rs.getString("id");
                                String fname = rs.getString("fname");
                                String lname = rs.getString("lname");
                                String course = rs.getString("course");
                                String batch = rs.getString("batch");
                                String email = rs.getString("email");
                                String phone = rs.getString("phone");
                                String address = rs.getString("address");
                                String name = fname + " " + lname;
                                String courseb = course + " " + batch;


                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( id);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( name);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( courseb);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( email);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( phone);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( address);
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href='result_update.jsp?u=");
      out.print(rs.getString("id"));
      out.write("' class=\"btn\">Edit</a>\n");
      out.write("                            <a href='result_delete.jsp?u=");
      out.print(rs.getString("id"));
      out.write("' class=\"btn\">Delete</a>\n");
      out.write("                            <a href='result_resultupdate10.jsp?u=");
      out.print(rs.getString("id"));
      out.write("' class=\"btn\">lol work bitch</a>\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");

                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("    </body>\n");
      out.write("\n");
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
