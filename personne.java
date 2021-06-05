package npj;

public class personne {
	
	private String nom ;
	private String prenom ;
	private int cin ;
	private int numtel ;
	
	public personne(String nom, String prenom, int cin, int numtel) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.numtel = numtel;
	}
	
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getCin() {
		return cin;
	}
	
	public int getNumtel() {
		return numtel;
	}


	@Override
	public String toString() {
		return " nom : " + nom + ", prenom : " + prenom + ", cin : " + cin + ", numtel : " + numtel+" ,\n ";
	}
	
	

}
