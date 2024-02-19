import java.util.Scanner;

// TO BE IMPLEMENTED - (FIND THE INDEX OF THE NUMBER, PROCESS IT UNTIL THERE, AND THEN REMOVE THE CONTENT UNTIL THAT INDEX)
// REPEAT THE PROCESS, UNTIL THE STRING IS EMPTY

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String result = input.nextLine();

		String temp = "";
		for(int i = 0; i < result.length(); i++){
			if(!result.substring(i, i+1).equals("+") && !result.substring(i, i+1).equals("-")){
				temp += result.substring(i, i+1);
			}
			else{
				if(result.substring(i, i+1).equals("+")){
					temp += " tighten ";
				}
				else{
					temp += " loosen ";	
				}
				temp += result.substring(i+1, i+2);
				i++;
				System.out.println(temp);
				temp = "";	
			}
		}
	}
}