package com.babyBear.calculator;

import java.util.Scanner;

public class Kangjinyoung {

    public  static void  multiple( ) {

        Scanner sc2 = new Scanner(System.in);

        System.out.print("곱하기 할 첫번째 값을 입력해주세요 : ");
        double num1 = sc2.nextDouble();
        System.out.print("곱하기 할 두번째 값을 입력해주세요 : ");
        double num2 = sc2.nextDouble();

        System.out.println();
        System.out.println("계산결과는 '" + (num1 * num2) + "' 입니다.");
        System.out.println();
        System.out.print("추가로 원하시는 기능의 이름을 입력하세요 : ");


    }
}
