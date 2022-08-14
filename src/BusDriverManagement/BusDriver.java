package BusDriverManagement;

public class BusDriver {//Thông tin lái xe
    private static int AUTO_IDDRIVER=10000;

    private int idDriver;
    private String name;
    private String address;
    private String tel;
    private String level;

    public BusDriver() {
    }

    public BusDriver(int idDriver, String name, String address, String tel, String level) {
        this.idDriver = idDriver;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.level = level;
    }

    public static int getAutoIddriver() {
        return AUTO_IDDRIVER;
    }

    public static void setAutoIddriver(int autoIddriver) {
        AUTO_IDDRIVER = autoIddriver;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
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
                "idDriver=" + idDriver +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
