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
public class GiamDoc extends NhanVien {

    private double luongLanhDao;

    public GiamDoc(double luongLanhDao, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.luongLanhDao = luongLanhDao;
    }

    public GiamDoc() {
    }

    public double getLuongLanhDao() {
        return luongLanhDao;
    }

    public void setLuongLanhDao(double luongLanhDao) {
        this.luongLanhDao = luongLanhDao;
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap luong lanh dao");
        luongLanhDao = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
    String formattedString = String.format("%-20s %-20s %-20d %-20s %-20.0f %-20.0f %-20.0f",
            this.getMaNhanVien(), this.getHoTen(),this.getTuoi(), this.getDiaChi(),
            this.getLuongCoBan(), this.getLuongLanhDao(), this.tinhLuong());
    
    return formattedString +" (Giam doc) ";
}

    @Override
    public double tinhLuong() {
        return this.getLuongCoBan()+this.getLuongLanhDao()-this.getThue();
    }
}
