<%-- 
    Document   : registrar
    Created on : 14-mar-2022, 22:26:52
    Author     : vanii
--%>

<html lang="en" class="no-js">

    <!DOCTYPE html>
    <head>

        <style>

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

            .redondeado {

                border-radius: 5px;

            }

            h1{
                font-family: arial;
                font-size: 20pt;
                color: #00CED1;
            }

            h2{
                font-family: arial;
                font-size: 18pt;
                color: mediumspringgreen;
            }
            
        </style>


        <title>Registrar Pelicula</title>
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
        <!-- BEGIN | Header -->
        <header class="ht-header">
            <div class="container">
                <nav class="navbar navbar-default navbar-custom">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header logo">
                        <div class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>

                        </div>
                        <a href="mostrarTodos.do"><img class="logo" src="images/LogoPelis.png" alt="" width="119" height="58"></a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse flex-parent" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav flex-child-menu menu-left">

                            <h1><p style="font-size: 50px"><b>REGISTRAR</b></p></h1>

                        </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                </nav>

            </div>
        </header>
        <!-- END | Header -->

        <div class="slider movie-items">
            <div class="container">
                <div class="row" >

                    <div class="col-lg-6">
                        <form action="registrar.do" method="post" enctype="multipart/form-data">
                            <h2 class="text-left">Nombre Pelicula:</h2>
                            <br />
                            <input type="text" name="txtNombreP" class="redondeado" placeholder="Batman"/> 
                            <br />
                            <h2 class="text-left">Nombre Original:</h2>
                            <br />
                            <input type="text" name="txtNombreO" class="redondeado" placeholder="El caballero de la noche"/>
                            <br />
                            <h2 class="text-left">Reseña:</h2>
                            <br />
                            <input type="text" name="txtResena" class="redondeado" placeholder="Reseña"/>
                            <br />
                            <h2 class="text-left">Sinopsis:</h2>
                            <br />
                            <textarea  name="txtSinopsis" class="redondeado form-control" rows="3" placeholder="Sinopsis"></textarea>
                            <br />
                            <h2 class="text-left">Portada:</h2>
                            <br />
                            <input type="file" name="filePortada" class="boton_personalizado"/>
                            <br />
                            <input type="submit" value="Registrar" class="boton_personalizado"/>
                        </form>
                    </div>
                    <div class="col-lg-6">
                        <img class="logo" src="images/263952.jpeg" alt="" width="500" height="300">
                    </div>
                </div>
            </div>
        </div>

        <!--end of latest new v1 section-->
        <!-- footer section-->
        <footer class="ht-footer">
            <div class="container">
                <div class="row ipad-width">
                    <div class="flex-parent-ft">
                        <div class="flex-child-ft item1">
                            <a href="mostrarTodos.do"><img class="logo" src="images/LogoPelis.png" alt=""  width="119" height="58"></a>
                            <p>Vanii Alcantara, 7690-18-1298<br>
                                Werner Carcamo, 7690-20-10779</p>
                            <p>Universidad: <a> Mariano Galvez de Guatemala</a></p>
                        </div>

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
