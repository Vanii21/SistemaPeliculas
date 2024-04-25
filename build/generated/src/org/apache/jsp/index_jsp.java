package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("    \n");
      out.write("    <head>\n");
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
      out.write("        <!--preloading-->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <img class=\"logo\" src=\"images/LogoPelis.png\" alt=\"\" width=\"119\" height=\"58\">\n");
      out.write("            <div id=\"status\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--end of preloading-->\n");
      out.write("\n");
      out.write("        <!-- BEGIN | Header -->\n");
      out.write("        <header class=\"ht-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"navbar navbar-default navbar-custom\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header logo\">\n");
      out.write("                        <div class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <div id=\"nav-icon1\">\n");
      out.write("                                <span></span>\n");
      out.write("                                <span></span>\n");
      out.write("                                <span></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\"><img class=\"logo\" src=\"images/LogoPelis.png\" alt=\"\" width=\"119\" height=\"58\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse flex-parent\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav flex-child-menu menu-left\">\n");
      out.write("                            <li class=\"hidden\">\n");
      out.write("                                <a href=\"#page-top\"></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown first\">\n");
      out.write("                                <a class=\"btn btn-default dropdown-toggle lv1\" data-toggle=\"dropdown\">\n");
      out.write("                                    Agrega <i class=\"fa fa-angle-down\" aria-hidden=\"true\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu level1\">\n");
      out.write("                                    <li><a href=\"registrar.jsp\">Agregar Peliculas</a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown first\">\n");
      out.write("                                <a class=\"btn btn-default dropdown-toggle lv1\" data-toggle=\"dropdown\">\n");
      out.write("                                    Busqueda <i class=\"fa fa-angle-down\" aria-hidden=\"true\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu level1\">\n");
      out.write("                                    <li><a href=\"buscar.jsp\">Busqueda Peliculas</a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown first\">\n");
      out.write("                                <a class=\"btn btn-default dropdown-toggle lv1\" data-toggle=\"dropdown\">\n");
      out.write("                                    Peliculas <i class=\"fa fa-angle-down\" aria-hidden=\"true\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu level1\">\n");
      out.write("                                    <li><a href=\"mostrarTodos.jsp\">Mostrar Todo</a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.navbar-collapse -->\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <!-- top search form -->\n");
      out.write("                <div class=\"top-search\">\n");
      out.write("\n");
      out.write("                    <input type=\"text\" placeholder=\"Busca tu pelicula favorita\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- END | Header -->\n");
      out.write("\n");
      out.write("        <div class=\"slider movie-items\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" >\n");
      out.write("\n");
      out.write("                    <div  class=\"slick-multiItemSlider\">\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"images/uploads/slider1.jpg\" alt=\"\" width=\"285\" height=\"437\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"blue\"><a href=\"#\">Sci-fi</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">Interstellar</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"images/uploads/slider2.jpg\" alt=\"\" width=\"285\" height=\"437\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"yell\"><a href=\"#\">action</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">The revenant</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"images/uploads/slider3.jpg\" alt=\"\" width=\"285\" height=\"437\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"green\"><a href=\"#\">comedy</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">Die hard</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"images/uploads/slider4.jpg\" alt=\"\" width=\"285\" height=\"437\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"blue\"><a href=\"#\">Sci-fi</a></span> <span class=\"orange\"><a href=\"#\">advanture</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">The walk</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"images/uploads/slider1.jpg\" alt=\"\" width=\"285\" height=\"437\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"blue\"><a href=\"#\">Sci-fi</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">Interstellar</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <a href=\"#\"><img src=\"images/uploads/slider2.jpg\" alt=\"\" width=\"285\" height=\"437\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"yell\"><a href=\"#\">action</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">The revenant</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <img src=\"images/uploads/slider3.jpg\" alt=\"\" width=\"285\" height=\"437\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"green\"><a href=\"#\">comedy</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">Die hard</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <img src=\"images/uploads/slider4.jpg\" alt=\"\" width=\"285\" height=\"437\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"blue\"><a href=\"#\">Sci-fi</a></span> <span class=\"orange\"><a href=\"#\">advanture</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">The walk</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                <img src=\"images/uploads/slider3.jpg\" alt=\"\" width=\"285\" height=\"437\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <div class=\"cate\">\n");
      out.write("                                    <span class=\"green\"><a href=\"#\">comedy</a></span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6><a href=\"#\">Die hard</a></h6>\n");
      out.write("                                <p><i class=\"ion-android-star\"></i><span>7.4</span> /10</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"trailers\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row ipad-width\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"title-hd\">\n");
      out.write("                            <h2>Corto Metrajes</h2>\n");
      out.write("                            <a href=\"#\" class=\"viewall\">Mas Trailer <i class=\"ion-ios-arrow-right\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"videos\">\n");
      out.write("                            <div class=\"slider-for-2 video-ft\">\n");
      out.write("                                <div>\n");
      out.write("                                    <iframe class=\"item-video\" src=\"#\" data-src=\"https://www.youtube.com/embed/1Q8fG0TtVAY\"></iframe>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <iframe class=\"item-video\" src=\"#\" data-src=\"https://www.youtube.com/embed/w0qQkSuWOS8\"></iframe>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <iframe class=\"item-video\" src=\"#\" data-src=\"https://www.youtube.com/embed/44LdLqgOpjo\"></iframe>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <iframe class=\"item-video\" src=\"#\" data-src=\"https://www.youtube.com/embed/gbug3zTm3Ws\"></iframe>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <iframe class=\"item-video\" src=\"#\" data-src=\"https://www.youtube.com/embed/e3Nl_TCQXuw\"></iframe>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <iframe class=\"item-video\" src=\"#\" data-src=\"https://www.youtube.com/embed/NxhEZG0k9_w\"></iframe>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"slider-nav-2 thumb-ft\">\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"trailer-img\">\n");
      out.write("                                        <img src=\"images/uploads/trailer7.jpg\"  alt=\"photo by Barn Images\" width=\"4096\" height=\"2737\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"trailer-infor\">\n");
      out.write("                                        <h4 class=\"desc\">Wonder Woman</h4>\n");
      out.write("                                        <p>2:30</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"trailer-img\">\n");
      out.write("                                        <img src=\"images/uploads/trailer2.jpg\"  alt=\"photo by Barn Images\" width=\"350\" height=\"200\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"trailer-infor\">\n");
      out.write("                                        <h4 class=\"desc\">Oblivion: Official Teaser Trailer</h4>\n");
      out.write("                                        <p>2:37</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"trailer-img\">\n");
      out.write("                                        <img src=\"images/uploads/trailer6.jpg\" alt=\"photo by Joshua Earle\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"trailer-infor\">\n");
      out.write("                                        <h4 class=\"desc\">Exclusive Interview:  Skull Island</h4>\n");
      out.write("                                        <p>2:44</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"trailer-img\">\n");
      out.write("                                        <img src=\"images/uploads/trailer3.png\" alt=\"photo by Alexander Dimitrov\" width=\"100\" height=\"56\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"trailer-infor\">\n");
      out.write("                                        <h4 class=\"desc\">Logan: Director James Mangold Interview</h4>\t\n");
      out.write("                                        <p>2:43</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"trailer-img\">\n");
      out.write("                                        <img src=\"images/uploads/trailer4.png\"  alt=\"photo by Wojciech Szaturski\" width=\"100\" height=\"56\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"trailer-infor\">\n");
      out.write("                                        <h4 class=\"desc\">Beauty and the Beast: Official Teaser Trailer 2</h4>\t\n");
      out.write("                                        <p>2: 32</p>\n");
      out.write("                                    </div>\t\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"trailer-img\">\n");
      out.write("                                        <img src=\"images/uploads/trailer5.jpg\"  alt=\"photo by Wojciech Szaturski\" width=\"360\" height=\"189\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"trailer-infor\">\n");
      out.write("                                        <h4 class=\"desc\">Fast&Furious 8</h4>\t\n");
      out.write("                                        <p>3:11</p>\n");
      out.write("                                    </div>\t\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>   \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--end of latest new v1 section-->\n");
      out.write("        <!-- footer section-->\n");
      out.write("        <footer class=\"ht-footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"flex-parent-ft\">\n");
      out.write("                    <div class=\"flex-child-ft item1\">\n");
      out.write("                        <a href=\"index-2.html\"><img class=\"logo\" src=\"images/LogoPelis.png\" alt=\"\"  width=\"119\" height=\"58\"></a>\n");
      out.write("                        <p>Vanii Alcantara, 7690-18-1298<br>\n");
      out.write("                            Werner Carcamo, 7690-20-10779</p>\n");
      out.write("                        <p>Universidad: <a> Mariano Galvez de Guatemala</a></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- end of footer section-->\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
      out.write("        <script src=\"js/plugins2.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
