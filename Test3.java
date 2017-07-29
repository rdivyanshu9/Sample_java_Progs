import java.util.Scanner;
class Test3{
	public static void main(String args[]){
		String name;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your name");
		name = obj.nextLine();
		System.out.println("Your name is " + name);
	}
}