package abc;

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
		
		
		
	}

}
