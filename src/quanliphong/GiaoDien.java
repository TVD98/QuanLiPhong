/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliphong;

import java.util.Scanner;

/**
 *
 * @author GMT
 */
public class GiaoDien {
    
    public static KhachHang taoKHMoi() {
        System.out.println("Nhập thông tin khách hàng:");
        String maKH = nhapChuoi("Nhập mã khách hàng");
        String hoTen = nhapChuoi("Nhập họ tên");
        String[] cacLuaChon = {"Nam", "Nữ"};
        int gioiTinh = luaChonMenu("Chọn giới tính", cacLuaChon);
        
        return KhachHang.taoMoiKH(maKH, hoTen, gioiTinh);
    }
    
    public static Phong taoPhongMoi() {
        System.out.println("Nhập thông tin phòng:");
        String maPhong = nhapChuoi("Nhập mã phòng");
        String[] cacLuaChon = {"Phòng đơn", "Phòng đôi", "Phòng VIP"};
        int loaiPhong = luaChonMenu("Chọn loại phòng", cacLuaChon);
        double giaTien = nhapSoThuc("Nhập giá tiền");
        
        return Phong.taoPhongMoi(maPhong, loaiPhong, giaTien);
    }
    
    public static void hienThiMenu(String tieuDe, String[] cacLuaChon) {
        System.out.println(String.format("%s:", tieuDe));
        for (int i = 0; i < cacLuaChon.length; i++) {
            System.out.println(String.format("\t%d. %s", i + 1, cacLuaChon[i]));
        }
    }

    public static int luaChonMenu(String tieuDe, String[] cacLuaChon) {
        int luaChon = 0;
        hienThiMenu(tieuDe, cacLuaChon);
        do {
            luaChon = nhapSoNguyen("Nhập lựa chọn");
        } while (luaChon < 1 || luaChon > cacLuaChon.length);
        return luaChon;
    }

    public static String nhapChuoi(String tieuDe) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("%s:", tieuDe));
        return scanner.next();
    }

    public static int nhapSoNguyen(String tieuDe) {
        int ketQua = 0;
        boolean thanhCong = false;       
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(String.format("%s:", tieuDe));
            if (scanner.hasNextInt()) {
                ketQua = scanner.nextInt();
                thanhCong = true;
            }
        } while (!thanhCong);
        return ketQua;
    }
    
    public static double nhapSoThuc(String tieuDe) {
        double ketQua = 0;
        boolean thanhCong = false;       
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(String.format("%s:", tieuDe));
            if (scanner.hasNextDouble()) {
                ketQua = scanner.nextDouble();
                thanhCong = true;
            }
        } while (!thanhCong);
        return ketQua;
    }
}
