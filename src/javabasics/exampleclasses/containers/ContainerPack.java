package javabasics.exampleclasses.containers;

import java.util.List;
import java.util.Vector;

public abstract class ContainerPack {
	private Vector<Container> containers = new Vector<Container>();
	
	/**
	 * An abstract class can implement partial functionality, and specify other
	 * methods to be implemented by a concrete class. All ContainerPacks
	 * should check if the container is allowed, then add it.  This
	 * functionality will not change between different packs.
	 * 
	 * @param c
	 * @return true if contaienr was added
	 */
	public boolean addContainer(Container c)
	{
		if(allowableContainer(c))
		{
			containers.add(c);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Weather or not the container is allowed is left up
	 * to a concrete implementation of ContainerPack.
	 * 
	 * @param c
	 * @return true if that type of container is allowed
	 */
	public abstract boolean allowableContainer(Container c);
	
	public List<Container> getAllContainersInPack()
	{
		return containers;
	}
}
