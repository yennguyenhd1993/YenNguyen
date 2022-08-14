package BusDriverManagement;

public class BusRoutes {// Tuyến xe
    private static int AUTO_IDROUTES=100;

    private int idRoutes;// Mã tuyến
    private float distance;// khoảng cách
    private int numberOfStops;

    public BusRoutes() {
    }

    public static int getAutoIdroutes() {
        return AUTO_IDROUTES;
    }

    public static void setAutoIdroutes(int autoIdroutes) {
        AUTO_IDROUTES = autoIdroutes;
    }

    public int getIdRoutes() {
        return idRoutes;
    }

    public void setIdRoutes(int idRoutes) {
        this.idRoutes = idRoutes;
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
                "idRoutes=" + idRoutes +
                ", distance=" + distance +
                ", numberOfStops=" + numberOfStops +
                '}';
    }
}
