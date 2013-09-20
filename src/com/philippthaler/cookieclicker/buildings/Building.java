package com.philippthaler.cookieclicker.buildings;

import com.philippthaler.cookieclicker.window.ContentPane;

public class Building {

	private long price;

	private int amount = 0;
	private double cps; // cookies per second for 1 Building

	public Building(long price, int amount, double cps) {
		this.price = price;
		this.amount = amount;
		this.cps = cps;
	}

	public int getAmount() {
		return this.amount;
	}

	public long getPrice() {
		return this.price;
	}

	public double getCps() {
		return cps;
	}

	public void buy() {
		if (isBuyable()) {
			BuildingHolder.cookies -= price;
			amount++;
			price = (long) (price * Math.pow(1.030, amount));
		} else
			ContentPane.setStatusbar("You don't have enough cookies.");
	}

	private boolean isBuyable() {
		if (BuildingHolder.cookies >= this.price)
			return true;
		return false;
	}

	public String toString() {
		return this.price + "," + this.amount + "," + this.cps + ";";
	}
}
