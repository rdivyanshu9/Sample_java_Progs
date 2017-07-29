import java.util.Scanner;
class Test5{
	public static void main(String args[]){
		int width , height , perimeter = 0 , area = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter width");
		width = obj.nextInt();
		System.out.println("Enter height");
		height = obj.nextInt();
		perimeter = 2 * (width + height);
		area = width * height;
		System.out.println("perimeter is" + perimeter + "\tarea is" + area);
	}
}