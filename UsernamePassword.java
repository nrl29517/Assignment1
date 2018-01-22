import java.util.Scanner;
public class UsernamePassword
{
	public static void main(String [] args)
	{
	String username = "DeepFriedPotato";
	String password = "password";
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter username:");
	String enteredUsername = input.nextLine();
	System.out.println("Please enter password:");
	String enteredPassword = input.nextLine();
	if (username.equals(enteredUsername) && password.equals(enteredPassword))
	{
	System.out.println("Welcome " + username);
	} else
	{
	System.out.println("Wrong username or password");
	}
	}

}