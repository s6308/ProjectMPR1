package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Base.Music;

public class MusicTest {
	
	private Music Test = new Music("author1", "title1");

	@Test
	public void testMusic() {
		assertTrue(Test.getTitle().equals("title1"));
		assertEquals(Test.getAuthor(), "author1");
	}

	@Test
	public void testGetTitle() {
		assertSame(Test.getTitle(), "title1");
	}

	@Test
	public void testGetAuthor() {
		assertSame(Test.getAuthor(), "author1");
		
	}

	@Test
	public void testSetTitle() {
		Test.setTitle("title3");		
		assertTrue(Test.getTitle().equals("title3"));
	}

	@Test
	public void testSetAuthor() {
		Test.setAuthor("author3");		
		assertEquals(Test.getAuthor(), "author3");
	}

}
