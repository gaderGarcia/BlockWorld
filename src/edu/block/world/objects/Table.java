package edu.block.world.objects;

import java.util.ArrayList;

public class Table {
	private ArrayList<Block> blocks;
	private static Table instance = null;
	
	//applying Singleton Pattern
	protected Table () {
		blocks = new ArrayList<Block>();
		System.out.println("Table created ...");
	}
	
	public static Table getInstance() {
		if(instance == null) {
			instance = new Table();
		}
		return instance;
	}

	public ArrayList<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(ArrayList<Block> blocks) {
		this.blocks = blocks;
	}
	
	public void addBlock(Block x) {
		blocks.add(x);
	}
	
	public boolean removeBlock(Block x) {
		int index = blocks.indexOf(x);
		if(index!=-1) {
			blocks.remove(index);
			return true;
		}
		return false;
	}
	
//	public static void main(String args[]) {
//		Table table = Table.getInstance();
//		Table table2 = Table.getInstance();
//		
//		System.out.println("Table 1 :"+table);
//		System.out.println("Table 2 :"+table2);
//		
//		Block a = new Block("A");
//		Block b = new Block("B");
//		table.addBlock(a);
//		table2.addBlock(b);
//		
//		for(Block x : table.getBlocks()) {
//			System.out.println(x.getName());
//		}
//		
//		table.removeBlock(b);
//		
//		for(Block x : table2.getBlocks()) {
//			System.out.println(x.getName());
//		}
//	}

}
