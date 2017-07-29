import java.util.Scanner;
class Prime{
	public static void main(String args[]){		
		int temp = 0, num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number : ");
		num = in.nextInt();
		for(int i = 2;i < num;i++ ){
			if(num % i == 0)
				temp += 1;
		}
		if(temp == 1)
			System.out.println(" Not a Prime Number");
		else
			System.out.println(" Prime Number");
	}
}	   