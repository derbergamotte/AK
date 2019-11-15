package com.name.test29;
import java.util.*;
public class Man {

	public static void main(String[] args) {
		String text = "Алиса сидела со старшей сестрой на берегу и маялась: делать ей было совершенно нечего, а сидеть без дела, сами знаете, дело нелегкое; раз-другой она, правда, сунула нос в книгу, которую сестра читала, но там не оказалось ни картинок, ни стишков. Кому нужны книжки без картинок.- или хоть стишков, не понимаю! - думала Алиса.";
		text = removePunc(text);
		List<String> textList = new ArrayList<String>(Arrays.asList(text.split(" ")));
		Iterator<String> iterText1 = textList.iterator();
		while (iterText1.hasNext()) {
			if (iterText1.next().equals(""))
				iterText1.remove();
		}
		Iterator<String> iterText2 = textList.iterator();
		Map<String, Integer> textMap = new HashMap<String, Integer>();
		while (iterText2.hasNext()) {
			String string = iterText2.next();
			int count = textMap.containsKey(string) ? textMap.get(string) : 0;
			textMap.put(string, count + 1);
		}
		
		System.out.println(textMap);
		
	}
	
	public static String removePunc(String string) {
		string = string.replace(',' , ' ');
		string = string.replace('.' , ' ');
		string = string.replace(';' , ' ');
		string = string.replace(':' , ' ');
		string = string.replace('-' , ' ');
		string = string.replace('?' , ' ');
		string = string.replace('!' , ' ');
		string = string.toLowerCase();
		return string;
	}

}
