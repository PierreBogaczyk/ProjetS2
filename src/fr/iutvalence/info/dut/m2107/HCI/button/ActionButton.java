package fr.iutvalence.info.dut.m2107.HCI.button;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import fr.iutvalence.info.dut.m2107.HCI.GameHCI;

public class ActionButton extends JButton implements MouseListener
{
	private String name;
	
	public GameHCI window;
	
	private JPanel p = new JPanel();
	private JLabel label = new JLabel("yey");

	public ActionButton(String str,GameHCI window)
	{
		super(str);
		this.name = str;
		this.window = window;
		
		this.addMouseListener(this);
	}

	
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		//this.p.add(this.label);
		//this.skill1 = new SkillButton(window.getCharacter().getCharacterJob().getJobSkillList().get(0));
		//this.skill2 = new SkillButton(window.getCharacter().getCharacterJob().getJobSkillList().get(1));
		//this.skill3 = new SkillButton(window.getCharacter().getCharacterJob().getJobSkillList().get(2));
		this.window.addSkillButton();
		this.window.moveMenu.add(this.window.getExitButton());
		//TODO régler le problème avec l'affichage du label (ne s'affiche pas) pour y mettre un bouton
	}



	@Override
    public void mouseEntered(MouseEvent arg0)
    {
	    // TODO Auto-generated method stub
	    
    }



	@Override
    public void mouseExited(MouseEvent arg0)
    {
	    // TODO Auto-generated method stub
	    
    }



	@Override
    public void mousePressed(MouseEvent arg0)
    {
	    // TODO Auto-generated method stub
	    
    }



	@Override
    public void mouseReleased(MouseEvent arg0)
    {
	    // TODO Auto-generated method stub
	    
    }


}
