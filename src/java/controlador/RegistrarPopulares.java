/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modelo.ListasEnlazadasDobles;
import modelo.Peliculas;

/**
 *
 * @author vanii
 */
@MultipartConfig
public class RegistrarPopulares extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombreP = request.getParameter("txtNombrePelicula");
        String nombreO = request.getParameter("txtNombreOriginal");
        String resena = request.getParameter("txtResenaPelicula");
        String sinopsis = request.getParameter("txtSinopsisPelicula");
        Part portada = request.getPart("filePortada1");
        
        //Guardar Imagen en el proyecto
        String imgFileName = portada.getSubmittedFileName();
       
        String uploadPath = "D:/OneDrive/Escritorio/Practica_Netbeans/ProyectoPeliculas/web/imgPopulares/" + imgFileName;

        try {
            FileOutputStream fos = new FileOutputStream(uploadPath);
            InputStream is = portada.getInputStream();

            byte[] data = new byte[is.available()];
            is.read(data);
            fos.write(data);
            fos.close();
        } catch (Exception e) {

            e.printStackTrace();

        }
         
        
        //fin del guardado del proyecto
        String error = " ";
/*
        if (nombreP.equals("") || nombreO.equals("") || resena.equals("") || sinopsis.equals("") || portada == null) {
            error = "Campo vacio...";

            request.getSession().setAttribute("myError", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else {

            Peliculas p = new Peliculas(nombreP, nombreO, resena, sinopsis, portada);

            ListasEnlazadasDobles<Peliculas> pelis = (ListasEnlazadasDobles<Peliculas>) request.getSession().getAttribute("myPeli");

            if (pelis == null) {
                
                pelis = new ListasEnlazadasDobles<Peliculas>();
                pelis.ingresarPelicula(p);
                request.setAttribute("imgPopulares", imgFileName);
                request.getSession().setAttribute("myPeli", pelis);
                request.getRequestDispatcher("registrarPopulares.jsp").forward(request, response);
                
            } else {
                
                pelis.ingresarPelicula(p);
                request.setAttribute("imgPopulares", imgFileName);
                request.getSession().setAttribute("myPeli", pelis);
                request.getRequestDispatcher("registrarPopulares.jsp").forward(request, response);

            }

        }
    */
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
