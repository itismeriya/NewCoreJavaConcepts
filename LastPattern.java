package basicprograms;

public class LastPattern {

	public static void main(String[] args) {
		for(int i=5;i>=0;i--)
		{
			int k=5;
			for(int j=0;j<i;j++)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
		}
	}

}
