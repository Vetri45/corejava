package FirstTest;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc =new Scanner (System.in);
		System.out.println ("Enter input");
		int value =Sc.nextInt();
		Sc.close();
		int a= value/100;
		int b=value%100;
		
		int l= b/10;
		int c=value %100;
		int z= c%10;
		int n=((a*a*a)+(l*l*l)+(z*z*z));
		if (n==value) {
			System.out.println("Armstrong number");
		}
			else {
				System.out.println("Not armstrong number");
			}
		}

	}


