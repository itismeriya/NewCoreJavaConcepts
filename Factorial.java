package basicprograms;

public class Factorial {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
		int fac=1;
		for(int j=1;j<=i;j++)
		{
			fac*=j;
		}
		System.out.println("Factorial of "+i+" is="+fac);
		}

}
}