import java.util.Scanner;

public class apples {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		System.out.println("Enter name of first gf here");
		String temp = input.nextLine();
		//takes the name entered and sets it to girlname
		tunaObject.setName(temp);
		tunaObject.saying();
		//uses tuna method saying
	}
}
