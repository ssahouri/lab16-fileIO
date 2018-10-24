import java.io.IOException;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		CountriesTextFile.fileExist("countries.txt");

		System.out.println("Welcome to the Countries Maintenance App!");
		boolean done = false;
		while (!done) {
			System.out.println("1 - See the list of countries \n2 - Add a country \n3 - Exit");
			System.out.println("Enter a number: ");
			String option = sc.next();
			switch (option) {
			case "1":
				System.out.println(CountriesTextFile.readFile());
				System.out.println();
				break;
			case "2":
				System.out.print("Enter country name: ");
				String name = sc.next();
				System.out.print("Enter " + name + "'s population: ");
				double population = sc.nextDouble();
				Country newCountry = new CountriesTextFile(name, population);
				CountriesTextFile.addToEndOfFile(newCountry);
				System.out.println();
				break;
			case "3":
				done = true;
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid choice...");
			}
		}

		sc.close();

	}

}
