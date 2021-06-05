package npj;

public class client extends personne {

	
	private String villed ;
	private String villea ;
	private double prixmax ;
	private double prixmin ;
	private String codeB;
	
	public client(String nom, String prenom, int cin, String villed, String villea, double prixmax, double prixmin,
			int numtel) {
		
		super(nom,prenom,cin,numtel);
		this.villed = villed;
		this.villea = villea;
		this.prixmax = prixmax;
		this.prixmin = prixmin;
		this.codeB="";
	}

	

	public String getVilled() {
		return villed;
	}

	public String getVillea() {
		return villea;
	}

	public double getPrixmax() {
		return prixmax;
	}

	public double getPrixmin() {
		return prixmin;
	}

	
	public String getCodeB() {
		return this.codeB;
	}
	
	

	public void setCodeB(String codeB) {
		this.codeB = codeB;
	}



	public String toString() {
		return super.toString()+"                  ville départ : " + villed + ", ville arrivée : " + villea +
				" code billet : "+codeB+"  | "+" \n ";
	}

	public String ToString() {
		return super.toString();
	}
	
	
	
	
	
}
