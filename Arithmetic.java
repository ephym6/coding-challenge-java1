// Java program to demonstrate handling
// the exception using try-catch block

package CodingChallenge;

class Arithmetic
{
	public static void main(String[] args)
	{
		int number1 = 300, number2 = 0;
		try {
            // Code that may throw exception
            int result = number1 / number2;
			System.out.println("Answer: " + result);
		} catch (ArithmeticException e)
		{
            // Handling the exception
			System.out.println("Error; Division by zero is not allowed! " + e);
		} finally {
            System.out.println("Program continues after handling exception");
        }
	}
}