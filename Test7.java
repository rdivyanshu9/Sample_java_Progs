import java.util.Scanner;
class Test7{
	public static void main(String args[]){
		String name , address;
		long phone;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter name");
		name = obj.nextLine();
		System.out.println("Enter Address");
		address = obj.nextLine();
		System.out.println("Enter phone number");
		phone = obj.nextLong();
		System.out.println("Name is " + name + "\tAddress is " + address + "\tPhone number is " + phone);
	}
}