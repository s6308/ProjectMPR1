package Base;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	Client n1 = new Client("Bernard","Bogusz",55555555,500500500);
	Client n2 = new Client("Marek","Kolonko",585310222,501010111);

	n1.AddMovie(new Movie("Armageddon"));
	n1.AddMovie(new Movie("Mission on Mars"));
	n1.AddMusic(new Music("Korn","Korn"));
	n1.AddGame(new Game("FinalFantasy VII", "PS"));
	n1.AddGame(new Game("MGS4", "PS3"));

	n2.AddMovie(new Movie("Killer"));
	n2.AddMusic(new Music("Korn", "Issues"));
	n2.AddGame(new Game("GTA IV","XBOX360"));


	n1.ViewClient();
	n1.ViewMovie();
	n1.ViewMusic();
	n1.ViewGame();

	System.out.println("\n\n");	

	n2.ViewClient();
	n2.ViewMovie();
	n2.ViewMusic();
	n2.ViewGame();

	System.out.println("\n\n");	


	n1.RemoveGame(0);

	n1.ViewGame();
	System.out.println("\n\n");	
	n1.AddGame(new Game("Killzone","PS3"));
	n1.ViewGame();

	}

}
