// INCOMPLETE

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		/*
		// Names which must be in the same group
		int x = input.nextInt();
		input.nextLine();
		ArrayList<String> sameGroups = new ArrayList<String>();	

		for(int i = 0; i < x; i++){
			String names = input.nextLine();
			int blankIndex = names.indexOf(" ");
			String first = names.substring(0, blankIndex);
			String second = names.substring(blankIndex+1);
			sameGroups.add(first);
			sameGroups.add(second);
		}	

		// Names which must not be in the same group
		int y = input.nextInt();
		input.nextLine();
		ArrayList<String> diffGroups = new ArrayList<String>();	

		for(int i = 0; i < y; i++){
			String names = input.nextLine();
			int blankIndex = names.indexOf(" ");
			String first = names.substring(0, blankIndex);
			String second = names.substring(blankIndex+1);
			diffGroups.add(first);
			diffGroups.add(second);
		}
		*/

		// How the groups are made (after this, we figure out the number of constraints violated)
		int g = input.nextInt();
		input.nextLine();
		ArrayList<String> originalGroups = new ArrayList<String>();

		for(int i = 0; i < g; i++){
			String names = input.nextLine();
			names.split(" ", 0);
			originalGroups.add(names);
			
		}
		for(String z : originalGroups){System.out.println(z);}

	}
}