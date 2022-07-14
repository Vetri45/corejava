package FirstTest;

import java.util.Scanner;
public class EvenDigitNumber{
	public static void main(String[] args) {
		EvenDigits();
	}

public static void EvenDigits()
{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        long num=scanner.nextInt();
        scanner.close();
        
        long value=num;
        long rem=0;
        System.out.println("The Even digits Number:");
        while(value>0)
        {
                rem=value%10;
                if(rem%2==0)
                {
                        System.out.println(rem);
                }
                value=value/10;
        }
}
}


