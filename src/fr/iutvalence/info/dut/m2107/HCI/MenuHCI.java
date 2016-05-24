package fr.iutvalence.info.dut.m2107.HCI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.iutvalence.info.dut.m2107.Panel;
import fr.iutvalence.info.dut.m2107.HCI.button.GoToNextWindowButton;
import fr.iutvalence.info.dut.m2107.HCI.button.ExitButton;

/**
 * This class is HCI for menu when you start application, 
 * it allows to access the character creator and to exit application
 * @author MickaelPrades
 *
 */
public class MenuHCI extends JFrame implements ActionListener {

	/**
	 * row count for grid layout
	 */
	private static final int ROW_COUNT = 2;
	/**
	 * column count for grid layout
	 */
	private static final int COLUMN_COUNT = 1;
	
	/**
	 * width of HCI window
	 */
	private static int WINDOW_SIZE_X = 1000;
	
	/**
	 * height of HCI window
	 */
	private static int WINDOW_SIZE_Y = 800;
	
	public GoToNextWindowButton gameButton = new GoToNextWindowButton("Commencer une nouvelle partie");
	public ExitButton exitButton = new ExitButton("Quitter le jeu");
	
	public JPanel menu = new JPanel();
	
	private CharacterCreatorHCI window;
	
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
		
		this.setContentPane(menu);
		
		menu.setLayout(null);
		
		gameButton.setBounds(300, 150, 400, 150);
		exitButton.setBounds(325, 450, 350, 150);

		
		menu.add(gameButton);
		menu.add(exitButton);
		
		gameButton.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		//Allow to change window when we click on button
		this.dispose();
		window = new CharacterCreatorHCI();
	}
	
	
}
