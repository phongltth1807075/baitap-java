package controller;

import entity.Foods;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController {
    private ArrayList<Foods> list = new ArrayList<>();
    private Object Foods;

    public void addFood(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã : ");
        String Id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String Name = scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        String Description = scanner.nextLine();
        System.out.println("Nhập giá: ");
        String Prive=scanner.nextLine();
        System.out.println("Nhập ngày tạo: ");
        String Date=scanner.nextLine();
        Foods foods=new Foods(Id,Name,Description,Prive,Date);
        list.add(foods);
        System.out.println("da them thanh cong!");
    }
    public void printList(){
        System.out.println("Thông tin tất cả các món ăn:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
