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
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <meta name = "viewport" content="width=device-width">
        <meta name = "description" content="Exchange mas que una familia">
        <meta name = "keywords" content="diseño web, desarrollo web, seo, posicionamiento web">
        <meta name = "author" content="Render-2Web">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
    </head>
    <body>
        <header>
            <%
                ProductoDAO pdao = new ProductoDAO();
                CategoriaDao cd = new CategoriaDao();

                List<CategoriasVo> lista = cd.listar();
                List<PublicarVO> producto = pdao.verproducto();
            %>
            <div class="contenedor">
                <div id="marca">
                    <h1><span class="resaltado">Exchange</span> Plataforma de Trueques</h1>			
                </div>
            </div>
        </header>  
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Exchange</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="inicio.jsp">Inicio</a></li>

                    <li><a href="#">Ayuda</a></li>
                </ul>
                <ul class="nav navbar-nav ">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Categorias
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <c:forEach var="ca" items="<%=lista%>">
                                <li><a href="jsp/Categoria.jsp?idcategoria=${ca.getIdCategoria()}">${ca.getDescripcion()}</a></li>
                                </c:forEach>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="jsp/regristar.jsp"><span class="glyphicon glyphicon-user"></span> Regristarse</a></li>
                    <li><a href="html/loginvista.html"><span class="glyphicon glyphicon-log-in"></span> Ingresar</a></li>
                </ul>
            </div>
        </nav>
    <center>
        <img src="img/logolargo.png">
    </center>

    <section id="cabecera">
        <div class="contenedor">
            <h1>Profesionales Expertos en Intercambios Online</h1>
            <p>¿Deseas intercambiar algun objeto que no necesitas por otro que realmente necesitas</p>
        </div>
    </section>


    <section id="boletin">
        <div class="contenedor">
            <h1>Encuentra rapido tus objetos...</h1>
            <form>
                <input type="text" name="texto" placeholder="Buscar objeto...">
                <button type="submit" class="boton1">Buscar</button>
            </form>
        </div>
        <table border="0" align="center" width="1000">
            <%
                int salto = 0;
            %>
            <c:forEach var="pd" items="<%=producto%>">
                <th><img src="consultarimagen?id=${pd.getId_publicar()}" height="200" width="200"><p>
                    <p>
                        ${pd.getNombre()}<br>
                        ${pd.getPrecioestimado()}

                    </p>
                    <a href="../Detallesproducto?idproducto=${pd.getId_publicar()}">Ver Detalles</a>
                </th>
                <%
                    salto++;
                    if (salto == 4) {
                %>
                <tr>
                    <%
                            salto = 0;
                        }
                    %>
                </c:forEach>
        </table>
        <footer>
            <center>
                <p>Exchange plataforma web. Copyrigth &copy; 2019</p>
            </center>

        </footer>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/jquery.js" type="text/javascript"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </body>
</html>