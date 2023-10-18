package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class result_005fdisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .data{\n");
      out.write("                        font-size: 20px; \n");
      out.write("                        display:table-cell; \n");
      out.write("                        border-radius: 5px 5px 5px 5px;\n");
      out.write("                        padding: 10% 20% 10% 20%;\n");
      out.write("                        font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                td{\n");
      out.write("                        padding: 20px 20px 20px 20px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                table.data {\n");
      out.write("                  width: 100%;\n");
      out.write("                  background-color: #ffffff;\n");
      out.write("                  border-collapse: collapse;\n");
      out.write("                  border-width: 0px;\n");
      out.write("                  border-color: #000000;\n");
      out.write("                  text-align: center;\n");
      out.write("                  border-style: solid;\n");
      out.write("                  color: #000000;\n");
      out.write("                  font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                table.data td, table.data th {\n");
      out.write("                        width: 200px;\n");
      out.write("                  /* border-width: 2px; */\n");
      out.write("                  border-color: #000000;\n");
      out.write("                  border-style: solid;\n");
      out.write("                  padding: 10px;\n");
      out.write("                  font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                table.data th {\n");
      out.write("                  background-color: coral;\n");
      out.write("                  font-family: \"Trebuchet MS\", Helvetica, sans-serif;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String id = request.getParameter("id");
            String fname = request.getParameter("fname");
            String lname=request.getParameter("lname");
            String course = request.getParameter("course");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
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
                    head="First";
                    query = "select * from trim1 where id='" + id + "'";
                } 
                else if (trim.equals("trim2")) {
                    head="Second";
                    query = "select * from trim2 where id='" + id + "'";
                } 
                else if (trim.equals("trim3")) {
                    head="Third";
                    query = "select * from trim3 where id='" + id + "'";
                } 
                else if (trim.equals("trim4")) {
                    head="Fourth";
                    query = "select * from trim4 where id='" + id + "'";
                } 
                else if (trim.equals("trim5")) {
                    head="Fifth";
                    query = "select * from trim5 where id='" + id + "'";
                } 
                else if (trim.equals("trimall")) {
                    head="Final";
                    query = "select * from trimall where id='" + id + "'";
                } 
                else {
                    out.println("Data not found");
                }
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    String status = rs.getString("status");
                    int subj1 = rs.getInt("sub1");
                    int subj2 = rs.getInt("sub2");
                    int subj3 = rs.getInt("sub3");
                    int subj4 = rs.getInt("sub4");
                    int subj5 = rs.getInt("sub5");
                    int total = subj1 + subj2 + subj3 + subj4 + subj5;
        
      out.write("\n");
      out.write("           <div align=\"center\">\n");
      out.write("              <table class=\"data\">\n");
      out.write("                   \n");
      out.write("                  <tr>\n");
      out.write("                    <th colspan=\"6\">Trimester: ");
      out.print( head );
      out.write("</th>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td colspan=\"3\">ID: ");
      out.print( id);
      out.write("</td>\n");
      out.write("                    <td colspan=\"3\">Name:");
      out.print( name );
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Subject</td>\n");
      out.write("                    <td>Advanced Java</td>\n");
      out.write("                    <td>Web Technology</td>\n");
      out.write("                    <td>Database Application</td>\n");
      out.write("                    <td>Business Statistics</td>\n");
      out.write("                    <td>Design &amp; Algorithms</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                     <td>Marks</td>\n");
      out.write("                    <td>");
      out.print( subj1);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subj2);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subj3);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subj4);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subj5);
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td colspan=\"2\">Total Marks: ");
      out.print( total );
      out.write("/500</td>\n");
      out.write("                    ");

                        String grade="";

                        if(total < 150){
                            grade = "E";
                            //request.setAttribute("grade", grade);
                        }
                        else if(total >= 150 && total <=170){
                            grade = "D";
                        }
                        else if(total >=170 && total <=200){
                            grade = "D+";
                        }
                        else if(total >=201 && total <=240){
                            grade = "C-";
                        }
                        else if(total >=241 && total<=270){
                            grade = "C";
                        }
                        else if(total >=271 && total <=310){
                            grade = "C+";
                        }
                        else if(total >=311 && total<=340){
                            grade = "B-";
                        }
                        else if(total >=341 && total <=380){
                            grade = "B";
                        }
                        else if(total >=381 && total <=420){
                            grade = "B+";
                        }
                        else if(total >=421 && total <=450){
                            grade = "A";
                        }
                        else if (total >=451 && total <=500){
                            grade = "A+";
                        }
                       request.setAttribute("grade",grade);
                    
      out.write("\n");
      out.write("                    <td colspan=\"2\">Final Grade: ");
      out.print( grade );
      out.write("</td>\n");
      out.write("                    <td colspan=\"2\">Result: ");
      out.print( status );
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    ");

                        float avg = total/5;
                        float cgpa = avg/10;
                    
      out.write("   \n");
      out.write("                    <td colspan=\"6\">CGPA: ");
      out.print( cgpa );
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table> \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            ");

                    }
                } catch (Exception e) {
                }

            
      out.write("\n");
      out.write("</body>\n");
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
