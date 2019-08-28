<%-- 
    Document   : Perfil
    Created on : 1/07/2019, 09:05:26 PM
    Author     : jonathan
--%>

<%@page import="Exchange.proyecto.persistencia.vo.CategoriasVo"%>
<%@page import="Exchange.proyecto.persistencia.dao.CategoriaDao"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Exchange.proyecto.persistencia.dao.ProductoDAO"%>
<%@page import="Exchange.proyecto.persistencia.vo.PublicarVO"%>
<%@page import="java.util.List"%>
<%@page import="Exchange.proyecto.persistencia.vo.usuariovo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script src="https://kit.fontawesome.com/297ca4f04f.js"></script>
        <title>Perfil</title>
        <jsp:include page="../Encabezado.jsp"></jsp:include>   
        </head>
        <body>  
        <%
            usuariovo vo = (usuariovo) session.getAttribute("usuario");
            ProductoDAO pdao = new ProductoDAO();
            CategoriaDao cd = new CategoriaDao();
            List<PublicarVO> producto = pdao.listar(vo.getId());
            List<CategoriasVo> lista = cd.listar();

        %>               
        <div class="container mt-9">
            <h3>Perfil</h3>
            <br>
            <div class="row ">
                <div class="col-sm-4 border border-dark">
                    <div class="card"></div>
                    <div class="card-header">
                        <label>Nombre : ${usuario.getNombres()}</label>
                    </div>
                    <div class="card-body">
                        <div class="text-center">
                            <img src="img/prueba.png" class="rounded-circle" width="200" height="200"></div><br>
                        <label>Telefono : ${usuario.getTelefono()}</label>
                        <br>
                        <label>Correo : ${usuario.getCorreo()}</label>
                        <br>
                        <label>Ciudad : ${usuario.getCiudadVO().getDescripcion()}</label>
                        <br>
                    </div>            
                    <div class=" card-footer"></div>
                    <a href="#"class="btn btn-info btn-block">Editar perfil</a>
                    <a href="#"class="btn btn-success btn-block">Cambiar contraseña</a>
                </div>
                
                    <div class="col-sm-8">
                        <c:forEach var="pd" items="<%=producto%>">
                            <div class="container">
                                <center>                
                                    <div class="row border border-primary"  >
                                        <div class="col-md-3" >
                                            <br>
                                            <img  class="rounded " src="../consultarimagen?id=${pd.getId_publicar()}" width="200" height="200"> 
                                        </div>
                                        <div class="col-md-6" >
                                            <br>
                                            <label>Nombre: ${pd.getNombre()}</label>
                                            <br>
                                            <label>Descripcion: ${pd.getDescripcion()}</label>
                                            <br>
                                            <label>Precio:$.${pd.getPrecioestimado()}</label>
                                        </div>
                                        <div class="col-md-2">
                                            <br>                      
                                            <a href="../listarproducto?idproducto=${pd.getId_publicar()}"><input type="submit" class="form-control btn btn-primary" value="Editar " ></a>
                                            <br>
                                            <br>
                                            <a href="../Detallesproducto?idproducto=${pd.getId_publicar()}"><input type="submit" class="form-control btn btn-success" value="Detalles " ></a>
                                            <br>
                                            <br>
                                            <a href="../eliminar?ideli=${pd.getId_publicar()}"><input type="submit" class="form-control btn btn-danger" value="Eliminar "</a> 
                                            <br>
                                            <br>
                                        </div>
                                                       
                                    </div>                                                       
                                    
                                </center>
                            </div>
                        </div>
                    </c:forEach>
            </div>          
        </div>
    </div>
<script src="../js/jquery.js" type="text/javascript"></script
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
