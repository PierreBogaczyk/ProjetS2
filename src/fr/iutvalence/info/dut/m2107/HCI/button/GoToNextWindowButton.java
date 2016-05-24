package fr.iutvalence.info.dut.m2107.HCI.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/**
 * It is a class for change window with a button
 * @author MickaelPrades
 *
 */
public class GoToNextWindowButton extends JButton implements MouseListener
{
	private String name;
	
	public GoToNextWindowButton(String str)
	{
		super(str);
		this.name = str;
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
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
