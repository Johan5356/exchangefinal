<%-- 
    Document   : subasta
    Created on : 14/08/2019, 10:36:27 PM
    Author     : johan
--%>

<%@page import="Exchange.proyecto.persistencia.dao.ProductoDAO"%>
<%@page import="Exchange.proyecto.persistencia.vo.PublicarVO"%>
<%@page import="Exchange.proyecto.persistencia.vo.CategoriasVo"%>
<%@page import="java.util.List"%>
<%@page import="Exchange.proyecto.persistencia.dao.CategoriaDao"%>
<%@page import="Exchange.proyecto.persistencia.vo.usuariovo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subasta</title>
        <link href="../css/estiloprincipal.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="../css/estilo.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <jsp:include page="../Encabezado.jsp"></jsp:include>
    </head>
    <body>
        
         
            <%
                usuariovo usu = (usuariovo) session.getAttribute("usuario");
                usuariovo vo = (usuariovo) session.getAttribute("usuario");
                int id=Integer.parseInt(request.getParameter("idusuario"));
                CategoriaDao cd = new CategoriaDao();
                ProductoDAO pdao = new ProductoDAO();
                List<PublicarVO> producto = pdao.listar(id);
                List<CategoriasVo> lista = cd.listar();
            %>
       
       <div class="container mt-4">
            <h3>Subasta</h3>
            <br>
            <div class="row">
                <div class="col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Item</th>
                                <th>Nombre</th>
                                <th>Descripcion</th>
                                <th>Precio</th>
                                <th>Acion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="sub" items="${subasta}">
                                <tr>
                                    <td>${sub.getIdsolicitud_intercambio()}</td>
                                    <td>${sub.getNombres()}</td>
                                    <td>${sub.getDescripciones()}
                                        <img src="Controlarimagenid=${sub.getProducto_idproducto()}"width="100" height="100" >                               
                                    </td>
                                    <td>${sub.getPrecios()}</td>  
                                    <td>${sub.getUsuario_idusuario()}</td>  
                                    <td>${sub.getProducto_idproducto()}</td> 
                                    <td>
                                        <input type="hidden"  id="idpp" values="${sub.getProducto_idproducto()}">   
                                        <a href="#" id="btnDelete" class="btn btn-danger" >Eliminar</a>                   
                                    </td>
                                </tr>
                            </c:forEach>   
                        </tbody>
                    </table> 
                </div>
                <div class="col-sm-4">
                    <div class="card"></div>
                    <div class="card-header">
                        <h3>Entrar a Subasta</h3>
                    </div>
                    <div class="card-body">
                        <div class="text-center">
                            <img src="img/prueba.png" class="rounded-circle" width="200" height="200"></div><br>
                        <label>Nombre del permutador:</label>
                        <input type="text" value="" readonly="" class="form-control">
                        <label>Tu precio:</label>
                        <input type="text" readonly="" class="form-control">   
                    </div>
                    <div class="card-footer"></div>
                    <a href="#"class="btn btn-info btn-block">Enviar propuesta </a>
                </div>
            </div>   
        </div>

    </body>
</html>
