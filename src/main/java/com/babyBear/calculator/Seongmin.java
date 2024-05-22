package com.babyBear.calculator;

import java.util.Scanner;

public class Seongmin {
    public static void divide() {
        Scanner sc = new Scanner(System.in);

        System.out.print("피제수를 입력해주세요 : ");
        double num1 = sc.nextDouble();

        System.out.print("제수를 입력해주세요 : ");
        double num2 = sc.nextDouble();

        System.out.println();
        System.out.println("나눈 몫은 '" + (num1 / num2) + "' 이고 나머지는 '" + (num1 % num2) + "' 입니다.");
        System.out.println();
        System.out.print("추가로 원하시는 기능의 이름을 입력하세요 : ");
    }
}
