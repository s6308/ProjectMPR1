package Base;

public class Main {
	

	public static void main(String[] args) {


	Client client1 = new Client("Bernard","Bogusz",55555555,500500500);
	Client client2 = new Client("Marek","Kolonko",585310222,501010111);

	client1.AddMovie(new Movie("Armageddon"));
	client1.AddMovie(new Movie("Mission on Mars"));
	client1.AddMovie(new Movie("Star Wars"));
	

	client1.AddMusic(new Music("Korn","Korn"));
	client1.AddMusic(new Music("Slipknot","Slipknot"));

	client1.AddGame(new Game("World of Warcraft", "PC"));
	client1.AddGame(new Game("FinalFantasy VII", "PS"));
	client1.AddGame(new Game("MGS4", "PS3"));

	


	client2.AddMovie(new Movie("Killer"));
	client2.AddMusic(new Music("Korn", "Issues"));
	client2.AddGame(new Game("GTA IV","XBOX360"));

	client1.ViewClient();
	client1.ViewMovie();
	client1.ViewMusic();
	client1.ViewGame();

	System.out.println("\n\n\n");

	client1.RemoveMovie("Armageddon");
	client1.RemoveMovie(3);
	client1.RemoveMusic(2);
	client1.RemoveMusic("Korn");
	client1.RemoveGame(2);

	client1.ViewMovie();
	client1.ViewMusic();
	client1.ViewGame();
	System.out.println("\n\n\n");

	client1.EditMovie(1,"Haloween");
	client1.EditMusic(2,"Slipknot","Slipknot");
	client1.ViewMovie();
	}

	}
