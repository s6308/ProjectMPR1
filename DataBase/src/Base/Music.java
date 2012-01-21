package Base;

public class Music {

	private static int maxId=0;
	private int MusicId;
	public String Author, Title;

	public Music(String author, String title)
	{
	super();
	this.Author = author;
	this.Title = title;
	this.MusicId=maxId++;
	}

	void ViewMusic()
	{
	System.out.println("ID: "+MusicId+" - Autor: "+Author+" - Title: "+Title);
	}

	public int getMusicId()
	{
	return MusicId;
	}

	public String getTitle()
	{
	return Title;
	}

}
