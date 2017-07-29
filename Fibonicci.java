class Fibonicci{
	int a,b,n;
	System.out.print( "0 1 ");
	a = 0;
	b = 1;
	for (int i = 1; i < 20; i++){
		n = a + b;
		System.out.print(n + " ");
		a = b;
		b = n;
	}
}