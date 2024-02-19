import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Taking input and initializing variables
		int num = input.nextInt();
		input.nextLine();
		String[] result = new String[num];

		// Storing every record in an array
		for(int i = 0; i < num; i++){
			result[i] = input.nextLine();
		}
	
		int day1 = 0;
		int day2 = 0;
		int day3 = 0;
		int day4 = 0;
		int day5 = 0;
		// Traversing through the array
		for(String x : result){
			for(int i = 0; i < x.length(); i++){
				if(x.substring(i, i+1).equals("Y")){
					if(i==0){
						day1++;
					}
					else if(i==1){
						day2++;
					}
					else if(i==2){
						day3++;
					}
					else if(i==3){
						day4++;
					}
					else if(i==4){
						day5++;
					}
				}
			}
		}

		// Checking if on any day all the people are able to not. If yes, that day is printed
		if(day1==num){
			System.out.println(1);
		}
		else if(day2==num){
			System.out.println(2);
		}
		else if(day3==num){
			System.out.println(3);
		}
		else if(day4==num){
			System.out.println(4);
		}
		else if(day5==num){
			System.out.println(5);
		}
		else{
			// If there is no day, on which everyone is able to attend, we will execute the following code
			ArrayList<Integer> record = new ArrayList<Integer>();
			ArrayList<Integer> similar = new ArrayList<Integer>();
			record.add(day1);
			record.add(day2);
			record.add(day3);
			record.add(day4);
			record.add(day5);

			// determining the largest number in the array list
			int largest = record.get(0);
			for(int i = 0; i < record.size(); i++){
				if(record.get(i)>largest){
					largest = record.get(i);
				}
			}

			for(int i = 0; i < record.size(); i++){
				if(record.get(i)==largest){
					similar.add(i+1);
				}
			}

			// Printing out the final output
			for(int j = 0; j < similar.size()-1; j++){
				System.out.print(similar.get(j) + ",");
			}
			System.out.println(similar.get(similar.size()-1));
		}
		
		
		
		input.close();
	}
}