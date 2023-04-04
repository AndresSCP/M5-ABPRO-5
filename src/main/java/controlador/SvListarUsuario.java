package controlador;



import java.io.IOException;

import interfaces.IUsuarioDAO;
import modelo.DaoUsuarioImp;
import modelo.Usuario;

import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/UsuarioServlet")
public class SvListarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Usuario> miArrayList = new ArrayList<Usuario>();
    
    public SvListarUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			IUsuarioDAO DaoUsuario = new DaoUsuarioImp();// Ojo que aqui esta la caida
			miArrayList = DaoUsuario.listarUsuario();
		 } catch (Exception  e) {
			 System.out.println(e.getMessage());
        }
		
		
		System.out.println("El tamaño de la lista miArrayList es: " + miArrayList.size());
		response.getWriter().println("El tamaño de la lista miArrayList es: " + miArrayList.size());
		
		// Establecer el atributo miLista en el objeto request
		request.setAttribute("miListaUsuario", miArrayList);
		

		// Obtener la sesión actual
        HttpSession session = request.getSession();

        // Obtener un atributo de sesión
        String username = (String) session.getAttribute("username");

        //Verificar que la session este activa
        if (session.getAttribute("username") != null) {
        	// Llamamos a la página JSP del formulario de Lista de Usuarios
            request.getRequestDispatcher("ListarUsuarios.jsp").forward(request, response);
        }else{
        	//Se redirige la pagina a login
        	request.getRequestDispatcher("login.jsp").forward(request, response);
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
