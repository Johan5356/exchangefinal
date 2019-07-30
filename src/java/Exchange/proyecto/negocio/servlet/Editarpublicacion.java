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
import javax.servlet.http.Part;

/**
 *
 * @author jonathan
 */
@MultipartConfig
public class Editarpublicacion extends HttpServlet {

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
       String nombre = request.getParameter("nombre");
        String cantidad = request.getParameter("size");
        String marca = request.getParameter("marca");
        String tiempo = request.getParameter("tiempo_uso");
        String descripcion = request.getParameter("descripcion");
        String precio = request.getParameter("precio");
int categoria=Integer.parseInt(request.getParameter("categoria"));
int id=Integer.parseInt(request.getParameter("id"));
        Part part=request.getPart("fileimagen");
        InputStream inputStream =part.getInputStream();
       
        ProductoDAO pro=new ProductoDAO();
        PublicarVO pu = new PublicarVO();
        pu.setId_publicar(id);
        pu.setNombre(nombre);
        pu.setCantidad(cantidad);
        pu.setTiempouso(tiempo);
        pu.setPrecioestimado(precio);
        pu.setMarca(marca);
        pu.setDescripcion(descripcion);
        pu.setId_categoria(categoria);
        
        pu.setImagen_1(inputStream);

        if (pro.crear_producto(pu)) {            
           response.sendRedirect("jsp/inicio.jsp");
        } 
        else {
            response.getWriter().println("ERROR al crear producto");
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
