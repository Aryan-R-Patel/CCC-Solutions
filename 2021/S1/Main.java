import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] heights = new int[n+1];
		int[] bases = new int[n];
		double total = 0;

		for(int i = 0; i <= n; i++){
			int height = input.nextInt();
			heights[i] = height; 
		}
		for(int i = 0; i < n; i++){
			int base = input.nextInt();
			bases[i] = base;
		}

		// Final Calculation
		for(int i = 0; i < heights.length-1; i++){
			int curr = heights[i];
			int next = heights[i+1];

			double area = ((double)(curr+next)/2) * bases[i];

			total += area;
		}

		System.out.println(total);
	}
}