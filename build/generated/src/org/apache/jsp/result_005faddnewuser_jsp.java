package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class result_005faddnewuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"result_addnewuser.jsp\" method='get'>\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <h1>Add New User</h1>\n");
      out.write("                <fieldset>\n");
      out.write("                    <table>                       \n");
      out.write("                        <tr>\n");
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
      out.write("                            <td><label>Type</label><br>\n");
      out.write("                                <select  class=\"data\" name=\"type\">\n");
      out.write("                                    <option></option>\n");
      out.write("                                    <option name=\"type1\" value=\"trim1\"> Admin </option>\n");
      out.write("                                    <option name=\"type2\" value=\"trim2\"> Student</option>\n");
      out.write("\n");
      out.write("                                    <option name=\"type3\" value=\"trim3\"> Professor </option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>  \n");
      out.write(" \n");
      out.write("                        \n");
      out.write("                        <td>\n");
      out.write("                            <label>Email:</label><br>\n");
      out.write("                            <input type=\"email\" class=\"data\" name=\"email\"/><br/>\n");
      out.write("                        </td>  \n");
      out.write("                        \n");
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
                
                String url = "jdbc:mysql://localhost:3306/onlineresult";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String type = request.getParameter("type");
                String email = request.getParameter("email");
                String[] pass = email.split("@");
                String password = pass[0];
                
                if(type.equals("Admin")){
                    String query="insert into users(fname,lname,type,email,password) values('"+fname+"','"+lname+"','"+type+"','"+email+"','"+password+"')";
                    st.executeUpdate(query);
                }
                else if(type.equals("Professor")){
                    String query="insert into users(fname,lname,type,email,password) values('"+fname+"','"+lname+"','"+type+"','"+email+"','"+password+"')";
                    st.executeUpdate(query);
                }
                else if(type.equals("Student")){
                    //query="insert into users(fname,lname,type,email,password) values('"+fname+"','"+lname+"','"+type+"','"+email+"','"+password+"')";
                    response.sendRedirect("result_addnewuser.jsp");
                }
               
                
                else {
                    out.println("error");
                }
                
                

//                if () {
//                    String url = "jdbc:mysql://localhost:3306/onlineresult";
//                    Class.forName("com.mysql.jdbc.Driver");
//                    Connection conn = DriverManager.getConnection(url, "root", "");
//                    Statement st = conn.createStatement();
//                    //Statement st1 = conn.createStatement();
//                    String query = "INSERT INTO students(fname,lname,course,batch,email,phone,address) VALUES('" + fname + "','" + lname + "','" + course + "','" + batch + "','" + email + "','" + phone + "','" + address + "')";
//                    String query2 = "Insert into users(fname,lname,type,email,password) values ('" + fname + "','" + lname + "','" + type + "','" + email + "','" + password + "')";
                    
                    //st.executeUpdate(query2);
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
                    response.sendRedirect("result_admincontroller.jsp");
                }
             catch (Exception e) {
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
