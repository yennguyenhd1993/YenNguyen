package entity;

import constant.DriverLevel;

import java.util.Scanner;

public class Person implements Inputable{

    protected int driverId;
    protected String name;
    public String address;
    public String tel;
    public DriverLevel level;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public DriverLevel getLevel() {
        return level;
    }

    public void setLevel(DriverLevel level) {
        this.level = level;
    }


    @Override
    public void inputInfo() {

        System.out.print("Nhập mã lái xe: ");
        this.driverId = new Scanner(System.in).nextInt();
        System.out.print("Nhập họ tên lái xe: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.tel = new Scanner(System.in).nextLine();
    }

}
