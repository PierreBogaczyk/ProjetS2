package fr.iutvalence.info.dut.m2107.HCI;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
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

import fr.iutvalence.info.dut.m2107.Character;
import fr.iutvalence.info.dut.m2107.Job;
import fr.iutvalence.info.dut.m2107.Panel;
import fr.iutvalence.info.dut.m2107.HCI.button.ExitButton;
import fr.iutvalence.info.dut.m2107.HCI.button.GoToNextWindowButton;

/**
 * This class is HCI for character creator, it allows to write/choose informations and 
 * to access the game.
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
	/**
	 * mainContainer is the panel allows to regroup many others.
	 */
	private JPanel mainContainer = new JPanel();
	/**
	 * 
	 */
	private JPanel container = new JPanel();
	/**
	 * imageContainer is the panel for images
	 */
	private JPanel imageContainer = new JPanel();
	/**
	 * buttonRadioContainer is the panel with aim to regroup radio buttons (see further)
	 */
	private JPanel buttonRadioContainer = new JPanel();
	/**
	 * validationButtonContainer is the panel for the validation button (allows to go into the game)
	 */
	private JPanel validationButtonContainer = new JPanel();
	
	/**
	 * This JTextField is the text field for write the name of the character.
	 */
	private JTextField characterName = new JTextField("Insérer le nom du personnage");
	/**
	 * label is the label before the text field
	 */
	private JLabel label = new JLabel("Nom du personnage");
	
	/**
	 * buttonClassOne is the first JRadioButton. This button corresponds with Warrior.
	 * This is the default choice if user doesn't click on radio buttons..
	 */
    private JRadioButton buttonClassOne = new JRadioButton("Warrior");
    /**
     * buttonClassTwo is the second JRadioButton. This button corresponds with Wizard.
     */
    private JRadioButton buttonClassTwo = new JRadioButton("Wizard");
    /**
     * buttonClassThree is the third JRadioButton. This button corresponds with Rogue.
     */
    private JRadioButton buttonClassThree = new JRadioButton("Rogue");
	
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
	/**
	 * This button allows to go to the next window and returns informations.
	 */
	public GoToNextWindowButton validationButton = new GoToNextWindowButton("Valider le personnage!");
	/**
	 * window is the next window.
	 */
	private GameHCI window;
	
	/**
	 * Creator of CharacterCreatorHCI. This window displays many informations : the name of the character,
	 * the job of the character and the validation button to go into the game.
	 */
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
		
		mainContainer.setLayout(new GridLayout(4,1));
		
		//Name's part
		container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());

	    Panel top = new Panel();
	    Font police = new Font("Arial", Font.BOLD, 14);

	    characterName.setFont(police);
	    characterName.setPreferredSize(new Dimension(150, 30));
	    characterName.setForeground(Color.PINK);

	    top.add(label);
	    top.add(characterName);

	    container.add(top, BorderLayout.NORTH);
	    this.setContentPane(container);
	    
	    //Radio button's part
	    
	    Panel panTop = new Panel();
	    

	    panTop.add(buttonClassOne);
	    panTop.add(buttonClassTwo);
	    panTop.add(buttonClassThree);
	    
	    buttonRadioContainer.add(panTop);
	    this.setContentPane(buttonRadioContainer);
	    
	    //ImageIcon warriorImage = new ImageIcon("img/Warrior.png");
	    //ImageIcon rogueImage = new ImageIcon("img/Rogue.png");
	    //ImageIcon wizardImage = new ImageIcon("img/Wizard.png");
	    
	    buttonGroup.add(buttonClassOne);
	    buttonGroup.add(buttonClassTwo);
	    buttonGroup.add(buttonClassThree);
	    //La méthode isSelected() permet de savoir si le bouton radio est sélectionné ou non
	    
	    /*JLabel image;
		if(buttonClassOne.isSelected())
		{
			image = new JLabel(new ImageIcon("/img/Warrior.png"));
		}else{
			if(buttonClassTwo.isSelected())
			{
				image = new JLabel(new ImageIcon("/img/Wizard.png"));
			}else{
				image = new JLabel(new ImageIcon("/img/Rogue.png"));
			}
		}

		imageContainer.add(image);
		imageContainer.setBackground(Color.BLACK);
		*/
	    mainContainer.add(container);
	    mainContainer.add(buttonRadioContainer);
	    //mainContainer.add(imageContainer);
	    mainContainer.add(validationButton);
	    this.setContentPane(mainContainer);
	    
	    
	    /*
	     * Attempt to add listener on radio button to put picture when buttons are checked
	    buttonClassOne.addActionListener(new ActionListener()
		{
	    	@Override
			public void actionPerformed(ActionEvent e){
				JLabel image = new JLabel(new ImageIcon("/img/Warrior.png"));
				imageContainer.add(image);
				mainContainer.add(imageContainer);
				}
		});
	    
	    buttonClassTwo.addActionListener(new ActionListener()
		{
	    	@Override
			public void actionPerformed(ActionEvent e){
				JLabel image = new JLabel(new ImageIcon("/img/Wizard.png"));
				imageContainer.add(image);
				mainContainer.add(imageContainer);
				}
		});
	    
		buttonClassOne.addActionListener(new ActionListener()
		{
	    	@Override
			public void actionPerformed(ActionEvent e){
				JLabel image = new JLabel(new ImageIcon("/img/Rogue.png"));
				imageContainer.add(image);
				mainContainer.add(imageContainer);
				}
		});
		*/
		
		
	    validationButton.addActionListener(this);
		this.setVisible(true);
	}
	
	/**
	 * This method allows to get the job of the character from radio buttons.
	 * @return the name of the chosen job (it is a string).
	 */
	public String getJob(){

        if (buttonClassOne.isSelected())
            return (buttonClassOne.getText());
        else if (buttonClassTwo.isSelected())
            return (buttonClassTwo.getText());
        else if (buttonClassThree.isSelected())
        	return (buttonClassThree.getText());
        else
        	return (buttonClassOne.getText()); 

      }
	
	/**
	 * This method allows to return the name of the character and his job.
	 * Furthermore it allows to display the next window (GameHCI) with parameters.
	 */
	public void actionPerformed(ActionEvent arg0)
	{
		System.out.println(characterName.getText() + getJob());
		
		this.dispose();
		window = new GameHCI(new Character(characterName.getText(),new Job(getJob())));
	}
	
	
}
