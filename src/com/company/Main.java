package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0) {
            System.out.println("skaicius yra lyginis");
        }else{
            System.out.println("skaicius yra nelyginis");
        }
	// write your code here
    }
}
