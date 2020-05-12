package game;

import java.util.Scanner;

import exception.EmailFormatException;

public interface GameInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setEmail(String email) throws EmailFormatException;
	
	public void setPassword(String password);

	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setGameID(Scanner input);
	
	public void setGameName(Scanner input);
	
	public void setGameEmail(Scanner input);
	
	public void setGamePassword(Scanner input);

}
