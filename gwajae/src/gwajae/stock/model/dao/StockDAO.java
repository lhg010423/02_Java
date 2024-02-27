package gwajae.stock.model.dao;

import java.util.List;

import gwajae.stock.model.dto.Stock;

public interface StockDAO {

	void saveFile() throws Exception;
	
	List<Stock> stockFullView();

	Stock stockInfo(String searchStock);

}
