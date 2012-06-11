package mystore.inventory;

import java.util.StringTokenizer;

public class Equipment extends StoreItem{
	
	private String manufacturer;
	private String modelName;
	private String condition;
	@Override
	public String getName()
	{
		return this.manufacturer + this.modelName;
	}
	
	@Override 
	public void setName(String name)
	{
		StringTokenizer st = new StringTokenizer(name);
		manufacturer = st.nextToken();
		modelName = st.nextToken();
	}
	
	
	
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
