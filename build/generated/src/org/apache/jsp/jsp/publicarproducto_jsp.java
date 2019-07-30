package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Exchange.proyecto.persistencia.vo.usuariovo;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Exchange.proyecto.persistencia.conexion.Conexion;

public final class publicarproducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Publicar</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/estiloss.css\">\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <center>\n");
      out.write("        <img src=\"../img/logolargo.png\" alt=\"\"/>\n");
      out.write("    </center>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"crearproducto\"name=\"frnuevo\" method=\"POST\" enctype=\"multipart/form-data\"class=\"formulario\" id=\"fr_nuevo\">\n");
      out.write("\n");
      out.write("        <h1>Selecciona la categoria</h1>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            ");

                Conexion con = new Conexion();
                PreparedStatement pst;
                ResultSet rs;
                usuariovo vo = new usuariovo();

                try {
                    con.getConnection();
                    String sql = "select * from categoria";
                    pst = con.getConnection().prepareStatement(sql);
                    rs = pst.executeQuery();

                    while (rs.next()) {

            
      out.write("\n");
      out.write("            <input type=\"radio\" name=\"tipo\" id=\"T\" value=\"");
      out.print(rs.getInt("idcategoria"));
      out.write("\">\n");
      out.write("            <label for=\"Tecnologia\">");
      out.print(rs.getString("descripcion"));
      out.write("</label>\n");
      out.write("            <br>\n");
      out.write("            ");
}
                } catch (Exception e) {
                    out.println(e.toString());
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <h1>Ingresa la Imagen</h1>\n");
      out.write("            <p>Selecciona la opciÃ³n de tu preferencia</p>\n");
      out.write("            <form enctype=\"multipart/form-data\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"file\" name=\"file[]\" id=\"archivos\" multiple>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <h1>Un titulo/nombre del objeto</h1>\n");
      out.write("        <div class=\"input-contenedor\">\n");
      out.write("            <input type=\"text\" placeholder=\"Titulo/Nombre\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <h1>Selecciona la cantidad del objeto</h1>\n");
      out.write("        <center>\n");
      out.write("            <select  name=\"cantidad\"class=\"form-control\" id=\"cantidad\">\n");
      out.write("                ");
for (int i = 1; i <= 20; i++) {
      out.write("\n");
      out.write("                <option values='");
      out.print(i);
      out.write('\'');
      out.write('>');
      out.print( i);
      out.write("</option>       \n");
      out.write("                ");
}
      out.write("   \n");
      out.write("            </select>\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("        <h1>¿Tienes alguna garantia o documento de autentidad del objeto?</h1>\n");
      out.write("        <p>(Es opcional)</p>\n");
      out.write("        <p>Sube el  documento de propiedad</p>\n");
      out.write("        <form enctype=\"multipart/form-data\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input id=\"file-2\" type=\"file\" class=\"file\" readonly=true>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <h1>Descriccion del producto</h1>\n");
      out.write("            <textarea class=\"form-control\" rows=\"3\"></textarea>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <center>\n");
      out.write("\n");
      out.write("                <button action =\"crearproducto\" type=\"button\" class=\"btn btn-primary\">Publicar</button>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"contenedor\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-12 col-md-6\">\n");
      out.write("                <h6 class=\"text-muted lead\">CONTACTO:</h6>\n");
      out.write("                <h6 class=\"text-muted\" Carrera 8h No. 166-71 Local 2<br>\n");
      out.write("                    Oficina Exchange fontibon.<br>\n");
      out.write("                    TelÃ©fonos: 3114862038 â€“ 3209975356 â€“ 3132958137 â€“ 3204695867 .<br>\n");
      out.write("                    Redes sociales -Facebook = Exchange.co - Instagram = @exchange_col -Twitter = @exchange_col -Twitter = @exchange_col <br>\n");
      out.write("                    Derechos reservados <br>\n");
      out.write("                    Javier Triana- Jorge Sedano-Johan Romero-Jonathan CaamaÃ±o\n");
      out.write("                </h6>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("</footer>\n");
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
