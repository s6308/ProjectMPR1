package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Base.Game;

public class GameTest {
	
	private Game Test = new Game("game1", "platform1");

	@Test
	public void testGame() {
		assertTrue(Test.getTitle().equals("game1"));
		assertEquals(Test.getPlatform(), "platform1");
	}

	@Test
	public void testGetTitle() {
		assertSame(Test.getTitle(), "game1");
	}
	
	@Test
	public void testSetTitle() {
		Test.setTitle("game3");		
		assertTrue(Test.getTitle().equals("game3"));
	}

	@Test
	public void testGetPlatform() {
		assertSame(Test.getPlatform(), "platform1");
	}
	
	@Test
	public void testSetPlatform() {
		Test.setPlatform("platform3");		
		assertEquals(Test.getPlatform(), "platform3");
	}

}
