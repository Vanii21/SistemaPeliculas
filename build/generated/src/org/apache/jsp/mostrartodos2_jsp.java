package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import modelo.Peliculas;
import modelo.ListaCircular;

public final class mostrartodos2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            ListaCircular<Peliculas> peliculas = (ListaCircular<Peliculas>) request.getSession().getAttribute("myUser");

        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");
                
                peliculas.actual = peliculas.primero;

                do {
                    
                    String nomb = peliculas.actual.getDato().getNombrePelicula();
                    Object port = peliculas.actual.getDato().getPortada();
                    File file= new File("D:\\OneDrive\\Escritorio\\Practica_Netbeans\\ProyectoPeliculas\\web\\Prueba\\uno.jpg");
                    BufferedImage bufferedImage=ImageIO.read(file);
                    ImageIcon image=new ImageIcon(bufferedImage);
                    
      out.write("\n");
      out.write("                    <div class=\"movie-item\">\n");
      out.write("                            <div class=\"mv-img\">\n");
      out.write("                                \n");
      out.write("                                <img src=\"D:\\\\OneDrive\\\\Escritorio\\\\Practica_Netbeans\\\\ProyectoPeliculas\\\\web\\\\Prueba\\\\uno.jpg\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"title-in\">\n");
      out.write("                                <h6><a href=\"#\">");
out.print(nomb);
      out.write("</a></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    ");

                    
                    peliculas.actual = peliculas.actual.getSiguiente();

                } while (peliculas.actual != peliculas.primero);
            
      out.write("\n");
      out.write("\n");
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
