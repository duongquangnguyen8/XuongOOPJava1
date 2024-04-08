/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiNhanVien;

/**
 *
 * @author hhhh
 */
public class TruongPhong extends NhanVien{
    private int kinhNghiem;

    public TruongPhong(int kinhNghiem, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.kinhNghiem = kinhNghiem;
    }

  

    public TruongPhong() {
    }

    public int getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(int kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap kinh nghiem");
        kinhNghiem=scanner.nextInt();
        scanner.nextLine();
    }
    
    @Override
    public String toString() {
    String formattedString = String.format("%-20s %-20s %-20d %-20s %-20.0f %-20d %-20.0f",
            this.getMaNhanVien(), this.getHoTen(),this.getTuoi(), this.getDiaChi(),
            this.getLuongCoBan(), this.getKinhNghiem(), this.tinhLuong());
    
    return  formattedString + " (TruongPhong)";
}

    @Override
    public double tinhLuong() {
        return luongCoBan+kinhNghiem*1000000-getThue();
    }
    
}
