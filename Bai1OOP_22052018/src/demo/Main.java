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
public class Main {

    public static void main(String[] args) {
        int dem = 0;
        Programmer p = new Programmer();
        //
        ArrayList<Tester> ListT = new ArrayList<>();
        //
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số nhân viên cần nhập vào :");
        int n = Integer.parseInt(nhap.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1));
            System.out.println("Thuộc ngành: 1.Programmer hay 2.Tester");
            System.out.print("Chọn: ");
            int choose = Integer.parseInt(nhap.nextLine());
            switch (choose) {
                case 1:
                    p.NhapNV();
                    System.out.println("Số lỗi là: ");
                    p.setSoLoi(Integer.parseInt(nhap.nextLine()));
                    p.HienNV();
                    System.out.println("\tLương thực lĩnh: " + p.TinhLuong());
                    if (p.getSoLoi() < 5) {
                        dem += 1;
                    }
                    break;
                case 2:

                    Tester t = new Tester();
                    t.NhapNV();
                    System.out.print("Số giờ OT : ");
                    t.setSoGioOT(Double.parseDouble(nhap.nextLine()));
                    t.HienNV();
                    System.out.println("\tLương thực lĩnh: " + t.TinhLuong());
                    ListT.add(t);
                    break;
            }
        }
        System.out.println("");
        System.out.println("Số nhân viên có số lỗi nhỏ hơn 5: " + dem);
        int vitri=0;
        for (int i = 1; i < ListT.size(); i++) {
            if(ListT.get(vitri).getSoGioOT()<ListT.get(i).getSoGioOT()){
                vitri=i;
            }
        }
        System.out.println("Thông tin nhân viên có OT cao nhất:");
        System.out.println("\tMã NV : "+ListT.get(vitri).getMaNV());
        System.out.println("\tTên NV : "+ListT.get(vitri).getTenNV());
        System.out.println("\tOT lớn nhất : "+ListT.get(vitri).getSoGioOT());
        System.out.println("\tLương : "+ListT.get(vitri).TinhLuong());
    }
}
