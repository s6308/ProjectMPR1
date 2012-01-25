package Base;

public class Game {


	private static int maxId=0;
	private int GameId;
	String Title, Platform;
	 
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
	
	public String getTitle()
	{
	return Title;
	}
	
	public String getPlatform() 
	{
	return Platform;
	}

	public void setGameId(int gameId) {
		GameId = gameId;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public void setPlatform(String platform) {
		Platform = platform;
	}
	
	

}



