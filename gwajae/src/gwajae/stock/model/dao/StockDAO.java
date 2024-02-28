package gwajae.stock.model.dao;

import java.util.List;

import gwajae.stock.model.dto.Stock;

public interface StockDAO {

	void saveFile() throws Exception;
	
	List<Stock> stockFullView();

	Stock stockInfo(String searchStock);

	int stockCreate(Stock stock) throws Exception;

	boolean stockUpdate(int num, String company, String sector, double stockPrice, double dividendRate) throws Exception;

	Stock stockDelete(String searchStock) throws Exception;

}
