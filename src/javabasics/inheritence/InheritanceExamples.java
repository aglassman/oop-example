package javabasics.inheritence;

import javabasics.exampleclasses.containers.Container;
import javabasics.exampleclasses.containers.JellyJar;


public class InheritanceExamples {
	
	public static void main(String args[])
	{
		InheritanceExamples inheritanceExamples = new InheritanceExamples();
		inheritanceExamples.testInheritence1();
	}

	private void testInheritence1() {
		/*
		 * Create a new jelly jar, and cast it to a Container.
		 * Now  Java (for the purposes of this tutorial) only knows the 
		 * current object is a container, and the jelly jar functionality,
		 * including the Edible methods, are hidden. 
		 */
		Container randomContainer = (Container)new JellyJar();		
		
		System.out.println("Is this random container open? "+ randomContainer.containerIsOpen());
		/*
		 * This next line doesn't build.  Even though the randomContainer is a JellyJar, we
		 * have no way of knowing this!
		 */
		//System.out.println("Can I taste what's in this container? "+ randomContainer.taste());
		
		/*
		 * We know that the randomContainer is a jelly jar, which implements Edible, so lets re-cast
		 * it to a JellyJar so that Java knows it can call Container AND Edible methods.
		 */
		JellyJar myJellyJar = (JellyJar)randomContainer;
		System.out.println("Taste it: "+ myJellyJar.taste());
		System.out.println("Woops, forgot to open it first!");
		System.out.println("Open this container...");
		myJellyJar.openContainer();
		System.out.println("Is this container open? "+ randomContainer.containerIsOpen());
		System.out.println("Taste it: "+ myJellyJar.taste());
		
	}
}
