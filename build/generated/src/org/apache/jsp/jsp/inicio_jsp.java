package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Exchange.proyecto.persistencia.dao.ProductoDAO;
import Exchange.proyecto.persistencia.vo.PublicarVO;
import Exchange.proyecto.persistencia.vo.CategoriasVo;
import java.util.List;
import Exchange.proyecto.persistencia.dao.CategoriaDao;
import Exchange.proyecto.persistencia.vo.usuariovo;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>Exchange</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("        <meta name = \"viewport\" content=\"width=device-width\">\r\n");
      out.write("        <meta name = \"description\" content=\"Exchange mas que una familia\">\r\n");
      out.write("        <meta name = \"keywords\" content=\"diseÃ±o web, desarrollo web, seo, posicionamiento web\">\r\n");
      out.write("        <meta name = \"author\" content=\"Render-2Web\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/estilo.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            form{\r\n");
      out.write("\r\n");
      out.write("                background-color: #f4f4f4;\r\n");
      out.write("\r\n");
      out.write("                padding: 3px;\r\n");
      out.write("                border: 1px solid #E1E1E1;\r\n");
      out.write("            }\r\n");
      out.write("            body {\r\n");
      out.write("                font:15px Arial, Helvetica, sans-serif;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                background-color: #f4f4f4;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("             ");

                usuariovo vo = (usuariovo) session.getAttribute("usuario");
                CategoriaDao cd = new CategoriaDao();
                ProductoDAO pdao = new ProductoDAO();
                List<CategoriasVo> lista = cd.listar();
                List<PublicarVO> producto = pdao.verproducto();

            
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Encabezado.jsp", out, false);
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        <br>\r\n");
      out.write("    <center>\r\n");
      out.write("        <img src=\"../img/logolargo.png\">\r\n");
      out.write("    </center>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"cabecera\">\r\n");
      out.write("        <div class=\"contenedor\">\r\n");
      out.write("            <h1>Profesionales Expertos en Intercambios Online</h1>\r\n");
      out.write("            <p>Â¿Deseas intercambiar algun objeto que no necesitas por otro que realmente necesitas</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section id=\"boletin\">\r\n");
      out.write("        <div class=\"contenedor\">\r\n");
      out.write("            <h1>Encuentra rapido tus objetos...</h1>\r\n");
      out.write("            <form>\r\n");
      out.write("                <input type=\"text\" name=\"texto\" placeholder=\"Buscar objeto...\">\r\n");
      out.write("                <button type=\"submit\" class=\"boton1\">Buscar</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write(" <table border=\"0\" align=\"center\" width=\"1000\">\r\n");
      out.write("            ");

                int salto = 0;
            
      out.write("\r\n");
      out.write("            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("pd");
      _jspx_th_c_forEach_0.setItems(producto);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("               <th> <a href=\"../Detallesproducto?idproducto=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pd.getId_publicar()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"><img src=\"../consultarimagen?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pd.getId_publicar()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" height=\"200\" width=\"200\"><p>\r\n");
            out.write("                    <p>\r\n");
            out.write("                        Nombre : ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pd.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("<br>\r\n");
            out.write("                        Valor : ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pd.getPrecioestimado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("<br>\r\n");
            out.write("                        \r\n");
            out.write("                    </p>\r\n");
            out.write("                    </a>\r\n");
            out.write("                   </th>\r\n");
            out.write("                ");

                    salto++;
                    if (salto == 4) {
                
            out.write("\r\n");
            out.write("                <tr>\r\n");
            out.write("                    ");

                            salto = 0;
                        }
                    
            out.write("\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <center>\r\n");
      out.write("                <p>Exchange plataforma web. Copyrigth &copy; 2019</p>\r\n");
      out.write("            </center>\r\n");
      out.write("\r\n");
      out.write("        </footer>\r\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
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
