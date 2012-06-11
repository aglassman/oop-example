package javabasics.abstraction;

import java.util.List;

import javabasics.exampleclasses.containers.Container;
import javabasics.exampleclasses.containers.ContainerPack;
import javabasics.exampleclasses.containers.GarbageCan;
import javabasics.exampleclasses.containers.JellyJar;
import javabasics.exampleclasses.containers.JellyOnlyContainer;

public class AbstractionExamples {
	public static void main(String args[])
	{
		AbstractionExamples examples = new AbstractionExamples();
		examples.example1();
	}

	private void example1() {
		//Create a bunch of containers
		JellyJar container1 = new JellyJar();
		JellyJar container2 = new JellyJar();
		GarbageCan container3 = new GarbageCan();
		GarbageCan container4 = new GarbageCan();
		JellyJar container5 = new JellyJar();
		JellyJar container6 = new JellyJar();
		GarbageCan container7 = new GarbageCan();
		JellyJar container8 = new JellyJar();
		GarbageCan container9 = new GarbageCan();
		
		/*
		 * These containers should be packed up!  The code will use an implementation of the
		 * ContainerPack class.
		 */
		ContainerPack myContainerPack = new JellyOnlyContainer();
		
		//Now the containers are added to the pack
		myContainerPack.addContainer(container1);
		myContainerPack.addContainer(container2);
		myContainerPack.addContainer(container3);
		myContainerPack.addContainer(container4);
		myContainerPack.addContainer(container5);
		myContainerPack.addContainer(container6);
		myContainerPack.addContainer(container7);
		myContainerPack.addContainer(container8);
		myContainerPack.addContainer(container9);
		
		//Check to see what the ContainerPack allowed to be packed.
		List<Container> contents = myContainerPack.getAllContainersInPack();
		for(int i = 0; i < contents.size(); i++)
		{
			System.out.println("container: " + i + " contains: " + contents.get(i).getContents());
		}
		
	}
}
