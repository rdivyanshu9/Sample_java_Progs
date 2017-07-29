import java.util.Scanner;
class Test2{
	public static void main(String args[]){
		int num1,num2,sum = 0,pro = 0,dif = 0,quo = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = obj.nextInt();
		System.out.println("Enter Second Number");
		num2 = obj.nextInt();
		sum = num1 + num2;
		pro = num1 * num2;
		dif = Math.abs(num1 - num2);
		quo = num1 / num2;
		System.out.println("Sum is : " + sum + "Difference is : " + dif + "Product is :" +  pro + "quotient is:" + quo);
	}
} 

		