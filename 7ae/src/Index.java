import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		System.out.println("enter the sentence");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("position of the word from start");
		System.out.println(str.indexOf("is"));
		
	}

}
