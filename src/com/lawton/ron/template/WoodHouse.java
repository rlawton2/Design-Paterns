package com.lawton.ron.template;

public class WoodHouse extends HouseTemplate {

	@Override
	public void buildStructure() {
		System.out.println("Building wood exterior..");
	}

	@Override
	public void installingRoofTiles() {
		System.out.println("Installing shingle roof tiles..");
	}

}
