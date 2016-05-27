package fr.iutvalence.info.dut.m2107.HCI;

import fr.iutvalence.info.dut.m2107.Character;
import fr.iutvalence.info.dut.m2107.Job;


public class TestHCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character character = new Character("Francis", new Job("Warrior"));
		GameHCI window = new GameHCI(character);
	}

}
