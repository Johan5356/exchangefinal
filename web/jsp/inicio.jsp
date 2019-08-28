<%@page import="Exchange.proyecto.persistencia.dao.ProductoDAO"%>
<%@page import="Exchange.proyecto.persistencia.vo.PublicarVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Exchange.proyecto.persistencia.vo.CategoriasVo"%>
<%@page import="java.util.List"%>
<%@page import="Exchange.proyecto.persistencia.dao.CategoriaDao"%>
<%@page import="Exchange.proyecto.persistencia.vo.usuariovo"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Exchange</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/estilos.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script src="https://kit.fontawesome.com/297ca4f04f.js"></script>
        <jsp:include page="../Encabezado.jsp"></jsp:include>
        </head>
        <body background="../img/claro2.jpg" >
        <%
            usuariovo vo = (usuariovo) session.getAttribute("usuario");
            CategoriaDao cd = new CategoriaDao();
            ProductoDAO pdao = new ProductoDAO();
            List<CategoriasVo> lista = cd.listar();
            List<PublicarVO> producto = pdao.verproducto();

        %>
        <br>
    <center>
        <img src="../img/logolargo.png">
    </center>
    <section id="cabecera">
        <div class="contenedor">
           <h1>Profesionales Expertos en Intercambios Online</h1>
            <p>Intercambiar algún objeto que no necesitas por otro que realmente necesitas</p>
        </div>
    </section>
    <section id="boletin">
        <center>  <h1 >Productos recientes</h1></center>
        <footer>
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
                                                <img src="../consultarimagen?id=${pd.getId_publicar()}" class="col" alt="..." width="20" height="200">
                                            </div>
                                            <div class="card-footer text-center"> 
                                                <label>${pd.getDescripcion()}</label>
                                                <div >
                                                    <a href="" class="btn btn-outline-info">Ingresar a subasta</a>
                                                    <a href="../detallesid=${pd.getId_publicar()}" class="btn btn-outline-danger">Ver mas info</a>
                                                </div>
                                            </div>
                                            </div>    
                                            </div>
                                        </c:forEach>
                                        </div>
                                        </div>
                                        </footer>
                                        <center>
                                            <p>Exchange plataforma web. Copyrigth &copy; 2019</p>
                                        </center>
                                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                                        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
                                        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
                                        </body>
                                        </html>