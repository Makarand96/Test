package abc;

import java.util.Arrays;
import java.util.List;

public class Hello {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {5,10,20,40};      //size = 4; index= 0,1,2,3
		
		int [] b = {2,4,6,8,10,11,13,14};  
	
		
//		String data [] = {"Hello","Print","Name"};
//		
//		List<String> name =Arrays.asList(data);
//		
//		List<int[]> intdata = Arrays.asList(a);
		
		System.out.println(a[1]);  // 10
		System.out.println(b[3]);  // 8
		
		b[2] = 50;
		
		System.out.println(b[2]);
		
		int d = a.length;        // d  =size ; size = length both means same
		
		System.out.println(d);    
		
		int k = b.length;
		System.out.println(k);
		
	 for (int c =0; c< a.length;c++)   // logic is on index
		
	 {
		 System.out.println(a[c]);
	 }
		
		for (int g =0;g<8;g++)
		{
			System.out.println(b[g]);
		}
	
	for(int f = a.length-1;f>=0;f--)    // reverse 
	{
		System.out.println(a[f]);
	}
		
	
	
	}
	

}
