package com.lawton.ron.template;

public class Main {

	public static void main(String[] args) {
		HouseTemplate house1 = new WoodHouse();
		house1.buildHouse();
		
		HouseTemplate house2 = new StuccoHouse();
		house2.buildHouse();
	}
}
