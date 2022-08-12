package trySingleton;

public class Main {
	public static void main(String[] args) {
		TabWindow s1=TabWindow.getInstance();
		TabWindow s2=TabWindow.getInstance();
		s1.addUrl("www.google.com");
		s2.addUrl("www.facebook.com");
		TabWindow s3=TabWindow.getInstance();
		s3.showUrls();
	}
}