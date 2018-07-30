package com.lawton.ron.template;

public abstract class HouseTemplate {
	
	// Template method final so subclasses can't override
	public final void buildHouse() {
		buildFoundation();
		buildStructure();
		buildRoof();
		installWindows();
		installingRoofTiles();
		completion();
	}
	// Default implementations
	private void buildFoundation() {
		System.out.println("Building foundation..");
	}
	
	private void buildRoof() {
		System.out.println("Building Roof..");
	}
	
	private void installWindows() {
		System.out.println("Installing windows..");
	}
	
	private void completion() {
		System.out.println("** House is completed **\n");
	}
	
	// Implemented by subclasses
	public abstract void buildStructure();
	public abstract void installingRoofTiles();
}
