import java.util.*;	
import java.lang.Math;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		ArrayList<Double> speeds = new ArrayList<Double>();

		int prevS = 0;
		int prevP = 0;
		for(int i = 0; i < num; i++){
			int second = input.nextInt();
			int position = input.nextInt();
			
			if(i > 0){
				double currentSpeed = Math.abs(((double)position - prevP) / (second - prevS));
				speeds.add(currentSpeed);
			}
			
			prevS = second;
			prevP = position;
		}
		
		// finding the largest element in the array list
		double largest = 0;
		for(int i = 0; i < speeds.size(); i++){
			if(speeds.get(i) >= largest){
				largest = speeds.get(i);
			}
		}

		System.out.println(largest);
	}
}