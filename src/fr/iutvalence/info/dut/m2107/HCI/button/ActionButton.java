package fr.iutvalence.info.dut.m2107.HCI.button;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.iutvalence.info.dut.m2107.HCI.GameHCI;

public class ActionButton extends JButton implements ActionListener
{
	private String name;
	
	public GameHCI window;
	
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
		//TODO régler le problème avec l'affichage du label (ne s'affiche pas) pour y mettre un bouton
	}


}
