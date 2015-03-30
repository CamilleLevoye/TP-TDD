package iut.tdd;

import java.util.HashMap;

public class Convert {

	public static String num2text(String input) {
		String result = "";
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("0", "zéro");
		map.put("1", "un");
		map.put("2", "deux");
		map.put("3", "trois");
		map.put("4", "quatre");
		map.put("5", "cinq");
		map.put("6", "six");
		map.put("7", "sept");
		map.put("8", "huit");
		map.put("9", "neuf");
		map.put("10", "dix");
		map.put("11", "onze");
		map.put("12", "douze");
		map.put("13", "treize");
		map.put("14", "quatorze");
		map.put("15", "quinze");
		map.put("16", "seize");
		map.put("20", "vingt");
		map.put("30", "trente");
		map.put("40", "quarente");
		map.put("50", "cinquante");
		map.put("60", "soixante");
		map.put("70", "soixante-dix");
		map.put("80", "quatre-vingt");
		map.put("90", "quatre-vingt-dix");

		if (Integer.parseInt(input) <= 16) {
			result = map.get(input);
		} 
		else if (input.charAt(1) == '0') {
			result = map.get(input);
		} 
		else if (input.charAt(1) == '1') {
			
			if(input.charAt(0) == '7' || input.charAt(0) == '9'){
				String dizaine = getDizaine(Integer.parseInt(input));
				String unite = getUnite(Integer.parseInt(input));
				result = map.get(dizaine) + "-et-"+map.get(unite);
			}
			
			else if(input.charAt(0) == '8'){
				String tmp = getDizaine(Integer.parseInt(input));
				result = map.get(tmp) + "-un";
			}
			
			else {
				String tmp = getDizaine(Integer.parseInt(input));
				String unite = getUnite(Integer.parseInt(input));
				result = map.get(tmp) + "-et-" + map.get(unite);
			}
			

			
		} 
		else {
			String dizaine = getDizaine(Integer.parseInt(input));
			String unite = getUnite(Integer.parseInt(input));
			result = map.get(dizaine) + "-" + map.get(unite);
		}

		return result;

	}
	
	public static String getDizaine(int input){
		int dizaine = (input/10)*10;
		if(dizaine==70 || dizaine==90){
			dizaine=dizaine-10;
		}
		return Integer.toString(dizaine);	
	}
	
	public static String getUnite(int input){
		int dizaine = (input/10)*10;
		int unite = input-(input/10)*10;
		
		if(dizaine==70 || dizaine==90){
			unite=unite+10;
		}
		return Integer.toString(unite);	
	}

	public static String text2num(String input) {
		return null;
	}
}