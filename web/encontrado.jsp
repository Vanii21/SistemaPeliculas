<%-- 
    Document   : encontrado
    Created on : 15-mar-2022, 0:06:45
    Author     : vanii
--%>

<%@page import="modelo.Nodo"%>
<%@page import="modelo.Peliculas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            Nodo<Peliculas> p = (Nodo<Peliculas>)request.getSession().getAttribute("myUserEncontrado");
            
            %>
        
            <h1>Pelicula Encontrada: <%out.println(p.getDato().toString());%></h1>
       
   
    </body>
</html>
