<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Exchange.proyecto.persistencia.conexion.Conexion"%>
<%@page import="Exchange.proyecto.persistencia.vo.PublicarVO"%>

<%@page import="Exchange.proyecto.persistencia.dao.ProductoDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Exchange.proyecto.persistencia.vo.CategoriasVo"%>
<%@page import="java.util.List"%>
<%@page import="Exchange.proyecto.persistencia.dao.CategoriaDao"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Exchange</title>
        <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
        <link rel="stylesheet" type="text/css" href="../css/estilo.css">
        <link rel="stylesheet" href="../css/estilos.css">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script src="https://kit.fontawesome.com/297ca4f04f.js"></script>
    </head>
    <body background="img/claro2.jpg">
       
        <header>
            <%
                Conexion cn = new Conexion();
                Statement smt;
                ResultSet rs;
                smt = cn.getConnection().createStatement();
                rs = smt.executeQuery("SELECT * FROM producto");
                ProductoDAO pdao = new ProductoDAO();
                CategoriaDao cd = new CategoriaDao();

                List<CategoriasVo> lista = cd.listar();
                List<PublicarVO> producto = pdao.verproducto();
            %>      
        </header>  
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Exchange </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
                    </li>
                    <li id="publi" class="nav-item">
                        <a id="btnPublicar" class="nav-link" href="#">Publicar</a>
                    </li>

                    <li id="sub" class="nav-item">
                        <a class="nav-link " href="#" id="btnSub" ><span style="font-size: 19px; color: Dodgerblue;"><i class="fas fa-balance-scale">(<label style="color:darkorange ">${contador}</label>)</i></span>Subasta en curso</a>
                    </li>
                     <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                </form>
                </ul>

                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link " href="jsp/Ingreso.jsp" id="navbarDropdown" role="button"  aria-haspopup="true" aria-expanded="false"><span style="font-size: 19px; color: Dodgerblue;"><i class="far fa-user"></i></span>
                            Iniciar Sesión 
                        </a>
                    </li>
                </ul>
                <ul class="navbar-nav ">
                    <li class="nav-item active"> <a class="nav-link " href="jsp/registro.jsp" id="navbarDropdown" role="button" aria-haspopup="true" aria-expanded="false"><span style="font-size: 19px; color: Dodgerblue;"><i class="fas fa-address-book"></i></span> Registro</a>
                    </li>     
                </ul>
            </div>
        </nav>
        <br>
    <center>
        <img src="img/logolargo.png">
    </center>

    <section id="cabecera">
        <div class="contenedor">
            <h1>Profesionales Expertos en Intercambios Online</h1>
            <p>Intercambiar algún objeto que no necesitas por otro que realmente necesitas</p>
        </div>
    </section>
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
                                                <a  id="btnSubasta" values=" ${p.getId_publicar()}" class="btn btn-outline-info">Ingresar a la subasta</a>
                                                <a href="" class="btn btn-outline-danger">Ver mas info</a>
                                            </div>
                                        </div>
                                        </div>    
                                        </div>
                                    </c:forEach>
                                    </div>
                                    </div>
                                    <footer>
                                        <center>
                                            <p>Exchange plataforma web. Copyrigth &copy; 2019</p>
                                        </center>
                                    </footer>
                                    <script src="js/jquery.js" type="text/javascript"></script>
                                    <script src="js/funciones.js" type="text/javascript"></script>
                                    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
                                    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                                    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
                                    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
                                    </body>
                                    </html>