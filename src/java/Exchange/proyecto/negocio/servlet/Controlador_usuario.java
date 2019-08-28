/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.negocio.servlet;

import Exchange.proyecto.persistencia.dao.ProductoDAO;
import Exchange.proyecto.persistencia.dao.usuarioDao;
import Exchange.proyecto.persistencia.vo.PublicarVO;
import Exchange.proyecto.persistencia.vo.usuariovo;
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
@MultipartConfig
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
    usuarioDao dao = new usuarioDao();
    usuariovo vo = new usuariovo();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String url = request.getServletPath();
        switch (url) {
            case "/ingresar":

                ingresar(response, request);

                break;

            case "/regristar":
                regristarse(response, request);

                break;
            case "/cerrar":
                HttpSession session = request.getSession();
                session.removeAttribute("usuario");
                response.sendRedirect("index.jsp");
                break;
            case "/editar":

                editar(request, response);

                break;
            case "/clave":
                String clave = request.getParameter("");
                int id_password = Integer.parseInt(request.getParameter("id"));

                vo.setPassword(clave);
                vo.setId(id_password);
                dao.cambiarcontraseña(vo);

                break;
            case "/fotoperfil":
               subirfoto(response,request);
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

    private void editar(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
        if (dao.actualizar(vo, id)) {

            request.getSession().setAttribute("usuario", vo);
            response.sendRedirect("jsp/Perfil.jsp");

        } else {
            response.sendRedirect("jsp/Perfil.jsp");
        }
    }

    private void ingresar(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String correo = request.getParameter("correo");
        String password = request.getParameter("password");
        vo.setCorreo(correo);
        vo.setPassword(password);
        if (dao.consultar(vo)) {

            request.getSession().setAttribute("usuario", vo);
            response.sendRedirect("jsp/inicio.jsp");
            // request.getRequestDispatcher("jsp/inicio.jsp").forward(request, response);
        } else {

            request.getSession().setAttribute("error", "Usuario no Existe");
            response.sendRedirect("html/loginvista.html");
        }
    }

    private void regristarse(HttpServletResponse response, HttpServletRequest request) throws IOException {
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

                    response.sendRedirect("../exchange/jsp/regristar.jsp");
                }
    }

    private void subirfoto(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
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
                    File archivo = new File("C:\\Users\\57313\\Documents\\NetBeansProjects\\exchange\\web\\img\\perfil\\" + item.getName());
                    item.write(archivo);
                    imgs.add("img/perfil/" + item.getName());
                } else {
                    campos.add(item.getString());
                }
            }
        } catch (Exception ex) {

        }
       usuarioDao dao=new usuarioDao();
       usuariovo vo=new usuariovo();
       vo.setPerfil(imgs.get(0));
       vo.setId(id);
        if (dao.subirfoto(vo)) {
            response.sendRedirect("jsp/Perfil.jsp");
        }
        else{
            response.getWriter().println("ERROR al crear producto");
        }
               
       
        
    }

}
