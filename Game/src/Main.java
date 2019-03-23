import entity.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên game:");
        String name = scanner.nextLine();
        System.out.println("Nhập thông tin cho game:");
        String description = scanner.nextLine();
        System.out.println("Nhập giá tiền cho game:");
        String price = scanner.nextLine();
        System.out.println("Nhập ngày phát hành:");
        String dateOfIssue = scanner.nextLine();
        System.out.println("Nhập trang chủ:");
        String homePage = scanner.nextLine();

        Game game = new Game(name, description, price, dateOfIssue, homePage);

        System.out.println(game.toString());

    }
}
