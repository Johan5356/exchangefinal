<%-- 
    Document   : Ingreso
    Created on : 25/08/2019, 06:47:02 PM
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script src="https://kit.fontawesome.com/297ca4f04f.js"></script>
        <title>Ingreso</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Exchange </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="../index.jsp">Inicio <span class="sr-only">(current)</span></a>
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
    <center>
        <img src="../img/logolargo.png"> 

        <div class="container mt-10">
            <form class="formulario" action="../ingresar" method="Post" onsubmit="">
                <div class="col-sm-4">
                    <div class="card-header">
                        <h3>Ingreso</h3>
                    </div>
                    <br>
                    <div class="contenedor">
                        <div class="input-group mb-3">
                            <div class="input-group-prepend" >
                                <span class="input-group-text" id="basic-addon1"><i class="fas fa-envelope icon"></i></span>
                            </div>
                            <input class="form-control" type="text" placeholder="Correo Electronico" required="" id="correo"  name="correo">
                        </div>
                        <br>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon1"><i class="fas fa-key icon"></i></span>
                            </div>
                            <input class="form-control" type="password" placeholder="Contraseña" id="clave" required="" name="password"  >
                        </div>
                        <div class="card-footer">
                            <input type="submit" value="Ingresar" class="btn btn-info">
                        </div>
                    </div>
                    <p>Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.</p>
                    <p>¿No tienes una cuenta? <a class="link" href="registro.jsp">Registrate </a></p>
            </form>        
        </div>
    </center>
                       <script src="../js/jquery.js" type="text/javascript"></script
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
