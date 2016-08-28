import java.util.Scanner;

public class apples {
	public static void main(String args[]) {
		Scanner bucky = new Scanner(System.in);
		int girls, boys, people;
		girls = 11;
	    boys = 3;
		people = girls % boys;
		//you can also use + - * %
		// % is the symbol to find the remainder
		System.out.println(people);
	}
}
