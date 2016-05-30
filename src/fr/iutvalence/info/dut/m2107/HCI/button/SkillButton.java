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

import fr.iutvalence.info.dut.m2107.action.Skill;

public class SkillButton extends JButton implements MouseListener
{
	private String name;
	
	public SkillButton(Skill skill)
	{
		super(skill.getSkillName());
		this.name = skill.getSkillName();
	}

	@Override
    public void mouseClicked(MouseEvent arg0)
    {
	    // TODO Auto-generated method stub
	    
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
