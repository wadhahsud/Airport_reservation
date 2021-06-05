package npj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class gestionVols {
	public billet[]tabb;
	public avion[]taba;
	public vol[]vols;
	public int nbb;
	public int nba;
	public int nbvol;
	
	public gestionVols(int lb, int la,int lvol) {
		
		this.tabb = new billet[lb];
		this.taba = new avion[la];
		this.vols= new vol[lvol];
		this.nbb=0;
		this.nba=0;
		this.nbvol=0;
	}
	
	// date System
	
	Date date = Calendar.getInstance().getTime(); 
	
	 SimpleDateFormat t = new SimpleDateFormat("HH:mm");
	 String DateSys = t.format(date); 
	
	                                     // ajout voyageurs
	 
	 public boolean ajoutvoyageur(client c)
		{
			
			for(int i=0;i<nbb;i++) {
				if ((c.getPrixmax()>tabb[i].prix)&&(c.getPrixmin()<tabb[i].prix)
						&&(c.getVilled()==tabb[i].villeD)&&(c.getVillea()==tabb[i].villeA)&&(tabb[i].reserve==false))
				{c.setCodeB(tabb[i].codeBillet);
				for(int j=0;j<nba;j++)
				{
					if(tabb[i].matriculeavion==taba[j].matricule)
					{
						taba[j].voyageurs[taba[j].nbv]=c;
						taba[j].nbv++;
					}
				}
			tabb[i].reserve=true;
				return true;
				
			}
			
			
		}
			return false;
			
			
		}
		 
	                                  // ajout billet
	   
	 public void ajoutbillet(billet b)
		{
			
			if(nbb<tabb.length)
			{
				tabb[nbb]=b;
				nbb++;
			}
			
		}
	 
	 
	                                  // ajout avion
	 
	public void ajoutavion(avion a)
		{
			
			if(nba<taba.length)
			{
				taba[nba]=a;
				nba++;
			}
			
		}
		
	 
	                                // ajout vol
	 
	public void ajoutvol(vol v)
	{
		if (nbvol<vols.length)
		{
			vols[nbvol]=v;
			nbvol++;
			for(int i=0;i<nbvol;i++)
			{
				vols[i].setMat(taba[i].matricule);
			}
		}
	}
	
	                          // Etat avion 
	public String Etat(vol v)
	{
		 	 
			 if(v.HoraireDepart.equals(DateSys))
			 {
			  for(int j=0;j<nbb;j++)
			  {
				  if (tabb[j].matriculeavion==v.mat)
				  {
					  v.EtatAvion="l'avion "+ v.mat +" va partir du "+tabb[j].villeD+" vers "+tabb[j].villeA ;
				  }
			  }
				 
			 }
			 else if(v.HoraireArrivee.equals(DateSys))
			 {
				 for(int j=0;j<nbb;j++)
				  {
					  if (tabb[j].matriculeavion==v.mat)
					  {
						  v.EtatAvion="l'avion "+ v.mat +" est arrivee du "+tabb[j].villeD+" à "+tabb[j].villeA;
					  }
				  }
			 }
			 else {v.EtatAvion="l'avion est en vol ";}
			 
			 return v.EtatAvion;
			 
			 
		 }
	
	                                          // annulation reservation
	
	public void annulationReservation(client c)
	{
		
		for(int i=0;i<nbb;i++)
		{
			if(tabb[i].codeBillet==c.getCodeB())
				
			tabb[i].reserve=false;
			for(int j=0;j<nba;j++)
			if (tabb[i].matriculeavion==taba[j].matricule)
			{
				for(int k=0;k<taba[j].nbv;k++)
				{
					if(taba[j].voyageurs[k].getCin()==c.getCin())
					{
						for(int l=k;l<taba[j].voyageurs.length;l++)
						{
							
						}
						
						taba[j].nbv--;
						System.out.println("Annulation terminé.Le nombre des voyageurs en cours de l'avion "+taba[j].matricule+
								" est "+taba[j].nbv);
					}
				}
			}
		}
		
	}
	
	
	
	
	public void InfosVoyageur(client c)
	{
		
		if(c.getCodeB()!="")
		{
			for(int i=0;i<nbb;i++)
			{
				if(c.getCodeB()==tabb[i].codeBillet)
				{
					System.out.println("                                                "
							+ "INFOS SUR VOYAGEURS \n \n");
					System.out.println("Infos sur le voyageurs "+c.ToString()+tabb[i].toString());
				}}
		}
		
		
	}
	
	          
	                                 //affiche des voyageurs
	public void affichevoyageurs()
	{
		
		for(int i=0;i<this.nba;i++)
		{
			System.out.println("                                      les voyageurs de l'avion \n"
		                       +"                                           "
					+taba[i].matricule+"\n");
			for(int j=0;j<taba[i].nbv;j++) {
				System.out.println("Voyageur "+(j+1)+" "+taba[i].voyageurs[j].toString());
				
				
			}
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -"
					+ " - - - - - - - - - - - - - - - - - - - \n");
		}
		
	}
	
	                             
	                                  //affiche des vols
	
	public void affichevol()
	{
		for(int i=0;i<nbvol;i++)
		{
			System.out.println(vols[i].toString());
		}
	}
	
	
	
}
	
	


