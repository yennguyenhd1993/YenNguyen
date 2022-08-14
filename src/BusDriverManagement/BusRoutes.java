package BusDriverManagement;

public class BusRoutes {// Tuyến xe
    private static int AUTO_ROUTESID=100;

    private int routesId;// Mã tuyến
    private float distance;// khoảng cách
    private int numberOfStops;

    public BusRoutes() {
    }

    public BusRoutes(int routesId, float distance, int numberOfStops) {
        this.routesId = routesId;
        this.distance = distance;
        this.numberOfStops = numberOfStops;
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

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    @Override
    public String toString() {
        return "BusRoutes{" +
                "routesId=" + routesId +
                ", distance=" + distance +
                ", numberOfStops=" + numberOfStops +
                '}';
    }
}
