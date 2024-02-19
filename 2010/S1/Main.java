import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();

		int num = input.nextInt();
		for(int i = 0; i < num; i++){
			String name = input.next();
		
			int ram = input.nextInt();
			int cpu = input.nextInt();
			int space = input.nextInt();

			int score = (2*ram) + (3*cpu) + space;
			scores.add(score);
			names.add(name);
		}

		// determining the largest score in the array list
		ArrayList<String> similar = new ArrayList<String>();
		int largest = 0;
		for(int j = 0; j < scores.size(); j++){
			if(scores.get(j) > largest){
				largest = scores.get(j);
			}
		}

		for(int j = 0; j < scores.size(); j++){
			if(scores.get(j) == largest){
				similar.add(names.get(j));
			}
		}

		// Calculating the final result:
		if(similar.size() >= 2){
			Collections.sort(similar);
			for(int i = 0; i < 2; i++){
				System.out.println(similar.get(i));
			}
		}
		else{
			Collections.sort(scores);
			for(int i = scores.size()-1; i > scores.size()-3; i--){
				System.out.println(names.get(i));	
			}
		}
		
	}
}