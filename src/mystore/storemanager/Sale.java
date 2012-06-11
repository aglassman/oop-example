package mystore.storemanager;

import java.util.Date;
import java.util.List;

import mystore.inventory.Item;

public class Sale {
	private Date saleDate;
	List<Item> purchasedItems;
	
	public String getSaleDescription()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("SaleDate: ").append(saleDate.toString()).append("\n");
		for(Item i: purchasedItems)
		{
			sb.append("-------\n");
			sb.append("name: ").append(i.getName()).append("\n");
			sb.append("price: ").append(i.getPrice()).append("\n");
		}
		sb.append("\n");
		return sb.toString();
	}
}
