package com.babyBear.calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double sum = 0.0;
        double remainder = 0.0;
        String sign = "";

        System.out.println("=============================");
        System.out.print("||     ");
        System.out.print("아기곰");
        System.out.print(" ");
        System.out.print("계산기");
        System.out.println("입니다     ||");
        System.out.println("=============================");
        System.out.println("||원하는 기능의 이름을 입력하세요||");
        while (true) {
            System.out.println("||기능1. 더하기");
            System.out.println("||기능2. 빼기");
            System.out.println("||기능3. 곱하기");
            System.out.println("||기능4. 나누기");
            System.out.print("'");
            System.out.print("종료");
            System.out.println("'를 입력하시면 계산기가 종료됩니다");
            sign = sc.nextLine();
            if (sign.equals("종료")) {
                break;
            }
            if (sign.equals("더하기") || sign.equals("빼기") || sign.equals("곱하기") || sign.equals("나누기")) {
                switch (sign) {
                    case "더하기":
                        System.out.print("더하기 할 첫번째 값을 입력해주세요 : ");
                        num1 = sc2.nextDouble();
                        System.out.print("더하기 할 두번째 값을 입력해주세요 : ");
                        num2 = sc2.nextDouble();
                        sum = Bohyun.plus(num1, num2);
                        System.out.println();
                        System.out.println("계산결과는 '" + sum + "' 입니다.");
                        System.out.println();
                        System.out.println("추가로 원하시는 기능의 이름 입력하세요 : ");
                        break;
                    case "빼기":
                        System.out.print("피감수를 입력해주세요 : ");
                        num1 = sc2.nextDouble();
                        System.out.print("감수를 입력해주세요 : ");
                        num2 = sc2.nextDouble();
                        sum = Yanghyeyeon.minus(num1, num2);
                        System.out.println();
                        System.out.println("계산결과는 '" + sum + "' 입니다.");
                        System.out.println();
                        System.out.println("추가로 원하시는 기능의 이름 입력하세요 : ");
                        break;
                    case "곱하기":
                        System.out.print("곱하기 할 첫번째 값을 입력해주세요 : ");
                        num1 = sc2.nextDouble();
                        System.out.print("곱하기 할 두번째 값을 입력해주세요 : ");
                        num2 = sc2.nextDouble();
                        sum = Kangjinyoung.multiple(num1, num2);
                        System.out.println();
                        System.out.println("계산결과는 '" + sum + "' 입니다.");
                        System.out.println();
                        System.out.println("추가로 원하시는 기능의 이름 입력하세요 : ");
                        break;
                    case "나누기":
                        System.out.print("피제수를 입력해주세요 : ");
                        num1 = sc2.nextDouble();
                        System.out.print("제수를 입력해주세요 : ");
                        num2 = sc2.nextDouble();
                        sum = Seongmin.divide(num1, num2);
                        remainder = Seongmin.remainder(num1, num2);
                        System.out.println();
                        System.out.println("나눈 몫은 '" + sum + "' 이고 나머지는 '" + remainder + "' 입니다.");
                        System.out.println();
                        System.out.println("추가로 원하시는 기능의 이름 입력하세요 : ");
                        break;
                }
            } else {
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        }
        System.err.println("계산기를 종료합니다.");
    }
}
