import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.simplon.com.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void return1IfFizz11()
	{
		assertEquals("1", FizzBuzz.fizzBuzz(1, 1));
	}
	
	@Test
	public void return2IfFizz22()
	{
		assertEquals("2", FizzBuzz.fizzBuzz(2, 2));
	}
	
	@Test
	public void returnFizzIfFizz33()
	{
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3));
	}
	
	@Test
	public void returnBuzzIfFizz55()
	{
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 5));
	}
	
	@Test
	public void returnFizzBuzzIfFizz1515()
	{
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 15));
	}
	
	@Test
	public void return12IfFizz12()
	{
		assertEquals("12", FizzBuzz.fizzBuzz(1, 2));
	}
	
	@Test
	public void return12FizzIfFizz13()
	{
		assertEquals("12Fizz", FizzBuzz.fizzBuzz(1, 3));
	}
	
	@Test
	public void return12Fizz4BuzzIfFizz15()
	{
		assertEquals("12Fizz", FizzBuzz.fizzBuzz(1, 5));
	}
	
	@Test
	public void returnFullIfFizz120()
	{
		assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", FizzBuzz.fizzBuzz(1, 20));
	}
}
