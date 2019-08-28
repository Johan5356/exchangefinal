<%-- 
    Document   : regristar
    Created on : 29/05/2019, 01:46:55 PM
    Author     : jonathan
--%>

<%@page import="Exchange.proyecto.persistencia.vo.CategoriasVo"%>
<%@page import="Exchange.proyecto.persistencia.dao.CategoriaDao"%>
<%@page import="Exchange.proyecto.persistencia.dao.departamentoDao"%>
<%@page import="Exchange.proyecto.persistencia.vo.DepartamentosVo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="Exchange.proyecto.persistencia.dao.CiudadDao"%>
<%@page import="Exchange.proyecto.persistencia.vo.CiudadVO"%>
<%@page import="Exchange.proyecto.persistencia.vo.usuariovo"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>

        <meta charset="UTF-8">
        <title>Registrar</title> 
        <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
        <link rel="stylesheet" type="text/css" href="../css/estilo.css">
        <link rel="stylesheet" href="../css/estilos.css">
        <script type="text/javascript" src="../js/validacion.js"></script>   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script src="https://kit.fontawesome.com/297ca4f04f.js"></script>
    </head>  
    <body>
        
            <%

                departamentoDao dao = new departamentoDao();
                CiudadDao cd = new CiudadDao();
                CategoriaDao ca = new CategoriaDao();
                List<CiudadVO> ciudades = cd.ciudades();
                List<DepartamentosVo> departamentos = dao.departamentos();
                List<CategoriasVo> lista = ca.listar();

            %>
        
     <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Exchange </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="pruebaindex.jsp">Inicio <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Publicar</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link " href="#" ><span style="font-size: 19px; color: Dodgerblue;"><i class="fas fa-balance-scale">(<label style="color:darkorange ">${contador}</label>)</i></span>Subasta en curso</a>
                    </li>
                     <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                </form>
                </ul>
               
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link " href="Ingreso.jsp" id="navbarDropdown" role="button"  aria-haspopup="true" aria-expanded="false"><span style="font-size: 19px; color: Dodgerblue;"><i class="far fa-user"></i></span>
                            Iniciar Sesión 
                        </a>
                    </li>
                </ul>
                <ul class="navbar-nav ">
                    <li class="nav-item active"> <a class="nav-link " href="registro.jsp" id="navbarDropdown" role="button" aria-haspopup="true" aria-expanded="false"><span style="font-size: 19px; color: Dodgerblue;"><i class="fas fa-address-book"></i></span> Registro</a>
                    </li>     
                </ul>
            </div>
        </nav>
        <br>
    <center>
        <img src="../img/logolargo.png">
    </center>
    <form class="formulario" action="../regristar" method="Post"  >
        <h3 style="color: red">${error}</h3>
        <h1>Registrar</h1>
        <div class="contenedor">

            <div class="input-contenedor">
                <input type="text" name="txtnombre" required=""  placeholder="Nombre Completo">

            </div>

            <div class="input-contenedor">
                <input type="text" name="txtcorreo" required="" id="correo" placeholder="Correo Electronico">
            </div>
            <span id="mensaje" style="color:red ; width: 50px"> </span>
            <div class="input-contenedor"> 
                <input type="password"  name="txtpassword"  id="clave" placeholder="Contraseña">

            </div>
            <span id="mensaje2" style="color:red"> </span>
            <div class="input-contenedor">
                <input type="password" name="" id="clave2" placeholder="Confirme Contraseña">  
            </div>
            <span id="" style="color:red"> </span>
            <div class=" input-contenedor">
                <input type="text" name="txttelefono" class="" id="telefono" onkeypress="" placeholder="Telefono">
            </div>
            <div class="form-group">
                <select class="form-control" name="country" id="departamento"  required="" >               
                    <option value="0">Departamentos</option>
                    <c:forEach var="depa" items="<%=departamentos%>">
                        <option value="${depa.getIddepartamento()}" >${depa.getDescripcion()}</option>
                    </c:forEach>   
                </select>
            </div>

            <div class="form-group ">
                <select class="form-control"name="txtciudad" id="ciudad" required="" >

                    <option value="0">Ciudad</option>
                    <c:forEach var="ciudad" items="<%=ciudades%>">
                        <option  value="${ciudad.getIdciudad()}">${ciudad.getDescripcion()}</option>
                    </c:forEach>

                </select>
            </div>
            <div class="form-group "> 
                <select name="sexo" class="form-control" id="genero" required="">
                    <option>Genero</option>
                    <option>Masculino</option>
                    <option>Femenino</option>
                </select>
            </div>
            <br>
            <input type="submit" name="accion" value="Registrate" class="button">
            <p>Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.</p>
            <p>¿Ya tienes una cuenta?<a class="link" href="Ingreso.jsp">Iniciar Sesion</a></p>
        </div>
    </form>
    <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    <script src="../js/jquery.js" type="text/javascript"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
