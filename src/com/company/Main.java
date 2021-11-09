package com.company;

import java.util.Scanner;

public class Main {

    public static int houses() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many houses would you like to make?");
        int amount_houses = input.nextInt();
        int matchsticks = ((amount_houses*5)+1);
        return matchsticks;
    }
    public static void main(String[] args) {
        System.out.println(houses());
    }
}
