package Dao;

import java.sql.*;
import java.util.*;
import Model.Etudiant;

public class Gestiondb implements IGestion {

	Connection cnx;

	public Gestiondb() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/comptedb", "root", "root");

		} catch (Exception e) {

			System.out.println(e);
			e.printStackTrace();
		}

	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		List<Etudiant> le = new ArrayList<Etudiant>();
		try {

			String req = "select * from etudiant";
			PreparedStatement ps = cnx.prepareStatement(req);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				Etudiant e = new Etudiant(res.getInt(1), res.getString(2), res.getString(3),
						Integer.parseInt(res.getString(4)));
				le.add(e);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return le;
	}

	@Override
	public void addEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		try {
			String req = "insert into etudiant values(?,?,?,?)";
			PreparedStatement ps = cnx.prepareStatement(req);
			ps.setInt(1, e.getNum());
			ps.setString(2, e.getPrenom());
			ps.setString(3, e.getNom());
			ps.setInt(4, e.getTel());
			ps.executeUpdate();

		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}

	}

	@Override
	public void deleteEtudiant(int num) {
		// TODO Auto-generated method stub
		try {
			String req = "delete from etudiant where num = ?";
			PreparedStatement ps = cnx.prepareStatement(req);
			ps.setInt(1, num);
			ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception

		}

	}

	@Override
	public boolean verif(String user, String mp) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			String req = "select * from compte where user=? and mp=?";
			PreparedStatement ps = cnx.prepareStatement(req);
			ps.setString(1, user);
			ps.setString(2, mp);
			ResultSet res = ps.executeQuery();
			if (res.next()) {

				i++;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		if (i != 0) {
			return true;
		}
		return false;

	}

}
