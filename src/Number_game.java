import javax.xml.transform.stax.StAXResult;
import java.util.Random;
import java.util.Scanner;

public class Number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int max_Attempts = 5;
        int rounds =0;
        int total_Attempts = 0;

        System.out.println("Welcome to the Number game!");
        System.out.println( "Guess the number between " + lowerBound + " and " + upperBound +"!");


        boolean Play_again = true;
        while (Play_again) {
            int Target_number = rm.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            System.out.println("New round! let's begin!!! ");
            while (attempts < max_Attempts) {
                System.out.println("Enter your guessed number : ");
                int user_guess = sc.nextInt();
                attempts++;

                if (user_guess == Target_number) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else if (user_guess < Target_number) {
                    System.out.println("Too Low!!! The number is greater than your guess.");
                } else {
                    System.out.println("Too High!!! The number is smaller than your guess.");
                }
                if (attempts == max_Attempts) {
                    System.out.println("You've reached the limit of your tries. Maximum " + max_Attempts + " attempts! ");
                    System.out.println("The correct number is : " + Target_number);
                }
                total_Attempts += attempts;
                rounds++;
                System.out.println("Play again? (Yes/No): ");
                String playAgainInput = sc.next().toLowerCase();
                Play_again = playAgainInput.equals("Yes");
            }
            System.out.println("Thanks for playing!!!");
            System.out.println("Total round played : "+ rounds);
            System.out.println( "Total attempts : "+ total_Attempts);
                }
                }
                }




