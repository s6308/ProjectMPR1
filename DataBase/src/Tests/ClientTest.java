package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Base.Client;
import Base.Game;
import Base.Movie;
import Base.Music;



public class ClientTest {
	
	public List<Movie> movies= new ArrayList<Movie>();
	private List<Music> musics= new ArrayList<Music>();
	private List<Game> games= new ArrayList<Game>();
	private Client Test = new Client("name", "surname", 1111, 2222, movies, musics, games);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Test.AddMovie("title1");
		Test.AddMovie("title2");
		Test.AddMusic("author1", "title_1");
		Test.AddMusic("author2", "title_2");
		Test.AddGame ("game1", "platform1");
		Test.AddGame ("game2", "platform2");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testClientStringStringIntInt() {
		assertTrue(Test.getName().equals("name"));
		assertTrue(Test.getSurname().equals("surname"));
		assertEquals(Test.getPhone(), 1111);
		assertEquals(Test.getMobile(), 2222);
	}

	@Test
	public void testGetName() {
		assertTrue(Test.getName() == "name");
	}

	@Test
	public void testSetName() {
		Test.setName("name_1");
		assertTrue(Test.getName().equals("name_1"));
		Test.setName("name");
		assertTrue(Test.getName().equals("name"));
	}

	@Test
	public void testAddMovie() {
		assertTrue(Test.getMovie().size() == 2);
		Test.AddMovie("title3");
		assertEquals("title3", Test.getMovie().get(2).getTitle());
		assertTrue(Test.getMovie().size() == 3);
	}

	@Test
	public void testFindMovieString() {	
		assertNotNull(Test.FindMovie("title1"));
	}

	@Test
	public void testFindMovieInt() {
		assertNotNull(Test.FindMovie(1));
	}

	@Test
	public void testRemoveMovieString() {
		assertTrue(Test.getMovie().size() == 2);
		Test.RemoveMovie("title1");
		assertTrue(Test.getMovie().size() == 1);
	}

	@Test
	public void testRemoveMovieInt() {
		assertTrue(Test.getMovie().size() == 2);
		Test.RemoveMovie(1);
		assertTrue(Test.getMovie().size() == 1);
	}

	@Test
	public void testEditMovie() {
		assertEquals("title1", Test.getMovie().get(0).getTitle());
		Test.EditMovie(Test.FindMovie("title1"), "title1_new");
		assertSame("title1_new", Test.getMovie().get(0).getTitle());
	}

	@Test
	public void testAddMusic() {
		assertTrue(Test.getMusic().size() == 2);
		Test.AddMusic("author3", "title_3");
		assertEquals("title_3", Test.getMusic().get(2).getTitle());
		assertTrue(Test.getMusic().size() == 3);
	}

	@Test
	public void testFindMusicInt() {
		assertNotNull(Test.FindMusic(1));
	}

	@Test
	public void testFindMusicString() {
		assertNotNull(Test.FindMusic("title_1"));
		assertEquals(Test.FindMusic("title_1").getTitle(), Test.getMusic().get(0).getTitle());
	}

	@Test
	public void testRemoveMusicInt() {
		assertTrue(Test.getMusic().size() == 2);
		Test.RemoveMusic(1);
		assertFalse(Test.getMusic().size() == 2);
	}

	@Test
	public void testRemoveMusicString() {
		assertTrue(Test.getMusic().size() == 2);
		Test.RemoveMusic("title_1");
		assertTrue(Test.getMusic().size() == 1);
	}
	//-----------------------------------dalej testy
	@Test
	public void testEditMusic() {
		assertSame("author1", Test.getMusic().get(0).getAuthor());
		Test.EditMusic(Test.FindMusic("title_1"), "author1_new");
		assertEquals("author1_new", Test.getMusic().get(0).getAuthor());
		assertNotSame("author1", Test.getMusic().get(0).getAuthor());
	}

	@Test
	public void testAddGame() {
		assertTrue(Test.getGame().size() == 2);
		Test.AddGame("game3", "platform3");
		assertEquals("game3", Test.getGame().get(2).getTitle());
		assertTrue(Test.getGame().size() == 3);
	}

	@Test
	public void testFindGameInt() {
		assertNotNull(Test.FindGame(1));
	}

	@Test
	public void testFindGameString() {
		assertNotNull(Test.FindGame("game1"));
		assertSame(Test.FindGame("game1").getTitle(), Test.getGame().get(0).getTitle());
	}

	@Test
	public void testRemoveGameInt() {
		assertTrue(Test.getMusic().size() == 2);
		Test.RemoveMusic(1);
		assertTrue(Test.getMusic().size() == 1);
	}

	@Test
	public void testRemoveGameString() {
		assertTrue(Test.getGame().size() == 2);
		Test.RemoveGame("game1");
		assertTrue(Test.getGame().size() == 1);
	}

	@Test
	public void testEditGame() {
		assertEquals("game1", Test.getGame().get(0).getTitle());
		Test.EditGame(Test.FindGame("game1"), "game1_new");
		assertSame("game1_new", Test.getGame().get(0).getTitle());
	}

}
