package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detallesproducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Detalles Producto</h1>\n");
      out.write("    </body>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Exchange</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"#\"></a></li>\n");
      out.write("                    <li><a href=\"#\"></a></li>\n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"jsp/regristar.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Regristarse</a></li>\n");
      out.write("                    <li><a href=\"html/loginvista.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Ingresar</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \t<div class=\"row\">\n");
      out.write("        \t\t<h2 align=\"center\">Detalles</h2>\n");
      out.write("        \t\t<form>\n");
      out.write("        \t\t\t\t<div class=\"col-md-6\" >\n");
      out.write("        \t\t\t\t\t<div class=\"col-md-3\"></div>\n");
      out.write("        \t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("        \t\t\t\t\t\t<img src=\"\" width=\"300\" height=\"300\">\n");
      out.write("        \t\t\t\t\t\t<br>\n");
      out.write("        \t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("        \t\t\t\t\t\t\t<img src=\"\" class=\"img-circle\" width=\"80\" height=\"80\">\n");
      out.write("        \t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("        \t\t\t\t\t\t<div class=\"col-md-6\">      \t\t\t\t\t\t\t\n");
      out.write("        \t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\t\n");
      out.write("        \t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t</div>\n");
      out.write("        \t\t\n");
      out.write("        \t\t<div class=\"col-md-6\" >\n");
      out.write("        \t\t\t<h2 align=\"center\">Descripción</h2>\n");
      out.write("        \t\t\t<br>\n");
      out.write("        \t\t\t      \t\t\t\n");
      out.write("        \t\t\t<div class=\"\" style=\"border: 1px solid #E1E1E1;\">\n");
      out.write("        \t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("        \t\t\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("        \t\t\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("        \t\t\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("        \t\t\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("        \t\t\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n");
      out.write("        \t\t\t</div>\n");
      out.write("        \t\t\t<br>\n");
      out.write("        \t\t\t<div style=\"border: 1px solid #E1E1E1;\"><h5>Precio Estimado : </h5></div>\n");
      out.write("        \t\n");
      out.write("        \t\t<br>\n");
      out.write("\n");
      out.write("        \t\t<div style=\"border: 1px solid #E1E1E1;\"><h5>Cantidad : </h5></div>\n");
      out.write("        \t\t<br>\n");
      out.write("        \t\t<div style=\"border: 1px solid #E1E1E1;\"><h5>Ciudad : </h5></div>\n");
      out.write("        \t\t</div>\n");
      out.write("        \t\t\n");
      out.write("        \t\t<br>\n");
      out.write("        \t\t<center>\n");
      out.write("        \t\t\t<div class=\"row\">\n");
      out.write("        \t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("        \t\t\t<div class=\"col-md-4\">\n");
      out.write("        \t\t\t\t<h4 align=\"center\">Desea ingresar ala subasta</h4>\n");
      out.write("        \t\t\t\t<div class=\"col-md-6\">\n");
      out.write("        \t\t\t\t\t<input type=\"submit\" value=\"Si\" class=\"btn btn-primary form-control\" name=\"\">\n");
      out.write("        \t\t\t\t</div>\n");
      out.write("        \t\t\t\t<div class=\"col-md-6\">\n");
      out.write("        \t\t\t\t\t<input type=\"submit\"  value=\"No\" class=\"btn btn-primary form-control\" name=\"\">\n");
      out.write("        \t\t\t\t</div>\n");
      out.write("        \t\t\t</div>\n");
      out.write("        \t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("        \t\t</div>\n");
      out.write("        \t\t</center>\n");
      out.write("        \t\t\n");
      out.write("        \t\t</form>       \t\n");
      out.write("        \t</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/jquery.js\"></script>\n");
      out.write("                <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
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
