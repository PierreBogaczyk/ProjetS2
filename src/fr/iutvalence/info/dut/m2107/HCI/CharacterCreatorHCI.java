package fr.iutvalence.info.dut.m2107.HCI;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.iutvalence.info.dut.m2107.Panel;
import fr.iutvalence.info.dut.m2107.HCI.button.ExitButton;
import fr.iutvalence.info.dut.m2107.HCI.button.GoToNextWindowButton;

/**
 * This class is HCI for character creator, it allows to write/choose informations and 
 * to access the game
 * @author MickaelPrades
 *
 */
public class CharacterCreatorHCI extends JFrame implements ActionListener
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
	private JPanel mainContainer = new JPanel();
	private JPanel container = new JPanel();
	private JPanel buttonRadioContainer = new JPanel();
	private JPanel validationButtonContainer = new JPanel();
	private JTextField jtf = new JTextField("Insérer le nom du personnage");
	private JLabel label = new JLabel("Nom du personnage");
	/**
	 * width of HCI window
	 */
	private static int WINDOW_SIZE_X = 1000;
	
	/**
	 * height of HCI window
	 */
	private static int WINDOW_SIZE_Y = 800;
	
	/**
	 * group of radio buttons
	 */
	private ButtonGroup buttonGroup = new ButtonGroup();
	
	public GoToNextWindowButton validationButton = new GoToNextWindowButton("Valider le personnage!");

	private GameHCI window;
	
	public CharacterCreatorHCI(){
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
		
		mainContainer.setLayout(new GridLayout(3,1));
		
		//Name's part
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
	    
	    //Radio button's part
	    
	    Panel panTop = new Panel();
	    
	    JRadioButton buttonClassOne = new JRadioButton("Première classe");
	    JRadioButton buttonClassTwo = new JRadioButton("Deuxième classe");
	    JRadioButton buttonClassThree = new JRadioButton("Troisième classe");
	    panTop.add(buttonClassOne);
	    panTop.add(buttonClassTwo);
	    panTop.add(buttonClassThree);
	    
	    buttonRadioContainer.add(panTop);
	    this.setContentPane(buttonRadioContainer);
	    
	    buttonGroup.add(buttonClassOne);
	    buttonGroup.add(buttonClassTwo);
	    buttonGroup.add(buttonClassThree);
	    //La méthode isSelected() permet de savoir si le bouton radio est sélectionné ou non
	    

	    mainContainer.add(container);
	    mainContainer.add(buttonRadioContainer);
	    mainContainer.add(validationButton);
	    this.setContentPane(mainContainer);
	    
	    
	    validationButton.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		this.dispose();
		window = new GameHCI();
	}
	
}
