package fr.iutvalence.info.dut.m2107.HCI.button;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ExitButton extends JButton implements MouseListener
{
	private String name;
	
	public ExitButton(String str)
	{
		super(str);
		this.name = str;
	    this.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent event)
	{
		int response = JOptionPane.showConfirmDialog(null, "Voulez-vous fermer l'application?", "Quitter l'application?",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(response == JOptionPane.YES_NO_OPTION)
		{
			System.exit(0);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}
