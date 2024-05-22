package com.babyBear.calculator;

import java.util.Scanner;

public class Bohyun {
    public static void plus() {
        Scanner sc = new Scanner(System.in);

        System.out.print("더하기 할 첫번째 값을 입력해주세요 : ");
        double num1 = sc.nextDouble();
        System.out.print("더하기 할 두번째 값을 입력해주세요 : ");
        double num2 = sc.nextDouble();
        System.out.println();
        System.out.println("계산결과는 '" + (num1 + num2)  + "' 입니다." );
        System.out.println();
        System.out.print("추가로 원하시는 기능의 이름을 입력하세요 : ");
    }
}
