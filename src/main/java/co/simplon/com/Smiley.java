package co.simplon.com;

import java.util.ArrayList;
import java.util.List;

public class Smiley {

	public static int countSmileys(List<String> arr) {
		//return 0;
		//return arr == null ? 0 : arr.size();
		
		List <String> valideSmiley = new ArrayList<String>();
		valideSmiley.add(":)");
		
		int result = 0;
		
		if (arr != null) {
			for (String a: arr) {
	            if(valideSmiley.contains(a)) {
	            	result++;
	            }
	        }
		}
		return result;		
	}

}
