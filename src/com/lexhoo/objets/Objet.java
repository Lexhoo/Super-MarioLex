package com.lexhoo.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.mathlexeu.jeu.Main;

public class Objet {
	
	private int largeur, hauteur;
	private int x, y;
	
	protected Image imgObjet;
	protected ImageIcon icoObjet;
	
	public Objet(int x, int y, int largeur, int hauteur) {
		
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	
	
	public Image getImgObjet() {
		return imgObjet;
	}



	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void deplacement() {
		
		if(Main.scene.getxPos() >= 0) {
			this.x = this.x - Main.scene.getDx();
		}
	}
}
