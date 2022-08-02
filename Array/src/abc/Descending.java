package abc;

public class Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int i [] = {2,5,10,6,7,4};
		
		for (int c = 0;c<i.length;c++)
				{
					for (int a=0;a<(i.length-1);a++)
					{
						if (i[a] < i[a+1])
							{
								int b = i[a];
								i[a]=i[a+1];
								i[a+1]=b;
						}
					}
				}
		
				for (int d=0;d<i.length;d++)
						{
							System.out.println(i[d]);
						}
		
		
	}

}
