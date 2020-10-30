package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> polies = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 polies.add(new BluePolymorph(50,50));
   	 polies.add(new RedMorph(50, 100));
   	 polies.add(new MovingMorph(50, 150));
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (int i = 0; i < polies.size(); i++) {
		polies.get(i).draw(g);
	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     System.out.println("tester!!!!!1!!!11!1");
   	 repaint();
   	 for (int j = 0; j < polies.size(); j++) {
   		polies.get(j).update();
	 }
   	 
    }
}
