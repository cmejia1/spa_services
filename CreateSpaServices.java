// chapter 3 exercise 5/11/2023

import java.util.Scanner;

public class CreateSpaServices
{
	public static void main(String[] args) 
	{
		// Variables and constsants
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();

		// Input phase
		System.out.print("Please enter name of service >> ");
		service = keyboard.nextLine();
		System.out.print("Please enter the price of that service >> ");
		price = keyboard.nextDouble();
		// implement our custom spaService methods
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		// keyboard buffer for the scanner object
		keyboard.nextLine();
		
		System.out.print("Next, pleses enter the name of a second service >> ");
		service = keyboard.nextLine();
		System.out.print("Please enter the price of that service >> ");
		price = keyboard.nextDouble();
		secondService.setServiceDescription(service);
		secondService.setPrice(price);

		// output phase
		System.out.println("First service details:");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
		System.out.println("Second service details:");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

	} // end of main()
} // end of class