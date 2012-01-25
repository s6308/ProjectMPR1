package Base;

import java.util.ArrayList;
import java.util.List;


public class Client {

	private String Name,Surname;
	private int Phone, Mobile;
	private List<Movie> movies = new ArrayList<Movie>();
	private List<Music> musics = new ArrayList<Music>();
	private List<Game> games = new ArrayList<Game>();

	public Client(String name, String surname, int phone, int mobile)
	{
	this.Name=name;
	this.Surname=surname;
	this.Phone=phone;
	this.Mobile=mobile;
	}
	
	public Client(String name, String surname, int phone, int mobile, List<Movie> movies, List<Music> musics, List<Game> games)
	{
	this.Name=name;
	this.Surname=surname;
	this.Phone=phone;
	this.Mobile=mobile;
	this.movies=new ArrayList<Movie>();
	this.musics=new ArrayList<Music>();
	this.games=new ArrayList<Game>();
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String name)
	{
		Name = name;
	}
	
	public String getSurname()
	{
		return Surname;
	}

	public void setSurname(String surname)
	{
		Surname = surname;
	}

	public int getPhone()
	{
		return Phone;
	}

	public void setPhone(int phone)
	{
		Phone = phone;
	}

	public int getMobile()
	{
		return Mobile;
	}

	public void setMobile(int mobile)
	{
		Mobile = mobile;
	}

	public List<Movie> getMovie()
	{
		return movies;
	}

	public void setMovie(List<Movie> movie)
	{
		this.movies = movie;
	}

	public List<Music> getMusic()
	{
		return musics;
	}

	public void setMusic(List<Music> music)
	{
		this.musics = music;
	}

	public List<Game> getGame()
	{
		return games;
	}

	public void setGame(List<Game> game)
	{
		this.games = game;
	}

	public void ViewClient()
	{
	System.out.println("Dane Klienta: ");
	System.out.println("Imie: "+this.Name+"; Nazwisko: "+this.Surname+"; Telefon: "+this.Phone+"; Tel. kom.: "+this.Mobile);
	System.out.println("");
	}

	public void ViewMovie()
	{
	for(Movie a : movies)
	a.ViewMovie();
	System.out.println("");
	}
	
	public void ViewMusic()
	{
	for(Music b : musics)
	b.ViewMusic();
	System.out.println("");
	}

	public void ViewGame()
	{
	for(Game c : games)
	c.ViewGame();
	System.out.println("");
	}

	/**Movie**/
	
	public void AddMovie(String title)
	{
	movies.add(new Movie(title));
	}

	public void CleanMovie()
	{
	movies.clear();
	}

	public Movie FindMovie(String title)
	{
	for(Movie movie1 : movies)
		if(movie1.getTitle()==title)
		{
		return movie1;
		}
		return null;		
	}

	public int FindMovie(int findid)
	{
	int b=0;
	for(Movie movie2 : movies)
		if(movie2.getMovieId()==findid)
			{
			b=movies.indexOf(movie2);
			break;
			}
		return b;
	}

	public void RemoveMovie(String titler)
	{
	movies.remove(FindMovie(titler));
	}

	public void RemoveMovie(int c)
	{
	movies.remove(FindMovie(c));
	}

	public void EditMovie(Movie movie1, String newtitle)
	{
		int number = 0;
		for(Movie  movie : movies)
		{
			if(movie.getTitle()==movie1.getTitle())
			{
				movies.set(number, new Movie(newtitle));
			}
		}
	}

	/**Music**/

	public void AddMusic(String author, String title)
	{
	musics.add(new Music(author, title));
	}

	public void CleanMusic()
	{
	musics.clear();
	}

	public int FindMusic(int findid)
	{
	int a=0;
	for(Music music1 : musics)
	if(music1.getMusicId()==findid)
		{
		a=musics.indexOf(music1);
		break;
		}
	return a;
	}

	public Music FindMusic(String title)
	{
	for(Music music1 : musics)
		if(music1.getTitle()==title)
		{
		return music1;
		}
		return null;		
	}

	public void RemoveMusic(int j)
	{
	musics.remove(FindMusic(j));
	}

	public void RemoveMusic (String title)
	{
	musics.remove(FindMusic(title));
	}

	public void EditMusic(Music music1, String newauthor)
	{
		int number = 0;
		for(Music  music : musics)
		{
			if(music.getTitle()==music1.getTitle())
			{
			musics.set(number, new Music(newauthor, music1.getTitle()));
			}
		}
	}

	/**Game**/
	
	public void AddGame(String title, String platform)
	{
	games.add(new Game(title, platform));
	}

	public void ClearGame()
	{
	games.clear();
	}

	public int FindGame(int l)
	{
	int a=0;
	for(Game game1 : games)
		if(game1.getGameId()==l)
		{
		a=games.indexOf(game1);
		}
	return a;
	}

	public Game FindGame(String title)
	{
	for(Game game1 : games)
		if(game1.getTitle()==title)
		{
		return game1;
		}
		return null;		
	}
	
	public void RemoveGame(int g)
	{
	games.remove(FindGame(g));
	}
	
	public void RemoveGame(String title)
	{
	games.remove(FindGame(title));
	}


	public void EditGame(Game game1, String newtitle)
	{
		int number = 0;
		for(Game  game : games)
		{
			if(game.getTitle()==game1.getTitle())
			{
				games.set(number, new Game(newtitle, game1.getPlatform()));
			}
		}
	}

}

