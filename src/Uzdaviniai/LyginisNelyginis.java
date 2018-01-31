package Uzdaviniai;

import java.util.Scanner;

public class LyginisNelyginis {
    public LyginisNelyginis() {
        System.out.println("iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("skaicius yra lyginis");
        } else {
            System.out.println("skaicius yra nelyginis");
        }
    }
}
