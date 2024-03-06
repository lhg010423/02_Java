package ex;

import java.io.FileOutputStream;

public class Ex {

	public void output1() {
		
		FileOutputStream fos = null;
		
		
		try {
			
			fos = new FileOutputStream("C:\\workspace\\02_Java\\12_io\\테스트.txt");
			
			String str = "안녕하세요!";
			
			fos.write(str.getBytes());
			
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	

	
	
	
	
}
