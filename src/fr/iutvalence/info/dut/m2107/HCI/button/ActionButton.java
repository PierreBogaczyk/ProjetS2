package fr.iutvalence.info.dut.m2107.HCI.button;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.iutvalence.info.dut.m2107.HCI.HCI;

public class ActionButton extends JButton implements MouseListener
{
	private String name;
	
	public HCI window;
	
	private JPanel p = new JPanel();
	private JLabel label = new JLabel("yey");
	
	public ActionButton(String str)
	{
		super(str);
		this.name = str;
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		this.window.listPart.add(this.p);
		/*GridLayout gridActionMenu = new GridLayout(2,2);
		p.setLayout(gridActionMenu);*/
		
		this.p.add(label);
		//TODO r�gler le probl�me avec l'affichage du label (ne s'affiche pas) pour y mettre un bouton
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
