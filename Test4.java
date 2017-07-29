import java.util.Scanner;
class Test4{
	public static void main(String args[]){
		int radius;
		double area=0;
		System.out.println("Enter Radius");
		Scanner obj = new Scanner(System.in);
		radius = obj.nextInt();
		area = Math.PI*radius*radius;
		System.out.println("Area is : " + area + "square units");
	}
}