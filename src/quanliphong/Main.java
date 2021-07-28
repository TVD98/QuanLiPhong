/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliphong;

/**
 *
 * @author GMT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLiPhong quanLiPhong = new QuanLiPhong();
        Phong p01 = GiaoDien.taoPhongMoi();
        Phong p02 = Phong.taoPhongMoi("phong02", 0, 50000);
        quanLiPhong.themPhong(p01);
        quanLiPhong.themPhong(p02);
        
        KhachHang kh01 = GiaoDien.taoKHMoi();
        
        System.out.println("\nNhập thông tin sắp xếp phòng:");
        String ngayNhan = GiaoDien.nhapChuoi("Nhập ngày nhận");
        int soNgayThue = GiaoDien.nhapSoNguyen("Nhập số ngày thuê dự kiến");
        XepPhong xepPhong = quanLiPhong.sapXepPhong(kh01, p01.getMaPhong(), ngayNhan, soNgayThue);
        if (xepPhong != null) {
            System.out.println("Xếp phòng thành công");
        }
    }
    
}
