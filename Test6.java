import java.util.Scanner;
class Test6{
	public static void main(String args[]){
		int p , r , t;
		double si = 0 , ci = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Principle");
		p = obj.nextInt();
		System.out.println("Enter Rate");
		r = obj.nextInt();
		System.out.println("Enter Time");
		t = obj.nextInt(); 
		si = (double)(p * r * t) / 100 ;
		ci = (double)p * Math.pow((1 + r / 100),t);
		System.out.println("Simple interest is "+ si +"\tCompund interst is " + ci);
	}
}