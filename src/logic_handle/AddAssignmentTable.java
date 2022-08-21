package logic_handle;

import entity.AssignmentTable;
import entity.BusDriver;
import entity.BusRoutes;
import entity.DriverMgr;
import main.MainRun;

import java.util.Scanner;

public class AddAssignmentTable {
    private static int BusDriver;
    private static DriverMgr[] driverMgrs;
    private static String AssignmentTable;

    public static entity.BusDriver inputAssignmentTable(int assignmentTable) {
        System.out.print("In ra danh sách quản lý xe bus : ");
        return null;
    }

    public static void sortAssignmentTable() {
        System.out.println("Nhập lựa chọn của bạn: ");
        System.out.println("1. Sắp xếp theo họ tên lái xe.");
        System.out.println("2. Sắp xếp theo số lượng tuyến đảm nhận trong ngày (giảm dần).");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice == 1 || choice == 2) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        if (choice == 1) { // sắp xếp theo tên lái xe
            for (int i = 0; i < MainRun.ASSIGNMENTTABLES.length - 1; i++) {
                if (MainRun.ASSIGNMENTTABLES[i] == null) {
                    continue;
                }
                for (int j = i + 1; j < MainRun.ASSIGNMENTTABLES.length; j++) {
                    if (MainRun.ASSIGNMENTTABLES[j] == null) {
                        continue;
                    }
                    if (MainRun.ASSIGNMENTTABLES[i].getBusDriver().getName().compareTo(MainRun.ASSIGNMENTTABLES[j].getBusDriver().getName()) > 0) {
                        AssignmentTable temp = MainRun.ASSIGNMENTTABLES[i];
                        MainRun.ASSIGNMENTTABLES[i] = MainRun.ASSIGNMENTTABLES[j];
                        MainRun.ASSIGNMENTTABLES[j] = temp;
                    }
                }
            }

            showAssignmentTable();
        } else if (choice == 2) { // sắp xếp theo số lượng tuyến đảm nhận trong ngày

        }
    }

    public static void searchASSIGNMENTTABLES() {
        System.out.print("Nhập tên lái xe mà bạn muốn tìm kiếm: ");
        String keyword = new Scanner(System.in).nextLine();
        for (int i = 0; i < MainRun.ASSIGNMENTTABLES.length; i++) {
            if (MainRun.ASSIGNMENTTABLES[i] != null && MainRun.ASSIGNMENTTABLES[i].getBusDriver().getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(MainRun.ASSIGNMENTTABLES[i]);
            }
        }
    }

    public static void showAssignmentTable() {
        for (int i = 0; i < MainRun.ASSIGNMENTTABLES.length; i++) {
            if (MainRun.ASSIGNMENTTABLES[i] != null) {
                System.out.println(MainRun.ASSIGNMENTTABLES[i]);
            }
        }
    }

    public void AssignmentTable() {

        if (AddBusRoutes.isEmptyBusRoutes() || AddBusDriver.isEmptyBusDriver()) {
            System.out.println("Cần thực hiện nhập danh sách tuyến và lái xe trước khi phân công");
            return;
        }

        System.out.print("Nhập vào số lượng lái xe muốn phân công: ");
        int BusDriverNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < BusDriverNumber; i++) {
            // thực hiện phân công cho lái xe thứ i

            // nhập lái xe muốn phân công
            BusDriver busDriver = inputAssignmentTable(i);

            // nhập danh sách tuyến mà bạn muốn phân công
            DriverMgr[] addAssignmentTable = inputAddAssignmentTable();

            AssignmentTable assignmentTable = new AssignmentTable(BusDriver, addAssignmentTable);// 1 lượt lái
            inputAssignmentTable(assignmentTable.getTongSoLuot());
        }
    }



    public static void saveAssignmentTable(AssignmentTable assignmentTable) {
        for (int j = 0; j < MainRun.ASSIGNMENTTABLES.length; j++) {
            if (MainRun.ASSIGNMENTTABLES[j] == null) {
                MainRun.ASSIGNMENTTABLES[j] = assignmentTable;
                break;
            }
        }
    }

    public static DriverMgr[] inputAddAssignmentTable() {
        System.out.print("Nhập số lượt bạn muốn phân công: ");
        int soLuot = -1;
        do {
            soLuot = new Scanner(System.in).nextInt();
            if (soLuot > 0 && soLuot <= 15) {
                break;
            }
            System.out.print("Bạn chỉ được phân công 15 lượt thôi, nhập lại đi: ");
        } while (true);

        // nhập từng tuyến và số lượng tuyến muốn phân công
        AddAssignmentTable[] AddAssignmentTables = new AddAssignmentTable[soLuot];
        for (int j = 0; j < soLuot; j++) {
            System.out.println("Nhập số tuyến thứ " + (j + 1) + " phân công cho lái xe: ");
            BusRoutes busRoutes = null;
            do {
                int routesId = new Scanner(System.in).nextInt();
                for (int k = 0; k < MainRun.BUSROUTESS.length; k++) {
                    if (MainRun.BUSROUTESS[k] != null && MainRun.BUSROUTESS[k].getRoutesId() == soLuot) {
                        busRoutes = MainRun.BUSROUTESS[k];
                        break;
                    }
                }
                if (busRoutes != null) {
                    break;
                }
                System.out.print("Không tìm thấy tuyến vừa nhập, vui lòng nhập lại: ");
            } while (true);


            System.out.print("Tuyến này bạn muốn phân công bao nhiêu lượt: ");
            int tongSoLuot = -1;
            do {
                tongSoLuot = new Scanner(System.in).nextInt();
                if (tongSoLuot > 0 && tongSoLuot <= 15) {
                    break;
                }
                System.out.print("Bạn chỉ được nhập tối đa 15 lượt thôi, nhập lại đi: ");
            } while (true);

            DriverMgr driverMgr = new DriverMgr(BusDriver,tongSoLuot);
            for (int k = 0; k < driverMgrs.length; k++) {
                if ( driverMgrs[k]== null) {
                    driverMgrs[k]= driverMgr;
                    break;
                }
            }
        }
        return driverMgrs;
    }

}
