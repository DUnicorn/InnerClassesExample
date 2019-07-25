package lt.inner;

import java.util.ArrayList;

/*
 * Top level class
 */
public class Gearbox {


MASTERIS #)))))))

	public Gearbox(int maxGears) {
		super();
		this.maxGears = maxGears;
		this.gears = new ArrayList<>();
		// added neutral gear by default
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);
		
		for (int i=0; i<maxGears; i++) {
			addGear(i, i*5.3);
		}

	}
	
	

	public void operateClutch(boolean in) {
		this.clutchIsIn = in;
	}

	public void addGear(int number, double ratio) {
		if ((number > 0) && (number <= maxGears)) {
			//call inner class
			this.gears.add(new Gear(number, ratio));
		}
	}

	public void changeGear(int newGear) {
		if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected");
		} else {
			System.out.println("Grind!");
			this.currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if (clutchIsIn) {
			System.out.println("Ooooops!!!");
			return 0.0;
		}
		return revs * gears.get(currentGear).getRatio();
	}

	/*
	 *weskjfhsjdhfsjkdhflskhdflkshdfksjhkh
sdfsdfsduhoho
