// Kattis id: spavanac

import java.util.Scanner;


public class Spavanac {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int min = in.nextInt();
		
		min = min - 45;
		if (min < 0 )
		{	min = 60 + min;
			hour--;
			if(hour < 0){
				hour = 23;
			}
		}
		System.out.println(hour + " " + min);
				
	}

}
