import java.util.*;

/*
    Create a class Game, which allows a user to play "Guess the Number" game once.
    
    Game should have the following methods:
    Constructor to generate the random number
    takeUserInput() to take a user input of number
    isCorrectNumber() to detect whether the number entered by the user is true
    getter and setter for noOfGuesses
    Use properties such as noOfGuesses(int), etc to get this task done!

 */

class Game {
    public int num;
    public int uinp;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.num = rand.nextInt(100);
    }

    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess = ");
        this.uinp = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if(num == uinp) {
            System.out.println("Your guess is right");
            System.out.println("You guessed it in = " + noOfGuesses);
            return true;
        } else if(num > uinp) {
            System.out.println("Guess is too low");
            System.out.println("Try again");
        } else if(num < uinp) {
            System.out.println("Guess is too high try again");
            System.out.println("Try again");
        }
        return false;
    }
}
public class Guess_the_number {
    public static void main(String[] args) {
        Game obj = new Game();
        boolean b = false;
        while(!b) {
            obj.takeUserInput();
            b = obj.isCorrectNumber();
        }
    }
}