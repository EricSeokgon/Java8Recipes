package test.chapter1.recipe1_04;

import java.util.Scanner;

/**
 * Project: Java8Recipes
 * FileName: Loan
 * Date: 2016-10-10
 * Time: 오후 3:22
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Loan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money, profit, month, result, result2, top1, top2;


        System.out.println("대출원금 입력");

        money = scan.nextDouble();

        System.out.println("연이율 입력");

        profit = scan.nextDouble();

        System.out.println("상환기간 입력");

        month = scan.nextDouble();


        top1 = money * (profit / 12);

        top2 = Math.pow(1 + profit / 12, month);


        result = (top1 * top2) / (top2 - 1);

        result2 = money * profit * month / 12;


        System.out.println("원리금을 갚을시 매달 갚아야 할 돈은 : " + result);

        System.out.println("이자만 갚을시 매달 갚아야 할 돈은 : " + result2);
    }
}
