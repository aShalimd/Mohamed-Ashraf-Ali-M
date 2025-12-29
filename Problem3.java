package Tandemloop;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter iteration: ");
        int iteration = sc.nextInt();

        int limit = (iteration % 2 == 0) ? iteration - 1 : iteration;

        int num = 1;
        for (int i = 1; i <= limit; i++) {
            System.out.print(num + " ");
            num += 2;
        }

        sc.close();
    }
}

