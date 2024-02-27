package gwajae.stock.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import gwajae.stock.model.dto.Stock;
import gwajae.stock.model.service.StockService;
import gwajae.stock.model.service.StockServiceImpl;

public class StockView {
	
	private BufferedReader br = null;
	private StockService service = null;
	
	
	public StockView() {
		
		try {
			
			service = new StockServiceImpl();
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void startView() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("\n========== 주식 리스트 ==========");
			
			System.out.println("1. 보유중인 주식");
			System.out.println("2. 주식 정보 보기");
			System.out.println("3. 주식 신규 상장");
			System.out.println("4. 주식 정보 수정");
			System.out.println("5. 주식 상장 폐지");
			System.out.println("0. 프로그램 종료");
			System.out.print("번호 검색 : ");
			
			
			try {
				menuNum = Integer.parseInt(br.readLine());
				
				switch(menuNum) {
				case 1 : stockFullView(); break;
				case 2 : stockInfo(); break;
				case 3 : stockCreate(); break;
				case 4 : /*stockUpdate();*/ break;
				case 5 : /*stockDelete();*/ break;
				case 0 : System.out.println("프로그램 종료.."); break;
				default : System.out.println("잘못 입력하였습니다.");
				
				}
				
				
				
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요");
				menuNum = -1;
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			System.out.println();
			
		} while(menuNum != 0);
	}
	






	public void stockFullView() {
		
		System.out.println("\n========== 보유중인 주식 ==========");
		
		List<Stock> stockList = service.stockFullView();
		String str = "종목명 : ";
		
		for(int i=0; i < stockList.size(); i++) {
			
			String company = stockList.get(i).getCompany();
			
			
			str += company + ", ";
		}
		str = str.substring(0, str.length() -2);
		System.out.println(str);

		
	}
	
	
	
	private void stockInfo() throws IOException {
		System.out.println("\n========== 주식 정보 보기 ==========");
		System.out.print("검색할 종목명 입력 : ");
		String searchStock = br.readLine();
		
		String stockInfo = service.stockInfo(searchStock);
		
		if(stockInfo == null) {
			System.out.println("검색한 종목명이 없습니다.");
			return;
		}
		System.out.println(stockInfo);
		
	}
	
	
	
	private void stockCreate() throws IOException {
		System.out.println("\n========== 주식 신규 상장 ==========");
		
		System.out.print("종목명 입력 : ");
		String company = br.readLine();
		
		System.out.print("섹터 입력 : ");
		String sector = br.readLine();
		
		System.out.print("주가 입력 : ");
		double stockPrice = Integer.parseInt(br.readLine());
		
		System.out.print("배당률 입력 : ");
		double dividendRate = Integer.parseInt(br.readLine());
		
		Stock newStock = service.stockCreate(company, sector, stockPrice, dividendRate);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
