package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = String.valueOf(scanner.nextInt());
        System.out.println(number.replaceAll("(\\d)(?=(\\d{3})+(?!\\d))", "$1,"));



    }

}