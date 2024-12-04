import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Miles Driven: ");
        int miles = inp.nextInt();
        System.out.print("Enter Gallons of gas: ");
        int gallons = inp.nextInt();
        double mpg = miles/gallons;
        System.out.println("Mile-per-gallon is "+mpg);
    }
}
