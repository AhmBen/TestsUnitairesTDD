package co.simplon.com;


public class FizzBuzz {
	
	//Exemple : l'appel de fizzBuzz(1, 20); doit retourner 12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz
	public static String fizzBuzz(int min, int max) {
		String result = "";

		for(int i = min; i <= max; i++)
		{
			result += numToString(i);
		}

		return result;	
	}
	
	public static String numToString(int num)
	{
		if (num %  15 == 0) { //Multiple de 15
			return "FizzBuzz";
		}
		if (num %  5 == 0) { //Multiple de 5
			return "Buzz"; 
		}
		if (num %  3 == 0) { //Multiple de 3
			return "Fizz";
		}
			 
		return "" + num; //Pour retourner un String au lieu d'un int
	}
	
}
