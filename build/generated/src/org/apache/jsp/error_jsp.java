package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\n");
      out.write("<!-- 40414:39-->\n");
      out.write("<head>\n");
      out.write("\t<!-- Basic need -->\n");
      out.write("\t<title>Error 404</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\t<link rel=\"profile\" href=\"#\">\n");
      out.write("\n");
      out.write("    <!--Google Font-->\n");
      out.write("    <link rel=\"stylesheet\" href='http://fonts.googleapis.com/css?family=Dosis:400,700,500|Nunito:300,400,600' />\n");
      out.write("\t<!-- Mobile specific meta -->\n");
      out.write("\t<meta name=viewport content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone-no\">\n");
      out.write("\n");
      out.write("\t<!-- CSS files -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/plugins.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"page-single-2\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"middle-content\">\n");
      out.write("\t\t\t\t<a href=\"#\"><img class=\"md-logo\" src=\"images/logo1.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t<img src=\"img/Eternals.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t<h1>PELICULA NO REGISTRADA - ERROR AL REGISTRAR LA PELICULA</h1>\n");
      out.write("\t\t\t\t<a href=\"mostrarTodos.do\" class=\"redbtn\">Ir al Inicio</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/plugins.js\"></script>\n");
      out.write("<script src=\"js/plugins2.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- 40414:54-->\n");
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
