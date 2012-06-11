package javabasics;

/*
 * PolymorphismHouse extends House.  This is how Java does Inheritence.
 * If you simply extended House without any code, they would behave identically.
 * Inheritance allows us to have a base set of functionality, and build upon it.
 */
public class PolymorphismHouse extends House{
	
	/*
	 * note I don't need to specify any attributes!  They were inherited from House.
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
		//note that I can't call the calculateNumberOfDoors() from here because it is private scope.
		//I can call calculateNumberOfFrontDoors() since it is protected scope.
		return calculateNumberOfFrontDoors();
	}
	
	/*
	 * We can still give the PolymorphismHouse the ability to access the overridden 
	 * method by using the super keyword.
	 */
	public int countAllDoors()
	{
		return super.countDoors();
	}
	
	/*
	 * We can use the countDoors method name again if we specify different parameters.
	 * This type of Polymorphism is known as method overloading.  There can be any number
	 * of countDoors methods as long as they have different method parameters.
	 */
	public int countDoors(int additionalDoors)
	{
		return super.countDoors() + additionalDoors;
	}
}
