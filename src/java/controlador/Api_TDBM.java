/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.scene.shape.Line;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modelo.ListaCircular;
import modelo.ListasEnlazadasDobles;
import modelo.Peliculas;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vanii
 */
public class Api_TDBM extends HttpServlet {

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
        BufferedReader reader, reader2;
        String line, line2;
        StringBuffer responseContent = new StringBuffer(), responseContent2 = new StringBuffer();
        HttpURLConnection connection = null, connection2 = null;

        try {
            URL url = new URL("https://api.themoviedb.org/3/movie/now_playing?api_key=b848ad900bd362f8e14087349221284a&language=en-US&page=1");
            URL url2 = new URL("https://api.themoviedb.org/3/movie/popular?api_key=b848ad900bd362f8e14087349221284a&language=en-US&page=1");

            //Cartelera
            connection = (HttpURLConnection) url.openConnection();
            //Populares
            connection2 = (HttpURLConnection) url2.openConnection();

            //Cartelera
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            //Populares
            connection2.setRequestMethod("GET");
            connection2.setConnectTimeout(5000);
            connection2.setReadTimeout(5000);

            //Cartelera
            int status = connection.getResponseCode();

            //Populares
            int status2 = connection2.getResponseCode();

            //Cartelera
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

            //Populares
            if (status2 > 299) {
                reader2 = new BufferedReader(new InputStreamReader(connection2.getErrorStream()));
                while ((line2 = reader2.readLine()) != null) {
                    responseContent2.append(line2);

                }
                reader2.close();
            } else {
                reader2 = new BufferedReader(new InputStreamReader(connection2.getInputStream()));
                while ((line2 = reader2.readLine()) != null) {
                    responseContent2.append(line2);
                }
            }

            //Cartelera
            try {
                JSONObject p = new JSONObject(responseContent.toString());
                JSONArray peli = p.getJSONArray("results");

                for (int i = 0; i < peli.length(); i++) {

                    JSONObject j = peli.getJSONObject(i);

                    String nombreP = j.getString("title");
                    String nombreO = j.getString("original_title");
                    String resena = j.getString("overview");
                    String sinopsis = j.getString("overview");
                    int idPelicula = j.getInt("id");
                    Object portada = j.get("poster_path");

                    Peliculas pel = new Peliculas(nombreP, nombreO, resena, sinopsis, portada, idPelicula);

                    ListaCircular<Peliculas> pelis = (ListaCircular<Peliculas>) request.getSession().getAttribute("myPel");

                    if (pelis == null) {

                        pelis = new ListaCircular<Peliculas>();
                        pelis.agregarPelicula(pel);
                        request.getSession().setAttribute("myPel", pelis);

                    } else {

                        pelis.agregarPelicula(pel);
                        
                    }
                }

            } catch (JSONException e) {

                e.printStackTrace();

            }

            //Populares
            try {
                JSONObject p2 = new JSONObject(responseContent2.toString());
                JSONArray peli2 = p2.getJSONArray("results");

                for (int i = 0; i < peli2.length(); i++) {

                    JSONObject j2 = peli2.getJSONObject(i);

                    String nombreP = j2.getString("title");
                    String nombreO = j2.getString("original_title");
                    String resena = j2.getString("overview");
                    String sinopsis = j2.getString("overview");
                    int idPelicula = j2.getInt("id");
                    Object portada = j2.get("poster_path");

                    Peliculas pel2 = new Peliculas(nombreP, nombreO, resena, sinopsis, portada, idPelicula);

                    ListasEnlazadasDobles<Peliculas> pelis2 = (ListasEnlazadasDobles<Peliculas>) request.getSession().getAttribute("myPeli");

                    if (pelis2 == null) {

                        pelis2 = new ListasEnlazadasDobles<Peliculas>();
                        pelis2.ingresarPelicula(pel2);
                        request.getSession().setAttribute("myPeli", pelis2);

                    } else {

                        pelis2.ingresarPelicula(pel2);
                        request.getSession().setAttribute("myPeli", pelis2);

                    }

                }

            } catch (JSONException e) {

                e.printStackTrace();

            }

            request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            connection.disconnect();
        }

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
