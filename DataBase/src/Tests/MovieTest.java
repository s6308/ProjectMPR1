package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Base.Movie;

public class MovieTest {

	private Movie Test = new Movie("title1");

	@Test
	public void testMovie() {
		assertTrue(Test.getTitle().equals("title1"));
		}

	@Test
	public void testGetTitle() {
		assertSame(Test.getTitle(), "title1");
	}
	
	@Test
	public void testSetTitle() {
		Test.setTitle("title3");		
		assertTrue(Test.getTitle().equals("title3"));
	}

}
