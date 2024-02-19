import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int h = input.nextInt();
		int M = input.nextInt();

		int t = 1;
		while(t <= M){
			int alt = calculateAlt(t, h);
			
			if(t == M && alt > 0){
				System.out.println("The balloon does not touch ground in the given time.");
			}
			else if(alt <= 0){
				System.out.println("The balloon first touches ground at hour:\n" + t);
				break;
			}		

			t++;
		
		}

		input.close();
	}

	public static int calculateAlt(int t, int h){
		int temp = (-6 * t * t * t * t) + (h * t * t * t) + (2 * t * t) + t;
		return temp;
	}
}