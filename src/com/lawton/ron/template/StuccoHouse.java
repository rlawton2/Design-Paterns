package com.lawton.ron.template;

public class StuccoHouse extends HouseTemplate {

	@Override
	public void buildStructure() {
		System.out.println("Building stucco exterior..");
	}

	@Override
	public void installingRoofTiles() {
		System.out.println("Installing ceramic roof tiles..");
	}

}
