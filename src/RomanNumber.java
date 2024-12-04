import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number between 1 to 10: ");
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.println("Roman of 1 is I");
                break;
            case 2:
                System.out.println("Roman of 2 is II");
                break;
            case 3:
                System.out.println("Roman of 3 is III");
                break;
            case 4:
                System.out.println("Roman of 4 is IV");
                break;
            case 5:
                System.out.println("Roman of 5 is V");
                break;
            case 6:
                System.out.println("Roman of 6 is VI");
                break;
            case 7:
                System.out.println("Roman of 7 is VII");
                break;
            case 8:
                System.out.println("Roman of 8 is VIII");
                break;
            case 9:
                System.out.println("Roman of 9 is IX");
                break;
            case 10:
                System.out.println("Roman of 10 is X");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
