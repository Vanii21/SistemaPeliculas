package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Swiper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper/swiper-bundle.min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background: #000;\n");
      out.write("                font-family: Helvetica Neue, Helvetica, Arial, sans-serif;\n");
      out.write("                font-size: 14px;\n");
      out.write("                color: #000;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .swiper-container {\n");
      out.write("                width: 100%;\n");
      out.write("                padding-top: 90px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                transition: all 0.5s linear;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .swiper-slide {\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("                width: 420px;\n");
      out.write("                height: 420px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .swiper-slide .number {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                opacity: 0.5;\n");
      out.write("                text-shadow: 4px 4px 4px rgba(255, 255, 255, 0.5),\n");
      out.write("                    -5px px 4px rgba(255, 255, 255, 0.5);\n");
      out.write("                font-size: 100px;\n");
      out.write("                font-weight: 900;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"swiper-container\">\n");
      out.write("            <div class=\"swiper-wrapper\">\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/355x400);\">\n");
      out.write("                    <div class=\"number\">01</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/350x400);\">\n");
      out.write("                    <div class=\"number\">02</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/350x401);\">\n");
      out.write("                    <div class=\"number\">03</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/351x400);\">\n");
      out.write("                    <div class=\"number\">04</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/350x402);\">\n");
      out.write("                    <div class=\"number\">05</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/352x400);\">\n");
      out.write("                    <div class=\"number\">06</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/350x403);\">\n");
      out.write("                    <div class=\"number\">07</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/353x400);\">\n");
      out.write("                    <div class=\"number\">08</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/350x401);\">\n");
      out.write("                    <div class=\"number\">09</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"swiper-slide\" style=\"background-image: url(https://source.unsplash.com/351x400);\">\n");
      out.write("                    <div class=\"number\">10</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"swiper-pagination\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://unpkg.com/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var swiper = new Swiper('.swiper-container', {\n");
      out.write("                effect: 'coverflow',\n");
      out.write("                grabCursor: true,\n");
      out.write("                centeredSlides: true,\n");
      out.write("                slidesPerView: 'auto',\n");
      out.write("                coverflowEffect: {\n");
      out.write("                    rotate: 50,\n");
      out.write("                    stretch: 0,\n");
      out.write("                    depth: 100,\n");
      out.write("                    modifier: 1,\n");
      out.write("                    slideShadows: true,\n");
      out.write("                },\n");
      out.write("                pagination: {\n");
      out.write("                    el: '.swiper-pagination',\n");
      out.write("                },\n");
      out.write("                loop: true,\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
