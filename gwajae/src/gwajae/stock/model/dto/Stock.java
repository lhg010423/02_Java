package gwajae.stock.model.dto;

import java.io.Serializable;

public class Stock implements Serializable{
	
	private String company; // 회사 이름
	private String sector; // 섹터
	private double stockPrice; // 주가
	private double dividendRate; // 배당률
	private double dividendYield; // 배당 수익률
	// 배당 수익률 = (주당 배당금 / 현재 주가) * 100
	
	
	public Stock() {}
	
	public Stock(String company, String sector, double stockPrice, double dividendRate, double dividendYield) {
		super();
		this.company = company;
		this.sector = sector;
		this.stockPrice = stockPrice;
		this.dividendRate = dividendRate;
		this.dividendYield = dividendYield;
	}





	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public double getDividendRate() {
		return dividendRate;
	}

	public void setDividendRate(double dividendRate) {
		this.dividendRate = dividendRate;
	}

	public double getDividendYield() {
		return dividendYield;
	}

	public void setDividendYield(double dividendYield) {
		this.dividendYield = dividendYield;
	}

	@Override
	public String toString() {
		return "Stock [company=" + company + ", sector=" + sector + ", stockPrice=" + stockPrice + ", dividendRate="
				+ dividendRate + ", dividendYield=" + dividendYield + "]";
	}





	
	
	
	
	
	
	
	
	
	
}
