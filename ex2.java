package com.company;

import java.util.Scanner;

public class ex2 {
    public static void body(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so ho gia dinh ");
        int Popu = input.nextInt(), i;
        String[] Popu1 = new String[20];
        int[] number = new int[20];
        for (i = 1; i <= Popu; i++) {
            System.out.print("Nhap chu ho gia dinh thu " + i + " ");
            input.nextLine();
            Popu1[i] = input.nextLine();
            System.out.print("Nhap so dien tieu thu ");
            number[i] = input.nextInt();
        }
        System.out.println("chon chuc nang :");
        System.out.println("1: thong ke tien dien");
        System.out.println("2: danh sach 3 ho co tien dien cao nhat");
        System.out.println("3: cac chu ho co ten \"Truong\" ");
        System.out.println("4: danh sach sap xep cac ho gia dinh theo so dien tieu thu");
        System.out.println("chon chuc nang :");
        int j;
        for(i = 1; i < Popu; i++)
            for(j = i + 1; j <= Popu; j++)
                if(number[i] < number[j]){
                    int code = number[i];
                    number[i] = number[j];
                    number[j] = code;
                    String codeS = Popu1[i];
                    Popu1[i] = Popu1[j];
                    Popu1[j] = codeS;
                }
        int const1 = input.nextInt();
        switch (const1) {
            case 1:
                for( i = 1; i <= Popu; i++){
                    System.out.println("ho gia dinh "+Popu1[i]+" tien dien la " + number[i] * 3000+" dong" );
                }
                break;
            case 2:

                System.out.println("Ba ho gia dinh co tien dien cao nhat la");
                for(i = 1; i <= 3; i++){
                    System.out.println("ho gia dinh \"" + Popu1[i] +"\" voi so tien din tieu thu la "+ number[i]*3000 +" dong" );
                }
                break;
            case 3:
                System.out.println("cac chu ho co ten\""+"Truong"+"\" la ");
                for(i = 1; i <= Popu; i++){
                    if(Popu1[i].lastIndexOf("Truong") >= 0) System.out.println("chu ho "+ Popu1[i]+" voi tien dien la "+number[i]*3000);
                    else if(Popu1[i].lastIndexOf("truong") >= 0) System.out.println("chu ho \""+ Popu1[i]+"\" voi tien dien la "+number[i]*3000);
                }
                break;
            case 4:
                for(i = 1; i <= Popu; i++){
                    System.out.println("chu ho \"" + Popu1[i]+"\" voi tien dien la "+ number[i]*3000+" dong");
                }
        }
    }
    public static void main(String[] args) {
        body();
    }
}
