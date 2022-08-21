package logic_handle;

import entity.BusRoutes;
import main.MainRun;

import java.util.Scanner;

public class AddBusRoutes {
    public static void inputNewBusRoutes() {
        System.out.print("Xin mời nhập số Tuyến mới : ");
        int busRoutesNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < busRoutesNumber; i++) {
            BusRoutes busRoutes = new BusRoutes();
            busRoutes.inputInfo();
            saveBusRoutesInfo(busRoutes);
        }
    }

    public static void saveBusRoutesInfo(BusRoutes busRoutes) {
        for (int j = 0; j < MainRun.BUSROUTESS.length; j++) {
            if (MainRun.BUSROUTESS[j] == null) {
                MainRun.BUSROUTESS[j] = busRoutes;
                return;
            }
        }
    }

    public static void showBusRoutes() {
        for (int i = 0; i < MainRun.BUSROUTESS.length; i++) {
            if (MainRun.BUSROUTESS[i] == null) {
                continue;
            }
            System.out.println(MainRun.BUSROUTESS[i]);
        }
    }


    public static boolean isEmptyBusRoutes() {
        for (int i = 0; i < MainRun.BUSROUTESS.length; i++) {
            if (MainRun.BUSROUTESS[i] != null) {
                return false;
            }
        }
        return true;
    }
}
