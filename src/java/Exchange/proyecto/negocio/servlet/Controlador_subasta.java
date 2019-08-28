/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.negocio.servlet;

import Exchange.proyecto.persistencia.dao.subastaDAO;
import Exchange.proyecto.persistencia.vo.subastaVO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author johan
 */
@WebServlet(name = "Controlador_subasta", urlPatterns = {"/Controlador_subasta"})
public class Controlador_subasta extends HttpServlet {

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
        String url = request.getServletPath();
        subastaVO suvo= new subastaVO();
        subastaDAO sudao= new subastaDAO();
         switch (url) {
            case "/veroferta":
                int id_solicitud = Integer.parseInt(request.getParameter("idsolicitud_intercambio"));
                suvo.setId_solicitud(id_solicitud);
                if (sudao.consultar(suvo)) {
                    request.getSession().setAttribute("solicitud_intercambio", suvo);
                    response.sendRedirect("jsp/");

                } else {
                    response.sendRedirect("jsp/inicio.jsp");
                }
                break;

            case "/eliminar":
                int id = Integer.parseInt(request.getParameter("ideli"));
                suvo.setId_solicitud(id);
                if (sudao.eliminar(suvo)) {
                    request.getSession().setAttribute("error "," Se Elimino Correctamente " );
                    response.sendRedirect("jsp/Perfil.jsp");
                } else {
                    response.getWriter().println("No se pudo eliminar la subasta ");
                }
                break;
            case "/ingresar":
                String oferta=request.getParameter("oferta");
                String estado=request.getParameter("estado");
                String notificacion=request.getParameter("notificacion");
                int id_producto = Integer.parseInt(request.getParameter("id_producto"));                              
                if (sudao.ingresar(suvo)) {
                    response.sendRedirect("jsp/Perfil.jsp");
                } else {
                    response.getWriter().println("Error no puede entrar en subasta");
                }
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
