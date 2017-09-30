/*
 * Name: Ryan Monaghan
 * ID: R00115129
 */
import java.util.Scanner;

public class qwerty {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling the methods.
		welcome();
		//prompt questions.
		int scoreForTheHole= readPosInt("How many shots have you taken to complete the hole?");
		int parForTheHole= readPosInt("What was the par for the hole?");
		String score=golfScore(scoreForTheHole, parForTheHole);
		displayScore(score);
	}

	public static void welcome()
	{
	System.out.println("############################# "
					+ "\n# Welcome to my Golf System # "
					+ "\n#############################");
	}
	
	public static int readPosInt(String prompt)
	{
		int value;
			do{
				System.out.println("");
				System.out.print(prompt); 
				
					while (!input.hasNextInt())
					{
						System.out.print("Please try again - integers only please! ");
						System.out.print(prompt); 
							input.nextLine();
					}
				value = input.nextInt();
					input.nextLine();	
					}while (! (value >=1)); //|| value <=11));
					
			return value;
			
			
	}
	
	public static String golfScore(int scoreForTheHole, int parForTheHole)
	{
		if (scoreForTheHole-parForTheHole== -3)
		{
			return ("Albatross");
		}
		
			else if (scoreForTheHole-parForTheHole== -2)
			{
				return ("Eagle");
			}
		
			else if (scoreForTheHole-parForTheHole== -1)
			{
				return("Birdie");
			}
		
			else if (scoreForTheHole==parForTheHole)
			{
				return("Par");
			}
		
			else if (scoreForTheHole-parForTheHole== 1)
			{
				return("Bogey");
			}

		else
		{
			return ("No special Name");
		}
	}
	
	
	public static void displayScore(String score)
	{
		System.out.println(score);
	}
	
}
