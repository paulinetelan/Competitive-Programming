// Kattis id: sumoftheothers

import java.util.Scanner;

public class SumoftheOthers {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        while(in.hasNextLine()){

            String line = in.nextLine();

            String [] arr = line.split(" ");

            int sum = 0;    

            for (String num : arr) {
                sum += Integer.valueOf(num);
            }

            System.out.println(sum/2);

            
        } 
    }
}