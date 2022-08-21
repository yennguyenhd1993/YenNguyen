package entity;

public class DriverMgr<B, I extends Number> {// Quản lý lái xe

    private int soTuyen;
    private int soLuot;

    public DriverMgr() {
    }

    public DriverMgr(int soTuyen, int soLuot) {
        this.soTuyen = soTuyen;
        this.soLuot = soLuot;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoLuot() {
        return soLuot;
    }

    public void setSoLuot(int soLuot) {
        this.soLuot = soLuot;
    }

    @Override
    public String toString() {
        return "DriverMgr{" +
                "soTuyen=" + soTuyen +
                ", soLuot=" + soLuot +
                '}';
    }
}

