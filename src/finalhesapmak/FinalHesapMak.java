
package finalhesapmak;

import java.util.Scanner;

public class FinalHesapMak {

    public static void main(String[] args) 
    {
        Scanner oku=new Scanner (System.in);
        System.out.println("Hesap Makinesi");
        System.out.println("--------------");
        int o=0;
        double a, b;
        
        String operator="";
        while(o==0)
        {
            System.out.println("Lütfen 1. sayıyı giriniz...");
            a=oku.nextDouble();
            System.out.println("Lütfen 2. sayıyı giriniz...");
            b=oku.nextDouble();
            System.out.println("Lütfen İşlem yapmak istediğiniz operatörü seçiniz..:");
            System.out.println("Toplama: T, Çıkarma: F, Çarpma: C, Bölme: B");
            operator=oku.next();
            
            switch(operator)
            {
                case "T":
                case "t":
                    System.out.println("Toplama yapılıyor...");
                    System.out.println("Sonuç:"+topla(a,b));
                    o=1;
                    break;
                case "F":
                case "f":
                    System.out.println("Toplama yapılıyor...");
                    System.out.println("Sonuç:"+fark(a,b));
                    o=1;
                    break;
                case "C":
                case "c":
                    System.out.println("Çarpma yapılıyor...");
                    System.out.println("Sonuç:"+carp(a,b));
                    o=1;
                    break;
                case "B":
                case "b":
                    System.out.println("Bölme yapılıyor...");
                    System.out.println("Sonuç:"+bol(a,b));
                    o=1;
                    break;
                default: 
                    System.out.println("Hatalı giriş! Tekrar deneyin");
                    o=0; 
            }
        }
    }
    static int topla (int a, int b)
    {
        return a+b;
    }
    static double topla (int a, double b)
    {
        return a+b;
    }
    static double topla (double a, int b)
    {
        return a+b;
    }
    static double topla (double a, double b)
    {
        return a+b;
    }
   
    static int fark (int a, int b)
    {
        return a-b;
    }
    static double fark (double a, int b)
    {
        return a-b;
    }
    static double fark (int a, double b)
    {
        return a-b;
    }
    static double fark (double a, double b)
    {
        return a-b;
    }
    
    static int carp (int a, int b)
    {
        return a*b;
    }
    static double carp (double a, int b)
    {
        return a*b;
    }
    static double carp (int a, double b)
    {
        return a*b;
    }
    static double carp (double a, double b)
    {
        return a*b;
    }
    
    static int bol (int a, int b)
    {
        return a/b;
    }
    static double bol (double a, int b)
    {
        return a/b;
    }
    static double bol (int a, double b)
    {
        return a/b;
    }
    static double bol (double a, double b)
    {
        return a/b;
    }
}
