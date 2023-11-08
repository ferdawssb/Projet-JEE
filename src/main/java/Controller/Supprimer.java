package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import Dao.Gestiondb;
import Model.Etudiant;

/**
 * Servlet implementation class Supprimer
 */
public class Supprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Supprimer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Gestiondb gs= new Gestiondb(); 
		try {
			 
			 int id = Integer.parseInt(request.getParameter("id"));
			 gs.deleteEtudiant(id);
			 List <Etudiant> le = gs.getAllEtudiants();
				request.setAttribute("le", le);
				request.getRequestDispatcher("Liste.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
