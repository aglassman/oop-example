package javabasics.exampleclasses.containers;

public interface Container {
	public void openContainer();
	public void closeContainer();
	public boolean containerIsOpen();
	public String getContents();
}
