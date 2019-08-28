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
        <style>
          body {
    font:15px Arial, Helvetica, sans-serif;
    padding: 0;
    margin: 0;
    background-color: #f4f4f4;
}
        </style>
    </head>
    <body>
        
         <header>
            <%
                usuariovo usu = (usuariovo) session.getAttribute("usuario");
                usuariovo vo = (usuariovo) session.getAttribute("usuario");
                int id=Integer.parseInt(request.getParameter("idusuario"));
                CategoriaDao cd = new CategoriaDao();
                ProductoDAO pdao = new ProductoDAO();
                List<PublicarVO> producto = pdao.listar(id);
                List<CategoriasVo> lista = cd.listar();
            %>
          <jsp:include page="../Encabezado.jsp"></jsp:include>
        </header>
        <h1>SUBIR SUBASTA</h1>
         <c:forEach var="pd" items="<%=producto%>">
                <div class="container">
                    <center>
                        <div class="row" style="border: 1px solid #E1E1E1;" >
                            <div class="col-md-3" >
                                <img src="../consultarimagen?id=${pd.getId_publicar()}" width="170" height="170">
                            </div>
                            <div class="col-md-4" >
                                <h3>${pd.getNombre()}</h3>
                                <br>
                                <p style="border: 1px solid #E1E1E1;">${pd.getDescripcion()}</p>
                            </div>
                            <div class="col-md-3">
                                <br>                      
                                <br>                      
                                <br>                      
                                <a href="..//ingresar?idproducto=${pd.getId_publicar()}"><input type="submit" class="form-control btn btn-primary" value="Enviar subasta " ></a>
                                <br>
                                <br>      
                            </div>                   
                        </div>
                    </center>
                </div>
            </div>
        </c:forEach>

    </body>
</html>
