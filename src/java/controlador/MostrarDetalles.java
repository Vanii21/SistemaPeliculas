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
import modelo.ListasEnlazadasDobles;
import modelo.Nodo;
import modelo.Peliculas;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vanii
 */
public class MostrarDetalles extends HttpServlet {

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

        String idPelicula = request.getParameter("accion2");
        String accion = request.getParameter("accion");
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        HttpURLConnection connection = null;

        Peliculas pe = new Peliculas(accion);

        ListaCircular<Peliculas> pelis = (ListaCircular<Peliculas>) request.getSession().getAttribute("myPel");

        if (pelis == null) {
            //error
            request.getRequestDispatcher("error.jsp").forward(request, response);

        } else {

            Nodo<Peliculas> pel = pelis.buscarPelicula(pe);
            request.getSession().setAttribute("myPeliEncontrado", pel);

        }

        try {
            URL url = new URL("https://api.themoviedb.org/3/movie/" + idPelicula + "/credits?api_key=b848ad900bd362f8e14087349221284a&language=en-US");

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
                JSONArray act = p.getJSONArray("cast");
                ArbolBinario arbol = (ArbolBinario) request.getSession().getAttribute("myActorEncontrado");
                arbol = null;
                
                for (int i = 0; i < act.length(); i++) {

                    JSONObject j = act.getJSONObject(i);

                    String nombre = j.getString("name");
                    String nombreO = j.getString("original_name");
                    String nombrepelicula = j.getString("character");
                    int genero = j.getInt("gender");
                    int id = j.getInt("id");
                    Object foto = j.get("profile_path");

                    Actor ac = new Actor(nombre, nombreO, nombrepelicula, id, genero, foto);
                    
                    
                    if (arbol == null) {
    
                        arbol = new ArbolBinario();
                        arbol.agregarNodo(ac);
                        request.getSession().setAttribute("myActorEncontrado", arbol);
                        
                    } else {

                        arbol.agregarNodo(ac);
                        request.getSession().setAttribute("myActorEncontrado", arbol);
                        

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

        
        request.getRequestDispatcher("detallePelicula.jsp").forward(request, response);

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
