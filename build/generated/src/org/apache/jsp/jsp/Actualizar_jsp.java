package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Actualizar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\"></div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <div id=\"ui\">\n");
      out.write("                        <form class=\"form-group \">\n");
      out.write("                            <div class=\"row \">\n");
      out.write("                                <div class=\"form-group col-lg-6\">\n");
      out.write("                                    <label>Nombre</label>\n");
      out.write("                                    <input type=\"text\" name=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\" form-group col-lg-6\">\n");
      out.write("                                    <label>Correo</label>\n");
      out.write("                                    <input type=\"text\" name=\"usuario\" value='' class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6 form-group\">\n");
      out.write("                                    <label>genero</label>\n");
      out.write("                                    <input type=\"text\" name=\"\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6 form-group\">\n");
      out.write("                                    <label>Telefono</label>\n");
      out.write("                                    <input type=\"text\" name=\"\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6 form-group\">\n");
      out.write("                                    <label>Departamento</label>\n");
      out.write("                                    <input type=\"text\" name=\"\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6 form-group\">\n");
      out.write("                                    <label>Ciudad</label>\n");
      out.write("                                    <input type=\"text\" name=\"\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6 form-group\">\n");
      out.write("                                    <input type=\"submit\" name=\"\" value=\"Actualizar\" class=\"form-control btn btn-primary\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6 form-group\">\n");
      out.write("                                    <input type=\"submit\" value=\"Cancelar\" name=\"\" class=\"form-control btn btn-danger\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
