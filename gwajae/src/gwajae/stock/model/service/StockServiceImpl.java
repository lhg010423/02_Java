package gwajae.stock.model.service;

import java.util.List;

import gwajae.stock.model.dao.StockDAO;
import gwajae.stock.model.dao.StockDAOImpl;
import gwajae.stock.model.dto.Stock;

public class StockServiceImpl implements StockService {

	private StockDAO dao = null;

	public StockServiceImpl() throws Exception {
		
		dao = new StockDAOImpl();
		
	}

	@Override
	public List<Stock> stockFullView() {
		
		List<Stock> StockList = dao.stockFullView();
		
		
		return StockList;
	}

	@Override
	public String stockInfo(String searchStock) {
		
		Stock stock = dao.stockInfo(searchStock);
		
		if(stock == null) return null;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("종목명 : %s / 섹터 : %s\n", stock.getCompany(), stock.getSector()));
		sb.append(String.format("주가 : %.2f USD / 배당률 : %.2f USD / 배당 수익률 : %.2f %%",
				stock.getStockPrice(), stock.getDividendRate(), stock.getDividendYield()));
		
		return sb.toString();
	}

	
	
	@Override
	public int stockCreate(String company, String sector, double stockPrice, double dividendRate) throws Exception{
		
		
		Stock stock = new Stock(company, sector, stockPrice, dividendRate);
		
		int result = dao.stockCreate(stock);
		
		
		return result;
	}

	
	
	

	@Override
	public boolean stockUpdate(int num, String company, String sector, double stockPrice, double dividendRate) throws Exception{
		
		return dao.stockUpdate(num, company, sector, stockPrice, dividendRate);
	}

	@Override
	public String stockDelete(String searchStock) throws Exception{
		
		Stock stock = dao.stockDelete(searchStock);
		
		if(stock == null) return null;
			
		
		
		return stock.getCompany();
	}
	
	
	
	
	
	
	
	
	
}
