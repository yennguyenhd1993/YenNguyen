package entity;

import constant.DriverLevel;

import java.util.Scanner;

public class BusDriver extends Person implements Comparable<BusDriver>  {//Thông tin lái xe
    private static int AUTO_DRIVERID=10000;
    private DriverLevel driverLevel;

    public DriverLevel getDriverLevel() {
        return driverLevel;
    }

    public void setDriverLevel(DriverLevel driverLevel) {
        this.driverLevel = driverLevel;
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

    @Override
    public void inputInfo() {

        this.driverId = BusDriver.AUTO_DRIVERID++;
        System.out.print("Nhập mã lái xe: ");
        this.driverId = new Scanner(System.in).nextInt();
        System.out.print("Nhập họ tên lái xe: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.tel = new Scanner(System.in).nextLine();
        this.inputDriverLevel();
    }

    private void inputDriverLevel() {
        System.out.println("Nhập trình độ của lái xe, chọn 1 trong các lựa chọn dưới đây: ");
        System.out.println("1. Loại A");
        System.out.println("2. Loại B");
        System.out.println("3. Loại C");
        System.out.println("4. Loại D");
        System.out.println("5. Loại E");
        System.out.println("6. Loại F");
        int driverLevelInt = 0;
        do {
            driverLevelInt = new Scanner(System.in).nextInt();
            if (driverLevelInt >= 1 && driverLevelInt <= 6) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (driverLevelInt) {
            case 1:
                this.setLevel(DriverLevel.A);
                break;
            case 2:
                this.setLevel(DriverLevel.B);
                break;
            case 3:
                this.setLevel(DriverLevel.C);
                break;
            case 4:
                this.setLevel(DriverLevel.D);
            case 5:
                this.setLevel(DriverLevel.E);
                break;
            case 6:
                this.setLevel(DriverLevel.F);
                break;
        }

    }
    @Override
    public int compareTo(BusDriver busDriver) {
        if (this.driverId > busDriver.getDriverId()) {
            return 1;
        } else if (this.driverId < busDriver.getDriverId()) {
            return -1;
        }
        return 0;
    }

}
