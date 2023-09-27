package Letcode;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height;
        double  weight;
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz (Metre Cinsinden): ");
        height=sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        weight=sc.nextDouble();
        double bodyMassIndex=weight/(height*height);
        System.out.println("Vücüt Kitle İndeksiniz : "+bodyMassIndex);
    }
}
