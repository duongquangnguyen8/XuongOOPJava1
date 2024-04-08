/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiNhanVien;

/**
 *
 * @author hhhh
 */
public class NhanVienIT extends NhanVien {
    private int soGioTangCa;

    public NhanVienIT(int soGioTangCa, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.soGioTangCa = soGioTangCa;
    }

    public NhanVienIT() {
    }
    

    public int getSoGioTangCa() {
        return soGioTangCa;
    }

    public void setSoGioTangCa(int soGioTangCa) {
        this.soGioTangCa = soGioTangCa;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.println("Nhap so gio tang ca");
        this.soGioTangCa=scanner.nextInt();
    }    

    @Override
     public String toString() {
    String formattedString = String.format("%-20s %-20s %-20s %-20s %-20.0f %-20d %-20.0f",
            this.getMaNhanVien(), this.getHoTen(),this.getTuoi(), this.getDiaChi(),
            this.getLuongCoBan(), this.getSoGioTangCa(), this.tinhLuong());
    
    return formattedString +" (NhanVienIT)";
}

    
    
    @Override
    public double tinhLuong() {
        return this.luongCoBan+this.soGioTangCa*300000-this.getThue();
    }
    
}
