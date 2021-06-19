package abc;

import java.util.Scanner;

public class Largest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the number");
			int r = s.nextInt();  
			
			System.out.println("Enter the number");
			int o = s.nextInt();
		
		int a [] = { r,o};
		
		if(a[0] > a[1])
		{
			System.out.println(a[0] + " is largest");
		}
		
		else
		{
			System.out.println(a[1] + " is largest");
		}
	
		System.out.println("_______________________________");
		
		int b [] = {3,5};
		if(b[0]>b[1])
		{
			System.out.println(b[0] + "is largest");
		}
		else
		{
			System.out.println(b[1] + " is largest");
		}
	}

}
