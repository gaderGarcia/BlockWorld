package edu.block.world.objects;

public class RobotArm {
	private Block hold;
	private static RobotArm instance = null;
	
	protected RobotArm() {
		this.hold = null;
		System.out.println("RobotArm working ....");
	}
	
	public static RobotArm getInstance() {
		if(instance == null) {
			instance = new RobotArm();
		}
		return instance;
	}

	public Block getHold() {
		return hold;
	}

	private void setHold(Block hold) {
		this.hold = hold;
	}
	
	public void holding(Block x) {
		setHold(x);
	}
	
	public void empty() {
		setHold(null);
	}
	
	public boolean isArmEmpty() {
		if(hold == null)
			return true;
		return false;
	}
}
