package fr.iutvalence.info.dut.m2107.HCI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;

import fr.iutvalence.info.dut.m2107.Panel;
import fr.iutvalence.info.dut.m2107.HCI.button.CreateNewGameButton;
import fr.iutvalence.info.dut.m2107.HCI.button.ExitButton;

/**
 * This class is HCI for character creator, it allows to write/choose informations and 
 * to access the game
 * @author MickaelPrades
 *
 */
public class CharacterCreatorHCI extends JFrame
{
	/**
	 * row count for grid layout
	 */
	private static final int ROW_COUNT = 4;
	/**
	 * column count for grid layout
	 */
	private static final int COLUMN_COUNT = 1;

	/**
	 * pan is an object of Panel
	 */
	public Panel pan = new Panel();
	private JPanel container = new JPanel();
	private JTextField jtf = new JTextField("Francis");
	private JLabel label = new JLabel("Nom du personnage");
	/**
	 * width of HCI window
	 */
	private static int WINDOW_SIZE_X = 1000;
	
	/**
	 * height of HCI window
	 */
	private static int WINDOW_SIZE_Y = 800;
	
	public CreateNewGameButton newGameButton = new CreateNewGameButton("Commencer une nouvelle partie");
	public ExitButton exitButton = new ExitButton("Quitter l'application");
	
	public CharacterCreatorHCI() {
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
		
		container.setBackground(Color.white);

	    container.setLayout(new BorderLayout());

	    Panel top = new Panel();

	    Font police = new Font("Arial", Font.BOLD, 14);

	    jtf.setFont(police);

	    jtf.setPreferredSize(new Dimension(150, 30));

	    jtf.setForeground(Color.PINK);

	    top.add(label);

	    top.add(jtf);

	    container.add(top, BorderLayout.NORTH);

	    this.setContentPane(container);
		this.setVisible(true);
	}
	
}
