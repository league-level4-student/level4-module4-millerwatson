package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{

	RedMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}

