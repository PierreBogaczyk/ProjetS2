package fr.iutvalence.info.dut.m2107.HCI.button;

import java.awt.Image;
import javax.swing.JButton;

public class InventoryButton extends JButton
{
	private String name;
	
	public InventoryButton(String str)
	{
		super(str);
		this.name = str;
	}
}
