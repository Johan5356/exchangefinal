/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.negocio.servlet;

import Exchange.proyecto.persistencia.dao.ProductoDAO;
import Exchange.proyecto.persistencia.vo.PublicarVO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author 57313
 */
@MultipartConfig
public class Controlador_Productos extends HttpServlet {

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
        PublicarVO pvo = new PublicarVO();
        ProductoDAO pdao = new ProductoDAO();
        switch (url) {
            case "/detalles":
                int idproducto = Integer.parseInt(request.getParameter("idproducto"));
                pvo.setId_publicar(idproducto);
                if (pdao.consultarproducto2(pvo)) {
                    request.getSession().setAttribute("producto", pvo);
                    response.sendRedirect("jsp/Detallesproducto.jsp");

                } else {
                    response.sendRedirect("jsp/inicio.jsp");
                }
                break;
            case "/editarproducto":
                break;
            case "/eliminar":
                int id = Integer.parseInt(request.getParameter("ideli"));
                pvo.setId_publicar(id);
                if (pdao.eliminar_producto(pvo)) {
                    request.getSession().setAttribute("errorp","Se Elimino Correctamente" );
                    response.sendRedirect("jsp/Perfil.jsp");
                } else {
                    response.getWriter().println("NO se pudo eliminar ");
                }
                break;
            case "/publicar":
                String nombre = request.getParameter("nombre");
                String cantidad = request.getParameter("size");
                String marca = request.getParameter("marca");
                String tiempo = request.getParameter("tiempo_uso");
                String descripcion = request.getParameter("descripcion");
                String precio = request.getParameter("precio");
                int categoria = Integer.parseInt(request.getParameter("categoria"));
                int id_producto = Integer.parseInt(request.getParameter("id"));
                Part part = request.getPart("fileimagen");
                InputStream inputStream = part.getInputStream();
      
                pvo.setNombre(nombre);
                pvo.setCantidad(cantidad);
                pvo.setTiempouso(tiempo);
                pvo.setPrecioestimado(precio);
                pvo.setMarca(marca);
                pvo.setDescripcion(descripcion);
                pvo.setId_categoria(categoria);
                pvo.setId_usuario(id_producto);
                pvo.setImagen_1(inputStream);

                if (pdao.crear_producto(pvo)) {
                    response.sendRedirect("jsp/Perfil.jsp");
                } else {
                    response.getWriter().println("ERROR al crear producto");
                }
                break;
            case "/perfil":
                int idusuario = Integer.parseInt(request.getParameter("idusuario"));
                pvo.setId_usuario(idusuario);
                if (pdao.consultarproducto(pvo)) {
                    request.getSession().setAttribute("perfil", pvo);

                    response.sendRedirect("jsp/Perfilusuarios.jsp");

                } else {
                    response.sendRedirect("jsp/inicio.jsp");
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
