import java.util.Arrays;
import java.util.Scanner;

public class Lab8Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("WELCOME TO OUR JAVA CLASS");
		String more = null;
		int num = 0;
		String go = null;

		do {
			int[] index = { 1, 2, 3, 4, 5, 6 };
			System.out.println("Which students would you like to learn more about? Enter a number 1-6");
			num = scan.nextInt();
			System.out.println();
			go = Lab8Array.contains(index, num);
			System.out.print(go);
//-------------------------------------------
			String[] name = { "Dylan", "Mattew", "Jody", "Ben", "Lindsay", "Tim" };
			String[] food = { "Coffee", "Pie", "Doughnuts", "Mangos", "Avocados", "Bread" };
			String[] home = { "Milford", "Novi", "the U.P.", "Holly", "Brighton", "Livonia" };
//-------------------------------------------
			int indices = (num - 1);
			System.out.print(num + " is student ");
			System.out.println(name[indices]);

			System.out.println("What would you like to know about them? (Enter hometown or Favorite food?");
			String info = scan.next();

			if (info.equalsIgnoreCase("hometown")) {
				System.out.println(name[indices]+ " is from " + home[indices]);
			}
			if (info.equalsIgnoreCase("Favorite food")) {
			}
			System.out.println(name[indices]+ "'s favorite food is " + food[indices]);
//-------------------------------------------
			System.out.println("\nWould you like to know more? yes or no?");
			more = scan.next();
		} while (more.equalsIgnoreCase("yes"));
		System.out.println("Goodbye");
	}

	public static String contains(int[] array, int key) {
		for (int i : array) {
			if (i == key)
				return " ";
		}
		return "That student does not exist. Please try again. (Enter a number between 1-6\n";
	}

	public static int[] index(int num, int[] arr) {
		for (int i : arr) {
			if (i == num)
				;
		}
		return arr;
	}
}
