package com.lexmo.affichage;

public class CompteARebours implements Runnable {

	//Variables
	private final int PAUSE = 1000;
	private int compteurTemps;
	private String str;
	
	//Constructeur
	public CompteARebours() {
		this.compteurTemps = 100;
		this.str = "Temps restant : 100";
		
		Thread compteARebours = new Thread(this);
		compteARebours.start();
	}
	
	
	
	public int getCompteurTemps() {
		return compteurTemps;
	}



	public String getStr() {
		return str;
	}


	//Methode
	@Override
	public void run() {
		while(true) {//Boucle infinie
			try{Thread.sleep(PAUSE);}
			catch (InterruptedException e) {}
			this.compteurTemps--;
			this.str = "Temps restant : " + this.compteurTemps;
		}
		
	}

}
