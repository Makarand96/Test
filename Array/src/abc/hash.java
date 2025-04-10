package abc;

import java.util.HashMap;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Object, Object> h = new HashMap<Object, Object>();

		HashMap<Object, Object> m = new HashMap<Object, Object>();

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4, 10, 10 };

		for (int i = 0; i < a.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i] == a[j])
				{
					count++;
				}
			}
			m.put(count, a[i]);

			h.put(a[i], "value repeats " + count + " Times");
		}

		System.out.println(m);

		System.out.println(h);

		System.out.println("The Unique number is " + m.get(1));

	}

}
