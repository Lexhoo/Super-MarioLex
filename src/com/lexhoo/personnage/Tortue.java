package com.lexhoo.personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.lexhoo.objets.Objet;

public class Tortue extends Personnage implements Runnable{
	
	private Image imgTortue;
	private ImageIcon icoTortue;	
	private final int PAUSE = 15;
	private int dxTortue;
	
	//Constructeur
		public Tortue(int x, int y) {
			
			super(x, y, 43, 50);
			super.setVersDroite(true);
			super.setMarche(true);
			this.dxTortue = 1;
			
			this.icoTortue = new ImageIcon(getClass().getResource("/images/tortueArretGauche.png"));
			this.imgTortue = this.icoTortue.getImage();
			
			Thread chronoChamp = new Thread(this);
			chronoChamp.start();
		}
		
		public Image getImgTortue() {
			return imgTortue;
		}

		public void bouge() { //Deplacement Tortue
			if(super.isVersDroite() == true) {this.dxTortue = 1;}
			else {this.dxTortue = -1;}
			super.setX(super.getX() + this.dxTortue);
		}
		
		@Override
		public void run() {
			try{Thread.sleep(20);}
			catch(InterruptedException e) {}
			
			while(true) {
				if(this.vivant == true) {		
				this.bouge();
				try {Thread.sleep(PAUSE);}
				catch (InterruptedException e) {}
				}
			}		
	}
		public void contact(Objet objet) {
			if(super.contactAvant(objet) == true && this.isVersDroite() == true) {
				super.setVersDroite(false);
				this.dxTortue = -1;
			}else if(super.contactArriere(objet) == true & this.isVersDroite() == false) {
				super.setVersDroite(true);
				this.dxTortue = 1;
			}
	}
		public void contact (Personnage personnage) {
			//Contact horizontal
			if((super.contactAvant(personnage) == true && this.isVersDroite() == true)){
				super.setVersDroite(false);
				this.dxTortue = -1;
			}else if (super.contactArriere(personnage) == true && this.isVersDroite() == false){
				super.setVersDroite(true);;
				this.dxTortue = 1;
			}
		}	
		
		public Image meurt() {
			String str;
			ImageIcon ico;
			Image img;
			
			str = "/images/tortueFermee.png";
			ico = new ImageIcon(getClass().getResource(str));
			img = ico.getImage();
			return img;
		}
}
