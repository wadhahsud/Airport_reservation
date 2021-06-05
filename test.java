	package npj;
	
public abstract class test {

	public static void main(String[] args) {
		
				//ajout voyageurs 
				client c1= new client("tababi","mohamed",14323058,"tunis","paris",800,400,29192737);
				
				
			client c2= new client("yassine","benouirane",13506699,"Djerba","paris",400,50,20632249);
			
			client c3= new client("wadhah","nagui",13556201,"tunis","paris",800,400,50874120);
			
			client c4= new client("jihed","bedhief",10830281,"tunis","allemagne",1000,500,23556098);
			
			client c5= new client("maram","hamm",13565699,"tunis","paris",1000,500,20632249);
			
			client c6= new client("ala","bouziri",13488098,"Djerba","paris",1050,500,20632249);
			
			client c7= new client("jalila","benmed",10125569,"tunis","allemagne",1000,500,22587411);
			
			client c8= new client("yassine","bouziri",13125463,"tunis","allemagne",1000,500,54879632);
			
			client c9= new client("fedi","aounallah",10830281,"tunis","allemagne",1000,500,55256098);
			
			client c10= new client("fathi","loussif",13540879,"tunis","allemagne",1000,500,50412223);
				
				
                
				 
				//ajout billet
				
				billet b1= new billet("billet01",600,"AV100Tunisair","tunis","paris");
				
				billet b5= new billet("billet05",700,"AV100Tunisair","tunis","paris");
				
				billet b6= new billet("billet06",600,"AV100Tunisair","tunis","paris");
				
				billet b2= new billet("billet02",100,"AV100Tunisair","Djerba","paris");
				
				billet b3= new billet("billet03",600,"AV101Transavia","tunis","allemagne");
				
				billet b4= new billet("billet04",1000,"AV102MasterAir","Djerba","paris");
				
				billet b7= new billet("billet07",700,"AV101Transavia","tunis","allemagne");
				
				billet b8= new billet("billet08",800,"AV101Transavia","tunis","allemagne");
				
				billet b9= new billet("billet09",900,"AV101Transavia","tunis","allemagne");
				
				billet b10= new billet("billet10",750,"AV101Transavia","tunis","allemagne");
				
			
				//ajout avion
				
				avion a1= new avion("AV100Tunisair",15);
				
				avion a2= new avion("AV101Transavia",15);
				
				avion a3= new avion("AV102MasterAir",15);
				
				//ajout vol
				
				vol v1=new vol("vol1","01/11/2021","08:00","12:59","2h5m");
				
				vol v2=new vol("vol2","01/11/2021","9:59","13:55","3h");
				
				vol v3=new vol("vol3","01/13/2021","06:30","01:59","2h45m");
				
				gestionVols r1= new gestionVols(10,10,10);
				
				
				
				r1.ajoutavion(a1);
				r1.ajoutavion(a2);
				r1.ajoutavion(a3);
				
				r1.ajoutbillet(b1);
				r1.ajoutbillet(b2);
				r1.ajoutbillet(b3);
				r1.ajoutbillet(b4);
				r1.ajoutbillet(b5);
				r1.ajoutbillet(b6);
				r1.ajoutbillet(b7);
				r1.ajoutbillet(b8);
				r1.ajoutbillet(b9);
				r1.ajoutbillet(b10);
				
				r1.ajoutvoyageur(c1);
				r1.ajoutvoyageur(c2);
				r1.ajoutvoyageur(c3);
				r1.ajoutvoyageur(c4);
				r1.ajoutvoyageur(c5);
				r1.ajoutvoyageur(c6);
				r1.ajoutvoyageur(c7);
				r1.ajoutvoyageur(c8);
				r1.ajoutvoyageur(c9);
				r1.ajoutvoyageur(c10);
				
				r1.ajoutvol(v1);
				r1.ajoutvol(v2);
				r1.ajoutvol(v3);
				
				r1.affichevoyageurs();
				r1.Etat(v1);
				r1.Etat(v2);
				r1.Etat(v3);
				
				System.out.println("                                                "
						+ "GESTION DES VOLS \n");
				
				System.out.println("current time  |"+r1.DateSys+"| \n ");
				
				r1.affichevol();
				
				r1.InfosVoyageur(c1);
				
				
				
			   
				
				
				
				
		
		
		
	}
	}


