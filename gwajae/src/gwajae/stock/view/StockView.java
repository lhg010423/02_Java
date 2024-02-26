package gwajae.stock.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import gwajae.stock.model.service.StockService;
import gwajae.stock.model.service.StockServiceImpl;

public class StockView {
	
	private BufferedReader br = null;
	private StockService service = null;
	
	
	public StockView() {
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			service = new StockServiceImpl();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void startView() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("\n========== 주식 리스트 ==========");
			
			System.out.println("1. 주식 전체 보기");
			System.out.println("2. 주식 정보 보기");
			System.out.println("3. 주식 신규 상장");
			System.out.println("4. 주식 정보 수정");
			System.out.println("5. 주식 상장 폐지");
			System.out.println("0. 프로그램 종료");
			System.out.print("번호 검색 : ");
			
			
			try {
				menuNum = Integer.parseInt(br.readLine());
				
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요");
				menuNum = -1;
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			System.out.println();
			
			
			
			
			
		} while(menuNum != 0);
		
		
		
		
	}
	
	
	
	
	
	

}
