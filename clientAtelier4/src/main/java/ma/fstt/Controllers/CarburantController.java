package ma.fstt.Controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.fstt.ws.carburant.Carburant;
import ma.fstt.ws.carburant.CarburantJpa;
import ma.fstt.ws.carburant.CarburantJpaImpService;

/**
 * Servlet implementation class CarburantController
 */
@WebServlet("/CarburantController")
public class CarburantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CarburantJpaImpService service =new CarburantJpaImpService();
	   CarburantJpa car=service.getCarburantJpaImpPort();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarburantController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");	 
        try {
            switch (action) {
            case "ajouter":
               ajoutercarburant(request, response);
            	//response.getWriter().append("--------------------------------ajouter ").append(request.getContextPath());
                break; 
            case "ajouterCarburant":
                pageajoutercarburant(request, response);
            	//response.getWriter().append("--------------------------------ajouter ").append(request.getContextPath());
                break; 
            case "delete":
               deletecarburant(request, response);
                break;          
            case "update":   
               updatecarburant(request, response);
                break;
            case "updateCarburant":
                pageupdatecarburant(request, response);
                 break;
           
            default:
            	//response.getWriter().append("Served ---------------------------list-----------------: ").append(request.getContextPath());
                listCarburants(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }	}
	private void listCarburants(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Carburant> listCarburants = car.getCarburants();
        request.setAttribute("listCarburants", listCarburants);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Carburant/carburant.jsp");
      dispatcher.forward(request, response);
    }
	private void ajoutercarburant(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String nom = request.getParameter("nomCar");
		String desc = request.getParameter("descriptionCar");
		Carburant carb= new Carburant(0L,nom,desc);
	   car.addCarburant(carb);
		
		response.sendRedirect("Carburant?action=list");	
	}
	private void pageajoutercarburant(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {	
		 RequestDispatcher dispatcher = request.getRequestDispatcher("Carburant/addcarburant.jsp");
	      dispatcher.forward(request, response);
	}
	private void deletecarburant(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
	 Long id = Long.parseLong(request.getParameter("id"));	        
   
       car.deleteCarburant(id);
        response.sendRedirect("Carburant?action=list"); 
    }
	private void updatecarburant(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		 Long id = Long.parseLong(request.getParameter("id"));
		 String nom = request.getParameter("nomCar");
			String desc = request.getParameter("descriptionCar");
			Carburant carb= new Carburant(id,nom,desc);
	       car.updateCarburant(carb);
	        response.sendRedirect("Carburant?action=list");  
		 }
	 private void pageupdatecarburant(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		 Long id = Long.parseLong(request.getParameter("id"));
		Carburant carb = car.trouverById(id) ;
		  request.setAttribute("carburant", carb);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("Carburant/updatecarburant.jsp");
	      dispatcher.forward(request, response); 
		 }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
