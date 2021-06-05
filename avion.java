package npj;

public class avion {
	public client[]voyageurs;
	public String matricule ;
	public int nbpmax ;
	public int nbv;
	
	public avion(String matricule, int nbpmax) {
		
		this.voyageurs = new client[nbpmax];
		this.matricule = matricule;
		this.nbpmax = nbpmax;
		this.nbv = 0;
	}
	 
	


	
}
