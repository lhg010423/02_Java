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
				case 4 : stockUpdate(); break;
				case 5 : stockDelete(); break;
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
	
	
	
	public void stockInfo() throws IOException {
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
	
	
	
	public void stockCreate() throws IOException, Exception {
		System.out.println("\n========== 주식 신규 상장 ==========");
		
		System.out.print("종목명 입력 : ");
		String company = br.readLine();
		
		System.out.print("섹터 입력 : ");
		String sector = br.readLine();
		
		System.out.print("주가 입력 : ");
		double stockPrice = Integer.parseInt(br.readLine());
		
		System.out.print("배당률 입력 : ");
		double dividendRate = Integer.parseInt(br.readLine());
		
		int newStock = service.stockCreate(company, sector, stockPrice, dividendRate);
		
		if(newStock == -1) {
			System.out.println("===== 추가 실패 =====");
			return;
		}
		
		System.out.printf("%s이(가) 신규 상장 되었습니다.", company);
		
		
	}
	
	
	
	public void stockUpdate() throws IOException, Exception {
		System.out.println("\n========== 주식 정보 수정 ==========");
		System.out.println("수정할 종목명 입력 : ");
		String str = br.readLine();
		
		String stockInfo = service.stockInfo(str);
		
		if(stockInfo == null) {
			System.out.println("검색한 종목명이 없습니다.");
			return;
			
		}
		int num = 0;
		List<Stock> stockList = service.stockFullView();
		for(int i = 0; i < stockList.size(); i++) {
			if(stockList.get(i).getCompany().equals(str)) {
				num = i;
				break;
			}
		}
		
		
		
		System.out.println("===== 현재 검색한 종목명의 정보 =====");
		System.out.println(stockInfo);
		
		System.out.println("===== 수정할 정보 입력 =====");
		System.out.print("종목명 입력 : ");
		String company = br.readLine();
		
		System.out.print("섹터 입력 : ");
		String sector = br.readLine();
		
		System.out.print("주가 입력 : ");
		double stockPrice = Integer.parseInt(br.readLine());
		
		System.out.print("배당률 입력 : ");
		double dividendRate = Integer.parseInt(br.readLine());
		
		boolean result = service.stockUpdate(num, company, sector, stockPrice, dividendRate);
		
		if(result) System.out.println("수정 완료");
		else System.out.println("수정 실패");
		
		
	}
	
	
	
	public void stockDelete() throws Exception {
		System.out.println("\n========== 주식 상장 폐지 ==========");
		System.out.print("파산한 회사 입력 : ");
		String searchStock = br.readLine();
		
		String result = service.stockDelete(searchStock);
		
		if(result == null) System.out.println("입력한 회사가 없습니다.");
		else System.out.println(result + "가 상장 폐지되었습니다.");
		
	}
	
	
	

}
