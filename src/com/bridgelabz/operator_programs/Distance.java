package com.bridgelabz.operator_programs;

import java.util.Scanner;

public class Distance {

    static void calculate(int x, int y) {
        System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
    }

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter value for x: ");
            int x = s.nextInt();
            System.out.println("enter value for y: ");
            int y = s.nextInt();
            calculate(x, y);
    }
}
