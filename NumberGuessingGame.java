import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        char choice;
        Scanner sc = new Scanner(System.in);
        do {      //Most outer loop -->> to restart the Game.. 
        Random random = new Random();
        int SecretNumber = random.nextInt(100) + 1;  //generate random number 1 - 100
        int count = 0;
        int number;
        System.out.println("----------------------------------");
        System.out.println(" Welcome to Number Guessing Game");
        System.out.println("----------------------------------");
        System.out.println("Choose a Number between 1 and 100." );
    do {                   //inner loop --->> to play the Game..
        System.out.print("Choose a Random number: ");
        number = sc.nextInt();
        count++;
        //Compare --- >>

    if(SecretNumber == number){
        System.out.println("Congratulations!\n You guessed the number in " + count +  " attempts.");
        System.out.println(".......You have Won the Game.......");
    }
    else if(number > SecretNumber){
        System.out.println("The Guess Number is Less than " + number);
    }
    else{
       System.out.println("The Guess Number is Greater than " + number);
    }
    System.out.println("Attempts Left : "+ (5-count));
    } 
    while (SecretNumber != number && count < 5);
    if(SecretNumber != number){
        System.out.println("You've exhausted all attempts. The correct number was: " + SecretNumber);
        System.out.println(".......Game Over.......");
    }
    
    System.out.print("Want to Restart Game ? (Y/N): ");
    choice = sc.next().charAt(0);
    } while (choice == 'Y');
    sc.close();
}
}
