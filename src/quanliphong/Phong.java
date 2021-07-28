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
public class Phong {
    private String maPhong;
    private int loaiPhong;
    private double giaTien;

    private Phong(String maPhong, int loaiPhong, double giaTien) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.giaTien = giaTien;
    }
    
    protected static Phong taoPhongMoi(String maPhong, int loaiPhong, double giaTien) {
        return new Phong(maPhong, loaiPhong, giaTien);
    }

    public String getMaPhong() {
        return maPhong;
    }
}
