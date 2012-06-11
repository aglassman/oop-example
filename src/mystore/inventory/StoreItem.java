package mystore.inventory;

public abstract class StoreItem implements Item{
	private String price;
	protected String name;
	
	@Override
	public void setPrice(String price)
	{
		this.price = price;
	}
	@Override
	public String getPrice()
	{
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public abstract String getDescription();

}
