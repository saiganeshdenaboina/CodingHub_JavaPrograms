public class Sumofnatural
{
	public static void main(String[] args)
	{
		// 1. Forward iteration
		/*
		for(int x = 1; x <= 10; x++)
			System.out.println("Hello World!");
		*/

		// 2. Backward iteration
		/*
		for(int x = -2; x >= -11; x--)
			System.out.println(x);
		*/

		// 3. Sum of first 10 natural numbers
		/*
		int sum = 0;
		for(int x = 1; x <= 10; x++)
			sum += x;
		System.out.println("Sum: " + sum);
		*/

		// 4. Factorial of a number
		/*
		int fact = 1;
		for(int i = 1; i <= 5; i++)
			fact *= i;
		System.out.println("Factorial: " + fact);
		*/

		// 5. Print each character in a string
		/*
		String name = "Ganesh";
		for(int i = 0; i < name.length(); i++)
			System.out.println(name.charAt(i));
		*/

		// 6. Print even numbers from 1 to 20
		/*
		for(int i = 2; i <= 20; i += 2)
			System.out.println(i);
		*/

		// 7. Multiplication table of a number
		/*
		int num = 7;
		for(int i = 1; i <= 10; i++)
			System.out.println(num + " x " + i + " = " + (num * i));
		*/

		// 8. Reverse a number
		/*
		int n = 1234, rev = 0;
		for(; n != 0; n /= 10)
			rev = rev * 10 + n % 10;
		System.out.println("Reversed number: " + rev);
		*/

		// 9. Check if a string is palindrome
		/*
		String str = "madam";
		boolean isPal = true;
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPal = false;
				break;
			}
		}
		System.out.println(str + " is " + (isPal ? "Palindrome" : "Not Palindrome"));
		*/

		// 10. Check Armstrong number (3-digit)
		/*
		int num2 = 153, temp = num2, result = 0;
		for(; temp != 0; temp /= 10)
			result += Math.pow(temp % 10, 3);
		System.out.println(num2 + (result == num2 ? " is an Armstrong number" : " is not an Armstrong number"));
		*/

		// 11. Print prime numbers from 1 to 50
		/*
		for(int i = 2; i <= 50; i++) {
			boolean isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i + " is Prime");
		}
		*/

		// 12. Fibonacci series for first N terms
		/*
		int a = 0, b = 1;
		for(int i = 0; i < 10; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
		*/

		// 13. Pattern - Right Triangle of Stars
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		// 14. Pattern - Inverted Right Triangle
		/*
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		// 15. Pattern - Number Triangle
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		*/

	}
}
