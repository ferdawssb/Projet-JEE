package Model;

public class Etudiant {

 private int num ;
 private String prenom ;
 private String nom ;
 private int tel ;
 
 
 
 public Etudiant(String prenom, String nom, int tel) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.tel = tel;
}


 
public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
 
  public Etudiant(int num, String prenom, String nom, int tel) {
	super();
	this.num = num;
	this.prenom = prenom;
	this.nom = nom;
	this.tel = tel;
}











public int getNum() {
	return num;
}



public void setNum(int num) {
	this.num = num;
}



public String getPrenom() {
	return prenom;
}



public void setPrenom(String prenom) {
	this.prenom = prenom;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public int getTel() {
	return tel;
}



public void setTel(int tel) {
	this.tel = tel;
}




 
 
 }



