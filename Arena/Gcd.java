package com.newtonschool;

import java.util.Scanner;

public class Gcd {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // while (x != y) {
            // if (x > y) {
            // x = x - y;
            // } else {
            // y = y - x;
            // }
            // }

            // System.out.println(y);

            System.out.println(gcd(x, y));
        }

    }
}
