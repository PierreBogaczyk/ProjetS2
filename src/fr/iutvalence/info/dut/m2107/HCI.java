package fr.iutvalence.info.dut.m2107;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HCI extends JFrame
{
	
	/**
	 * pan is an object of JPanel
	 */
	Panel pan = new Panel();
	
	/**
	 * width of HCI window
	 */
	private static int WIDTH_WINDOW = 1000;
	
	/**
	 * height of HCI window
	 */
	private static int HEIGHT_WINDOW = 800;
	
	public HCI(){
		
		this.setTitle("Walkyries");
		this.setSize(WIDTH_WINDOW, HEIGHT_WINDOW);
		/**
		 * window position, if null = window is center in the screen
		 */
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setAlwaysOnTop(false);
		

		pan.setBackground(Color.BLACK);
		this.setContentPane(pan);
		go();
	}
	
	private void go(){

	    for(int i = -50; i < pan.getWidth(); i++){

	      int x = pan.getPosX(), y = pan.getPosY();

	      x++;

	      y++;

	      pan.setPosX(x);

	      pan.setPosY(y);

	      pan.repaint();  

	      try {

	        Thread.sleep(5);

	      } catch (InterruptedException e) {

	        e.printStackTrace();

	      }

	    }

	  }     
	
}