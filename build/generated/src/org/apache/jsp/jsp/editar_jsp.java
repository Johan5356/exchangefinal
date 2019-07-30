package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Exchange.proyecto.persistencia.vo.CiudadVO;
import Exchange.proyecto.persistencia.dao.CiudadDao;
import java.util.List;
import Exchange.proyecto.persistencia.vo.usuariovo;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Editar Perfil</title>\n");
      out.write("        <link href=\"../css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        ");

            usuariovo vo = (usuariovo) session.getAttribute("usuario");
            CiudadDao ciudadDao = new CiudadDao();
            List<CiudadVO> ciudades = ciudadDao.ciudades();

        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <div id=\"marca\">\n");
      out.write("                    <h1><span class=\"resaltado\">Exchange</span> Plataforma de Trueques</h1>\t\t\t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Exchange</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"inicio.jsp\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"Publicarproducto.jsp\">Publicar</a></li>\n");
      out.write("                    <li><a href=\"#\">Ayuda</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getCorreo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                            <li><a href=\"#\">Perfil</a></li>\n");
      out.write("                            <li><a href=\"editar.jsp\">Editar Perfil</a></li>\n");
      out.write("                            <li><a href=\"Editarclave.jsp\">Cambio de Contraseña</a></li>\n");
      out.write("                            <li><a href=\"../index.jsp\">Salir</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"row container\">\n");
      out.write("            <div class=\"col-md-2\"></div>\n");
      out.write("            <div class=\"col-md-8\" >\n");
      out.write("                <form method=\"POST\" enctype=\"\" action=\"../Actualizarusuario?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  >                 \n");
      out.write("                    <h1 style=\"text-align: center\">Editar Perfil</h1>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"row \">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" >Nombre:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"txtnombre\" value=\"");
      out.print(vo.getNombres());
      out.write("\" placeholder=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" >Correo:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getCorreo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtcorreo\"  placeholder=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" >Telefono:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  name=\"txttelefono\" placeholder=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-3\" >Ciudad:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <select name=\"txtciudad\" class=\"form-control\">\n");
      out.write("                                        <option>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getCiudadVO().getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("ciudad");
      _jspx_th_c_forEach_0.setItems(ciudades);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                            <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ciudad.getIdciudad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ciudad.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</option>\n");
            out.write("                                        ");
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
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <center>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group \">\n");
      out.write("                            <input type=\"submit\" value=\"Actualizar\" name=\"editar\" class=\"btn btn-primary \">\n");
      out.write("                        </div>\n");
      out.write("                    </center>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
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
