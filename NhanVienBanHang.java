/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiNhanVien;

/**
 *
 * @author hhhh
 */
public class NhanVienBanHang extends NhanVien {

    private double hoaHong;
    private int doanhSo;

    public NhanVienBanHang(double hoaHong, int doanhSo, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.hoaHong = hoaHong;
        this.doanhSo = doanhSo;
    }

    public NhanVienBanHang() {
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public int getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(int doanhSo) {
        this.doanhSo = doanhSo;
    }
    

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap doanh so: ");
        this.doanhSo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap hoa hong: ");
        this.hoaHong = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        String formattedString = String.format("%-20s %-20s %-20d %-20s %-20.0f %-20d %-20s %-20.0f",
                this.getMaNhanVien(), this.getHoTen(), this.getTuoi(), this.getDiaChi(),
                this.getLuongCoBan(), this.getDoanhSo(),this.getHoaHong(), this.tinhLuong());

        return formattedString +" (NhanVienBanHang) ";
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan + (this.doanhSo * this.hoaHong) - this.getThue();
    }

}
