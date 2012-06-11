package javabasics.exampleclasses.houses;

public class House {
	//Check out the scope of these attributes.
	
	//color is public, so any calling code can change the color!
	public String color = "white";
	public String owner;
	
	/*
	 * Door variables are private, so they can only be changed by
	 * methods of the House class.
	 */
	private int frontDoors;
	private int backDoors;
	
	/*
	 * Constructors create a new instance of the class.  All non-primitive attributes start
	 * out as null unless specified in the attribute declaration above.  Example:
	 * color will always be white unless someone else changes it. owner will be null untill
	 * someone sets the owner's name.  frontDoors and backDoors are primitives, and will be 
	 * zero when created, but are set within the constructor in this case.  
	 */
	
	
	//default constructor, this means it has no parameters.
	public House()
	{
		//specify how many doors a house has by default.
		frontDoors = 1;
		backDoors = 1;
	}
	
	//a more specific constructor
	public House(int frontDoors, int backDoors)
	{
		/*
		 * The keyword this lets java know we are talking about the
		 * object's attributes, not the parameters passed in to the
		 * constructor.  
		 * frontDoors = frontDoors would be ambiguous.
		 */
		this.frontDoors = frontDoors;
		this.backDoors = backDoors;
	}
	
	/*
	 * countDoors() is an example of encapsulation.  We leave the calculation of 
	 * total doors up to this method.  The code calling the method has no idea
	 * how the number of doors is actually calculated.
	 */
	public int countDoors()
	{
		return calcuateNumberOfDoors();
	}

	//Note this method is private.  Only code within the House class can
	//call this method!
	private int calcuateNumberOfDoors() {
		return frontDoors + backDoors;
	}
	
	protected int calculateNumberOfFrontDoors()
	{
		return frontDoors;
	}

	/*These are 'setter' methods.  We don't give the calling code the ability to
	* change these values directly.  This adds security to the object.  Like below, we are
	* limiting the number of front doors to > =.  This gives us more control over our
	* objects.  This is also an example of Encapsulation.
	*/
	public void setNumberOfFrontDoors(int newNumberOfDoors) {
		if(newNumberOfDoors <= 0)
			frontDoors = 0;
		else
			frontDoors = newNumberOfDoors;
	}
	
	public void setNumberOfBackDoors(int newNumberOfDoors) {
		if(newNumberOfDoors <= 0)
			backDoors = 0;
		else
			backDoors = newNumberOfDoors;
	}
}
