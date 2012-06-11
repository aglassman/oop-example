package javabasics.encapsulation;

import javabasics.exampleclasses.houses.House;
import javabasics.exampleclasses.houses.PolymorphismHouse;

public class EncapsulationExamples {
	/*
	 * static main methods, with an array of string arguments, are the standard way of starting a java
	 * class.
	 */
	public static void main(String args[])
	{
		EncapsulationExamples encapsulationExamples = new EncapsulationExamples();
		//Change the example method to test out each one.
		encapsulationExamples.instanceExample();
	}
	
	private void instanceExample()
	{
		/*
		 * House is a class which describes a House's methods and attributes.
		 * andysHouse and franksHouse are java Objects, which are instances 
		 * of the House class.  The implementation of owner and color are
		 * not encapsulated by the House class.  The controlling code has to
		 * worry about making sure owner and color are valid entries.
		 */
		House house1 = new House();
		house1.owner = "Andy";
		house1.color = "blue";
		
		House house2 = new House();
		house2.owner = "Frank";
		house2.color = "yellow";
		
		System.out.println(house1.owner + "'s house is colored " + house1.color);
		System.out.println(house2.owner + "'s house is colored " + house2.color);
	}
	
	private void encapsulationExample()
	{
		/*
		 * You are setting how many doors your house has, then asking the object
		 * to count how many doors there are.  By default, there are 2 doors on a
		 * house.  The implementation of countDoors is encapsulated by the House
		 * class.  We are not worried about how House calculates how many doors it 
		 * has, which frees the controlling code to worry about other things.
		 */
		
		House myHouse = new House();
		System.out.println("My house has " + myHouse.countDoors() + " doors.");
		
		myHouse.setNumberOfFrontDoors(2);
		myHouse.setNumberOfBackDoors(3);
		
		System.out.println("My house now has " + myHouse.countDoors() + " doors.");
		
		/*
		 * By passing parameters into the constructor, we can instantiate a more specific
		 * house.
		 */
		House mySpecificHouse = new House(5,5);
		System.out.println("My specificly constructed house has " + mySpecificHouse.countDoors() + " doors.");
	}
}
