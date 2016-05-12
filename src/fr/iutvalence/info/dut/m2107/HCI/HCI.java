package fr.iutvalence.info.dut.m2107.HCI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javafx.scene.input.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import fr.iutvalence.info.dut.m2107.Panel;

/**
 * This class is the main class for HCI, this class allow to configure window display
 * @author MickaelPrades
 *
 */
public class HCI extends JFrame
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
	
	/**
	 * width of HCI window
	 */
	private static int WINDOW_SIZE_X = 1000;
	
	/**
	 * height of HCI window
	 */
	private static int WINDOW_SIZE_Y = 800;
	
	public JButton actionButton;
	public JButton moveButton;
	public JButton inventoryButton;
	public JButton menuButton;
	
	public HCI(){
		
		 
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
		
		//choose your action in the action menu
		JPanel actionMenu = new JPanel();
		actionMenu.setBackground(Color.BLUE);
		
		//display part for action menu
		JPanel listPart = new JPanel();
		listPart.setBackground(Color.CYAN);
		
		//menuComponent is the part for menu 
		JSplitPane menuComponent = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, actionMenu, listPart);
		menuComponent.setDividerLocation(200);
		menuComponent.setEnabled(false);
		menuComponent.setDividerSize(1);
		
		//displayComponent is the picture part
		JPanel displayComponent = new JPanel();
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, displayComponent , menuComponent);
		splitPane.setDividerLocation(550);
		splitPane.setEnabled(false);
		splitPane.setDividerSize(1);

		this.setContentPane(splitPane);
		
		GridLayout grid = new GridLayout(ROW_COUNT,COLUMN_COUNT);
		actionMenu.setLayout(grid);
		
		this.actionButton = new JButton("Action");
		this.moveButton = new JButton("Déplacement");
		this.inventoryButton = new JButton("Inventaire");
		this.menuButton = new JButton("Menu");
		actionMenu.add(actionButton);
		actionMenu.add(moveButton);
		actionMenu.add(inventoryButton);
		actionMenu.add(menuButton);
		
//		this.getContentPane().add(content);
		//go();
		//while(true) {
		//	update();
		//}
		
		/**
		 * Allow to display the window
		 */
		this.setVisible(true);
	}
	
	private void update() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int myint = keyboard.nextInt();
	}	
	
}