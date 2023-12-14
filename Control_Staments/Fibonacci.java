package Control_Staments;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter any positive integer: ");
int firstterm=0 ,secondterm =1;
int n;
n=sc.nextInt();
System.out.println("Fibonaci Series till "+ n +" terms:");
int i=1;
do {
	System.out.print(firstterm+" ");
	   int nextTerm = firstterm + secondterm;
       firstterm = secondterm;
       secondterm = nextTerm;
       
	++i;
}
while(i<=n);
	}
}
	

	


	