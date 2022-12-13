package ma.fstt.Controllers;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import ma.fstt.ws.histcarburant.HistCarburant;
import ma.fstt.ws.histcarburant.HistCarburantJpa;
import ma.fstt.ws.histcarburant.HistCarburantJpaImpService;

/**
 * Servlet implementation class HisCarbController
 */
@WebServlet("/HisCarbController")
public class HisCarbController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HistCarburantJpaImpService service =new HistCarburantJpaImpService();
	   HistCarburantJpa histcar=service.getHistCarburantJpaImpPort();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HisCarbController() {
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
               ajouterhistcarburant(request, response);
            	//response.getWriter().append("--------------------------------ajouter ").append(request.getContextPath());
                break; 
            case "ajouterHistCarburant":
                pageajouterhistcarburant(request, response);
            	//response.getWriter().append("--------------------------------ajouter ").append(request.getContextPath());
                break; 
            case "delete":
               deletehistcarburant(request, response);
                break;          
            case "update":   
               updatehistcarburant(request, response);
                break;
            case "getprices":   
                getprices(request, response);
                 break;
            case "updateHistCarburant":
                pageupdatehistcarburant(request, response);
                 break;
           
            default:
            	//response.getWriter().append("Served ---------------------------list-----------------: ").append(request.getContextPath());
                listHistCarburants(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	private void listHistCarburants(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<HistCarburant> listHistCarburants = histcar.getHistCarburants();
        request.setAttribute("listHistCarburants", listHistCarburants);
        RequestDispatcher dispatcher = request.getRequestDispatcher("HistCarburant/histcarburant.jsp");
      dispatcher.forward(request, response);
    }
	private void ajouterhistcarburant(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ParseException {
		java.util.Date date=  new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateHistCar"));
		Date SQLDate =  new java.sql.Date(date.getTime());		
		 Double prix = Double.parseDouble(request.getParameter("prixHistCar"));	        

		 Long idCar = Long.parseLong(request.getParameter("idCar"));	        
		 Long idSta = Long.parseLong(request.getParameter("idSta"));	        

		HistCarburant histcarb= new HistCarburant(0L,idCar,idSta,SQLDate,prix);
	   histcar.addHistCarburant(histcarb);
		
		response.sendRedirect("HistCarburant?action=list");	
	}
	private void pageajouterhistcarburant(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {	
		 RequestDispatcher dispatcher = request.getRequestDispatcher("HistCarburant/addhistcarburant.jsp");
	      dispatcher.forward(request, response);
	}
	private void deletehistcarburant(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
	 Long id = Long.parseLong(request.getParameter("id"));	        
   
       histcar.deleteHistCarburant(id);
        response.sendRedirect("HistCarburant?action=list"); 
    }
	private void updatehistcarburant(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ParseException {
		 Long id = Long.parseLong(request.getParameter("id"));
		 java.util.Date date=  new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateHistCar"));
			Date SQLDate =  new java.sql.Date(date.getTime());		
			 Double prix = Double.parseDouble(request.getParameter("prixHistCar"));	        

			 Long idCar = Long.parseLong(request.getParameter("idCar"));	        
			 Long idSta = Long.parseLong(request.getParameter("idSta"));	        

			HistCarburant histcarb= new HistCarburant(id,idCar,idSta,SQLDate,prix);
	       histcar.updateHistCarburant(histcarb);
	        response.sendRedirect("HistCarburant?action=list");  
		 }
	 private void pageupdatehistcarburant(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		 Long id = Long.parseLong(request.getParameter("id"));
		HistCarburant histcarb = histcar.trouverById(id) ;
		  request.setAttribute("histcarburant", histcarb);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("Carburant/updatecarburant.jsp");
	      dispatcher.forward(request, response); 
		 }
	 private void getprices(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException, ParseException {
		String nom = request.getParameter("nomSta");
		 java.util.Date date=  new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateHistCar"));
		 Date SQLDate =  new java.sql.Date(date.getTime());	
        List<String> prices = histcar.getPrices(nom, SQLDate);
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
