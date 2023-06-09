package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import interfaces.ICapacitacion;
import interfaces.ICapacitacionDao;
import modelo.Capacitacion;
import modelo.CapacitacionDaoImpl;
import implementacion.CapacitacionImpl;


/**
 * Servlet implementation class ContactoServletJSP
 */
@WebServlet("/SvListarCapacitacion")
public class SvListarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Capacitacion> miArrayList = new ArrayList<>();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvListarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * @Override protected void doGet(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * 
	 * // Obtener la sesión actual HttpSession session = request.getSession();
	 * 
	 * // Obtener un atributo de sesión String username = (String)
	 * session.getAttribute("username");
	 * 
	 * //Verificar que la session este activa if (session.getAttribute("username")
	 * != null) {
	 * 
	 * ICapacitacionDao capacitacionDao = new CapacitacionDaoImpl(); miArrayList =
	 * capacitacionDao.obtener();
	 * 
	 * // Establecer el atributo miLista en el objeto request
	 * request.setAttribute("miLista", miArrayList);
	 * =
	 * // Enviar el objeto request y el objeto response a la página JSP
	 * request.getRequestDispatcher("ListarCapacitaciones.jsp").forward(request,
	 * response);
	 * 
	 * }else{ //Se redirige la pagina a login
	 * request.getRequestDispatcher("login.jsp").forward(request, response); }
	 * 
	 * }
	 */
    
/**
 * 	Trae 3 capacitaciones de la clase Capacitacion
 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        //Verificar que la sesión esté activa
        if (session.getAttribute("username") != null) {

            ICapacitacion capacitacion = new CapacitacionImpl();

            List<Capacitacion> miArrayList = capacitacion.obtenerCapacitaciones();

            request.setAttribute("miLista", miArrayList);
            for(int i=0;i<miArrayList.size();i++){
            	System.out.println(miArrayList.get(i));
            }
            System.out.println(capacitacion.obtenerCapacitaciones());

            request.getRequestDispatcher("ListarCapacitaciones.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}