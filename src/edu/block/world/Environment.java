package edu.block.world;

import edu.block.world.objects.Block;
import edu.block.world.objects.RobotArm;
import edu.block.world.objects.Table;

public class Environment {
	
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
