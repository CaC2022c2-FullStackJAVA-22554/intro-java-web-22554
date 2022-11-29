
package ar.charlycimino.hola.mundo.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
@WebServlet(name = "procesar", urlPatterns = {"/procesar-saludo"})
public class ProcesarServlet extends HttpServlet {
    
    /*
        PEDIRLE AL USUARIO SU FECHA DE NACIMIENTO. EL SERVIDOR LE DICE LA EDAD
    */
    private Modelo model;
    
    public ProcesarServlet() {
        model = new Modelo();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String fechaNacimiento = req.getParameter("fNac");
        int laEdad = model.edad(fechaNacimiento);
        req.setAttribute("edad", laEdad);
        req.getRequestDispatcher("saludo.jsp").forward(req, resp);
    }
    
}
