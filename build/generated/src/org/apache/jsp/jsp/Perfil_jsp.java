package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/estilo.css\">\n");
      out.write("        <title>Perfil</title>\n");
      out.write("        <style>\n");
      out.write("            form{\n");
      out.write("\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("\n");
      out.write("                padding: 3px;\n");
      out.write("                border: 1px solid #E1E1E1;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                font:15px Arial, Helvetica, sans-serif;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <div id=\"marca\">\n");
      out.write("                    <h1><span class=\"resaltado\">Exchange</span> Plataforma de Trueques</h1>\t\t\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" style=\"border: 1px solid #E1E1E1;\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <img src=\"\" width=\"250\" height=\"250\">                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <h3>Nombre :</h3>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <h3>Telefono : </h3>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Editar Perfil\" class=\"btn btn-primary form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <h3>Correo :</h3>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <h3>Ciudad :</h3>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Cambiar Contraseña\" class=\"btn btn-primary form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <center>\n");
      out.write("                    <div class=\"row\" style=\"border: 1px solid #E1E1E1;\" >\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3\" >\n");
      out.write("                            <img src=\"\" width=\"170\" height=\"170\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\" >\n");
      out.write("                            <h3>Nombre </h3>\n");
      out.write("                            <br>\n");
      out.write("                            <p style=\"border: 1px solid #E1E1E1;\">descripcion</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <br>                      \n");
      out.write("                            <input type=\"submit\" class=\"form-control btn btn-primary\" value=\"Editar \" >\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"submit\" class=\"form-control btn btn-primary\" value=\"Detalles \" >\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <a><input type=\"submit\" class=\"form-control btn btn-primary\" value=\"Eliminar \"</a> >\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </div>                   \n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script> \n");
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
