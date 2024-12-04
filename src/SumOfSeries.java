import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive nonzero Integer: ");
        int num = scan.nextInt();
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        System.out.println("Sum of number series till "+num+" is "+total);
    }
}
