/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: A walkthrough program to help troubleshoot wifi problems
 * Due: 2/14/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: B. Leigh Vining
 */


import java.util.Scanner; //to be able to use the scanner method

public class WiFiDiagnosis
{
	//using nested if statement format until answer is yes
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //scanner to get yes/no answer

		System.out.println("If you have a problem with internet connectivity, this Wi-Fi diagnosis might work");

		System.out.println("\nFirst step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		String answer = input.nextLine(); //variable holder for scanner

		if (answer.contains("yes") || answer.contains("Yes")) //take into account capitalization
		{
			System.out.println("This seemed to work");
		}
		else if (answer.contains("no") || answer.contains("No")) // when answer is no, go to next step
		{
			System.out.println("Second step: reboot the router");
			System.out.println("are you able to connect to with the internet? (yes or no)");
			answer = input.nextLine();

			if (answer.contains("yes") || answer.contains("Yes")) //when step 2 worked
			{
				System.out.println("This seemed to work");
			}
			else if (answer.contains("no") || answer.contains("No")) //otherwise, keep the nesting statements going
			{
				System.out.println("Third step: make sure the cables to the router are plugged in firmly and the router is getting power");
				System.out.println("are you able to connect to with the internet? (yes or no)");
				answer = input.nextLine();

				if (answer.contains("yes") || answer.contains("Yes"))
				{
					System.out.println("This seemed to work");
				}
				else if (answer.contains("no") || answer.contains("No"))
				{
					System.out.println("Fourth step: move the computer closer to the router");
					System.out.println("are you able to connect to with the internet? (yes or no)");
					answer = input.nextLine();

					if (answer.contains("yes") || answer.contains("Yes"))
					{
						System.out.println("This seemed to work");
					}
					else if (answer.contains("no") || answer.contains("No"))
					{
						System.out.println("Fifth step: contact your ISP");
					}
				}
			}
		}
		System.out.println("\nProgrammer: B. Leigh Vining"); //to print name at end of program, no matter which IF statement
	}
}