package wepsysTest;


public class Wepsys {
	
	
	void transform(String phrase, String formats) {
		
		
		String[] format = formats.split("->");
		
		for(String x : format) {
			if(x.equalsIgnoreCase("ToUpper")) {
				System.out.print("toUpper:");
				System.out.println(phrase.toUpperCase());
			}else if (x.equalsIgnoreCase("toLower")) {
				System.out.print("toLower:");
				System.out.println(phrase.toLowerCase());
			}else if(x.equalsIgnoreCase("Pack")) {
				System.out.print("Pack:");
			    System.out.println(phrase.split(" ")[0].concat(phrase.split(" ")[1]));
			}else if(x.equalsIgnoreCase("LTrim")) {
				System.out.print("LTrim:");
				if(Character.isWhitespace(phrase.charAt(0))) {
					x = phrase.substring(1, phrase.length());
					System.out.println(x);
				}else {
					System.out.println(x);
				}
			}else if (x.equalsIgnoreCase("RTrim")) {
				System.out.print("RTrim:");
				if(Character.isWhitespace(phrase.charAt(phrase.length()-1))) {
					x = phrase.substring(0, phrase.length());
					System.out.println(x);
				}else {
					System.out.println(x);
				}
			}
			
		}	
		
	}
	

	public static void main(String[] args) {
		Wepsys wep=new Wepsys();
		wep.transform(" pepe Pepe ", "toUpper->toLower->Pack->ltrim->RTrim");

	}

}
