import java.util.Scanner;

public class ScoreAverageGrade {
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter 1st Score: ");
        int s1 = myscanner.nextInt();
        System.out.print("Enter 2nd Score: ");
        int s2 = myscanner.nextInt();
        System.out.print("Enter 3rd Score: ");
        int s3 = myscanner.nextInt();
        double avg = (s1+s2+s3)/3;
        System.out.println("Average Scores are: "+avg);
        if(90 <= avg && avg <= 100)
            System.out.println("Score Grade is A");
        else if (80 <= avg && avg <= 89)
            System.out.println("Score Grade is B");
        else if (70 <= avg && avg <= 79)
            System.out.println("Score Grade is C");
        else if (60 <= avg && avg <= 69)
            System.out.println("Score Grade is D");
        else
            System.out.println("Score Grade is F");

    }
}
