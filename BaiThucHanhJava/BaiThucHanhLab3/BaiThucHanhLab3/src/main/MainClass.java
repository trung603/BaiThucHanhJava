package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
        // Thử nghiệm với lớp Hình tròn
        HinhTron HinhTron = new HinhTron();
        HinhTron.XuatTen();
        HinhTron.nhapBanKinh();
        HinhTron.tinhChuVi();
        HinhTron.tinhDienTich();
        HinhTron.inChuVi();
        HinhTron.inDienTich();
        
        // Thử nghiệm với lớp Hình trụ
        HinhTru HinhTru = new HinhTru();
        HinhTru.XuatTen();
        HinhTru.nhapChieuCao();
        HinhTru.tinhTheTich();
        HinhTru.inTheTich();
        // Thử nghiệm với lớp Hình chữ nhật
        HinhChuNhat HinhChuNhat = new HinhChuNhat();
        HinhChuNhat.XuatTen();
        HinhChuNhat.nhapChieuDai();
        HinhChuNhat.nhapChieuRong();
        HinhChuNhat.tinhChuVi();
        HinhChuNhat.tinhDienTich();
        HinhChuNhat.inChuVi();
        HinhChuNhat.inDienTich();
        // Thử nghiệm với lớp Hình vuông
        HinhVuong HinhVuong = new HinhVuong();
        HinhVuong.XuatTen();
        HinhVuong.nhapCanh();
        HinhVuong.tinhChuVi();
        HinhVuong.tinhDienTich();
        HinhVuong.inChuVi();
        HinhVuong.inDienTich();
    }
}
