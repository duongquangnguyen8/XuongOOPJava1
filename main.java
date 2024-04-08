/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiNhanVien;

import java.util.Scanner;

/**
 *
 * @author hhhh
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        quanLi ql=new quanLi();
        while(true){
            System.out.println("----------MENU----------");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xuat nhan vien");
            System.out.println("3. Tim nhan vien theo ma");
            System.out.println("4. Xoa nhan vien theo ma");
            System.out.println("5. cap nhat nhan vien theo ma");
            System.out.println("6. Tim nhan vien theo khoang luong");
            System.out.println("7. Sap xep nhan vien theo ho ten");
            System.out.println("8. Sap xep nhan vien theo luong");
            System.out.println("9. 5 nhan vien co luong cao nhat");
            System.out.println("10. Tim nhan vien theo ten");
            System.out.println("Lua chon cua ban la");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    ql.bai1();
                    break;
                case 2:
                    ql.bai2();
                    break;
                case 3:
                    ql.bai3();
                    break;
                case 4:
                    ql.bai4();
                    break;
                case 5:
                    ql.bai5();
                    break;
                case 6:
                    ql.bai6();
                    break;
                case 7:
                    ql.bai7();
                    break;
                case 8:
                    ql.bai8();
                    break;
                case 9:
                    ql.bai9();
                    break;
                case 10:
                    ql.bai10();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon kh co trong menu moi ban nhap lai");
                    break;
            }
        }
    }
}
