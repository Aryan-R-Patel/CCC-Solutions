import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		if(num==1 || num==10 || num==9){
			System.out.println(1);
		}
		else if(num==2 || num==3 || num==7 || num==8){
			System.out.println(2);
		}
		else if(num==4 || num==5 || num==6){
			System.out.println(3);
		}

		input.close();
	}
}