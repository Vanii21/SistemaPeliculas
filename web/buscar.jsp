<%-- 
    Document   : buscar
    Created on : 14-mar-2022, 22:26:40
    Author     : vanii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Buscar</h1>
        <form action="buscar.do" method="post">
            <h2> Nombre Pelicula:<input type="text" name="txtNombreP" /></h2><br />
            <input type="submit" value="Buscar"/>
            
        </form>
    </body>
</html>
