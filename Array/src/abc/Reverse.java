package abc;

// reverse array program

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i [] = {2,5,8,10,45,6,7};
		
		for (int a=0;a<(i.length/2);a++)
		{
			int b = i[a];
			i[a] = i[(i.length-1)-a];
			i[(i.length-1)-a] = b;
		}
		
		for(int c =0;c<i.length;c++)
		{
			System.out.println(i[c]);
		}
		
	System.out.println("--------------------------------");	
		
        int y [] = {2,5,8,10,45,6,7};
        
        int[] z = new int[y.length];
		
		for (int x=0;x<y.length;x++)
		{
			 z[(y.length-1)-x] = y[x];
		}
		
		y = z;
		for (int d =0; d<y.length;d++)
		{
		System.out.println(y[d]);
		
	}

}
}
