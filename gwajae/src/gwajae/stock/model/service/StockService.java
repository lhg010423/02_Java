package gwajae.stock.model.service;

import java.util.List;

import gwajae.stock.model.dto.Stock;

public interface StockService {

	public abstract List<Stock> stockFullView();

	public abstract String stockInfo(String searchStock);

	public abstract int stockCreate(String company, String sector, double stockPrice, double dividendRate);

}
