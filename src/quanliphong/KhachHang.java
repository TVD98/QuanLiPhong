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
public class KhachHang {
    private String maKH;
    private String hoTen;
    private int gioiTinh;
    private String maPhong = "";

    private KhachHang(String maKH, String hoTen, int gioiTinh) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }
    
    public static KhachHang taoMoiKH(String maKH, String hoTen, int gioiTinh) {
        return new KhachHang(maKH, hoTen, gioiTinh);
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
}
