package Base;

import java.util.ArrayList;
import java.util.List;

public class Client {

	String Name,Surname;
	int Phone, Mobile;

	public List<Movie> movie = new ArrayList<Movie>();
	public List<Music> music = new ArrayList<Music>();
	public List<Game> game = new ArrayList<Game>();

	Client(String name, String surname, int phone, int mobile)
	{
	this.Name=name;
	this.Surname=surname;
	this.Phone=phone;
	this.Mobile=mobile;
	this.movie=new ArrayList<Movie>();
	this.music=new ArrayList<Music>();
	this.game=new ArrayList<Game>();
	}
	
	public void ViewClient()
	{
	System.out.println("Dane Klienta: ");
	System.out.println("Imie: "+this.Name+"; Nazwisko: "+this.Surname+"; Telefon: "+this.Phone+"; Tel. kom.: "+this.Mobile);
	System.out.println("");
	}

	public void ViewMovie()
	{
	for(Movie a : movie)
	a.ViewMovie();
	System.out.println("");
	}
	
	public void ViewMusic()
	{
	for(Music b : music)
	b.ViewMusic();
	System.out.println("");
	}

	public void ViewGame()
	{
	for(Game c : game)
	c.ViewGame();
	System.out.println("");
	}

	/**Movie**/
	
	public void AddMovie(Movie movies)
	{
	movie.add(movies);
	}

	public void CzyscGry()
	{
	movie.clear();
	}

	int FindMovie(String title)
	{
	int a=0;
	for(Movie movie1 : movie)
	if(movie1.getTitle()==title)
		{
		a=movie.indexOf(movie1);
		break;
		}
	return a;
	}

	int FindMovie(int findid)
	{
	int b=0;
	for(Movie movie2 : movie)
	if(movie2.getMovieId()==findid)
		{
		b=movie.indexOf(movie2);
		break;
		}
	return b;
	}

	public void RemoveMovie(String titler)
	{
	movie.remove(FindMovie(titler));
	}

	public void RemoveMovie(int c)
	{
	movie.remove(FindMovie(c));
	}

	public void EditMovie(int keyid, String newtitle)
	{
	int d=FindMovie(keyid);
	movie.get(d).Title=newtitle;
	}

	public void EditMovie(String movietitle, String newtitle)
	{
	int d=FindMovie(movietitle);
	movie.get(d).Title=newtitle;
	}


	/**Music**/

	public void AddMusic(Music music1)
	{
	music.add(music1);
	}

	public void CzyscMusic()
	{
	music.clear();
	}

	int FindMusic(int findid)
	{
	int a=0;
	for(Music music1 : music)
	if(music1.getMusicId()==findid)
		{
		a=music.indexOf(music);
		break;
		}
	return a;
	}

	int FindMusic(String musictitle)
	{
	int b =0;
	for (Music music2 : music)
	if(music2.getTitle()==musictitle)
		{
		b=music.indexOf(music2);
		break;
		}
	return b;
	}

	public void RemoveMusic(int j)
	{
	music.remove(FindMusic(j));
	}

	public void RemoveMusic (String album)
	{
	music.remove(FindMusic(album));
	}

	public void EditMusic(int keyid, String newauthor, String newtitle)
	{
	int c=FindMusic(keyid);
	music.get(c).Author=newauthor;
	music.get(c).Title=newtitle;
	}

	public void EditMusic(String title, String newauthor, String newtitle)
	{
	int d=FindMusic(title);
	music.get(d).Author=newauthor;
	music.get(d).Title=newtitle;
	}

	/**Game**/
	
	public void AddGame(Game game1)
	{
	game.add(game1);
	}

	public void ClearGame()
	{
	game.clear();
	}

	int FindGame(int l)
	{
	int a=0;
	for(Game game1 : game)
	if(game1.getGameId()==l){
	a=game.indexOf(game1);
	}
	return a;
	}

	int FindGame (String findgame){
	int b = 0;
	for(Game game2 : game)
	if(game2.getTitle()==findgame){
	b=game.indexOf(findgame);
	}
	return b;
	}

	public void RemoveGame(int removegame) {
	game.remove(FindGame(removegame));

	}
	public void RemoveGame(String removegame1)
	{
	game.remove(FindGame(removegame1));
	}

	public void Editgame(int position, String newtitle, String newplatform) {
	int w=FindGame(position);
	game.get(w).Title=newtitle;
	game.get(w).Platform=newplatform;
	}

	public void EditGame(String gamename, String newtitle, String newplatform ){
	int w=FindGame(gamename);
	game.get(w).Title=newtitle;
	game.get(w).Platform=newplatform;
	}

}

