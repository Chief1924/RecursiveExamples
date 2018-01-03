import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveSets {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a short string of different letters: ");
		String s = input.nextLine();
		ArrayList<String> ss = subsets(s);
		System.out.println("Subsets of set form by letters in "
				+ s + " are:");
		for (String r: ss)
			System.out.println(" \"" + r + "\"");
	}
	
	private static ArrayList<String> subsets(String s){
		ArrayList<String> ss = new ArrayList<>();
		if (s.length() == 0)
			ss.add(s);
		else {
			String st;
			st = s.substring(1);
			ArrayList<String> tSS = subsets(st);
			for (String r : tSS)
				ss.add(r);
			for (String r : tSS)
				ss.add(s.substring(0,1) + r);
		}
		return ss;
	}
}
