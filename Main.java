package com.company;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static float Ctron(int a){
        return  2 * 3.14f * a;
    }
    public static float Stron(int a){
        return (float) 3.14f * a * a;
    }
    public static float Sthang(int a, int b, int h){
        return (float) (a + b) * h / 2;
    }
    public static int Ctamgiac(int a, int b, int c){
        return  a + b + c;
    }
    public static float Stamgiac(int a, int b, int d){
        float c = (float) (a + b + d) / 2;
        return (float) Math.sqrt(c * (c - a) * (c - b) * (c - d));
    }
    static int fibo(int n){
        if ( n < 3) return 1;
        else return fibo(n - 1) + fibo( n - 2);
    }
    public static void main(String[] args) {
        System.out.println("dien tich hinh thang 2 3 4 = " + Sthang(2,3,4));
        System.out.println("chu vi tam giac 2 3 4 = "+ Ctamgiac(2, 3, 4));
        System.out.println("dien tich tam giac 2 3 4 =" +Stamgiac(2, 3, 4));
        System.out.println("chu vi hinh tron r= 4 la" +Ctron(4));
        System.out.println("dien tich hinh tron r= 3 la" +Stron(3));
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so");
        int a = input.nextInt();
        System.out.println(+ a);
        System.out.print("so fibo thu ");
        System.out.println( a +" la " + fibo(a));
        String s = input.next();
        System.out.println("chuoi ban vua nhap la " + s);
        System.out.print("nhap ten cua ban");
        String Name = input.next();
        System.out.print("nhap tuoi cua ban");
        int Old = input.nextInt();
        System.out.print("nhap dia chi");
        String Diachi = input.next();
        System.out.print("nhap so dien thoai");
        long So = input.nextLong();
        System.out.print(" nhap diem thanh phan toan ly hoa");
        int Toan = input.nextInt(), Ly = input.nextInt(), Hoa = input.nextInt();
//        System.out.print("ban ten la %s , ban %d tuoi", Name, Old);
//        System.out.print("ban ten la %s , ban %d tuoi", Name, Old);
        System.out.println("ban ten la " + Name+ " ban " +Old+" tuoi " ) ;
//       System.out.print(" dia chi cua ban tai %s", Diachi);
        System.out.print(" dia chi cua ban tai " + Diachi);
//       System.out.print("diem thanh phan la : /n toan = %d /n ly = %d /n hoa = %d ", Toan, Ly, Hoa);
        System.out.println("diem thanh phan la :  toan = "+ Toan +"  ly = " + Ly +"  hoa = "+ Hoa + " ");
	// write your code here
        int Max = ((((Toan > Ly)? Toan : Ly) > ((Ly > Hoa)?Ly:Hoa))?((Toan > Ly)? Toan : Ly):((Ly > Hoa)?Ly:Hoa));
        System.out.print("diem cao nhat : " + Max );
        input.close();
    }
}
