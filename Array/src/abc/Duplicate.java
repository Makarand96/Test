package abc;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = { 1, 2, 3, 4, 2 };

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] == data[j] && i != j) {

					System.out.println(data[i] + " is duplicate");
				}
			}
		}
	}
}
