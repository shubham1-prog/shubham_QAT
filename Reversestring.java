package testprg.java;
import java.util.ArrayList;
import java.util.Scanner;

public class Reversestring {
	
		public static void main(String[] args) {
			ArrayList<String> a = new  ArrayList<String>();
			Scanner in= new Scanner(System.in); 
			System.out.println("enter the size of  array : ");
			int n = in.nextInt();
			System.out.println("enter the string words");
			for(int i=0;i<n;i++) {
				a.add(in.next());
			}
			System.out.println("reversed Strings : ");
			for(int j=a.size()-1;j>=0;j--) {
				System.out.println(a.get(j));
			}

		}

	}

