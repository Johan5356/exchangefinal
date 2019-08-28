<%-- 
    Document   : Categoria
    Created on : 28/06/2019, 12:27:41 PM
    Author     : jonathan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Exchange.proyecto.persistencia.vo.PublicarVO"%>
<%@page import="Exchange.proyecto.persistencia.vo.CategoriasVo"%>
<%@page import="java.util.List"%>
<%@page import="Exchange.proyecto.persistencia.dao.ProductoDAO"%>
<%@page import="Exchange.proyecto.persistencia.dao.CategoriaDao"%>
<%@page import="Exchange.proyecto.persistencia.dao.CategoriaDao"%>
<%@page import="Exchange.proyecto.persistencia.vo.usuariovo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/297ca4f04f.js"></script>
        <jsp:include page="../Encabezado.jsp"></jsp:include>
        </head>
        <body background="../img/claro2.jpg">

        <%
            CategoriasVo cv = new CategoriasVo();
            int idcategoria = Integer.parseInt(request.getParameter("idcategoria"));
            usuariovo vo = (usuariovo) session.getAttribute("usuario");
            CategoriaDao cd = new CategoriaDao();
            ProductoDAO pdao = new ProductoDAO();
            List<CategoriasVo> lista = cd.listar();
            List<PublicarVO> producto = pdao.listarcategoria(idcategoria);

        %>
        <div class="container mt-4">
            <div  class="row">
                <c:forEach  var="pd" items="<%=producto%>">
                    <div  class="col-sm-4">
                        <div id="idpro" class="card">
                            <div class="card-header">
                                <label>${pd.getNombre()}<label>
                                        </div>
                                        <div class="card-body "> 
                                            <i>$.${pd.getPrecioestimado()}</i>
                                            <center><img src="consultarimagen?id=${pd.getId_publicar()}" width="200" height="200"></center>                           
                                        </div>
                                        <div class="card-footer text-center"> 
                                            <label>${pd.getDescripcion()}</label>
                                            <div >
                                                <a href="../Detallesproducto?idproducto=${pd.getId_publicar()}" class="btn btn-outline-danger">Ver mas info</a>
                                            </div>
                                        </div>
                                        </div>    
                                        </div>
                                    </c:forEach>
                                    </div>
                                    </div>




                                    <script src="../js/bootstrap.min.js" type="text/javascript"></script>
                                    <script src="../js/jquery.js" type="text/javascript"></script>
                                    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
                                    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                                    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
                                    </body>
                                    </html>
