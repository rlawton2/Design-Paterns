package com.lawton.ron.template;

public class BlockHouse extends HouseTemplate {

	@Override
	public void buildStructure() {
		System.out.println("Building block exterior..");
	}

	@Override
	public void installingRoofTiles() {
		System.out.println("Installing ceramic roof tiles..");
	}

}
