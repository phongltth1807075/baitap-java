package controller;

import java.util.Scanner;

public class MenuCreator {
    public static void createMenu() {
        Scanner scanner = new Scanner(System.in);
        FoodController foodController = new FoodController();
        boolean action = true;
        while (action == true) {
            System.out.println("————————Foodydi———————");
            System.out.println("1. Thêm món ăn.");
            System.out.println("2. Hiển thị danh sách món ăn.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("———————————————————");
            System.out.println("Vui lòng nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm món ăn.");
                    foodController.addFood();
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách món ăn.");
                    foodController.printList();
                    break;
                case 3:
                    System.out.println("Thoát");
                    action=false;
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
                    break;

            }

        }
    }
}