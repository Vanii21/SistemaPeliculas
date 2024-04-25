/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Actor;
import modelo.ArbolBinario;
import modelo.ListaCircular;
import modelo.Peliculas;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vanii
 */
public class DetalleActores extends HttpServlet {

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

        String nomA = request.getParameter("accion3");
        String idActor = request.getParameter("accion");
        String tituloP = request.getParameter("accion2");
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        HttpURLConnection connection = null;

        try {
  
            URL url = new URL("https://api.themoviedb.org/3/person/" + idActor + "/movie_credits?api_key=96ee6998a03846dba765634d8135cb0a&language=en-US");
            
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            
            int status = connection.getResponseCode();

            
            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);

                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
            }

            
            try {
                JSONObject p = new JSONObject(responseContent.toString());
                JSONArray peli = p.getJSONArray("cast");
                ListaCircular<Peliculas> pelisActores = (ListaCircular<Peliculas>) request.getSession().getAttribute("myPelActor");
                
                pelisActores = null;
                for (int i = 0; i < peli.length(); i++) {

                    JSONObject j = peli.getJSONObject(i);

                    
                    String nombreP = j.getString("title");
                    String nombreO = j.getString("original_title");
                    String resena = j.getString("overview");
                    String sinopsis = j.getString("overview");
                    int idPelicula = j.getInt("id");
                    Object portada = j.get("poster_path");

                    Peliculas pelisA = new Peliculas(nombreP, nombreO, resena, sinopsis, portada, idPelicula);

                    if (pelisActores == null) {

                        pelisActores = new ListaCircular<Peliculas>();
                        pelisActores.agregarPelicula(pelisA);
                        request.getSession().setAttribute("myPelActor", pelisActores);

                    } else {

                        pelisActores.agregarPelicula(pelisA);
                        
                    }
                }

            } catch (JSONException e) {

                e.printStackTrace();

            }

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            connection.disconnect();
        }

            
            
          
            request.getSession().setAttribute("miNombre", nomA);
            request.getSession().setAttribute("miTitulo", tituloP);
            request.getRequestDispatcher("detalleActores.jsp").forward(request, response);
        
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
