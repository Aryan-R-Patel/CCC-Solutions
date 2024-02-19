import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		int solutions = 0;
		while(n >= 0){
			if(n % 5 == 0){
				solutions++;
			}
			n -= 4;
		}

		System.out.println(solutions);
	}
}