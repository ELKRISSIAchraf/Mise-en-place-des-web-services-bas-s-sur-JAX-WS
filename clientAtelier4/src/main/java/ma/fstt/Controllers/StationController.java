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


import ma.fstt.ws.station.Station;
import ma.fstt.ws.station.StationJpa;
import ma.fstt.ws.station.StationJpaImpService;



/**
 * Servlet implementation class StationController
 */
@WebServlet("/StationController")

public class StationController extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;

	   StationJpaImpService service =new StationJpaImpService();
	   StationJpa sta=service.getStationJpaImpPort();
	   
	




   

 

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");	 
        try {
            switch (action) {
            case "ajouter":
               ajouterstation(request, response);
            	//response.getWriter().append("--------------------------------ajouter ").append(request.getContextPath());
                break; 
            case "ajouterStation":
                pageajouterstation(request, response);
            	//response.getWriter().append("--------------------------------ajouter ").append(request.getContextPath());
                break; 
            case "delete":
               deletestation(request, response);
                break;          
            case "update":   
               updatestation(request, response);
                break;
            case "updateStation":
                pageupdatestation(request, response);
                 break;
           
            default:
            	//response.getWriter().append("Served ---------------------------list-----------------: ").append(request.getContextPath());
                listStations(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
		
	}
	private void listStations(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Station> listStations = sta.getStations();
        request.setAttribute("listStations", listStations);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Station/station.jsp");
      dispatcher.forward(request, response);
    }
	private void ajouterstation(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String nom = request.getParameter("nomSta");
		String adresse = request.getParameter("adresseSta");
		String ville= request.getParameter("villeSta");
		Station stat= new Station(0L,nom,ville,adresse);
	   sta.addStation(stat);
		
		response.sendRedirect("Station?action=list");	
	}
	private void pageajouterstation(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {	
		 RequestDispatcher dispatcher = request.getRequestDispatcher("Station/addstation.jsp");
	      dispatcher.forward(request, response);
	}
	private void deletestation(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
	 Long id = Long.parseLong(request.getParameter("id"));	        
   
        sta.deleteStation(id);
        response.sendRedirect("Station?action=list"); 
    }
	private void updatestation(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		 Long id = Long.parseLong(request.getParameter("id"));
		 String nom = request.getParameter("nomSta");
			String adresse = request.getParameter("adresseSta");
			String ville= request.getParameter("villeSta");
				 
			Station stat= new Station(id,nom,ville,adresse);
	       sta.updateStation(stat);
	        response.sendRedirect("Station?action=list");  
		 }
	 private void pageupdatestation(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		 Long id = Long.parseLong(request.getParameter("id"));
		Station stat =  sta.trouverById(id) ;
		  request.setAttribute("station", stat);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("Station/updatestation.jsp");
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
