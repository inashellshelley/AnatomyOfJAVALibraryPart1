
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");

        int limit = sc.nextInt();

        Random random = new Random();

        int r_num= random.nextInt(limit);
        System.out.println("Random number between 0 and "+ (limit)+": "+r_num);

        sc.close();
    }    
}
