package entity;

import java.util.List;
import java.util.Scanner;

public class AssignmentTable{//Bảng phân công

    private BusRoutes BusRoutes;

    private BusDriver BusDriver;
    private int tongSoLuot;
    private List<DriverMgr<BusRoutes, Integer>> driverMgrs;

    public AssignmentTable(entity.BusRoutes busRoutes, entity.BusDriver busDriver, int tongSoLuot, List<DriverMgr<entity.BusRoutes, Integer>> driverMgrs) {
        BusRoutes = busRoutes;
        BusDriver = busDriver;
        this.tongSoLuot = tongSoLuot;
        this.driverMgrs = driverMgrs;
    }

    public AssignmentTable(int busDriver, DriverMgr[] addAssignmentTable) {
    }

    public entity.BusRoutes getBusRoutes() {
        return BusRoutes;
    }

    public void setBusRoutes(entity.BusRoutes busRoutes) {
        BusRoutes = busRoutes;
    }

    public entity.BusDriver getBusDriver() {
        return BusDriver;
    }

    public void setBusDriver(entity.BusDriver busDriver) {
        BusDriver = busDriver;
    }

    public int getTongSoLuot() {
        return tongSoLuot;
    }

    public void setTongSoLuot(int tongSoLuot) {
        this.tongSoLuot = tongSoLuot;
    }

    public List<DriverMgr<entity.BusRoutes, Integer>> getDriverMgrs() {
        return driverMgrs;
    }

    public void setDriverMgrs(List<DriverMgr<entity.BusRoutes, Integer>> driverMgrs) {
        this.driverMgrs = driverMgrs;
    }

    @Override
    public String toString() {
        return "AssignmentTable{" +
                "BusRoutes=" + BusRoutes +

                ", BusDriver=" + BusDriver +
                ", tongSoLuot=" + tongSoLuot +
                ", driverMgrs=" + driverMgrs +
                '}';
    }
}


