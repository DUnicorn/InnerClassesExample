package lt.inner;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in); changing lines and lines

	some shit will cahnges

asdasdasdasdlkl

	public static void main(String[] args) {

		// local class was created --->>
		// class ClickListener implements Button.OnClickListener {
		//
		// public ClickListener() {
		// System.out.println("I've been attached");
		// }
		//
		// @Override
		// public void onClick(String title) {
		// System.out.println(title + " was clicked");
		//
		// }
		//
		// }
		//
		// btnPrint.setOnClickListener(new ClickListener());
		//

		/*
		 * anonymous class not creating separate class. all lines 
		 */

		btnPrint.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");

			}
		});

		listen();

		// Gear class is local to that gearBox class itself
		// Gearbox mcLaren = new Gearbox(6);
		//
		// mcLaren.operateClutch(true);
		// mcLaren.changeGear(1);
		// mcLaren.operateClutch(false); change it just
		// System.out.println(mcLaren.wheelSpeed(1000));
		// mcLaren.changeGear(2);
		// System.out.println(mcLaren.wheelSpeed(3000));
		// mcLaren.operateClutch(true);
		// mcLaren.changeGear(3);
		// mcLaren.operateClutch(false);
		// System.out.println(mcLaren.wheelSpeed(6000));

	}

	asdahsdkahsdjhaskdhkaj {
		boolean quit = false;
		while (!quit) {
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				btnPrint.onClick();
			}
		}
	}

}
