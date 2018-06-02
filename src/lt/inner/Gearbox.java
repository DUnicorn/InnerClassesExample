package lt.inner;

import java.util.ArrayList;

/*
 * Top level class
 */
public class Gearbox {

	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean clutchIsIn;

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
	 * Inner class The gear is not something that sort of is useful in it own. It is
	 * couple with gearBox that makes it useful. **** Instances of the gear class
	 * have got access to all the methods of fields of the outer gearBox class, even
	 * those mark as private.
	 */
	private class Gear {

		private int gearNumber;
		private double ratio;

		public Gear(int gearNumber, double ratio) {
			super();
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}

		public double getRatio() {
			return ratio;
		}

	}
	/*Objects know about other objects that they need to know about.Nothing apart gearBox
	 * needs to have any details about actual gear. So the gear class was hidden.
	 * 
	 */

}
