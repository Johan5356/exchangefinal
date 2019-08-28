package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Exchange.proyecto.persistencia.dao.usuarioDao;
import Exchange.proyecto.persistencia.vo.CategoriasVo;
import Exchange.proyecto.persistencia.dao.CategoriaDao;
import Exchange.proyecto.persistencia.dao.ProductoDAO;
import java.util.List;
import Exchange.proyecto.persistencia.vo.PublicarVO;
import Exchange.proyecto.persistencia.vo.usuariovo;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Detalles pedidos</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/estilo.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                font:15px Arial, Helvetica, sans-serif;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                background-color: #f4f4f4;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");


            PublicarVO pvo = (PublicarVO) session.getAttribute("producto");
            usuariovo vo = (usuariovo) session.getAttribute("usuario");            
            CategoriaDao cd = new CategoriaDao();
            List<CategoriasVo> lista = cd.listar();


        
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Encabezado.jsp", out, false);
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <h2 align=\"center\">Detalles</h2>\r\n");
      out.write("                <form>\r\n");
      out.write("                    <div class=\"col-md-6\" >\r\n");
      out.write("                        <div class=\"col-md-3\"></div>\r\n");
      out.write("                        <div class=\"col-md-9\">\r\n");
      out.write("                            <img src=\"../consultarimagen?id=");
      out.print(pvo.getId_publicar());
      out.write("\" width=\"300\" height=\"300\">\r\n");
      out.write("                            <br>\r\n");
      out.write("                           <a href=\"../perfil?idusuario=");
      out.print(pvo.getId_usuario());
      out.write("\"> <div class=\"col-md-6\">\r\n");
      out.write("                                <img src=\"\" class=\"img-circle\" width=\"80\" height=\"80\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-6\">     \r\n");
      out.write("                                <h4>");
      out.print(pvo.getUsuario().getNombres());
      out.write("</h4>                                \r\n");
      out.write("                                <h4>");
      out.print(pvo.getUsuario().getTelefono());
      out.write("</h4>  \r\n");
      out.write("                                \r\n");
      out.write("                               </div></a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6\" >\r\n");
      out.write("                        <h2 align=\"center\">");
      out.print(pvo.getNombre());
      out.write("</h2>\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"\" style=\"border: 1px solid #E1E1E1;\">\r\n");
      out.write("                            ");
      out.print(pvo.getDescripcion());
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div style=\"border: 1px solid #E1E1E1;\"><h5>Precio Estimado :");
      out.print(pvo.getPrecioestimado());
      out.write(" </h5></div>\r\n");
      out.write("\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                        <div style=\"border: 1px solid #E1E1E1;\"><h5>Cantidad :");
      out.print(pvo.getCantidad());
      out.write(" </h5></div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div style=\"border: 1px solid #E1E1E1;\"><h5>Ciudad : ");
      out.print(pvo.getUsuario().getCiudadVO().getDescripcion());
      out.write("</h5></div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div style=\"border: 1px solid #E1E1E1;\"><h5>Categoria : ");
      out.print(pvo.getCategoriasVo().getDescripcion());
      out.write("</h5></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-4\"></div>\r\n");
      out.write("                            <div class=\"col-md-4\">\r\n");
      out.write("                                <h4 align=\"center\">Desea ingresar a la subasta</h4>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    <a href=\"subasta.jsp?idusuario=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" <input  type=\"submit\" value=\"Si\" class=\"btn btn-primary form-control\" name=\"\">Si</a> \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <input type=\"submit\"  value=\"No\" class=\"btn btn-primary form-control\" name=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-4\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </center>\r\n");
      out.write("\r\n");
      out.write("                </form>       \t\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/jquery.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
