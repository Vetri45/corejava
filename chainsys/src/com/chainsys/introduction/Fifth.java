package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
	  printNumbersOneToTen();
	  printMatrix();
     printNumbersTenToOne();
		printTriangleB();
		Matrix1();
		Matrix2();
		Matrix3();
	}
    public static void printNumbersOneToTen(){
    	int count=0;
    	for(count=0;count<=10;count++)
    	{
    		System.out.print(count +" ");
    	}
    }
    public static void printNumbersTenToOne(){
    	int count=0;
    	for(count=10;count<=1;count++)
    	{
    		System.out.print(count +" ");
    	}
    }
    public static void printMatrix() {
    	int countA=0;
    	for(countA=1;countA<=10;countA++)
    	{
           for (int countB=1;countB<=10;countB++)
           {
        	   System.out.print(countB+ " ");
           }
           System.out.println();
           }}  

public static void printTriangleB() {
	int countA=0;
	for(countA=1;countA<=10;countA++)
	{
       for (int countB=1;countB<=countA;countB++)
       {
    	   System.out.print(".");
       }
       for(int countC=countA;countC>=1;countC--)
       {
    	   System.out.print(countC);
       }
      
       System.out.println();
       }
} 
 public static void Matrix1() {
	   for(int countA=1;countA<=5;countA++) {
		   for(int countB=1;countB<=countA;countB++) {
			   System.out.print(countB+" ");
		   }
			   System.out.println();
		   }
	   }
public static void Matrix2() {
	   for(int countA=4;countA>=1;countA--) {
		   for(int countB=1;countB<=countA;countB++) {
			   System.out.print(countB+" ");
		   }
			   System.out.println();
		   }
	   }
public static void Matrix3() {
	for(int countA=5;countA>=1;countA--) {
		   for(int countB=5;countB<=countA;countB++) {
			   System.out.print(countB+" ");
		   }
			   System.out.println();
		   }
	   }
}


    
    

