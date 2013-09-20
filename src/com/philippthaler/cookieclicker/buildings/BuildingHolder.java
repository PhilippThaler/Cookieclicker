package com.philippthaler.cookieclicker.buildings;

import java.util.ArrayList;
import java.util.Arrays;

import com.philippthaler.cookieclicker.window.ContentPane;

public class BuildingHolder {

	public static double cookies = 0.0;

	public static Building[] buildings;
	public static String defaultValues = "0.0;15,0,0.1;100,0,0.5;500,0,2.0;"
			+ "3000,0,10.0;10000,0,40.0;40000,0,100.0;"
			+ "200000,0,400.0;1666666,0,6666.0;"
			+ "123456789,0,98765.0;3999999999,0,999999.0;";

	public static double getCpsAll() {
		return (buildings[0].getCps() * buildings[0].getAmount())
				+ (buildings[1].getCps() * buildings[1].getAmount())
				+ (buildings[2].getCps() * buildings[2].getAmount())
				+ (buildings[3].getCps() * buildings[3].getAmount())
				+ (buildings[4].getCps() * buildings[4].getAmount())
				+ (buildings[5].getCps() * buildings[5].getAmount())
				+ (buildings[6].getCps() * buildings[6].getAmount())
				+ (buildings[7].getCps() * buildings[7].getAmount())
				+ (buildings[8].getCps() * buildings[8].getAmount())
				+ (buildings[9].getCps() * buildings[9].getAmount());
	}

	public static String getIOString() {
		return buildings[0].toString() + buildings[1].toString()
				+ buildings[2].toString() + buildings[3].toString()
				+ buildings[4].toString() + buildings[5].toString()
				+ buildings[6].toString() + buildings[7].toString()
				+ buildings[8].toString() + buildings[9].toString();
	}

	public static void setBuildings(String s) {
		// price,amount,cps;
		try {
			ArrayList<String> listOfBuildings = new ArrayList<String>(
					Arrays.asList(s.split(";")));
			cookies = Double.parseDouble(listOfBuildings.get(0));
			listOfBuildings.remove(0);

			String[] tempValues;

			buildings = new Building[listOfBuildings.size()];
			for (int i = 0; i < listOfBuildings.size(); i++) {
				tempValues = listOfBuildings.get(i).split(",");
				buildings[i] = new Building(Long.parseLong(tempValues[0]),
						Integer.parseInt(tempValues[1]),
						Double.parseDouble(tempValues[2]));
			}
		} catch (Exception e) {
			System.out.println("Setbuildings");
		}
	}

	public static void reset() {
		setBuildings(defaultValues);
		ContentPane.setStatusbar("Reset successful!");
	}
}
