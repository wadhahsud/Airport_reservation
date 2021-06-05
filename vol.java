package npj;

public class vol {
	
	public String numvol;
	public String date;
	public String HoraireDepart;
	public String HoraireArrivee;
	public String duree;
	public String mat;
	public String EtatAvion;
	
	
	public vol(String numvol,String date, String horaireDepart, String horaireArrivee,
			String duree) {
		this.numvol = numvol;
		this.date = date;
		HoraireDepart = horaireDepart;
		HoraireArrivee = horaireArrivee;
		this.duree = duree;
		this.mat ="";
		this.EtatAvion="";
		
	}


	
	
	
	public void setEtatAvion(String etatAvion) {
		EtatAvion = etatAvion;
	}





	public void setMat(String mat) {
		this.mat = mat;
	}





	public void setHoraireDepart(String horaireDepart) {
		HoraireDepart = horaireDepart;
	}




	public void setDuree(String duree) {
		this.duree = duree;
	}





	
	public String toString() {
		return " Infos sur "+numvol + "  date du vol : le " + date + " , horaire depart :" + HoraireDepart + 
				" , horaire arrivee : "+ HoraireArrivee + " , duree du vol " + duree +"  \n "+
				"                matricule de l'avion " + mat + " , état de l'avion : " + EtatAvion +" \n ";
	}




	
	
	
	
	
	

}
