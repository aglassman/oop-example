package mystore.storemanager;

import java.util.List;

public interface SaleManager {
	public void storeSale(Sale sale);
	public List<Sale> getPastSales();
}
