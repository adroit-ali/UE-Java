import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numerical = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] StoreNumeral = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter "+i+" number: ");
            int num = input.nextInt();
            if(1 <= num && num <= 10)
                StoreNumeral[i] = numerical[num];
            else{
                System.out.println("Invalid Number Try Again");
                i--;
            }
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.print(StoreNumeral[i]+ ((i!=9)?",":""));
        }
    }
}
