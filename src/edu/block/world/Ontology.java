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
	
	//methods to verify
	public static boolean isClear(Block x){
		return x.isClear();
	} 
	
	public static boolean isHolding(Block x) {
		RobotArm robot = RobotArm.getInstance();
		if(robot.isArmEmpty())
			return false;
		Block hold = robot.getHold();
		
		if(hold.equals(x))
			return true;
		return false;
	}
	
	public static boolean isOn(Block a, Block b){
		Block top = b.getTop();
		if(top!= null && top.equals(a))
			return true;
		return false;
	}
	
	public static boolean isOnTable(Block x) {
		Table table = Table.getInstance();
		if(table.getBlocks().indexOf(x) != -1)
			return true;
		return false;
	}
}

