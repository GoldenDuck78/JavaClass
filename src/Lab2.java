import java.util.Scanner;

public class Lab2 {
    public static void main (String[] args) {
        float[] mySecondArray = new float[10];
        Scanner input = new Scanner(System.in);
        float n;

        for (int i = 0; i<10; i++) {
            System.out.println("Enter a number: ");
            input = new Scanner(System.in);
            n = input.nextFloat();
            mySecondArray[i] = n;
        }

        int fiveCount = 0;
        int fiveSum = 0;
        for (int i = 0; i < 10; i++) {
            if (mySecondArray[i]%5 == 0) {
                fiveCount++;
                fiveSum+= mySecondArray[i];
                System.out.print(mySecondArray[i] + " ");
            }
        }

        System.out.print("This array has " + fiveCount);
        System.out.println(" and its sump is: " + fiveSum);



    }
}
