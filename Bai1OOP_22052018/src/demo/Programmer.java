/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Programmer extends NhanVien{
    private int soLoi;

    public Programmer() {
        super();
    }

    public Programmer(int soLoi) {
        super();
        this.soLoi = soLoi;
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    @Override
    public double TinhLuong() {
        if(soLoi<20){
             return super.getLuong()*1.1;
        }else{
            return super.getLuong();
        }
    }  

    @Override
    public void NhapNV() {
        Scanner nhap=new Scanner(System.in);
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
        System.out.println("\tMã nhân viên: "+super.getMaNV());
        System.out.println("\tTên nhân viên: "+super.getTenNV());
        System.out.println("\tLương cơ bản: "+super.getLuong());
    }

    @Override
    public String toString() {
        return "ThongTin{"+"MaNV= "+super.getMaNV()+','+"TenNV= "+super.getTenNV()+','+"Luong= "+TinhLuong()+'}';
    }
    
}
