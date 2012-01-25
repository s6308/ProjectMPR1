package Base;

public class Main {
	

	public static void main(String[] args) {


	Client client1 = new Client("Bernard","Bogusz",55555555,500500500);
	Client client2 = new Client("Marek","Kolonko",585310222,501010111);

	client1.AddMovie("Armageddon");
	client1.AddMovie("Mission on Mars");
	client1.AddMovie("Star Wars");

	client1.AddMusic("Korn","Korn");
	client1.AddMusic("Slipknot","Slipknot");

	client1.AddGame("World of Warcraft", "PC");
	client1.AddGame("FinalFantasy VII", "PS");
	client1.AddGame("MGS4", "PS3");

	client2.AddMovie("Killer");
	client2.AddMusic("Korn", "Issues");
	client2.AddGame("GTA IV","XBOX360");

	client1.ViewClient();
	client1.ViewMovie();
	client1.ViewMusic();
	client1.ViewGame();

	System.out.println("");

	client1.RemoveMovie("Armageddon");
	client1.RemoveMovie(1);
	client1.RemoveMusic(2);
	client1.RemoveMusic("Korn");
	client1.RemoveGame(2);
	
	client1.ViewClient();
	client1.ViewMovie();
	client1.ViewMusic();
	client1.ViewGame();
	System.out.println("\n");

	client1.EditMovie(client1.FindMovie("Star Wars"),"Haloween");
	client1.EditMusic(client1.FindMusic("Slipknot"),"New_Slipknot");
	client1.EditGame(client1.FindGame("World of Warcraft"),"World of Warcraft II");
	
	client1.ViewClient();
	client1.ViewMovie();
	client1.ViewMusic();
	client1.ViewGame();
	}

	}
