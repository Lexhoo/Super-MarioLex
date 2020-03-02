package com.mathlexeu.jeu;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		
		//Cr�ation de la fen�tre d'application
		JFrame fenetre = new JFrame("Jeu style Mario");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(700, 360);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
		//Instancer l'objet scene
		scene = new Scene();
		
		fenetre.setContentPane(scene); //On associe la scene � la fenetre d'application
		fenetre.setVisible(true);
	}

}
