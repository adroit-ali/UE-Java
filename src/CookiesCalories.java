import java.util.Scanner;

public class CookiesCalories {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int cookies = ip.nextInt();
        int calories = cookies*300/4;
        System.out.println("Calories consumed by you are: "+calories);
    }
}
