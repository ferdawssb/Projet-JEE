package Controller;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import Model.*;
import Dao.*;

/**
 * Servlet implementation class Ajouter
 */
public class Ajouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
            Gestiondb  ges = new Gestiondb ();
            int num  = Integer.parseInt(request.getParameter("num"));
			String per  =request.getParameter("prenom");
			String nom =request.getParameter("nom");
			int tel =Integer.parseInt(request.getParameter("tel"));
			Etudiant e = new Etudiant(num,per,nom,tel); 
			ges.addEtudiant(e);
			List <Etudiant>le =ges.getAllEtudiants();
			request.setAttribute("le",le);
			request.getRequestDispatcher("Liste.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
