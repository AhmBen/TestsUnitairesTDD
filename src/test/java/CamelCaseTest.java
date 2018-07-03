import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.simplon.com.CamelCase;

public class CamelCaseTest {

	@Test
	public void sendNull()
	{
		assertEquals(null, CamelCase.camelCase(null));
	}
	
	@Test
	public void sendSpace()
	{
		assertEquals(null, CamelCase.camelCase(" "));
	}
	
	
	@Test
	public void sendOneWord()
	{
		assertEquals("toto", CamelCase.camelCase("toto"));
	}
	
	@Test
	public void sendTwoWordsWithSpace()
	{
		assertEquals("totoTiti", CamelCase.camelCase("toto titi"));
	}
	
	@Test
	public void sendTwoWordsWithUnderscore()
	{
		assertEquals("totoTiti", CamelCase.camelCase("toto_titi"));
	}
	
	@Test
	public void sendTwoWordsWithPlus()
	{
		assertEquals("totoTiti", CamelCase.camelCase("toto+titi"));
	}
	
	@Test
	public void sendAlreadyCamelCase()
	{
		assertEquals("totoTitiTutuTete", CamelCase.camelCase("totoTiti tutuTete"));
	}
	
	@Test
	public void sendManyWordsWithSpace()
	{
		assertEquals("totoTitiTataTutu", CamelCase.camelCase("toto titi tata tutu"));
	}
	
	@Test
	public void sendManyWordsWithManyDelimiters()
	{
		assertEquals("totoTitiTataTutuTete", CamelCase.camelCase("toto  ++ + titi+tata-tutu_tete"));
	}
	
	@Test
	public void sendManyWordsWithNumber()
	{
		assertEquals("totoTitiTete", CamelCase.camelCase("toto1titi2tete6"));
	}
	
	@Test
	public void sendManyWordsAllUpperCase()
	{
		assertEquals("totoTitiTete", CamelCase.camelCase("TOTO TITI TETE"));
	}
}
