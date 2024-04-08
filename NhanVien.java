/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiNhanVien;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hhhh
 */
public abstract class  NhanVien {
    private String maNhanVien;
    private String hoTen;
    private int tuoi;
    private String diaChi;
    double luongCoBan;
    
    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    Scanner scanner=new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ma nhan vien: ");
        maNhanVien=scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen=scanner.nextLine();
        System.out.println("Nhap tuoi");
        tuoi=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=scanner.nextLine();
        System.out.println("Nhap luong co ban: ");
        luongCoBan=scanner.nextDouble();
        scanner.nextLine();
        
    }
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    public double getThue(){
        if(this.luongCoBan>10000000){
            return this.getLuongCoBan()*0.05;
        }
        return 0;
    }


    
    public abstract String toString();
    public abstract double tinhLuong();
}
