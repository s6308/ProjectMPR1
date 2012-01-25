package Base;

public class Movie {

	private static int maxId=0;
	private int MovieId;
	public String Title;

	public Movie(String title)
	{
	super();
	this.Title = title;
	this.MovieId=maxId++;
	}

	void ViewMovie()
	{
	System.out.println("ID: "+MovieId+" - Tytul: "+Title);
	}

	public int getMovieId()
	{
	return MovieId;
	}

	public String getTitle()
	{
	return Title;
	}

	public void setTitle(String title) 
	{
		Title = title;
	}
	
	

}

