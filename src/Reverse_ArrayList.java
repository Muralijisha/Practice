import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_ArrayList {

	public static void main(String[] args) {
		List<String> Sports = new ArrayList<String>();
		Sports.add("Football");
		Sports.add("Tennis");
		Sports.add("Hockey");
		Sports.add("Cricket");
		System.out.println("Array List:");
		System.out.println(Sports.toString());
		System.out.println();
		Collections.reverse(Sports);
		System.out.println("Reverse of Array List:");
		System.out.println(Sports);
		

	}

}
