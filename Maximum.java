import java.util.Scanner;

public class DigitAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;

        int max = -1, secondMax = -1;
        int min = 9, secondMin = 9;


        while (temp > 0) {
            int digit = temp % 10;

            // Max and second max logic
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit < max && digit > secondMax) {
                secondMax = digit;
            }

            // Min and second min logic
            if (digit < min) {
                secondMin = min;
                min = digit;
            } else if (digit > min && digit < secondMin) {
                secondMin = digit;
            }

            temp /= 10;
        }

        System.out.println("Maximum digit: " + max);
        System.out.println("Second maximum digit: " + (secondMax == -1 ? "Not available" : secondMax));
        System.out.println("Minimum digit: " + min);
        System.out.println("Second minimum digit: " + (secondMin == 9 ? "Not available" : secondMin));
    }
}
