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
public class XepPhong {
    private KhachHang khachHang;
    private String ngayNhan;
    private int soNgayThueDuKien;

    public XepPhong(KhachHang khachHang, String ngayNhan, int soNgayThueDuKien) {
        this.khachHang = khachHang;
        this.ngayNhan = ngayNhan;
        this.soNgayThueDuKien = soNgayThueDuKien;
    }
}
