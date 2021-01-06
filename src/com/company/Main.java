package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static String r;


    public static void main(String[] args) {
        // не ужели понял дз
        final int age = 18;
        String name = "Ernst";
        System.out.println(in + " menya zavut " + name + " mne " + age + " let! ");
        if (age <= 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
            System.out.println("Вы совершеннолетний!");
        }

        writeln("??");
    }

    private static void writeln(java.lang.String s) {
        System.out.println("как Вас зовут?" + s);


        String r = in.nextLine();
        {
            System.out.println("Привет " + r);
        }
    }
}