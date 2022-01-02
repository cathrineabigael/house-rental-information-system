package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import org.apache.jasper.tagplugins.jstl.ForEach;
import com.nginepaja.peter.Houses;
import com.nginepaja.peter.Users;
import java.util.ArrayList;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

////    if (session.getAttribute("username") == "null") {
//    if (session.getAttribute("Username") == null || session.getAttribute("Username").equals("")) {
//        response.sendRedirect("signin.jsp");
////        out.println(session.getAttribute("Username"));
//    }
  
    if (session.getAttribute("username")== null) {
        response.sendRedirect("signin.jsp");
        
    }
     out.println(session.getAttribute("username"));

      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: 'Poppins', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            *,\n");
      out.write("            *:focus,\n");
      out.write("            *:hover {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar {\n");
      out.write("                background-color: lightgoldenrodyellow;\n");
      out.write("                min-height: 75px;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar label {\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-style: italic;\n");
      out.write("                font-weight: 500;\n");
      out.write("                color: sienna;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: 1fr 1fr;\n");
      out.write("                /* justify-content: center;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-left: 20px;\n");
      out.write("                margin-right: 20px; */\n");
      out.write("                gap: 20px;\n");
      out.write("                padding: 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .content {\n");
      out.write("                /* margin-top: 20px; */\n");
      out.write("                border: 1px solid silver;\n");
      out.write("                width: auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .content > h4{\n");
      out.write("                margin-top: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img {\n");
      out.write("                width: 600px;\n");
      out.write("                height: 300px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                display: block;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo {\n");
      out.write("                background-color: white;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin: auto;\n");
      out.write("                width: 200px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                align-items: center;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .icon {\n");
      out.write("                height: 50px;\n");
      out.write("                width: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("                /*font-weight: bold;*/\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:hover > .content {\n");
      out.write("                background-color: lightgoldenrodyellow;\n");
      out.write("                border: 1px solid sienna;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:hover >.content> h4 {\n");
      out.write("                color: sienna;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                margin-top: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li {\n");
      out.write("                display: inline;\n");
      out.write("                margin: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a:hover{\n");
      out.write("                color:sienna;text-decoration: underline\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <div class=\"contentlogo\">\n");
      out.write("                    <img class=\"icon\" src=\"https://i.pinimg.com/originals/5e/87/1a/5e871a36092f98428e748dbb9100d3e7.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"contentlogo\">\n");
      out.write("                    <label for=\"\">NginepAja!</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li style=\"color:sienna;text-decoration: underline;\">Home</li>\n");
      out.write("                        <li><a href=\"reservation.jsp\" style=\"font-weight: normal;\">Reservation</a></li>\n");
      out.write("                        <li><a href=\"contactus.jsp\" style=\"font-weight: normal;\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div style=\"float:right;position:absolute;right:30px; top:80px;\">\n");
      out.write("                        <p>John Doe</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
                try {
                    com.nginepaja.peter.UserWS_Service service = new com.nginepaja.peter.UserWS_Service();
                    com.nginepaja.peter.UserWS port = service.getUserWSPort();
                    // TODO process result here
                    java.util.List<com.nginepaja.peter.Houses> result = port.showHouses();

                    for (Houses results : result) {
                        Random rand = new Random();
                        String img = "";
                        int rand_int1 = rand.nextInt(3);
                        if (rand_int1 == 0) {
                            img = "02094137/gambar-rumah-minimalis-2.jpg";
                        } else if (rand_int1 == 1) {
                            img = "02094028/gambar-rumah-minimalis-1.jpg";
                        } else if (rand_int1 == 2) {
                            img = "02094227/gambar-rumah-minimalis-3.jpg";
                        }
                        out.println("<a href='bookreservation.jsp?id=" + results.getHouseId() + "&img=" + img + "'>");
                        out.println("<div class='content'>");
                        out.println("<img src=https://d3p0bla3numw14.cloudfront.net/news-content/img/2020/10/" + img + ">");
                        out.println("<h4>" + results.getAddress() + "</h4>");
                        out.println("<p>Rp " + String.format("%,d\n", results.getPricePerYear()) + " / Tahun</p>");
                        out.println("<p>" + results.getBedroom() + " bedroom, " + results.getBathroom() + " bathroom</p>");
                        out.println("<p>" + results.getElectricalPower() + " V</p>");
                        out.println("</div>");
                        out.println("</a>");
                    }
                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
