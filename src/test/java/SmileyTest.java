import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import co.simplon.com.Smiley;

public class SmileyTest {

	@Test
	public void sendNull()
	{
		assertEquals(0, Smiley.countSmileys(null));
	}
	
	@Test
	public void sendEmptyList()
	{
		List <String> arr = new ArrayList<String>();	
		assertEquals(0, Smiley.countSmileys(arr));
	}
	
	@Test
	public void sendOneGoodSmiley()
	{
		List <String> arr = new ArrayList<String>();
		arr.add(":)");
		assertEquals(1, Smiley.countSmileys(arr));
	}
	
	@Test
	public void sendOneBadSmiley()
	{
		List <String> arr = new ArrayList<String>();
		arr.add(":(");
		assertEquals(0, Smiley.countSmileys(arr));
	}

}
