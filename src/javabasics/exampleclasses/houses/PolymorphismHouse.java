package javabasics.exampleclasses.houses;



/*
 * PolymorphismHouse extends House.  This is how Java does Inheritence.
 * If you simply extended House without any code, they would behave identically.
 * Inheritance allows us to have a base set of functionality, and build upon it.
 */
public class PolymorphismHouse extends House{
	
	/*
	 * Note there is no need to specify any attributes! They were inherited from House.
	 * public attributes and methods WILL be available to this code.
	 * private attributes and methods WILL NOT be available to this code.
	 * protected attributes and methods WILL be available to this code.
	 * package-private attributes and methods WILL be available to this code.
	 */
	
	//Constructors are not inherited, but can be called.
	public PolymorphismHouse(int frontDoors, int backDoors) {
		super(frontDoors,backDoors);
	}
	
	/*
	 * This is an example of build-time Polymorphism.  
	 * This PolymorphismHouse's method of counting doors overrides 
	 * the House method of counting doors at build time.
	 */
	@Override
	public int countDoors()
	{
		//Note that the code can't call the calculateNumberOfDoors() from here because it is private scope.
		//The code CAN call calculateNumberOfFrontDoors() since it is protected scope.
		return calculateNumberOfFrontDoors();
	}
	
	/*
	 * The PolymorphismHouse class still has the ability to access the overridden 
	 * method by using the super keyword.
	 */
	public int countAllDoors()
	{
		return super.countDoors();
	}
	
	/*
	 * Methods can share the same name. For example, the countDoors method can be used 
	 * again if we specify different parameters.
	 * This type of Polymorphism is known as method overloading.  There can be any number
	 * of countDoors methods as long as they have different method parameters.
	 */
	public int countDoors(int additionalDoors)
	{
		return super.countDoors() + additionalDoors;
	}
}
