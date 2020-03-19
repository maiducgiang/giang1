package com.company;

import java.util.Scanner;

public class ex1{
/*    public static boolean compare(String s1, String s2){
        int i1 = s1.length(), i2 = s2.length(), j;
        char ss1 ="", ss2 = "";
        for(j = i1 - 2; j >= 1; j--) if((int) s1.charAt(j) == 32) {
            ss1 = s1.charAt(j + 1);
            break;
        }
        if((int) ss1 == 32) ss1 = s1.charAt(0);
        for(j = i2 - 2; j >= 1; j--) if((int) s2.charAt(j) == 32){
            ss2 = s2.charAt(j + 1);
            break;
        }
        if(Character.isSpace(ss2)) ss2 = s2.charAt(0);
        i1 = (int) ss1; i2 = (int) ss2;
        if( i1 >= i2) return true;
        else return false;

    }*/
    public static int compare(String s){
        int i;
        char ss = s.charAt(0);
        for(i = s.length() - 2; i >= 1; i-- )
            if((int) s.charAt(i) == 32){
                ss = s.charAt(i + 1);
                break;
            }
 //       if((int) ss == 32) ss = s.charAt(0);
        if((int) ss == 84 || (int) ss == 116) return 1;
        else return 0;
    }
    public static void ex1() {
        Scanner input = new Scanner(System.in);
        int i;
//        System.out.println((int)'a');
        int[] Point1 = new int[30];
        int[] Point2 = new int[30];
        int[] Point3 = new int[30];
        int[] Point4 = new int[30];
        String[] Name = new String[11];
        for(i = 1; i <= 10; i++){
            System.out.print("nhap ten van dong vien thu "+ i +" ");
            if(i > 1) input.nextLine();
            Name[i] = input.nextLine();
            System.out.print("nhap thanh tich cua van dong vien "+ Name[i]+" ");
            Point1[i] = input.nextInt();
            Point2[i] = input.nextInt();
            Point3[i] = input.nextInt();
            Point4[i] = Point1[i] + Point2[i] + Point3[i];
        }
        System.out.println("chon chuc nang :");
        System.out.println("1: hien thi danh sach van dong vien va thanh tich");
        System.out.println("2: van dong vien co tong thanh tich cao nhat");
        System.out.println("3: 3 van dong vien co tong thanh tich cao nhat");
        System.out.println("4: danh sach van dong vien theo ten");
        System.out.println("5: danh sach van dong vien ten bat dau bang chu \"t\" ");
        System.out.println("6: danh sach van dong vien co van \"an\"");
        System.out.println("7: danh sach van dong vien co do tai ten tang dan");
        System.out.println("8: danh sach van dong vien co cung tong thanh tich");
        System.out.println("9: danh sach van dong vien co lan cu ta thu 3 thap nhat");
        System.out.println("10: danh sach van dong vien co lan cu ta thu nhat cao nhat");
        int code2 = input.nextInt(), j;
        switch (code2){
            case 1:
                for(i = 1; i <= 10; i++){
                    System.out.println("van dong vien \""+Name[i]+"\" co thanh tich lan luot la "+Point1[i]+" "+ Point2[i]+ " " +Point3[i]);
                }
                break;
            case 2:
                for(i = 1; i < 10; i++ )
                    for(j = i + 1; j <= 10; j++ )
                        if(Point4[i] > Point4[j]){
                            String S = Name[i];
                            Name[i] = Name[j];
                            Name[j] = Name[i];

                            int code1 = Point1[i];
                            Point1[i] = Point1[j];
                            Point1[j] = code1;

                            code1 = Point2[i];
                            Point2[i] = Point2[j];
                            Point2[j] = code1;

                            code1 = Point3[i];
                            Point3[i] = Point3[j];
                            Point3[j] = code1;

                            code1 = Point4[i];
                            Point4[i] = Point4[j];
                            Point4[j] = code1;
                        }
                System.out.println("van dong vien\""+Name[10]+"\" co thanh tich cao nhat voi tong la"+Point4[10] );
                break;
            case 3:
                for(i = 1; i < 10; i++ )
                    for(j = i + 1; j <= 10; j++ )
                        if(Point4[i] > Point4[j]){
                            String S = Name[i];
                            Name[i] = Name[j];
                            Name[j] = Name[i];

                            int code1 = Point1[i];
                            Point1[i] = Point1[j];
                            Point1[j] = code1;

                            code1 = Point2[i];
                            Point2[i] = Point2[j];
                            Point2[j] = code1;

                            code1 = Point3[i];
                            Point3[i] = Point3[j];
                            Point3[j] = code1;

                            code1 = Point4[i];
                            Point4[i] = Point4[j];
                            Point4[j] = code1;
                        }
                for(i = 10; i >= 8 ; i-- )
                    System.out.println("van dong vien xep thu "+ (10 - i + 1) +" la \""+ Name[i]+ "\" voi thanh tich la "+Point4[i]);
                break;
            case 4:
                System.out.println("chuong trinh gap virus");
               break;
            case 5:
                for(i = 1; i <= 10; i++)
                    if(compare(Name[i]) == 1) System.out.println("van dong vien \"" + Name[i] +"\" ");
                    break;
            case 6:
                for(i = 1; i <= 10; i++)
                    if(Name[i].indexOf("an") >= 0||Name[i].indexOf("An") >= 0 ) System.out.println("van dong vien \"" + Name[i] +"\" ");
                break;
            case 7:
                for(i = 1; i < 10; i++ )
                    for(j = i + 1; j <= 10; j++ )
                        if(Name[i].length() > Name[j].length()){
                            String S = Name[i];
                            Name[i] = Name[j];
                            Name[j] = Name[i];

                        }
                for(i = 1; i <= 10 ; i++ )
                    System.out.println("van dong vien \""+Name[i]+"\"");
            case 8:
                for(i = 1; i < 10; i++ )
                    for(j = i + 1; j <= 10; j++ )
                        if(Point4[i] > Point4[j]){
                            String S = Name[i];
                            Name[i] = Name[j];
                            Name[j] = Name[i];

                            int code1 = Point4[i];
                            Point4[i] = Point4[j];
                            Point4[j] = code1;
                        }
                System.out.println("cac nhom van dong vien co cung thanh tich :");
                for(i = 1; i <= 9; i++)
                    if(Point4[i] == Point4[i + 1]) System.out.print("\""+Name[i]+"\",");
                    else {
                        System.out.println();
                        System.out.print("\""+Name[i]+"\"");
                    }
                if(Point4[10] == Point4[9]) System.out.print("\""+Name[i]+"\"");
            case 9:
                for(i = 1; i < 10; i++ )
                    for(j = i + 1; j <= 10; j++ )
                        if(Point3[i] > Point3[j]){
                            String S = Name[i];
                            Name[i] = Name[j];
                            Name[j] = Name[i];

                            int code1 = Point1[i];
                            Point1[i] = Point1[j];
                            Point1[j] = code1;

                            code1 = Point2[i];
                            Point2[i] = Point2[j];
                            Point2[j] = code1;

                            code1 = Point3[i];
                            Point3[i] = Point3[j];
                            Point3[j] = code1;

                            code1 = Point4[i];
                            Point4[i] = Point4[j];
                            Point4[j] = code1;
                        }
                for(i = 10; i >= 8 ; i-- )
                    System.out.println("van dong vien \""+ Name[i]+ "\" voi thanh tich lan 3 la "+Point3[i]);
                break;
            case 10:
                for(i = 1; i < 10; i++ )
                    for(j = i + 1; j <= 10; j++ )
                        if(Point1[i] < Point1[j]){
                            String S = Name[i];
                            Name[i] = Name[j];
                            Name[j] = Name[i];

                            int code1 = Point1[i];
                            Point1[i] = Point1[j];
                            Point1[j] = code1;

                            code1 = Point2[i];
                            Point2[i] = Point2[j];
                            Point2[j] = code1;

                            code1 = Point3[i];
                            Point3[i] = Point3[j];
                            Point3[j] = code1;

                            code1 = Point4[i];
                            Point4[i] = Point4[j];
                            Point4[j] = code1;
                        }
                for(i = 10; i >= 8 ; i-- )
                    System.out.println("van dong vien \""+ Name[i]+ "\" voi thanh tich lan 1 la "+Point1[i]);
                break;
        }
    }
    public static void main(String[] args){
        ex1();
    }
}