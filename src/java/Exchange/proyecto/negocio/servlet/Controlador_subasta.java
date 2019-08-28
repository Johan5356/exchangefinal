/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.negocio.servlet;

import Exchange.proyecto.persistencia.dao.ProductoDAO;
import Exchange.proyecto.persistencia.vo.PublicarVO;
import Exchange.proyecto.persistencia.vo.Subasta;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author johan
 */
public class Controlador_subasta extends HttpServlet {

    ProductoDAO pdao = new ProductoDAO();
    PublicarVO p= new PublicarVO();
    List<PublicarVO>producto=new ArrayList<>();
    List<Subasta> listarsubasta= new ArrayList<>();
    int item;
    double totalintercambio=0.0;
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String accion = request.getParameter("accion");
        producto=pdao.listar2();
        switch (accion) {
            case "AgregarSubasta":
                int idp=Integer.parseInt(request.getParameter("id"));
                p=pdao.listarId(idp);
                item=item+1;
                Subasta sb= new Subasta();
                sb.setIdsolicitud_intercambio(item);
                sb.setProducto_idproducto(p.getId_publicar());
                sb.setUsuario_idusuario(p.getId_usuario());
                sb.setNombres(p.getNombre());
                sb.setDescripciones(p.getDescripcion());
                sb.setPrecios(p.getPrecioestimado());
                listarsubasta.add(sb);
                request.setAttribute("contador", listarsubasta.size());
                request.getRequestDispatcher("Controlador_subasta?accion=home").forward(request, response);
                break;
            case"Delete":
                int idproducto=Integer.parseInt(request.getParameter("idpp"));
                for (int i = 0; i < listarsubasta.size(); i++) {
                    if (listarsubasta.get(i).getProducto_idproducto()==idproducto) {
                        listarsubasta.remove(i);
                    }
                }
                break;
            case "Subasta":
                /*totalintercambio=0.0;
                for (int i = 0; i < listarsubasta.size(); i++) {
                    totalintercambio=totalintercambio+listarsubasta.get(i).Double.(getPrecios();
                }*/
                request.setAttribute("totalsub", totalintercambio);
                request.setAttribute("subasta", listarsubasta);
               
                request.getRequestDispatcher("jsp/subasta.jsp").forward(request, response);

                break;
            default:
             request.setAttribute("producto", producto);
             request.getRequestDispatcher("index.jsp").forward(request, response);
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
