package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .boton_personalizado{\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                background-color: #1883ba;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                border: 2px solid #0016b0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .redondeado {\n");
      out.write("\n");
      out.write("                border-radius: 5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1{\n");
      out.write("                font-family: arial;\n");
      out.write("                font-size: 20pt;\n");
      out.write("                color: #00CED1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2{\n");
      out.write("                font-family: arial;\n");
      out.write("                font-size: 18pt;\n");
      out.write("                color: mediumspringgreen;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Registrar Pelicula</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"profile\" href=\"#\">\n");
      out.write("\n");
      out.write("        <!--Google Font-->\n");
      out.write("        <link rel=\"stylesheet\" href='http://fonts.googleapis.com/css?family=Dosis:400,700,500|Nunito:300,400,600' />\n");
      out.write("        <!-- Mobile specific meta -->\n");
      out.write("        <meta name=viewport content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"format-detection\" content=\"telephone-no\">\n");
      out.write("\n");
      out.write("        <!-- CSS files -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/plugins.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- BEGIN | Header -->\n");
      out.write("        <header class=\"ht-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"navbar navbar-default navbar-custom\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header logo\">\n");
      out.write("                        <div class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"mostrarTodos.do\"><img class=\"logo\" src=\"images/LogoPelis.png\" alt=\"\" width=\"119\" height=\"58\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse flex-parent\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav flex-child-menu menu-left\">\n");
      out.write("\n");
      out.write("                            <h1>AGREGA UNA PELICULA</h1>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.navbar-collapse -->\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- END | Header -->\n");
      out.write("\n");
      out.write("        <div class=\"slider movie-items\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" >\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <form action=\"registrar.do\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                            <h2 class=\"text-left\">Nombre Pelicula:</h2>\n");
      out.write("                            <br />\n");
      out.write("                            <input type=\"text\" name=\"txtNombreP\" class=\"redondeado\" placeholder=\"Batman\"/> \n");
      out.write("                            <br />\n");
      out.write("                            <h2 class=\"text-left\">Nombre Original:</h2>\n");
      out.write("                            <br />\n");
      out.write("                            <input type=\"text\" name=\"txtNombreO\" class=\"redondeado\" placeholder=\"El caballero de la noche\"/>\n");
      out.write("                            <br />\n");
      out.write("                            <h2 class=\"text-left\">Reseña:</h2>\n");
      out.write("                            <br />\n");
      out.write("                            <input type=\"text\" name=\"txtResena\" class=\"redondeado\" placeholder=\"Reseña\"/>\n");
      out.write("                            <br />\n");
      out.write("                            <h2 class=\"text-left\">Sinopsis:</h2>\n");
      out.write("                            <br />\n");
      out.write("                            <textarea  name=\"txtSinopsis\" class=\"redondeado form-control\" rows=\"3\" placeholder=\"Sinopsis\"></textarea>\n");
      out.write("                            <br />\n");
      out.write("                            <h2 class=\"text-left\">Portada:</h2>\n");
      out.write("                            <br />\n");
      out.write("                            <input type=\"file\" name=\"filePortada\" class=\"boton_personalizado\"/>\n");
      out.write("                            <br />\n");
      out.write("                            <input type=\"submit\" value=\"Registrar\" class=\"boton_personalizado\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <img class=\"logo\" src=\"images/263952.jpeg\" alt=\"\" width=\"500\" height=\"300\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--end of latest new v1 section-->\n");
      out.write("        <!-- footer section-->\n");
      out.write("        <footer class=\"ht-footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row ipad-width\">\n");
      out.write("                    <div class=\"flex-parent-ft\">\n");
      out.write("                        <div class=\"flex-child-ft item1\">\n");
      out.write("                            <a href=\"mostrarTodos.do\"><img class=\"logo\" src=\"images/LogoPelis.png\" alt=\"\"  width=\"119\" height=\"58\"></a>\n");
      out.write("                            <p>Vanii Alcantara, 7690-18-1298<br>\n");
      out.write("                                Werner Carcamo, 7690-20-10779</p>\n");
      out.write("                            <p>Universidad: <a> Mariano Galvez de Guatemala</a></p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- end of footer section-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
      out.write("        <script src=\"js/plugins2.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
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
