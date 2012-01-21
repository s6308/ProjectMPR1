package Base;

public class Game {


	private static int maxId=0;
	private int GameId;
	String Title, Platform;
	 
	public String getTitle()
	{
	return Title;
	}

	public Game(String title, String platform)
	{
	this.Title=title;
	this.Platform=platform;
	this.GameId=maxId++;
	}

	void ViewGame()
	{
	System.out.println("ID: "+GameId+" - Tytul: "+Title+" - "+Platform);
	}

	public int getGameId() 
	{
	return GameId;
	}

}



