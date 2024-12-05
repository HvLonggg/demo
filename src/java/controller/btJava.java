/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class btJava {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            int n;
            System.out.println("nhap n:");
            n=sc.nextInt();
            float s=0;
            for (int i = 0; i < n; i++) {
                s+=1/2*i-1;
            }
            System.out.println("tong la:"+s);
        }
        
    }

}
