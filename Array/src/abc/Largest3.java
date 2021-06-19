package abc;

public class Largest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {8,2,5};
		
		if(a[0]>a[1])
		{
			if(a[0]>a[2])
			{
				System.out.println(a[0] + " is largest");
			}
			else
			{
				System.out.println(a[2] + " is largest");
			}
		}
		else
			if(a[1]>a[2])
			{
				System.out.println(a[1] + " is largest");
			}
			else
			{
				System.out.println(a[2] + " is largest");
			}
		
		
	}

}
