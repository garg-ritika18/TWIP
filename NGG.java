import java.util.Random;
import java.util.Scanner;;
public class NGG {
    public static void main(String[] args) throws Exception {
        System.out.println("WELCOMEE TO GUESS NUMBER NAME");
        System.out.println("You will be asked to guess a number to this game.");
        System.out.println("You have Maximum 5 Attemp Limit");
        int num = NumberGuess();
        int i = 1;
        do{
            System.out.println("Guess a number between 1 to 100");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
             if(guess==num){
            System.out.println("Wooho! You guessed the number right. The number is " + num);
            break;
        }
        else if(guess>num){
            System.out.println("Your guess is greater");
        }
        else if(guess<num){
            System.out.println("Your guess is smaller");
        }
    
        }while(i<=5);
    }
    public static int NumberGuess(){
        Random r = new Random();
        int x = r.nextInt(100);
        return x;
    }
}
