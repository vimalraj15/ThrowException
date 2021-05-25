package Exception;

import java.util.Scanner;

public class Voting {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		String req = "Y";
		while(req.equalsIgnoreCase("y"))
		{
			try
			{
			System.out.print("Enter the age of Voter : ");
			int age=  in.nextInt();
			
			if(age < 18)
			{
                throw new InvalidAgeException("age should be >= 18");				
			}
			else if(age >= 18)
			{
				System.out.println("VOTING DONE");
			}
			}
			catch(Exception e)
			{
				System.out.println("ERROR: "+ e);
			}
			finally
			{
			System.out.print("Next Voter [Y/N] : ");
			req = in.next();
			}
		}
	}

}
