/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiNhanVien;

/**
 *
 * @author hhhh
 */
public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;
    private double thuongSanPham;

    public NhanVienSanXuat(int soSanPham, double thuongSanPham, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.soSanPham = soSanPham;
        this.thuongSanPham = thuongSanPham;
    }

    public NhanVienSanXuat() {
    }
    
    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public double getThuongSanPham() {
        return thuongSanPham;
    }

    public void setThuongSanPham(double thuongSanPham) {
        this.thuongSanPham = thuongSanPham;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.println("Nhap so san pham lam duoc");
        this.soSanPham=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap thuong moi san pham lam duoc");
        this.thuongSanPham=scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
     public String toString() {
    String formattedString = String.format("%-20s %-20s %-20d %-20s %-20.0f %-20d %-20.0f %-20.0f",
            this.getMaNhanVien(), this.getHoTen(), this.getTuoi(), this.getDiaChi(),
            this.getLuongCoBan(), this.getSoSanPham(), this.getThuongSanPham(), this.tinhLuong());
    
    return  formattedString + " (NhanVienSX) ";
}

    @Override
    public double tinhLuong() {
        return this.getLuongCoBan()+(this.soSanPham*this.thuongSanPham)-this.getThue();
    }
    
}
