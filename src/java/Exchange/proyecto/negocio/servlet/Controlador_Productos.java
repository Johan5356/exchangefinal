/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.negocio.servlet;

import Exchange.proyecto.persistencia.dao.ProductoDAO;
import Exchange.proyecto.persistencia.vo.PublicarVO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author 57313
 */

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
                if (pdao.detallesproducto(pvo)) {
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
                    
                    response.sendRedirect("jsp/Perfil.jsp");
                } else {
                    response.getWriter().println("NO se pudo eliminar ");
                }
                break;
            case "/publicar":
                nuevoproducto(response,request);
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

    private void nuevoproducto(HttpServletResponse response, HttpServletRequest request) throws IOException {
       int id = Integer.parseInt(request.getParameter("id"));
        FileItemFactory file_factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(file_factory);

        ArrayList<String> campos = new ArrayList<>();
        ArrayList<String> imgs = new ArrayList<>();

        try {
            List items = sfu.parseRequest(request);
            for (int i = 0; i < items.size(); i++) {
                FileItem item = (FileItem) items.get(i);
                if (!item.isFormField()) {
                    File archivo = new File("C:\\Users\\Sena.DESKTOP-8CEV86G\\Documents\\NetBeansProjects\\exchangev3\\web\\img\\productos\\" + item.getName());
                    item.write(archivo);
                    imgs.add("img/productos/" + item.getName());
                } else {
                    campos.add(item.getString());
                }
            }
        } catch (Exception ex) {

        }
        ProductoDAO pdao = new ProductoDAO();
        PublicarVO pvo = new PublicarVO();
        pvo.setNombre(campos.get(0));
        pvo.setDescripcion(campos.get(1));
        pvo.setPrecioestimado(campos.get(2));
        pvo.setCantidad(campos.get(3));
        pvo.setMarca(campos.get(4));
        pvo.setImagen1(imgs.get(0));
        pvo.setImagen2(imgs.get(1));
        pvo.setImagen3(imgs.get(2));    
        pvo.setId_categoria(Integer.parseInt(campos.get(5)));
        pvo.setId_usuario(id);
        if (pdao.Publicar_producto(pvo)) {
            response.sendRedirect("jsp/inicio.jsp");
        } else {
            response.getWriter().println("ERROR al crear producto");
        }
    }

}
