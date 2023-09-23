package Java_Coding;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <= n; i++)// 1stLoop
		{
			for (int j = 0; j <= n; j++)
			{
				if(j<=i)
				{
					System.out.print(i+1);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}