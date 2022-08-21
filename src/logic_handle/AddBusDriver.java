package logic_handle;

import entity.BusDriver;
import main.MainRun;
import java.util.Scanner;

public class AddBusDriver {
    private boolean driverId;

    public static void showBusDriver() {
        for (int i = 0; i < MainRun.BUSDRIVERS.length; i++) {
            if (MainRun.BUSDRIVERS[i] == null) {
                continue;
            }
            System.out.println(MainRun.BUSDRIVERS[i]);
        }
    }

    public static void inputNewBusDriver() {
        System.out.print("Xin mời nhập số lượng Lái xe mới muốn thêm : ");
        int busdriverNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < busdriverNumber; i++) {
            BusDriver busdriver = new BusDriver();
            busdriver.inputInfo();
            saveBusDriverInfo(busdriver);
        }
    }

    public static void saveBusDriverInfo(BusDriver busdriver) {
        for (int j = 0; j < MainRun.BUSDRIVERS.length; j++) {
            if (MainRun.BUSDRIVERS[j] == null) {
                MainRun.BUSDRIVERS[j] = busdriver;
                return;
            }
        }
    }

    public static boolean isEmptyBusDriver() {
        for (int i = 0; i < MainRun.BUSDRIVERS.length; i++) {
            if (MainRun.BUSDRIVERS[i] != null) {
                return false;
            }
        }
        return true;
    }
}
