package com.te.javabasics.blocks;

public class InhertedBlock extends Blocks{
	public InhertedBlock() {
		System.out.println("This is Inherited constructor");
	}
	// static block
		static {
			System.out.println("This is a static block");
		}
		// non-static block
		{
			System.out.println("This is a non-static block");
		}
}

