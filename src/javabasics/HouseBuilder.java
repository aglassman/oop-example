package javabasics;

public class HouseBuilder {
	private void instanceExample()
	{
		//House is a class which describes a House's methods and attributes.
		//  andysHouse and franksHouse are java Objects, which are instances 
		//	of the House class.
		House andysHouse = new House();
		andysHouse.color = "blue";
		
		House franksHouse = new House();
		franksHouse.color = "yellow";
		
		System.out.println("Andy's house is colored " + andysHouse.color);
		System.out.println("Frank's house is colored " + franksHouse.color);
	}
	
	private void methodExample()
	{
		//You are setting how many doors your house has, then asking the object
		//	to count how many doors there are.  By default, there are 2 doors on a 
		//	house.
		House myHouse = new House();
		System.out.println("My house has " + myHouse.countDoors() + " doors.");
		
		myHouse.setNumberOfFrontDoors(2);
		myHouse.setNumberOfBackDoors(3);
		
		System.out.println("My house now has " + myHouse.countDoors() + " doors.");
		
		//by passing parameters into the constructor, we can instantiate a more specific
		//	house.
		House mySpecificHouse = new House(5,5);
		System.out.println("My specificly constructed house has " + mySpecificHouse.countDoors() + " doors.");
	}
	
	private void polymorphismExample()
	{
		PolymorphismHouse polyHouse = new PolymorphismHouse(5,5);
		System.out.println("My polyHouse has " + polyHouse.countDoors() + " doors.(method override, excludes back doors.)");
		System.out.println("My polyHouse has " + polyHouse.countAllDoors() + " doors.(calling overridden method from House, all doors counted");
		System.out.println("My polyHouse has " + polyHouse.countDoors(2) + " doors.(method overload, all doors counted + 1)");
		
	}
	
	public static void main(String args[])
	{
		HouseBuilder houseBuilder = new HouseBuilder();
		houseBuilder.polymorphismExample();
	}
}
