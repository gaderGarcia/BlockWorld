package edu.block.world.objects;

public class Block {
	private Block top;
	private String name;
	
	public Block(String name){
		this.name = name;
		this.top = null;
	}
	
	public Block getTop() {
		return top;
	}

	public void setTop(Block top) {
		this.top = top;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isClear() {
		if (top == null)
			return true;
		return false;
	}

}
