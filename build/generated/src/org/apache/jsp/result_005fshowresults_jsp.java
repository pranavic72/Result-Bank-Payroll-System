package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class result_005fshowresults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("\ttext-align: center;\n");
      out.write("\talign-content: center;\n");
      out.write("\tfont-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("            .data{\n");
      out.write("                font-size: 25px; \n");
      out.write("                display:table-cell; \n");
      out.write("                border-radius: 5px 5px 5px 5px;\n");
      out.write("/*                padding: 10% 20% 10% 20%;*/\n");
      out.write("                padding: 5% 20% 5% 20%;\n");
      out.write("                font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("                background-color: aqua;\n");
      out.write("\n");
      out.write("            }\n");
      out.write(".btn {\n");
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
      out.write("\n");
      out.write("            td{\n");
      out.write("                padding: 20px 20px 20px 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.data {\n");
      out.write("                width: 100%;\n");
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
      out.write("                width: 200px;\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            String id = request.getParameter("id");
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String course = request.getParameter("course");
            String batch = request.getParameter("batch");
//            String phone = request.getParameter("phone");
//            String address = request.getParameter("address");
            String trim = request.getParameter("trim");
            String name = fname + " " + lname;

            try {
                String query = "";
                String head = "";

                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                if (trim.equals("trim1")) {
                    head = "First";
                    query = "select * from trim1 where id='" + id + "'";
                } else if (trim.equals("trim2")) {
                    head = "Second";
                    query = "select * from trim2 where id='" + id + "'";
                } else if (trim.equals("trim3")) {
                    head = "Third";
                    query = "select * from trim3 where id='" + id + "'";
                } else if (trim.equals("trim4")) {
                    head = "Fourth";
                    query = "select * from trim4 where id='" + id + "'";
                } else if (trim.equals("trim5")) {
                    head = "Fifth";
                    query = "select * from trim5 where id='" + id + "'";
                } else if (trim.equals("trimall")) {
                    head = "Final";
                    query = "select * from trimall where id='" + id + "'";
                } else {
                    out.println("Data not found");
                }
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    String status = rs.getString("status");
                    int sub1 = rs.getInt("sub1");
                    int sub2 = rs.getInt("sub2");
                    int sub3 = rs.getInt("sub3");
                    int sub4 = rs.getInt("sub4");
                    int sub5 = rs.getInt("sub5");
                    int total = sub1 + sub2 + sub3 + sub4 + sub5;
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div align=\"center\">\n");
      out.write("            <h1>Student Results</h1>\n");
      out.write("            <table class=\"data\">\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"6\">Trimester: ");
      out.print( head);
      out.write("</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\">ID: ");
      out.print( id);
      out.write("</td>\n");
      out.write("                    <td colspan=\"3\">Name:");
      out.print( name);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Subject</td>\n");
      out.write("                    <td>Advanced Java</td>\n");
      out.write("                    <td>Web Technology</td>\n");
      out.write("                    <td>Database Application</td>\n");
      out.write("                    <td>Business Statistics</td>\n");
      out.write("                    <td>Design &amp; Algorithms</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Marks</td>\n");
      out.write("                    <td>");
      out.print( sub1);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( sub2);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( sub3);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( sub4);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( sub5);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">Total Marks: ");
      out.print( total);
      out.write("/500</td>\n");
      out.write("                    ");

                        String grade = "";

                        if (total < 150) {
                            grade = "E";
                            //request.setAttribute("grade", grade);
                        } else if (total >= 150 && total <= 170) {
                            grade = "D";
                        } else if (total >= 170 && total <= 200) {
                            grade = "D+";
                        } else if (total >= 201 && total <= 240) {
                            grade = "C-";
                        } else if (total >= 241 && total <= 270) {
                            grade = "C";
                        } else if (total >= 271 && total <= 310) {
                            grade = "C+";
                        } else if (total >= 311 && total <= 340) {
                            grade = "B-";
                        } else if (total >= 341 && total <= 380) {
                            grade = "B";
                        } else if (total >= 381 && total <= 420) {
                            grade = "B+";
                        } else if (total >= 421 && total <= 450) {
                            grade = "A";
                        } else if (total >= 451 && total <= 500) {
                            grade = "A+";
                        }
                        request.setAttribute("grade", grade);
                    
      out.write("\n");
      out.write("                    <td colspan=\"2\">Final Grade: ");
      out.print( grade);
      out.write("</td>\n");
      out.write("                    <td colspan=\"2\">Result: ");
      out.print( status);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        float avg = total / 5;
                        float cgpa = avg / 10;
                    
      out.write("   \n");
      out.write("                    <td colspan=\"5\">CGPA: ");
      out.print( cgpa);
      out.write("</td>\n");
      out.write("                    <td id=\"insert\">\n");
      out.write("                        <a href='result_resultupdate.jsp?u=");
      out.print(rs.getString("id"));
      out.write("?t=");
      out.print(trim);
      out.write("?s1=");
      out.print(rs.getInt("sub1"));
      out.write("?s2=");
      out.print(rs.getInt("sub2"));
      out.write("?s3=");
      out.print(rs.getInt("sub3"));
      out.write("?s4=");
      out.print(rs.getInt("sub4"));
      out.write("?s5=");
      out.print(rs.getInt("sub5"));
      out.write("' class=\"btn\">Edit</a>\n");
      out.write("                        <a href='result_resultupdate10.jsp?id=");
      out.print(rs.getString("id"));
      out.write("?t=");
      out.print(trim);
      out.write("' class=\"btn\">LOL FUCKN WORK BITCH</a>\n");
      out.write("                        <a href='result_resultupdate10.jsp?u=");
      out.print(rs.getString("id"));
      out.write("' class=\"btn\">Pls work lol</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table> \n");
      out.write("                        <button onclick=\"history.back()\" class=\"btn\">Go Back </button>\n");
      out.write("        </div>\n");
      out.write("        ");
                }
            } catch (Exception e) {
            }

        
      out.write("\n");
      out.write("<br><br>\n");
      out.write("            ");
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
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
