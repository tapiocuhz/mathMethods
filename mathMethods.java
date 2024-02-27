package mathMethods;
import java.util.Scanner;
public class MathMethods {
	
	public class MyMath {
		double number1;
		double number2;
		double tolerance = 0.00001;
		
	public MyMath(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
		
	// METHOD #1: ABSOLUTE VALUE
	public void absolute() {
		double ab1 = Math.abs(number1);
		System.out.println("The absolute value of number 1 is: " + ab1);
	}
	
	public void absolute2() {
		double ab2 = Math.abs(number2);
		System.out.println("The absolute value of number 2 is: " + ab2);
	}
	
	// METHOD #2: COMPARING TWO DOUBLES
	public void compare() {
		boolean comparedValue = Math.abs(number1 - number2) <= tolerance;
		if(comparedValue = true) {
			System.out.println(number1 + " is greater than 0.0001");
		}
		
	}
	
	// METHOD #3: POWER
	public void power() {
		double power = Math.pow(number1, number2);
		System.out.println("A base of " + number1 + " to the power of " + number2 + " equals " + power);
	}
	
	}

	public static void main(String[] args) {
		MathMethods math = new MathMethods();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("+ CALCULATOR + \n\nBegin by typing your first number.");
		double number1 = scanner.nextDouble();
		System.out.println("\nNext, type your second number and the calculations will begin!");
		double number2 = scanner.nextDouble();
		
		MyMath input = math.new MyMath(number1, number2);
		
		input.absolute();
		input.absolute2();
		input.compare();
		input.power();
	}

}
