package com.company;

import Uzdaviniai.LyginisNelyginis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        LyginisNelyginis objektas = new LyginisNelyginis();

        objektas.setA(a);
        System.out.println("ivestas skaicius: " +objektas.getA());
        objektas.skaiciuok();
	// write your code here
    }
}
