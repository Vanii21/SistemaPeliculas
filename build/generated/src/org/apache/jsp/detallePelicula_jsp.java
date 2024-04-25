package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.Actor;
import modelo.NodoArbol;
import modelo.ArbolBinario;
import modelo.Nodo;
import modelo.Peliculas;

public final class detallePelicula_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\n");
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
      out.write("            h1{\n");
      out.write("                font-family: arial;\n");
      out.write("                font-size: 18pt;\n");
      out.write("                color: #EF5350;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2{\n");
      out.write("                font-family: arial;\n");
      out.write("                font-size: 18pt;\n");
      out.write("                color: #B2DFDB;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <!-- Basic need -->\n");
      out.write("        <title>SpamFlix</title>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");


            Nodo<Peliculas> p = (Nodo<Peliculas>) request.getSession().getAttribute("myPeliEncontrado");

            Object port = p.getDato().getPortada();
            String nomP = p.getDato().getNombrePelicula();
            String nombO = p.getDato().getNombreOriginal();
            String resena = p.getDato().getReseñas();
            String sinop = p.getDato().getSinopsis();


        
      out.write("\n");
      out.write("        <header class=\"ht-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"navbar navbar-default navbar-custom\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <a href=\"mostrarTodos.do\"><img class=\"logo\" src=\"images/LogoPelis.png\" alt=\"\" width=\"119\" height=\"58\"></a>\n");
      out.write("                    <div class=\"collapse navbar-collapse flex-parent\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav flex-child-menu menu-left\">\n");
      out.write("\n");
      out.write("                            <p style=\"font-size: 50px\"><b>DETALLE PELICULA</b></p>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"slider movie-items\" align=\"center\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <th colspan=\"3\"><img src=\"https://image.tmdb.org/t/p/w500");
      out.print(port);
      out.write("\" style=\"width:1800px !important; height:700px !important\" alt=\"\"></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td rowspan=\"4\"><img src=\"https://image.tmdb.org/t/p/w500");
      out.print(port);
      out.write("\" style=\"width:400px !important; height:550px !important\" alt=\"\"></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td colspan=\"2\"><p style=\"font-size: 50px\"><b>");
      out.print(nomP);
      out.write("<br></b></p></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td colspan=\"2\"><p style=\"font-size: 35px\"><b>Nombre Original: ");
      out.print(nombO);
      out.write("</b></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td colspan=\"2\"><p style=\"font-size: 20px\"><b>Reseña: ");
      out.print(resena);
      out.write("</b></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td colspan=\"3\"><p style=\"font-size: 20px\"><b>Sinopsis: ");
      out.print(sinop);
      out.write("</b></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"slider movie-items\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    ");


                        ArbolBinario actor = (ArbolBinario) request.getSession().getAttribute("MyActorEncontrado");
                        ArrayList<Actor> arr = new ArrayList<Actor>();

                        actor.agregarNodo(new Actor("Holland", "Tom", "Spiderman", 1001, 1, "Spiderman.jpg"));
                        actor.agregarNodo(new Actor("Zendaya", "MJ", "Spiderman No way home", 1002, 2, "SpidermanHome.jpg"));

                        actor.inOrden(actor.raiz, arr);

                        for (Actor e : arr) {


                    
      out.write("\n");
      out.write("                    <div class=\"movie-item\">\n");
      out.write("\n");
      out.write("                        <h1>out.println(e);</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");
                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"slider movie-items\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <div>\n");
      out.write("                        <form action=\"eliminarpeli.do?accion=");
      out.print(nomP);
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                            <input type=\"submit\" value=\"Eliminar Pelicula\" class=\"boton_personalizado\"> \n");
      out.write("                        </form>\n");
      out.write("                        <br>\n");
      out.write("                        <form action=\"editarPeli.jsp?accion=");
      out.print(nomP);
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                            <input type=\"submit\" value=\"Editar Pelicula\" class=\"boton_personalizado\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--end of latest new v1 section-->\n");
      out.write("    <!-- footer section-->\n");
      out.write("    <footer class=\"ht-footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"flex-parent-ft\">\n");
      out.write("                <div class=\"flex-child-ft item1\">\n");
      out.write("                    <a href=\"mostrarTodos.do\"><img class=\"logo\" src=\"images/LogoPelis.png\" alt=\"\"  width=\"119\" height=\"58\"></a>\n");
      out.write("                    <p>Vanii Alcantara, 7690-18-1298<br>\n");
      out.write("                        Werner Carcamo, 7690-20-10779</p>\n");
      out.write("                    <p>Universidad: <a> Mariano Galvez de Guatemala</a></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- end of footer section-->\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <script src=\"js/plugins2.js\"></script>\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
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
