package com.win.junit;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            System.out.println("Hi," + name);
        }
    }
}