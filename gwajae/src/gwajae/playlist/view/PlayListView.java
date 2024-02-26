package gwajae.playlist.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import gwajae.playlist.model.service.PlayListService;
import gwajae.playlist.model.service.PlayListServiceImpl;

public class PlayListView {
	
	private BufferedReader br = null;
	private PlayListService service = null;
	
	
	public PlayListView() {
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			service = new PlayListServiceImpl();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
