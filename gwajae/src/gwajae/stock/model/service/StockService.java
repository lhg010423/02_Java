package gwajae.stock.model.service;

import java.util.List;

import gwajae.stock.model.dto.Stock;

public interface StockService {

	public abstract List<Stock> stockFullView();

	public abstract String stockInfo(String searchStock);

	public abstract int stockCreate(String company, String sector, double stockPrice, double dividendRate) throws Exception;

	public abstract boolean stockUpdate(int num, String company, String sector, double stockPrice,
			double dividendRate) throws Exception;

	public abstract String stockDelete(String searchStock) throws Exception;

}
