package grandcircus.lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int carNum = 8;
		int choice1 = 1;
		int carList = 0;
		String cont;

		ArrayList<Car> list = new ArrayList<>();

		// add new cars to list
		list.add(new Car("Ford", "Escape", 2018, 29000.00));
		list.add(new Car("Toyota", "Camery", 2018, 31000.00));
		list.add(new Car("Chevrolet", "Corvette", 2018, 58000.00));
		list.add(new Car("Audi", "TT", 2018, 120000.00));

		// add used cars to list
		list.add(new UsedCar("Buick*", "Regal", 1987, 25000.00, 70010));
		list.add(new UsedCar("Chevorlet*", "Corvette", 1956, 95000.00, 1001));
		list.add(new UsedCar("Chevrolet*", "Nova", 1967, 35000.00, 32000));
		list.add(new UsedCar("Buick*", "Skylark", 1964, 37000.00, 52000));

		System.out.println(
				"Welcome to the refreshed employee Dashboard. You now have the ability to view and edit your inventory via this tool.\n");

		// do {
		System.out.println(
				"Here are a list of vehicles that are currently included within our inventory (asterisk indicates used vehicle):\n");

		for (int i = 0; i < carNum; i++) {
			carList++;
			System.out.print(carList + ". ");
			System.out.println(list.get(i));
		}

		do {
			System.out.println(
					"\nPlease indicate which car you'd like to remove from your inventory by choosing it's number.");
			choice1 = scnr.nextInt();
			if (choice1 <= 8) {

				scnr.nextLine();
				System.out.println("\nWould you like to remove this car?");
				cont = scnr.nextLine();

				System.out.println("\nDone deal, the car listed below has been removed from your inventory.");
				choice1 = choice1 - 1;
				System.out.println(list.get(choice1));
				System.out.println("*\n*\n*\n*\n*\n*");
				list.remove((choice1));

				int updated = 0;
				for (int i = 0; i < list.size(); i++) {
					updated++;
					System.out.print(updated + " ");
					System.out.println(list.get(i));
				}

			}
		} while (true);
	}

	{
		System.out.println("Have a good one, and thank you for being patient as I fine tune my AI.");
	}
}
