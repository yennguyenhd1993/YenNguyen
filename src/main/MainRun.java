package main;

import entity.AssignmentTable;
import entity.BusDriver;
import entity.BusRoutes;
import logic_handle.AddAssignmentTable;
import logic_handle.AddBusDriver;
import logic_handle.AddBusRoutes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRun {

    public static BusDriver[] BUSDRIVERS = new BusDriver[100];
    public static BusRoutes[] BUSROUTESS = new BusRoutes[100];
    public static AssignmentTable[] ASSIGNMENTTABLES = new AssignmentTable[100];

    public static void main(String[] args) {
        String name = "Nguyen Thi Yen ";
        System.out.println(name);
        menu();
    }

    private static void menu() {
        boolean isExit = false;
        do {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    AddBusDriver.inputNewBusDriver();
                    break;
                case 2:
                    AddBusDriver.showBusDriver();
                    break;
                case 3:
                    AddBusRoutes.inputNewBusRoutes();
                    break;
                case 4:
                    AddBusRoutes.showBusRoutes();
                    break;
                case 5:
                    AddAssignmentTable.sortAssignmentTable();
                    AddAssignmentTable.showAssignmentTable();
                    break;
                case 6:
                    AddAssignmentTable.sortAssignmentTable();
                    break;
                case 7:
                    AddAssignmentTable.searchASSIGNMENTTABLES();
                    break;
                case 8:
                    AddAssignmentTable.searchASSIGNMENTTABLES();
                    break;
                case 9:
//                    System.exit(0);
                    isExit = true;
            }
        } while (!isExit);
    }

    private static int functionChoice() {
        showMenu();
        System.out.print("Xin mời chọn chức năng: ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

        private static void showMenu(){
            System.out.println("\n\n\n----------PHẦN MỀM QUẢN LÝ PHÂN CÔNG LÁI XE BUÝT------------");
            System.out.println("1. Nhập danh sách Lái xe mới.");
            System.out.println("2. In ra danh sách lái xe.");
            System.out.println("3. Nhập danh sách Tuyến mới.");
            System.out.println("4. In ra danh sách các tuyến.");
            System.out.println("5. Nhập danh sách phân công cho mỗi lái xe.");
            System.out.println("6. In danh sách phân công lái xe ra màn hình.");
            System.out.println("7. Sắp xếp danh sách phân công.");
            System.out.println("8. Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe.");
            System.out.println("9. Thoát chương trình.");
        }

}
