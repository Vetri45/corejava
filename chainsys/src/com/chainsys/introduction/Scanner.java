package com.chainsys.introduction;

public class Scanner {

public static void main(String[] args) {
printTriangleB();

}
// TODO Auto-generated method stub
public static void printTriangleB() {
int countA =0;
for (countA =1;countA<=10;countA++)
{
for(int countB =1;countB<countA;countB++)
{
System.out.print(".");
}
for(int countc =countA;countc>=1;countc--)
{
System.out.print(countc);

}
System.out.println();
}
}
}


