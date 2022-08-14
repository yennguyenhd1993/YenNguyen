package BusDriverManagement;

import Constant.DriverLevel;

import java.util.Scanner;

public class BusDriver {//Thông tin lái xe
    private static int AUTO_DRIVERID=10000;

    private int driverId;
    private String name;
    private String address;
    private String tel;
    private DriverLevel level;

    public BusDriver() {
    }

    public static int getAutoDriverid() {
        return AUTO_DRIVERID;
    }

    public static void setAutoDriverid(int autoDriverid) {
        AUTO_DRIVERID = autoDriverid;
    }

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

    public int getLevel() {
        return level.ordinal();
    }

    public void setLevel(DriverLevel level) {
        this.level = level;
    }

    public void input (){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma lai xe : ");
        driverId = Integer.parseInt(input.nextLine());

        System.out.println("Nhap ho ten : ");
        name = input.nextLine();

        System.out.println("Nhap dia chi : ");
        address = input.nextLine();

        System.out.println("Nhap so dien thoai : ");
        tel = input.nextLine();

        System.out.println("Chon trinh do : ");
        level = DriverLevel.valueOf(input.nextLine());
    }

    @Override
    public String toString() {
        return "BusDriver{" +
                "driverId=" + driverId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", level=" + level +
                '}';
    }

    public void showInfo(){
        System.out.println(toString());
    }
}
