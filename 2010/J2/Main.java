// Score = 12/15

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		int s = input.nextInt();

		// Nikki Calculation
		int nForward = 0;
		int nTotal = 0;
		while(true){
			int difference = s - nTotal; // max available steps
			if(difference < a){ // forward
				nForward += difference;
				nTotal += difference;
				break;
			}
			else{
				nForward += a;
				nTotal += a;
			}

			difference = s - nTotal;

			if(difference < b){ // backward
				nForward -= difference;
				nTotal += difference;
				break;
			}
			else{
				nForward -= b;
				nTotal += b;
			}
		}

		// Byron Calculation
		int bForward = 0;
		int bTotal = 0;
		while(true){
			int difference = s - bTotal; // max available steps
			if(difference < c){ // forward
				bForward += difference;
				bTotal += difference;
				break;
			}
			else{
				bForward += c;
				bTotal += c;
			}

			difference = s - bTotal;

			if(difference < d){ // backward
				bForward -= difference;
				bTotal += difference;
				break;
			}
			else{
				bForward -= d;
				bTotal += d;
			}
		}

		// Printing out the final result
		if(nForward > bForward){
			System.out.println("Nikki");
		}
		else if(nForward < bForward){
			System.out.println("Byron");
		}
		else{
			System.out.println("Tied");
		}

		input.close();
	}
}