package gwajae.stock.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import gwajae.stock.model.dto.Stock;

public class StockDAOImpl implements StockDAO {

	private final String FILE_PATH = "/gwajae/StockList.dat";
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	private List<Stock> stockList = null;
	
	
	
	
	/** 기본 생성자
	 * @throws Exception
	 */
	public StockDAOImpl() throws Exception{
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) { // 파일이 있을 때
			
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				stockList = (ArrayList<Stock>)ois.readObject();
				
			} finally {
				if(ois != null) ois.close();
				
			}
			
		} else { // 파일 없을 때
			
			File directory = new File("/gwajae");
			if(!directory.exists()) directory.mkdir(); // 폴더가 없으면 만들기
			
			stockList = new ArrayList<Stock>();
			
			//                    회사이름    섹터      주가    배당률
			stockList.add(new Stock("애플", "첨단기술", 182.15, 0.96));
			stockList.add(new Stock("마이크로소프트", "IT", 410.35, 3));
			stockList.add(new Stock("코카콜라", "필수 소비재", 61.15, 1.94));
			stockList.add(new Stock("화이자", "헬스케어", 27.18, 1.68));
			stockList.add(new Stock("뱅크오브아메리카", "금융", 33.61, 0.96));
			
			try {
				
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(stockList);
				
			} finally {
				if(oos != null) oos.close();
			}
			System.out.println("===== StockList.dat 파일 생성 완료 =====");
			
		}
	}
	
	
	
	
	
	@Override
	public void saveFile() throws Exception {
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(stockList);
			
		} finally {
			oos.close();
			
		}
		
	}
	
	
	
	
	
	
	
	
	@Override
	public List<Stock> stockFullView() {
		
		return stockList;
	}


	@Override
	public Stock stockInfo(String searchStock) {
		
		for(int i = 0; i < stockList.size(); i++) {
			if(stockList.get(i).getCompany().equals(searchStock)) return stockList.get(i);
			
		}
		
		return null;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
