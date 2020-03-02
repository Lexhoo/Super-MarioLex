package com.mathlexeu.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.lexmer.audio.Audio;

public class Clavier implements KeyListener {

	//METHODE
	@Override
	public void keyPressed(KeyEvent e) {
		if(Main.scene.mario.isVivant() == true) {	
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			//Annule le decalage de 1 créé par déplacementFond (PanJeu)
			if(Main.scene.getxPos() == -1) {
				Main.scene.setxPos(0);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(750);
			}
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(true);
			Main.scene.setDx(1);
			
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			if(Main.scene.getxPos() == 4431) {
				Main.scene.setxPos(4430);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(750);
			}
			
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(false);
			Main.scene.setDx(-1);
		}
		//Mario saut
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			Main.scene.mario.setSaut(true);
			Audio.playSound("/audio/saut.wav");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0);}

	@Override
	public void keyTyped(KeyEvent e) {}

}
