package BusDriverManagement;

import java.util.Scanner;

public class BusRoutes {// Tuyến xe
    private static int AUTO_ROUTESID=100;

    private int routesId;// Mã tuyến
    private float distance;// khoảng cách
    private int busStopNumber;// Số điểm dừng xe buýt

    public BusRoutes() {
    }

    public BusRoutes(int routesId, float distance, int busStopNumber) {
        this.routesId = routesId;
        this.distance = distance;
        this.busStopNumber = busStopNumber;
    }

    public static int getAutoRoutesid() {
        return AUTO_ROUTESID;
    }

    public static void setAutoRoutesid(int autoRoutesid) {
        AUTO_ROUTESID = autoRoutesid;
    }

    public int getRoutesId() {
        return routesId;
    }

    public void setRoutesId(int routesId) {
        this.routesId = routesId;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getBusStopNumber() {
        return busStopNumber;
    }

    public void setBusStopNumber(int busStopNumber) {
        this.busStopNumber = busStopNumber;
    }

    public void input (){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma tuyen : ");
        routesId = Integer.parseInt(input.nextLine());

        System.out.println("Nhap Khoang cach : ");
        distance = input.nextFloat();

        System.out.println("Nhap so diem dung : ");
        busStopNumber = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return "BusRoutes{" +
                "routesId=" + routesId +
                ", distance=" + distance +
                ", busStopNumber=" + busStopNumber +
                '}';
    }
    public void showInfo(){
        System.out.println(toString());
    }
}
