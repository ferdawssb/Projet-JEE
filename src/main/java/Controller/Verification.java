package Controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.*;

import Dao.Gestiondb;
import Model.*;

/**
 * Servlet implementation class Verification
 */
public class Verification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Verification() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		try {
			Gestiondb gs = new Gestiondb();
			HttpSession session = request.getSession();
			String user = request.getParameter("user");
			String mp = request.getParameter("password");

			if (gs.verif(user, mp) == true) {
				Compte c = new Compte(user, mp);
				session.setAttribute("c", c);
				response.sendRedirect("Liste.jsp");

			} else {
				request.getRequestDispatcher("Authentification.jsp").forward(request, response);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
