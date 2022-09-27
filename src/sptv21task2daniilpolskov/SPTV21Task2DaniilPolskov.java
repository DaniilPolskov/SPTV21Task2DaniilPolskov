/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task2daniilpolskov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21Task2DaniilPolskov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int num = scanner.nextInt();
        System.out.println("Сумма цифр числа - " +num);
        System.out.println((num%10)+((num/10)%10)+((num/100)%10));         
    }
    
}
