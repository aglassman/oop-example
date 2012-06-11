package javabasics.exampleclasses.containers;




public class JellyJar implements Container, Edible{

	private boolean isOpen = false;
	
	public JellyJar()
	{
		isOpen = false;
	}
	
	@Override
	public void openContainer() {
		isOpen = true;
	}

	@Override
	public void closeContainer() {
		isOpen = false;
	}

	@Override
	public boolean containerIsOpen() {
		return isOpen;
	}

	@Override
	public String taste() {
		if(containerIsOpen())
		{
			return "yummmm!, this Jelly is delicious.";
		}
		else
		{
			return "Open the jar to taste you fool.";
		}
	}

}
