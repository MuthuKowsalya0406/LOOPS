package Control_Staments;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Name:");
String name = sc.nextLine();
System.out.println("Total nunmber of characters in name:"+name.length());
for(int i=0;i<name.length();i++) {
	char letter = name.charAt(i);
	System.out.println("Letter in the Name:"+letter);
}



	}

}
