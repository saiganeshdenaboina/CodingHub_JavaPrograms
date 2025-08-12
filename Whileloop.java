public class Whileloop
{
	public static void main(String[] args)
	{
		// 1. Count the number of digits in the given number
		/*
		int num = 1243, count = 0;
		while(num != 0)
		{
			num /= 10;
			count++;
		}
		System.out.println("Total digits: " + count);
		*/

		// 2. Reverse the given number
		/*
		int num = 1234, rev = 0, temp = num;
		while(num != 0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Original number: " + temp + "\nReverse number: " + rev);
		*/

		// 3. Sum of digits
		/*
		int num = 2536, sum = 0;
		while(num != 0)
		{
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("Sum of digits: " + sum);
		*/

		// 4. Check if number is palindrome
		/*
		int num = 27872, rev = 0, temp = num;
		while(num != 0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if(temp == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		*/

		// 5. Factorial of a number
		/*
		int num = 5, fact = 1;
		while(num > 0)
		{
			fact *= num;
			num--;
		}
		System.out.println("Factorial is: " + fact);
		*/

		// 6. Sum of even and odd digits
		/*
		int num = 78943, eCount = 0, oCount = 0;
		while(num != 0)
		{
			int rem = num % 10;
			if(rem % 2 == 0)
				eCount += rem;
			else
				oCount += rem;
			num /= 10;
		}
		System.out.println("Sum of even digits: " + eCount);
		System.out.println("Sum of odd digits: " + oCount);
		System.out.println("Total sum: " + (eCount + oCount));
		*/

		// 7. Armstrong number (e.g. 153 = 1^3 + 5^3 + 3^3)
		/*
		int num = 153, sum = 0, temp = num;
		while(num != 0)
		{
			int rem = num % 10;
			sum += rem * rem * rem;
			num /= 10;
		}
		if(sum == temp)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");
		*/

		// 8. Prime number check
		/*
		int num = 17, i = 2, count = 0;
		while(i <= num / 2)
		{
			if(num % i == 0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count == 0)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
		*/

		// 9. GCD of two numbers
		/*
		int a = 20, b = 30, gcd = 1, i = 1;
		while(i <= a && i <= b)
		{
			if(a % i == 0 && b % i == 0)
				gcd = i;
			i++;
		}
		System.out.println("GCD is: " + gcd);
		*/

		// 10. LCM of two numbers
		/*
		int a = 12, b = 18, lcm = (a > b) ? a : b;
		while(true)
		{
			if(lcm % a == 0 && lcm % b == 0)
			{
				System.out.println("LCM is: " + lcm);
				break;
			}
			lcm++;
		}
		*/

		// 11. Sum of even-position digits (from right)
		/*
		int num = 123456, pos = 1, sum = 0;
		while(num != 0)
		{
			int rem = num % 10;
			if(pos % 2 == 0)
				sum += rem;
			num /= 10;
			pos++;
		}
		System.out.println("Sum of even-position digits: " + sum);
		*/

		// 12. Product of digits
		/*
		int num = 2345, product = 1;
		while(num != 0)
		{
			int rem = num % 10;
			product *= rem;
			num /= 10;
		}
		System.out.println("Product of digits: " + product);
		*/

		// 13. Count digits that are even
		/*
		int num = 78439, evenCount = 0;
		while(num != 0)
		{
			int rem = num % 10;
			if(rem % 2 == 0)
				evenCount++;
			num /= 10;
		}
		System.out.println("Number of even digits: " + evenCount);
		*/

		// 14. Print digits in reverse order
		/*
		int num = 9876;
		System.out.print("Digits in reverse: ");
		while(num != 0)
		{
			System.out.print(num % 10 + " ");
			num /= 10;
		}
		*/

		// 15. Count number of zeros in number
		/*
		int num = 10203040, zeroCount = 0;
		while(num != 0)
		{
			int rem = num % 10;
			if(rem == 0)
				zeroCount++;
			num /= 10;
		}
		System.out.println("Number of zeros: " + zeroCount);
		*/
	}
}
