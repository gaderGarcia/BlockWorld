package edu.block.world;

import edu.block.world.objects.Block;
import edu.block.world.objects.RobotArm;
import edu.block.world.objects.Table;

public class Ontology {

	public static void on(Block a, Block b) {
		b.setTop(a);
	}
	
	public static void onTable(Block x) {
		Table table = Table.getInstance();
		table.addBlock(x);
	}
	
	public static void clear(Block x) {
		x.setTop(null);
	}
	
	public static void holding(Block x) {
		RobotArm robot = RobotArm.getInstance();
		robot.holding(x);
	}
}

