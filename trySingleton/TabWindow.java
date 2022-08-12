package trySingleton;

import java.util.ArrayList;

public class TabWindow {
	//Creating the only object that will be created of this Class
	public static TabWindow sc;
	ArrayList<String> urls;
	//This constructor is Important	
	private TabWindow() {
		urls=new ArrayList<String>();
	}
	
	public static TabWindow getInstance() {
		if(sc==null)
			sc=new TabWindow();
		return sc;
	}
	
	public void addUrl(String url) {
		urls.add(url);
	}
	
	public void showUrls() {
		for(String u:urls)
			System.out.println(u);
	}
}
