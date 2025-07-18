package Package_A;

import java.util.HashSet;
import java.util.Iterator;

public class PracticeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hash =new HashSet();
		hash.add("Name");
		hash.add('k');
		hash.add(55);
		hash.add("Name");   // duplicate not stored
		Iterator i =hash.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		System.out.println("________________________");
		
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("Name");
		hashset.add("tell");
		hashset.add("koi");
		hashset.add("satara");
		Iterator set =hashset.iterator();
		while(set.hasNext())
		{
			System.out.println(set.next());
		}
		
		
		
	}

}
