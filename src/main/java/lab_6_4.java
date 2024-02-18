package labs;



public class lab_6_4 {
	public static void main(String[] args) {
		String url = "https://google.com";

		boolean containHttp = url.contains("http://");
		boolean containHttps = url.contains("https://");
		boolean containCom = url.contains(".com");
		boolean containNet = url.contains(".net");
		
		System.out.println("Contains 'http': "+ containHttp);
		System.out.println("Contains 'https': "+ containHttps);
		System.out.println("Contains 'com': "+ containCom);
		System.out.println("Contains 'net': "+ containNet);
	}
	
	
	
}
