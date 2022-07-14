package Work;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		int count=0; 
		//divison counter
		Scanner sc =new Scanner (System .in);
		System.out.println("Enterva number:");
		n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++; //increment
			}
		}
		if (count==2) // exactly 2 if no .is prime
		{
			System.out.println(n+" is a Prime number");
			}
		else
		{
			System.out.println(n+"is Not a Prime number");
		}
	}
}
