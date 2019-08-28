package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Exchange.proyecto.persistencia.vo.CategoriasVo;
import Exchange.proyecto.persistencia.dao.CategoriaDao;
import Exchange.proyecto.persistencia.dao.departamentoDao;
import Exchange.proyecto.persistencia.vo.DepartamentosVo;
import java.util.List;
import Exchange.proyecto.persistencia.dao.CiudadDao;
import Exchange.proyecto.persistencia.vo.CiudadVO;
import Exchange.proyecto.persistencia.vo.usuariovo;
import Exchange.proyecto.persistencia.conexion.Conexion;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class regristar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Registrar</title> \r\n");
      out.write("\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/estilo.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/estilos.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/validacion.js\"></script>   \r\n");
      out.write("\r\n");
      out.write("    </head>  \r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            ");


                departamentoDao dao = new departamentoDao();
                CiudadDao cd = new CiudadDao();
                CategoriaDao ca = new CategoriaDao();
                List<CiudadVO> ciudades = cd.ciudades();
                List<DepartamentosVo> departamentos = dao.departamentos();
                List<CategoriasVo> lista = ca.listar();

            
      out.write("\r\n");
      out.write("            <div class=\"contenedor\">\r\n");
      out.write("                <div id=\"marca\">\r\n");
      out.write("                    <h1><span class=\"resaltado\">Exchange</span> Plataforma de Trueques</h1>\t\t\t\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header> \r\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Exchange</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"inicio.jsp\">Inicio</a></li>\r\n");
      out.write("                   \r\n");
      out.write("                    <li><a href=\"#\">Ayuda</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav \">\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Categorias\r\n");
      out.write("                            <span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("ca");
      _jspx_th_c_forEach_0.setItems(lista);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                                <li><a href=\"Categoria.jsp?idcategoria=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.getIdCategoria()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("                                ");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li><a href=\"jsp/regristar.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Regristarse</a></li>\r\n");
      out.write("                    <li><a href=\"../html/loginvista.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Ingresar</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <br>\r\n");
      out.write("    <center>\r\n");
      out.write("        <img src=\"../img/logolargo.png\">\r\n");
      out.write("    </center>\r\n");
      out.write("    <form class=\"formulario\" action=\"../regristar\" method=\"Post\"  >\r\n");
      out.write("        <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("        <h1>Registrar</h1>\r\n");
      out.write("        <div class=\"contenedor\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"input-contenedor\">\r\n");
      out.write("                <input type=\"text\" name=\"txtnombre\" required=\"\"  placeholder=\"Nombre Completo\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"input-contenedor\">\r\n");
      out.write("                <input type=\"text\" name=\"txtcorreo\" required=\"\" id=\"correo\" placeholder=\"Correo Electronico\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <span id=\"mensaje\" style=\"color:red ; width: 50px\"> </span>\r\n");
      out.write("            <div class=\"input-contenedor\"> \r\n");
      out.write("                <input type=\"password\"  name=\"txtpassword\"  id=\"clave\" placeholder=\"Contraseña\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <span id=\"mensaje2\" style=\"color:red\"> </span>\r\n");
      out.write("            <div class=\"input-contenedor\">\r\n");
      out.write("                <input type=\"password\" name=\"\" id=\"clave2\" placeholder=\"Confirme Contraseña\">  \r\n");
      out.write("            </div>\r\n");
      out.write("            <span id=\"\" style=\"color:red\"> </span>\r\n");
      out.write("            <div class=\" input-contenedor\">\r\n");
      out.write("                <input type=\"text\" name=\"txttelefono\" class=\"\" id=\"telefono\" onkeypress=\"\" placeholder=\"Telefono\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <select class=\"form-control\" name=\"country\" id=\"departamento\"  required=\"\" >               \r\n");
      out.write("                    <option value=\"0\">Departamentos</option>\r\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setVar("depa");
      _jspx_th_c_forEach_1.setItems(departamentos);
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depa.getIddepartamento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${depa.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
      }
      out.write("   \r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group \">\r\n");
      out.write("                <select class=\"form-control\"name=\"txtciudad\" id=\"ciudad\" required=\"\" >\r\n");
      out.write("\r\n");
      out.write("                    <option value=\"0\">Ciudad</option>\r\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_2.setParent(null);
      _jspx_th_c_forEach_2.setVar("ciudad");
      _jspx_th_c_forEach_2.setItems(ciudades);
      int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        <option  value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ciudad.getIdciudad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ciudad.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_2.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group \"> \r\n");
      out.write("                <select name=\"sexo\" class=\"form-control\" id=\"genero\" required=\"\">\r\n");
      out.write("                    <option>Genero</option>\r\n");
      out.write("                    <option>Masculino</option>\r\n");
      out.write("                    <option>Femenino</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Registrate\" class=\"button\">\r\n");
      out.write("            <p>Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.</p>\r\n");
      out.write("            <p>¿Ya tienes una cuenta?<a class=\"link\" href=\"../html/loginvista.html\">Iniciar Sesion</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"../js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
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
