package fr.iutvalence.info.dut.m2107.HCI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.iutvalence.info.dut.m2107.Panel;
import fr.iutvalence.info.dut.m2107.HCI.button.CreateNewGameButton;
import fr.iutvalence.info.dut.m2107.HCI.button.ExitButton;

public class MenuHCI extends JFrame {

	/**
	 * row count for grid layout
	 */
	private static final int ROW_COUNT = 2;
	/**
	 * column count for grid layout
	 */
	private static final int COLUMN_COUNT = 1;
	
	/**
	 * pan is an object of Panel
	 */
	public Panel pan = new Panel();
	
	/**
	 * width of HCI window
	 */
	private static int WINDOW_SIZE_X = 1000;
	
	/**
	 * height of HCI window
	 */
	private static int WINDOW_SIZE_Y = 800;
	
	public CreateNewGameButton gameButton = new CreateNewGameButton("Commencer une nouvelle partie");
	public ExitButton exitButton = new ExitButton("Quitter le jeu");
	
	public JPanel menu = new JPanel();
	
	public MenuHCI() {
		 // Set window title
		this.setTitle("Walkyries");
		
		//Set window size, width and height
		this.setSize(WINDOW_SIZE_X, WINDOW_SIZE_Y);
		
		 //window position, if null = window is center in the screen
		this.setLocationRelativeTo(null);
		
		 // Set action to close the window and process when we click on the red cross
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//If true : the window could be resizable, if false : not resizable 
		this.setResizable(false);
		
		//If true : the window is always on top, all applications could be hide because of this method
		this.setAlwaysOnTop(false);
		
		this.menu.setBackground(Color.WHITE);
		
		this.setContentPane(pan);
		
		GridLayout grid = new GridLayout(ROW_COUNT, COLUMN_COUNT);
		menu.setLayout(grid);
		
		menu.add(gameButton);
		menu.add(exitButton);
		
		
		this.setVisible(true);
	}
	
}
