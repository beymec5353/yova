

import org.apache.commons.lang3.StringUtils;


public class Main {

	public static void main(String[] args) {
	 
		String hataliMetin = " M ed i p      o      l";
		System.out.println("Hatali metin: " + hataliMetin);
		
		// TO DO : Hatalı Metini Düzelt
		
		String duzgunMetin = StringUtils.deleteWhitespace(hataliMetin);
		System.out.println("Duzgun Metin: " + duzgunMetin);
	}

}
