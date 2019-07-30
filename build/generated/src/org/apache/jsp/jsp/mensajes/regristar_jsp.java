package org.apache.jsp.jsp.mensajes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Exchange.proyecto.persistencia.vo.usuariovo;
import Exchange.proyecto.persistencia.conexion.Conexion;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class regristar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Registrar</title> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/boostrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../exchange/css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/validacion.js\"></script>|\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <center>\n");
      out.write("        <img src=\"../img/logolargo.png\">\n");
      out.write("    </center>\n");
      out.write("</head>  \n");
      out.write("<body>\n");
      out.write("    <form class=\"formulario\" action=\"../Regristarusuario\" method=\"Post\" onsubmit=\"return formulario();\" >\n");
      out.write("\n");
      out.write("        <h1>Registrar</h1>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("\n");
      out.write("            <div class=\"input-contenedor\">\n");
      out.write("                <input type=\"text\" name=\"txtnombre\" required=\"\"  placeholder=\"Nombre Completo\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <h2>El correo Ingresado ya existe</h2>\n");
      out.write("            <div class=\"input-contenedor\">\n");
      out.write("                <input type=\"text\" name=\"txtcorreo\" required=\"\" id=\"correo\" placeholder=\"Correo Electronico\">\n");
      out.write("            </div>\n");
      out.write("            <span id=\"mensaje\" style=\"color:red ; width: 50px\"> </span>\n");
      out.write("            <div class=\"input-contenedor\"> \n");
      out.write("                <input type=\"password\"  name=\"txtpassword\"  id=\"clave\" placeholder=\"Contraseña\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <span id=\"mensaje2\" style=\"color:red\"> </span>\n");
      out.write("            <div class=\"input-contenedor\">\n");
      out.write("                <input type=\"password\" name=\"\" id=\"clave2\" placeholder=\"Confirme Contraseña\">  \n");
      out.write("            </div>\n");
      out.write("            <span id=\"\" style=\"color:red\"> </span>\n");
      out.write("            <div class=\" input-contenedor\">\n");
      out.write("                <input type=\"text\" name=\"txttelefono\" class=\"\" id=\"telefono\" onkeypress=\"\" placeholder=\"Telefono\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <select class=\"form-control\" name=\"country\" id=\"departamento\"  required=\"\" >\n");
      out.write("                    ");

                        Conexion con = new Conexion();
                        PreparedStatement pst;
                        ResultSet rs;
                        usuariovo vo = new usuariovo();

                        try {
                            con.getConnection();
                            String sql = "select * from departamento";
                            pst = con.getConnection().prepareStatement(sql);
                            rs = pst.executeQuery();
                    
      out.write("\n");
      out.write("                    <option value=\"0\">Departamentos</option>\n");
      out.write("                    ");

                        while (rs.next()) {


                    
      out.write(" \n");
      out.write("\n");
      out.write("                    <option  value=\"");
      out.print(rs.getInt("id_departamento"));
      out.write("\"\n");
      out.write("\n");
      out.write("\n");
      out.write("                             >");
      out.print(rs.getString("nombre"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    ");
}
                        } catch (Exception e) {
                            out.println(e.toString());
                        }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group \">\n");
      out.write("                <select class=\"form-control\"name=\"txtciudad\" id=\"ciudad\" required=\"\" >\n");
      out.write("                    ");

                        try {
                            con.getConnection();
                            String sql = "select id_ciudad,nombre from ciudad ";
                            // String sql = "select id_ciudad,nombre from ciudad where departamento_id_departamento= ?";
                            pst = con.getConnection().prepareStatement(sql);
                            // pst.setInt(1,Integer.parseInt(request.getParameter("country")));
                            rs = pst.executeQuery();
                    
      out.write("\n");
      out.write("                    <option value=\"0\">Ciudad</option>\n");
      out.write("                    ");

                        while (rs.next()) {

                    
      out.write(" \n");
      out.write("\n");
      out.write("                    <option  value=\"");
      out.print(rs.getInt("id_ciudad"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("nombre"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    ");
}
                        } catch (Exception e) {
                            out.println(e.toString());
                        }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group \"> \n");
      out.write("                <select name=\"sexo\" class=\"form-control\" id=\"genero\" required=\"\">\n");
      out.write("                    <option>Genero</option>\n");
      out.write("                    <option>Masculino</option>\n");
      out.write("                    <option>Femenino</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Registrate\" class=\"button\">\n");
      out.write("            <p>Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.</p>\n");
      out.write("            <p>¿Ya tienes una cuenta?<a class=\"link\" href=\"../html/loginvista.html\">Iniciar Sesion</a></p>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
