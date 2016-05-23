package fr.iutvalence.info.dut.m2107.HCI;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import fr.iutvalence.info.dut.m2107.Panel;
import fr.iutvalence.info.dut.m2107.HCI.button.ActionButton;
import fr.iutvalence.info.dut.m2107.HCI.button.InventoryButton;
import fr.iutvalence.info.dut.m2107.HCI.button.ExitButton;
import fr.iutvalence.info.dut.m2107.HCI.button.MoveButton;

/**
 * This class is the main class for HCI, this class allow to configure window display
 * @author MickaelPrades
 *
 */
public class GameHCI extends JFrame
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
	
	public ActionButton actionButton = new ActionButton("Action");
	public MoveButton moveButton = new MoveButton("Déplacement");
	public InventoryButton inventoryButton = new InventoryButton("Inventaire");
	public ExitButton menuButton = new ExitButton("Sortir du jeu");
	
	public JPanel actionMenu = new JPanel();
	public JPanel listPart = new JPanel();
	public JPanel displayComponent = new JPanel();

	public GameHCI(){
		
		 
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
		this.actionMenu.setBackground(Color.BLUE);
		
		//display part for action menu
		this.listPart.setBackground(Color.CYAN);
		
		//menuComponent is the part for menu 
		JSplitPane menuComponent = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, actionMenu, listPart);
		menuComponent.setDividerLocation(200);
		menuComponent.setEnabled(false);
		menuComponent.setDividerSize(1);
		
		//displayComponent is the picture part
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, displayComponent , menuComponent);
		splitPane.setDividerLocation(550);
		splitPane.setEnabled(false);
		splitPane.setDividerSize(1);

		this.setContentPane(splitPane);
		
		GridLayout grid = new GridLayout(ROW_COUNT,COLUMN_COUNT);
		actionMenu.setLayout(grid);
		

		actionMenu.add(actionButton);
		actionMenu.add(moveButton);
		actionMenu.add(inventoryButton);
		actionMenu.add(menuButton);
		

		/**
		 * Allow to display the window
		 */
		this.setVisible(true);
	}
	
}