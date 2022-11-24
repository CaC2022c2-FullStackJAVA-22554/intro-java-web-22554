
package ar.charlycimino.hola.mundo.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
@WebServlet(name = "procesar", urlPatterns = {"/procesar-saludo"})
public class ProcesarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombreDelCliente = req.getParameter("fname");
        
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>SALUDANDO</title></head>");
        out.println("<body><h1>Hola " + nombreDelCliente + "</h1></body>");
        out.println("</html>");
    }
    
}
