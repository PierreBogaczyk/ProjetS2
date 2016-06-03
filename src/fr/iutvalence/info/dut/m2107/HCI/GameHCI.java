package fr.iutvalence.info.dut.m2107.HCI;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import fr.iutvalence.info.dut.m2107.Panel;
import fr.iutvalence.info.dut.m2107.Character;
import fr.iutvalence.info.dut.m2107.Job;
import fr.iutvalence.info.dut.m2107.HCI.button.ActionButton;
import fr.iutvalence.info.dut.m2107.HCI.button.InventoryButton;
import fr.iutvalence.info.dut.m2107.HCI.button.ExitButton;
import fr.iutvalence.info.dut.m2107.HCI.button.MoveButton;
import fr.iutvalence.info.dut.m2107.HCI.button.SkillButton;

/**
 * This class is the main class for HCI, this class allow to configure window display
 * @author MickaelPrades
 *
 */
public class GameHCI extends JFrame
{
	private Character character;
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
	
	/**
	 * Panel for the action menu
	 */
	public JPanel actionMenu = new JPanel();
	/**
	 * Panel for the move menu
	 */
	public JPanel moveMenu = new JPanel();
	/**
	 * Panel for the list part
	 */
	public JPanel listPart = new JPanel();
	/**
	 * Panel for the display component
	 */
	public JPanel displayComponent = new JPanel();
	
	public ActionButton actionButton = new ActionButton("Action",this);
	public MoveButton moveButton = new MoveButton("Déplacement");
	public InventoryButton inventoryButton = new InventoryButton("Inventaire");
	public ExitButton menuButton = new ExitButton("Sortir du jeu");
	public SkillButton skill1;
	public SkillButton skill2;
	public SkillButton skill3;
	public GameHCI(Character character){
		
		 this.character = character;
		 // Set window title
		this.setTitle("Walkyries");
		this.skill1 = new SkillButton(this.character.getCharacterJob().getJobSkillList().get(0));
		this.skill2 = new SkillButton(this.character.getCharacterJob().getJobSkillList().get(1));
		this.skill3 = new SkillButton(this.character.getCharacterJob().getJobSkillList().get(2));
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
		this.moveMenu.setBackground(Color.CYAN);
		
		//menuComponent is the part for menu 
		JSplitPane menuComponent = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, actionMenu, moveMenu);
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
		GridLayout grid2 = new GridLayout(ROW_COUNT,COLUMN_COUNT);
		moveMenu.setLayout(grid2);
		actionMenu.add(this.actionButton);
		actionMenu.add(this.moveButton);
		actionMenu.add(this.inventoryButton);
		actionMenu.add(this.menuButton);
		//actionMenu.add(this.skill1);
		//actionMenu.add(this.skill2);
		//actionMenu.add(this.skill3);
		
		/**
		 * Allow to display the window
		 */
		this.setVisible(true);
	}
	public Character getCharacter()
	{
		return this.character;
	}
	public ExitButton getExitButton()
	{
		return this.menuButton;
	}
	
	public void addSkillButton()
	{
		this.moveMenu.add(this.skill1);
		this.moveMenu.add(this.skill2);
		this.moveMenu.add(this.skill3);
	}
}