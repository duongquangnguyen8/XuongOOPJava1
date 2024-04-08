/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiNhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author hhhh
 */
public class quanLi {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void bai1() {
        System.out.println("Moi ban nhap so nhan vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho nhan vien thu " + (i + 1) + " :");
            System.out.println("1.Giam doc");
            System.out.println("2.Nhan vien IT");
            System.out.println("3.Nhan vien ban hang");
            System.out.println("4.Nhan vien san xuat");
            System.out.println("5. Truong phong");
            System.out.println("Lua chon cua ban la: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    GiamDoc gd = new GiamDoc();
                    gd.input();
                    list.add(gd);
                    break;
                case 2:
                    NhanVienIT nvIT = new NhanVienIT();
                    nvIT.input();
                    list.add(nvIT);
                    break;
                case 3:
                    NhanVienBanHang nvBanHang = new NhanVienBanHang();
                    nvBanHang.input();
                    list.add(nvBanHang);
                    break;
                case 4:
                    NhanVienSanXuat nvSanXuat = new NhanVienSanXuat();
                    nvSanXuat.input();
                    list.add(nvSanXuat);
                    break;
                case 5:
                    TruongPhong truongPhong=new TruongPhong();
                    truongPhong.input();
                    list.add(truongPhong);
                    break;
                default:
                    System.out.println("Moi ban chon lai");
                    break;
            }
        }
    }
    GiamDoc gd = new GiamDoc();
    NhanVienBanHang nvBanHang = new NhanVienBanHang();
    NhanVienIT nvIT = new NhanVienIT();
    NhanVienSanXuat nvSanXuat = new NhanVienSanXuat();
    TruongPhong truongPhong=new TruongPhong();
    public void bai2() {
        System.out.println("Danh sach cac nhan vien: ");
        for (NhanVien nv : list) {
            System.out.println(nv.toString());
        }
    }
    
    public void bai3() {
        System.out.println("Nhap ma nhan vien can tim ");
        String maCanTim = scanner.nextLine();
        boolean check=false;
        for (NhanVien nv : list) {
            if (nv.getMaNhanVien().equals(maCanTim)) {
                System.out.println(nv.toString());
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("Khong tim thay ma nhan vien ");
        }
    }

    public void bai4() {
        System.out.println("Nhap ma nhan vien can xoa");
        String maCanXoa = scanner.nextLine();
        boolean check=false;
        for (NhanVien nv : list) {
            if (nv.getMaNhanVien().equals(maCanXoa)) {
                list.remove(nv);
                System.out.println("xoa thanh cong");
                check=true;
                break;
            }
        }if(!check){
            System.out.println("Khong tim thay ma nhan vien ");
        }
    }
    public void bai5(){
        System.out.println("Nhap ma nhan vien can cap nhat");
        String ma=scanner.nextLine();
        boolean check=false;
        for(NhanVien nv:list){
            if (nv.getMaNhanVien().equals(ma)) {
                System.out.println("Cap nhat thon tin");
                nv.input();
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("Khong tim thay ma nhan vien ");
        }
        else{
            bai2();
        }
    }
    public void bai6(){
        System.out.println("Nhap vao khoang luong ban muon tim");
        System.out.println("Khoang luong min: ");
        double min=scanner.nextDouble();
        System.out.println("Khoang luong max: ");
        double max=scanner.nextDouble();
        boolean check=false;
        for(NhanVien nv: list){
            if(min<nv.getLuongCoBan()&&nv.getLuongCoBan()<max){
                System.out.println(nv.toString());
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("Khong co hnhan vien co luong thuoc khoang tren");
        }
    }
    public void bai7(){
        //sắp xếp nhân viên theo họ tên
        Comparator<NhanVien> com=new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(list, com);
        bai2();
    }
    public void bai8(){
        Comparator<NhanVien> com=new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o1.tinhLuong(), o2.tinhLuong());
            }
        };
        Collections.sort(list, com);
        bai2();
    }
    public void bai9(){
        Comparator<NhanVien> com=new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o1.tinhLuong(), o2.tinhLuong());
            }
        };
        Collections.sort(list, com);
        System.out.println("5 nhân viên có lương cao nhất");
        for(int i=0;i<5;i++){
            for(NhanVien nv:list){
                System.out.println(nv.toString());
            }
        }
    }
    public void bai10(){
        // tìm nhân viên theo tên
        System.out.println("Nhap ten can tim");
        String ten=scanner.nextLine();
        boolean check=false;
        for(NhanVien nv: list){
            if(ten.equalsIgnoreCase(nv.getHoTen())){
                System.out.println(nv.toString());
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("Khong tim thay ten trong danh sach nhan vien");
        }
    }
}
