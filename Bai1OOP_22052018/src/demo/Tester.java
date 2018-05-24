/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Tester extends NhanVien {

    private double soGioOT;

    public Tester() {
        super();
    }

    public Tester(double soGioOT) {
        super();
        this.soGioOT = soGioOT;
    }

    public double getSoGioOT() {
        return soGioOT;
    }

    public void setSoGioOT(double soGioOT) {
        this.soGioOT = soGioOT;
    }

    @Override
    public double TinhLuong() {
        return super.getLuong() + soGioOT * 200000;
    }

    @Override
    public void NhapNV() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Mã nhân viên : ");
        super.setMaNV(Integer.parseInt(nhap.nextLine()));
        System.out.println("Tên Nhân viên: ");
        super.setTenNV(nhap.nextLine());
        System.out.println("Nhập lương cơ bản: ");
        super.setLuong(Double.parseDouble(nhap.nextLine()));
    }

    @Override
    public void HienNV() {
        System.out.println("Thông tin:");
        System.out.println("\tMã nhân viên: " + super.getMaNV());
        System.out.println("\tTên nhân viên: " + super.getTenNV());
        System.out.println("\tLương cơ bản: " + super.getLuong());
    }

    @Override
    public String toString() {
        return "ThongTin{" + "MaNV= " + super.getMaNV() +','+ "TenNV= " + super.getTenNV()+','+ "Luong= " + TinhLuong() + '}';
    }
}
