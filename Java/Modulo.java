// Kattis id: modulo

import java.util.Scanner;


public class Modulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] arr = new int[42];
		for(int i = 0; i < 42; i++){
			arr[i] = 0;
		}
		
		int counter = 0;
		
		for(int i = 0; i < 10; i++){
			int input = in.nextInt();
			int index = input % 42;
			if(arr[index] != 1){
				arr[index] = 1;
				counter++;
			}
			
			
			
		}
		
		System.out.println(counter);
	}

}
