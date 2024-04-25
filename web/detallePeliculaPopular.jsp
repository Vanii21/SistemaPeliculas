<%-- 
    Document   : detallePeliculaPopular
    Created on : 23-mar-2022, 21:00:49
    Author     : vanii
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Actor"%>
<%@page import="modelo.ArbolBinario"%>
<%@page import="modelo.Nodo"%>
<%@page import="modelo.Peliculas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <style>

            h6{
                font-family: arial;
                font-size: 20pt;
                color: #00CED1;
            }

            .boton_personalizado{
                text-decoration: none;
                padding: 10px;
                font-weight: 600;
                font-size: 20px;
                color: #ffffff;
                background-color: #1883ba;
                border-radius: 6px;
                border: 2px solid #0016b0;
            }

            h1{
                font-family: arial;
                font-size: 18pt;
                color: #EF5350;
            }

            h2{
                font-family: arial;
                font-size: 18pt;
                color: #B2DFDB;
            }
        </style>
        <!-- Basic need -->
        <title>SpamFlix</title>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <meta name="author" content="">
        <link rel="profile" href="#">

        <!--Google Font-->
        <link rel="stylesheet" href='http://fonts.googleapis.com/css?family=Dosis:400,700,500|Nunito:300,400,600' />
        <!-- Mobile specific meta -->
        <meta name=viewport content="width=device-width, initial-scale=1">
        <meta name="format-detection" content="telephone-no">

        <!-- CSS files -->
        <link rel="stylesheet" href="css/plugins.css">
        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>

        <%

            Nodo<Peliculas> p = (Nodo<Peliculas>) request.getSession().getAttribute("miPeliEncontrada");
            
            Object port = p.getDato().getPortada();
            String nomP = p.getDato().getNombrePelicula();
            String nombO = p.getDato().getNombreOriginal();
            String resena = p.getDato().getReseñas();
            String sinop = p.getDato().getSinopsis();


        %>
        <header class="ht-header">
            <div class="container">
                <nav class="navbar navbar-default navbar-custom">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <a href="mostrarTodos.do"><img class="logo" src="images/LogoPelis.png" alt="" width="119" height="58"></a>
                    <div class="collapse navbar-collapse flex-parent" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav flex-child-menu menu-left">

                            <h1><p style="font-size: 50px"><b>DETALLE POPULAR</b></p></h1>

                        </ul>
                    </div>
                </nav>

            </div>
        </header>


        <div class="slider movie-items" align="center">
            <div class="container">
                <div class="row">

                    <table>
                        <thead>
                            <tr>

                                <th colspan="3"><img src="https://image.tmdb.org/t/p/w500<%=port%>" style="width:1800px !important; height:700px !important" alt=""></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td rowspan="4"><img src="https://image.tmdb.org/t/p/w500<%=port%>" style="width:400px !important; height:550px !important" alt=""></td>

                            </tr>
                            <tr>
                                <td colspan="2"><p style="font-size: 50px"><b><%=nomP%><br></b></p></td>
                            </tr>
                            <tr>

                                <td colspan="2"><p style="font-size: 35px"><b>Nombre Original: <%=nombO%></b></td>
                            </tr>
                            <tr>

                                <td colspan="2"><p style="font-size: 20px"><b>Reseña: <%=resena%></b></td>
                            </tr>
                            <tr>

                                <td colspan="3"><p style="font-size: 20px"><b>Sinopsis: <%=sinop%></b></td>
                            </tr>

                        </tbody>
                    </table>

                </div>
            </div>
        </div>
    </div>

    <div class="slider movie-items">
        <div class="container">
            <div class="row" >
                <div class="title-hd">
                    <h1><p style="font-size: 50px"><b>REPARTO</b></p></h1>
                </div>
                <div  class="slick-multiItemSlider">
                    <%

                        ArbolBinario actor = (ArbolBinario) request.getSession().getAttribute("myActorEncontrado");
                        ArrayList<Actor> arr = new ArrayList<Actor>();

                        actor.inOrden(actor.raiz, arr);

                        for (Actor e : arr) {

                            Object portA = e.getFoto();
                            String nom = e.getNombre();
                            int id = e.getId();

                    %>
                    <div class="movie-item">

                        <div class="mv-img">
                            <a><img src="https://image.tmdb.org/t/p/w500<%=portA%>" style="width:285px !important; height:437px !important" alt=""> </a>

                        </div>
                        <div class="title-in">
                            <a href="detalleactores.do?accion=<%=id%>&accion2=popular&accion3=<%=nom%>"><h6><%=nom%></h6></a>
                        </div>

                    </div>
                    <%                        }

                    %>

                </div>
            </div>
        </div>
    </div>


    <div class="slider movie-items">
        <div class="container">
            <div class="row" >
                <div>
                    <form action="eliminarpopulares.do?accion=<%=nomP%>" method="post" enctype="multipart/form-data">
                        <input type="submit" value="Eliminar Pelicula" class="boton_personalizado">
                    </form>
                    <br>
                    <form action="editarPelisP.jsp?accion=<%=nomP%>" method="post" enctype="multipart/form-data">
                        <input type="submit" value="Editar Pelicula" class="boton_personalizado">
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


<!--end of latest new v1 section-->
<!-- footer section-->
<footer class="ht-footer">
    <div class="container">
        <div class="flex-parent-ft">
            <div class="flex-child-ft item1">
                <a href="mostrarTodos.do"><img class="logo" src="images/LogoPelis.png" alt=""  width="119" height="58"></a>
                <p>Vanii Alcantara, 7690-18-1298<br>
                    Werner Carcamo, 7690-20-10779</p>
                <p>Universidad: <a> Mariano Galvez de Guatemala</a></p>
            </div>

        </div>
    </div>
</footer>
<!-- end of footer section-->

<script src="js/jquery.js"></script>
<script src="js/plugins.js"></script>
<script src="js/plugins2.js"></script>
<script src="js/custom.js"></script>

</body>
</html>
