package Dao;
import Model.*;

import java.sql.SQLException;
import java.util.*;

public interface IGestion {
	public List <Etudiant> getAllEtudiants() throws SQLException;
	public void addEtudiant(Etudiant p );
	public void deleteEtudiant(int num );
	public boolean verif (String user , String mp);
	
}
