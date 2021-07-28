/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliphong;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GMT
 */
public class QuanLiPhong {
    private List<Phong> dsPhong = new ArrayList<>();
    
    public XepPhong sapXepPhong(KhachHang kh, String maPhong, String ngayNhan, int soNgayThue) {
        Phong phong = searchPhong(maPhong);
        if(phong != null) {
            kh.setMaPhong(maPhong);
            return new XepPhong(kh, ngayNhan, soNgayThue);
        }
        return null;
    }
    
    public void themPhong(Phong phong) {
        Phong p = searchPhong(phong.getMaPhong());
        if(p == null) {
            dsPhong.add(phong);
        }
    }
    
    private Phong searchPhong(String maPhong) {
        Phong p = dsPhong.stream()
                .filter(phong -> maPhong.compareTo(phong.getMaPhong()) == 0)
                .findAny()
                .orElse(null);
        return p;
    }
}
