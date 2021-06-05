package npj;

public class billet {
	public double prix ;
	public String matriculeavion ;
	public String villeA ;
	public String villeD ;
	public String codeBillet;
	public boolean reserve;
	
	public billet(String codeBillet ,double prix, String matriculeavion, String villeD, String villeA) {
		
		this.prix = prix;
		this.matriculeavion = matriculeavion;
		this.villeA = villeA;
		this.villeD = villeD;
		this.codeBillet=codeBillet;
		this.reserve = false;
	}

	@Override
	public String toString() {
		return "code du billet : " + codeBillet +" prix de billet : " + prix + " , matricule d'avion : " + matriculeavion + ", ville d'arrivee  :" + villeA + ", ville de départ : "
				+ villeD +  ", reserve effectue ? " + reserve ;
	}

	
	
	
	
	
	
	
	

}
