import java.util.Scanner;
class Temp{
	public static void main(String args[]){
		float celsius , fahrenheit = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperature in degree celsius");
		celsius = in.nextFloat();
		fahrenheit = (celsius*9/5) + 32;
		System.out.println("Temperature in degree fahrenheit is " + fahrenheit);
	}
} 
		 