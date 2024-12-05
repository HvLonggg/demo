/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class NewClass {
  
 class Javacoban {
    public static void Main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Nhập vào từ bàn phím :" + a + b);
        if (a == b) {
            System.out.println("Bằng nhau");
        } else {
            System.out.println("Đong chim vẫn bé");
        }
    }
}


    
}
