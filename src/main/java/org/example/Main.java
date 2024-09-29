package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String number = "12345678";
        String delimiter = ",";
        System.out.println(number.replaceAll("(\\d)(?=(\\d{3})+(?!\\d))", "$1,"));



    }

}