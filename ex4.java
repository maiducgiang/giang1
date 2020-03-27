package com.company;
import java.util.Scanner;
public class ex4 {
    public static void body(){
        Scanner input = new Scanner(System.in);
        int code = 1;
        String[] codeID = new String[100];
        String[] codeName = new String[100];
        String[] codeFName = new String[100];
        String[] codeClass = new String[100];
        int[] codeOld = new int[100];
        String[] codeS = new String[100];
        /*int[] codeTerm = new int[100];*/





        System.out.println("thong tin sinh vien :");
        System.out.print("ma sinh vien ");/*String*/ codeID[code] = input.nextLine();
        System.out.print("ho dem "); /*String*/ codeName[code] = input.nextLine();
        System.out.print("ten "); /*String*/ codeFName[code] = input.nextLine();
        System.out.print("ma lop "); /*String*/ codeClass[code] = input.nextLine();
        System.out.print("nam sinh "); /*int*/ codeOld[code] = input.nextInt();
        System.out.print("gioi tinh ");input.nextLine(); /*String*/ codeS[code] = input.nextLine();
        System.out.print("so hoc phan da hoc ");int codeTerm = input.nextInt();
        System.out.println("thong tin hoc phan:");int i;

        String[] codeCourse = new String[codeTerm + 1];
        String[] nameCourse = new String[codeTerm + 1];
        String[] credits = new String[codeTerm + 1];
        int[] numberCourse = new int[codeTerm + 1] ;
        int[] point = new int[codeTerm + 1];
        int totalCourse = 0, total = 0;

        for(i = 1; i <= codeTerm; i++){
            System.out.print("nhap ma hoc phan "+ i +" "); input.nextLine(); codeCourse[i] = input.nextLine();
            System.out.print("nhap ten hoc phan "+ i +" " ); nameCourse[i] = input.nextLine();
            System.out.print("nhap so tin chi cua hoc phan "+ i +" "); numberCourse[i] = input.nextInt(); totalCourse += numberCourse[i];
            System.out.print("nhap diem ket thuc hoc phan "+ i +" " ); point[i] = input.nextInt();
            total = total + point[i] * numberCourse[i];
        }

        System.out.print("nhap so luong giao vien ");int numberTeacher = input.nextInt();
        System.out.println("thong tin giao vien :");
        String[] codeTeacher = new String[numberTeacher + 1];
        String[] classTeacher = new String[numberTeacher + 1];
        String[] nameTeacher = new String[numberTeacher + 1];
        int[] oldTeacher = new int[ numberTeacher + 1];
        String[] sTeacher = new String[numberTeacher + 1];
        for(i = 1; i <= numberTeacher; i++){
            input.nextLine();
            System.out.print("nhap ma giao vien "+ i +" "); /* input.nextLine()*/; codeTeacher[i] = input.nextLine();
            System.out.print("nhap ma lop giao vien "+ i +" "); classTeacher[i] = input.nextLine();
            System.out.print("nhap ten giao vien "+ i +" " ); nameTeacher[i] = input.nextLine();
            System.out.print("nhap nam sinh giao vien "+ i +" "); oldTeacher[i] = input.nextInt();
            System.out.print("nhap gioi tinh giao vien " + i +" ");/*input.nextLine();*/  sTeacher[i] = input.nextLine(); //input.nextLine();
        }
        System.out.println("thong tin sinh vien vua tao :");
        System.out.println("ten " +codeFName[code] +" ma sinh vien "+ codeID[code] +" ma lop " + codeClass[code] );
        System.out.println("gioi tinh "+codeS[code]+ " so hoc phan da hoc " + codeTerm +" diem tong ket "+(float) total / totalCourse );
        System.out.println("danh sach giao vien :");
        for(i = 1; i <= numberTeacher; i++){
            System.out.println(i+" ten giao vien "+ nameTeacher[i]+" ma giao vien "+ codeTeacher[i] +" ma lop "+classTeacher[i]);
        }
        int fun = 1;
        while(fun != 0){
            System.out.println("cac chuc nang :");
            System.out.println("1. them sinh vien moi");
            System.out.println("2. sua thong tin sinh vien");
            System.out.println("3. sua thong tin giao vien");
            System.out.println("4. xua diem hoc phan theo ma hoc phan");
            System.out.println("5. xoa thong tin giao vien theo ma giao vien");
            System.out.println("6. xoa thong tin sinh vien theo ma sinh vien");
            System.out.println("0. ket thuc");
            System.out.print("nhap chuc nang :"); fun = input.nextInt();
            switch (fun){
                case 0: break;
                case 1:
                    code++;
                    System.out.print("ma sinh vien ");/*String*/input.nextLine(); codeID[code] = input.nextLine();
                    System.out.print("ho dem "); /*String*/ codeName[code] = input.nextLine();
                    System.out.print("ten "); /*String*/ codeFName[code] = input.nextLine();
                    System.out.print("ma lop "); /*String*/ codeClass[code] = input.nextLine();
                    System.out.print("nam sinh "); /*int*/ codeOld[code] = input.nextInt();
                    System.out.print("gioi tinh ");input.nextLine(); /*String*/ codeS[code] = input.nextLine();
                    break;
                case 2:
                    System.out.print("nhap ma sinh vien can sua") ; String masinhvien = input.nextLine();
                    for(i = 1; i <= code; i++){
                        if (masinhvien.compareTo(codeID[code]) == 0){
                            System.out.print("nhap ho dem "); /*String*/ codeName[i] = input.nextLine();
                            System.out.print("nhap ten "); /*String*/ codeFName[i] = input.nextLine();
                            System.out.print("nhap ma lop "); /*String*/ codeClass[i] = input.nextLine();
                            System.out.print("nhap nam sinh "); /*int*/ codeOld[i] = input.nextInt();
                            System.out.print("nhap gioi tinh ");input.nextLine(); /*String*/ codeS[i] = input.nextLine();
                            break;
                        }
                        if(i == code) System.out.print("khong ton tai ma sinh vien thoa man");
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
            }
        }

    }
    public static void main(String[] args){
        body();
    }
}
