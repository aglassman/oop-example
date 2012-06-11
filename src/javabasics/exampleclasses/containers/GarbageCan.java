package javabasics.exampleclasses.containers;

public class GarbageCan implements Container, Edible{
	private boolean isOpen;
	@Override
	public String taste() {
		return "Ewww, why are you trying to eat garbage??";
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
	public String getContents() {
		return "Garbage";
	}

}
