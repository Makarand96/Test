import java.util.ArrayList;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arraylist is used to overcome disadvantage of Array, ie size of Array remains fixed.
	//Arraylist is Class in Util package of Java library.
	
	ArrayList<String> a = new ArrayList<String>();
	a.add("Mak");
	a.add("Hello");
	a.add("hi");
	a.add("name");
	a.add("simple");
	a.remove(4);
	
	System.out.println(a.get(1));
	
	
	System.out.println("--------------");
	
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a.get(i)); 
	}
	
	}

}
