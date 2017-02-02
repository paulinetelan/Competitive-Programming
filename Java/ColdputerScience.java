// Kattis id: coldputerscience

import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int counter = 0;
        int x = in.nextInt();

        for(int i = 0; i < x; i++){
            if (in.nextInt() < 0)
                counter++;
        }

        System.out.println(counter);
    }
}