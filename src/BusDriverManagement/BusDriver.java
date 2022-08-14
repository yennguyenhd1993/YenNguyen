package BusDriverManagement;

public class BusDriver {//Thông tin lái xe
    private static int AUTO_DRIVERID=10000;

    private int driverId;
    private String name;
    private String address;
    private String tel;
    private String level;

    public BusDriver() {
    }

    public BusDriver(int driverId, String name, String address, String tel, String level) {
        this.driverId = driverId;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.level = level;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "BusDriver{" +
                "driverId=" + driverId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
