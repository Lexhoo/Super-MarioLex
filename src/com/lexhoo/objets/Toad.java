package com.lexhoo.objets;

import javax.swing.ImageIcon;

public class Toad extends Objet{

public Toad(int x, int y) {
		
		super(x, y, 600, 230);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/toad.png"));
		super.imgObjet = this.icoObjet.getImage();
}
}
