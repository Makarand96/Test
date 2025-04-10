package abc;

public class MultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object objectref [][] = {{"Say",1},{"Call",2},{"Name",3}};
		
		// System.out.println(objectref[2][0]);
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<2;j++)
			{
				System.out.print(objectref[i][j]);
			}
			System.out.println();
		}
	

	}

}
