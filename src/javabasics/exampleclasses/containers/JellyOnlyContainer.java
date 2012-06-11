package javabasics.exampleclasses.containers;

public class JellyOnlyContainer extends ContainerPack{

	
	@Override
	public boolean allowableContainer(Container c) {
		//Only allow jelly in this pack!
		return c.getClass().equals(JellyJar.class);
	}

}
