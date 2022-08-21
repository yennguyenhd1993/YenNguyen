package entity;

import java.util.Scanner;

public class BusRoutes implements QLRoutes {// Tuyến xe
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

    @Override
    public String toString() {
        return "BusRoutes{" +
                "routesId=" + routesId +
                ", distance=" + distance +
                ", busStopNumber=" + busStopNumber +
                '}';
    }

  @Override
        public void inputInfo() {

            this.routesId =BusRoutes.AUTO_ROUTESID++;
            System.out.print("Nhập mã tuyến xe: ");
            this.routesId = new Scanner(System.in).nextInt();
            System.out.print("Nhập khoảng cách: ");
            this.distance = Float.parseFloat(new Scanner(System.in).nextLine());
            System.out.print("Nhập số điểm số điểm dừng: ");
            this.busStopNumber= new Scanner(System.in).nextInt();
            return;
        }
}