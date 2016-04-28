package fr.iutvalence.info.dut.m2107;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHM extends JFrame
{
	/**
	 * width of IHM window
	 */
	private static int widthWindow = 1000;
	
	/**
	 * height of IHM window
	 */
	private static int heightWindow = 400;
	
	public IHM(){
		
		this.setTitle("Walkyries");
		this.setSize(widthWindow, heightWindow);
		/**
		 * window position, if null = window is center in the screen
		 */
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		/**
		 * pan is an object of JPanel
		 */
		JPanel pan = new JPanel();
		pan.setBackground(Color.BLACK);
		this.setContentPane(pan);
	}
}