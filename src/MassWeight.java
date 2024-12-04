import java.util.Scanner;

public class MassWeight {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Mass of Object in Kilogram: ");
        int mass = inp.nextInt();
        double weight = mass * 9.8;
        System.out.println("Weight of Object is "+weight);
        if(weight>1000)
            System.out.println("It is too Heavy!");
        if(weight<10)
            System.out.println("It is too Light!");
    }
}
