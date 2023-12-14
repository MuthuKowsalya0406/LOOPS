package Control_Staments;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();   
        System.out.println("Multiplication Table of " + num);
        int i =0;
        while(i<10) {
        	System.out.println(i+" x "+num+" = "+num*i);
        	i++;
        }
        }
       //TODO implement While loop to get print result
    }
