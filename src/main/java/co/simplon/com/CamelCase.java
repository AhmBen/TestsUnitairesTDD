package co.simplon.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {

	public static String camelCase(String str) {
		String result = "";
		
		if (str != null)
		{
			

			
			
			String[] listWords = str.split("[^a-zA-Z]+"); //Separe tout les caract non alphanum dans un tableau
		
			for(int i = 0; i < listWords.length; i++)
			{
				/*
				Pattern p = Pattern.compile("([A-Z][a-z0-9]+)+(\\_[a-z0-9]+([A-Z][a-z0-9]+)*)?(\\-[a-z0-9]+([A-Z][a-z0-9]+)*)?");
				// cr�ation d'un moteur de recherche
				Matcher m = p.matcher(listWords[i]);
				while(m.find()) {
				    // affichage de la sous-cha�ne captur�e,
				    // de l'index de d�but dans la cha�ne originale
				    // et de l'index de fin
				    System.out.println("Le texte \"" + m.group() + "\" d�bute � " + m.start() + " et termine � " + m.end());
				    System.out.println(m.groupCount());
				}
				*/
				if (i < 1)
				{
					result = listWords[i].toLowerCase(); //premier mot, pas de majuscule
				}
				else
				{
					result += ucFirst(listWords[i].toLowerCase()); //mot(s) suivant(s) => majuscule
				}
			}
		}
		
		return result == "" ? null : result;
		
	}
	
	public static String ucFirst(final String name) {
	    return name.toUpperCase().charAt(0) + name.substring(1);
	}
	
}
