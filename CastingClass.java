package PackageA;

public class CastingClass {
	
 public static void main(String[] args) {
	 
	 //explicit casting
	double a = 58.63;
	int c = (int) a;
	long d = (long) a;
	System.out.println(c + " " + d); // 0.63 is data loss.
	
	long x = 48;
	int k = (int)x;
	System.out.println(k); 
	
	for(int i=0; i<10;i++)
	{
		System.out.println("I love programing");
	}
	
}
	

}
