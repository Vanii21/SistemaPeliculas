<%-- 
    Document   : registrar
    Created on : 14-mar-2022, 22:26:52
    Author     : vanii
--%>
<%@page import="modelo.ListasEnlazadasDobles"%>
<%@page import="modelo.Peliculas"%>
<%@page import="modelo.ListaCircular"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <!-- Basic need -->
        <title>SpamFlix</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <meta name="author" content="">
        <link rel="profile" href="#">

        <!--Google Font-->
        <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css">
        <link rel="stylesheet" href='http://fonts.googleapis.com/css?family=Dosis:400,700,500|Nunito:300,400,600' />
        <!-- Mobile specific meta -->
        <meta name=viewport content="width=device-width, initial-scale=1">
        <meta name="format-detection" content="telephone-no">

        <!-- CSS files -->
        <link rel="stylesheet" href="css/plugins.css">
        <link rel="stylesheet" href="css/style.css">

        <style>
            h6{
                font-family: arial;
                font-size: 20pt;
                color: #00CED1;
            }

            h1{
                font-family: arial;
                font-size: 20pt;
                color: #00CED1;
            }

            h2{
                font-family: arial;
                font-size: 20pt;
                color: #FF4500;
            }


            body {
                background: left;
                font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
                font-size: 14px;
                margin: 0;
                padding: 0;
            }

            .swiper-container {
                background-color: transparent;
                width: 100%;
                padding-top: 90px;
                padding-bottom: 10px;
                transition: all 0.5s linear;
            }

            .swiper-slide {
                background-position: center;
                background-size: cover;
                width: 420px;
                height: 420px;
            }

            .swiper-slide .text {
                position: initial;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                opacity: 0.5;
                text-shadow: 4px 4px 4px rgba(255, 255, 255, 0.5),
                    -5px px 4px rgba(255, 255, 255, 0.5);
                font-size: 100px;
                font-weight: 900;
            }
        </style>

    </head>
    <body>

        <!-- BEGIN | Header -->
        <header class="ht-header">
            <div class="container">
                <nav class="navbar navbar-default navbar-custom">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header logo">
                        <div class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <div id="nav-icon1">
                                <span></span>
                                <span></span>
                                <span></span>
                            </div>
                        </div>
                        <a href="index.jsp"><img class="logo" src="images/LogoPelis.png" alt="" width="119" height="58"></a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse flex-parent" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav flex-child-menu menu-left">
                            <li class="hidden">
                                <a href="#page-top"></a>
                            </li>

                        </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                </nav>

                <!-- top search form -->
                <div class="top-search">

                    <input type="search" placeholder="Busca tu pelicula favorita">

                </div>
            </div>
        </header>
        <!-- END | Header -->
        <div class="slider movie-items">

        </div>

        <%
            ListaCircular<Peliculas> peliculas = (ListaCircular<Peliculas>) request.getSession().getAttribute("myPel");

        %>
        <div class="slider movie-items">
            <div class="container">
                <div class="row ipad-width">
                    <div class="col">
                        <div class="container">

                            <div class="row" >
                                <div class="title-hd">
                                    <h1><p style="font-size: 50px"><b>CARTELERA</b></p></h1>
                                </div>

                                <div class="swiper-container container">

                                    <div  class="swiper-wrapper">
                                        <%                                            try {

                                                peliculas.actual = peliculas.primero;
                                                
                                                do {

                                                    String nomb = peliculas.actual.getDato().getNombrePelicula();
                                                    int id = peliculas.actual.getDato().getIdPelicula();
                                                    Object port = peliculas.actual.getDato().getPortada();
                                                    
                                        %>

                                        <div class="swiper-slide">
                                            <div class="mv-img">
                                                <a href="mostrarDetalle.do?accion=<%=nomb%>&accion2=<%=id%>"><img src="https://image.tmdb.org/t/p/w500<%=port%>" style="width:350px !important; height:500px !important" alt=""> </a>
                                            </div>
                                            <div class="title-in">
                                                <h6><a><%=nomb%></a></h6>
                                            </div>
                                        </div>


                                        <%

                                                peliculas.actual = peliculas.actual.getSiguiente();

                                            } while (peliculas.actual != peliculas.primero);

                                        } catch (Exception e) {
                                        %>

                                        <div>

                                            <h2> Registre Peliculas para poder ver </h2>

                                        </div> 


                                        <%
                                            }
                                        %>


                                    </div>

                                    <div class="swiper-pagination"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="slider movie-items">
            <div class="container">
                <div class="row ipad-width">
                    <div class="col">
                        <div class="container">

                            <div class="row" >
                                <div class="title-hd">
                                    <h1><p style="font-size: 50px"><b>CARTELERA POPULARES</b></p></h1>
                                </div>
                                <div  class="slick-multiItemSlider">
                                    <%
                                        try {
                                            ListasEnlazadasDobles<Peliculas> peliculasP = (ListasEnlazadasDobles<Peliculas>) request.getSession().getAttribute("myPeli");
                                            peliculasP.actual = peliculasP.ultimo;
                                            
                                            while (peliculasP.actual != null) {

                                                String nomb = peliculasP.actual.getDato().getNombrePelicula();
                                                int id2 = peliculasP.actual.getDato().getIdPelicula();
                                                Object port = peliculasP.actual.getDato().getPortada();
                                                


                                    %>
                                    <div class="movie-item">
                                        
                                        <div class="mv-img">
                                            <a><img src="https://image.tmdb.org/t/p/w500<%=port%>" style="width:285px !important; height:437px !important" alt=""> </a>

                                        </div>
                                        <div class="title-in">
                                            <h6><a href="mostrardetallepopulares.do?accion=<%=nomb%>&accion2=<%=id2%>"><%=nomb%></a></h6>
                                        </div>
                                        
                                    </div>
                                    <%

                                            peliculasP.actual = peliculasP.actual.getAnterior();

                                        }
                                    } catch (Exception e) {
                                    %>

                                    <div>
                                        <br />
                                        <br />
                                        <br />
                                        <br />
                                        <br />
                                        <br />                            
                                        <h2> Registre Peliculas para poder ver </h2>

                                    </div> 


                                    <%
                                        }
                                    %>
                                </div>
                            </div>
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
                        <a href="index.jsp"><img class="logo" src="images/LogoPelis.png" alt=""  width="119" height="58"></a>
                        <p>Vanii Alcantara, 7690-18-1298<br>
                            Werner Carcamo, 7690-20-10779</p>
                        <p>Universidad: <a> Mariano Galvez de Guatemala</a></p>
                    </div>

                </div>
            </div>
        </footer>
        <!-- end of footer section-->

        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

        <script>
            var swiper = new Swiper('.swiper-container', {
                effect: 'coverflow',
                grabCursor: true,
                centeredSlides: true,
                slidesPerView: 'auto',
                coverflowEffect: {
                    rotate: 10,
                    stretch: 60,
                    depth: 90,
                    modifier: 5,
                    slideShadows: true,
                },
                pagination: {
                    el: '.swiper-pagination',
                },
                loop: true,
            });
        </script>

        <script src="js/jquery.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/plugins2.js"></script>
        <script src="js/custom.js"></script>
    </body>


</html>