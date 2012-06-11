package javabasics.polymorphism;

import javabasics.exampleclasses.houses.PolymorphismHouse;

public class PolymorphismExamples {
	public static void main(String args[])
	{

		/*
		 * PolymorphismHouse inherits functionality from House by using the extends
		 * keyword.  It then uses Polymorphism to change the behavior of the countDoors
		 * method.
		 */
		PolymorphismHouse polyHouse = new PolymorphismHouse(5,5);
		System.out.println("My polyHouse has " + polyHouse.countDoors() + " doors.(method override, excludes back doors.)");
		System.out.println("My polyHouse has " + polyHouse.countAllDoors() + " doors.(calling overridden method from House, all doors counted");
		System.out.println("My polyHouse has " + polyHouse.countDoors(2) + " doors.(method overload, all doors counted + 2)");
	}
}
