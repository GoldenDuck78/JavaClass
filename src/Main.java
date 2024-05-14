
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] myFirstArray = new int[10];
        Scanner input;
        int n;

        for (int i = 0; i<10; i++) {

            System.out.println("Enter a number: ");
            input = new Scanner(System.in);
            n = input.nextInt();
            myFirstArray[i] = n;
        }

        int evenCount = 0;
        int evenSum = 0;
        for (int i = 0; i < 10; i++) {
            if (myFirstArray[i]%2 == 0) {
                evenCount++;
                evenSum+= myFirstArray[i];
            }
        }

        System.out.print("This array has " + evenCount );
        System.out.println(" even numbers and its sump is: " + evenSum);


        int max = 0;
        int min = 1;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (myFirstArray[i] > max) {
                max = myFirstArray[i];
            }

            if (myFirstArray[i] < min) {
                min = myFirstArray[i];
            }
            sum +=myFirstArray[i];
        }

        System.out.println("The maxium element is: " +max);
        System.out.println("The minium element is: " + min);

        System.out.println("Here is the revere of array: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(myFirstArray[i]+ " ");
        }

        int sevenCount = 0;
        int sevenSum = 0;

        for (int i = 0; i < 10; i++) {
            if (myFirstArray[i]%7 == 0) {
                sevenCount++;
                sevenSum+= myFirstArray[i];
            }
        }
        System.out.print("This array has " + sevenCount);
        System.out.println(" and its sum is: " + sevenSum);

        System.out.println("This array's average is: " + (sum/10));

        int maxCount=0;
        for (int i=0; i <10; i++) {
            if (myFirstArray[i] == max) {
                maxCount++;
            }
        }
        System.out.println ("There is (are) " + maxCount + " that equals to " +max);
    }
}
