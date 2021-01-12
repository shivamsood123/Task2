package task2;
import java.util.*;
public class Task2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        int min = input.nextInt();

        int hours = min / 60;
        int days = hours / 24;
        int years = days / 365;
        
        int rdays = days % 365;
        

        System.out.println(min + " minutes is approximately " + years + " years and " + rdays + " days");
    }
    
}
