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
		} else if (input.charAt(1) == '0') {
			result = map.get(input);
		} else if (input.charAt(1) == '1') {
			if (2 <= Integer.parseInt(input.charAt(0)+"") || Integer.parseInt(input.charAt(0)+"") <= 6) {
				String tmp = getDizaine(Integer.parseInt(input));
				result = map.get(tmp) + "-et-un";
			}
			else if(Integer.parseInt(input.charAt(0)+"")==7){
				String tmp = input.charAt(0) + "0";
				result = map.get(tmp) + "-et-onze";
			}
			else{
				
			}
		} else {
			String dizaine = input.charAt(0) + "0";
			String unite = input.charAt(1) + "";
			result = map.get(dizaine) + "-" + map.get(unite);
		}

		return result;

	}
	
	public static String getDizaine(int input){
		int dizaine = input/10;
		return null;
		
	}

	public static String text2num(String input) {
		return null;
	}
}