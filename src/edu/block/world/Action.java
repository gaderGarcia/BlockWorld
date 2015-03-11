package edu.block.world;

import edu.block.world.objects.Block;
import edu.block.world.objects.RobotArm;
import edu.block.world.objects.Table;

public class Action {

	public static boolean stack(Block x, Block y) {
		//pre-condition
		if(Environment.isClear(y) && Environment.isHolding(x)) {
			//delete
			//On method delete isClear method as well as armEmpty delete holding
			
			//We executed the sentence
			RobotArm arm = RobotArm.getInstance();
			arm.empty();
			Ontology.on(x, y);
			return true;
		}
		return false;
	}
	
	public boolean unStack(Block x, Block y) {
		//pre-condition
		RobotArm  arm = RobotArm.getInstance();
		if(Environment.isOn(x, y) && Environment.isClear(x) && arm.isArmEmpty()){
			//delete
			//clear deletes On method 
			//holding deletes armEmtpy method
			//We need to check if Clear method is really deleted
			
			//execute
			Ontology.holding(x);
			Ontology.clear(y);
			return true;
		}
		return false;
	}
	
	public static boolean pickUp(Block x) {
		//pre-condition
		RobotArm  arm = RobotArm.getInstance();
		if(Environment.isClear(x) && Environment.isOnTable(x) && arm.isArmEmpty()) {
			//delete list
			Table table = Table.getInstance();
			table.removeBlock(x);
			
			//execute action
			Ontology.holding(x);
			return true;
		}
		
		return false;
	}
	
	public static boolean putDown(Block x) {
		//pre-condition
		
		if(Environment.isHolding(x)) {
			//delete list
			//armEmpty is removing the action of Holding
			//execute action
			Ontology.clear(x);
			Ontology.onTable(x);
			RobotArm  arm = RobotArm.getInstance();
			arm.empty();
			return true;
		}
		
		return false;
	}
	
}
