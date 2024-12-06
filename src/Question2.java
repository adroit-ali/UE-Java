import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        int table = inp.nextInt();
        int[] arr = new int[10];
        for (int i = 1; i <= 10 ; i++) {
            int result = table*i;
            arr[i-1] = result;
            System.out.println(table+" x "+i+" = "+result);
        }
        // agr dil kra to array asa print hogi
        for (int i = 0; i < 10 ; i++) {
            System.out.println(arr[i]+ ",");
        }
    }
}
