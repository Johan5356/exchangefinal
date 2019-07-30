/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.negocio.servlet;

import Exchange.proyecto.persistencia.dao.usuarioDao;
import Exchange.proyecto.persistencia.vo.usuariovo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 57313
 */
public class Controlador_usuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        usuarioDao dao = new usuarioDao();
        usuariovo vo = new usuariovo();
        String url = request.getServletPath();
        switch (url) {
            case "/ingresar":
                String correo = request.getParameter("correo");
                String password = request.getParameter("password");
                vo.setCorreo(correo);
                vo.setPassword(password);
                if (dao.consultar(vo)) {
                    
                    request.getSession().setAttribute("usuario", vo);
                    response.sendRedirect("jsp/inicio.jsp");
                    // request.getRequestDispatcher("jsp/inicio.jsp").forward(request, response);
                } else {
                    out.println("<script>alert('Usuario no encontrado');</script>");
                    request.getSession().setAttribute("error", "Usuario no Existe");
                    response.sendRedirect("html/loginvista.html");
                }
                break;

            case "/regristar":
                String accion = request.getParameter("accion");
                String nombre = request.getParameter("txtnombre");
                String correo2 = request.getParameter("txtcorreo");
                String password2 = request.getParameter("txtpassword");
                String telefono = request.getParameter("txttelefono");
                String genero = request.getParameter("sexo");
                int ciudad = Integer.parseInt(request.getParameter("txtciudad"));
                vo.setNombres(nombre);
                vo.setCorreo(correo2);
                vo.setPassword(password2);
                vo.setTelefono(telefono);
                vo.setGenero(genero);
                vo.setCiudad_id(ciudad);
                if (dao.agregar(vo)) {
                    request.getSession().setAttribute("usuario", vo);
                    response.sendRedirect("jsp/inicio.jsp");
                } else {
                    request.getSession().setAttribute("error", "No se pudo Regristrar el usuario");
                    response.sendRedirect("../exchange/jsp/regristar.jsp");
                }
                break;
            case "/cerrar":
                HttpSession session = request.getSession();
                session.removeAttribute("usuario");
                response.sendRedirect("index.jsp");
                break;
            case "/editar":
                String nombre3 = request.getParameter("txtnombre");
                String correo3 = request.getParameter("txtcorreo");
                String telefono3 = request.getParameter("txttelefono");

                int ciudad2 = Integer.parseInt(request.getParameter("txtciudad"));
                int id = Integer.parseInt(request.getParameter("id"));

                vo.setNombres(nombre3);
                vo.setCorreo(correo3);
                vo.setTelefono(telefono3);
                vo.setCiudad_id(ciudad2);
                vo.setId(id);
                if (dao.actualizar(vo)) {
                    request.getSession().setAttribute("usuario", vo);
                    response.sendRedirect("jsp/inicio.jsp");
                } else {
                    response.sendRedirect("jsp/editar.jsp");
                }
                break;
            case "/clave":
                String clave = request.getParameter("txtpassword");
                int id_password = Integer.parseInt(request.getParameter("id"));

                vo.setPassword(clave);
                vo.setId(id_password);
                if (dao.cambiarcontraseña(vo)) {

                    response.sendRedirect("jsp/inicio.jsp");
                } else {
                    response.sendRedirect("jsp/cambio.jsp");
                }

                break;
            case "/perfil":
                
                break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
