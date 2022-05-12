package com.chainsys.introduction;

import java.util.Scanner;

import java.util.Scanner;

public class Task1 {
	public static void main(String[]args) {
//		 printTrianglesB();
		 printPrimiteD();
	}

	public static void printTrianglesB() {
		int countA =0;
		for (countA =1; countA<=9;countA++) {
			if (countA<6) {
				for(int countB=5;countB>=countA;countB--) {
					System.out.print(" ");
				}
				for(int countC=countA; countC >=1;countC--) {
					System.out.print(countC);
				}
				for(int countC=2;countC<=countA;countC++) {
					System.out.print(countC);
				}
			}
			else {
				for (int count=0;count<=countA-5;count++)
					System.out.print(" ");
			}
			for (int i=10-countA; i>=1; i--) {
				System.out.print(i);
			}
			for (int j=2; j<=10-countA;j++) {
				System.out.print(j);
				}
			 //System.out.println(" ");
			}
		System.out.println(" ");
		}
		// TODO Auto-generated method stub
       
//	}

  public static void printPrimiteD()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int n = in.nextInt();
        in.close();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) 
        {

            for (int spc = n - no_of_spaces; spc > 0; spc--) 
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else 
            {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(start);
                if (j < count / 2) 
                {
                    start--;
                } else 
                {
                    start++;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }

}