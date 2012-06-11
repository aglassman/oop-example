package mystore.storemanager;

import java.util.List;

import mystore.inventory.Item;

public interface InventoryManager {
	public void addItem(Item item);
	public void removeItem(Item item);
	public List<Item> getAllItems();
	public Item getItemByName(String itemName);
}
