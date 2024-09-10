package com.ohgiraffers.practice;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        프로그램 개요 : 리모콘으로 TV를 작동하는 프로그램
//
//        시스템 요구사항 :
//
//        1. 리모콘으로 전원 켜기, 소리 키우기, 음소거, 전원 끄기
//        2. 티비는 전원켜기, 소리 키우기, 음소거,  전원 끄기
//        3. 티비는 처음에 꺼져있는 상태
//        4. 리모콘으로 TV를 먼저 켠다
//        5. 리모콘으로 소리 키우기를 하면 TV가 켜져있는 상태일 경우 소리가 10올라간다.
//        6. TV 소리가 키워져 있는 경우 음소거를 누르면 소리는 0으로 변경된다.
//        7. 소리가 0일 때 음소거를 누르면 이미 0이라고 안내한다.
//        8. 전원을 끄면 TV는 소리가 나지 않는다.
//        9. 소리가 키워져 있는 경우 TV를 끌 수 없다.
//
//        객체간 상호작용 :
//
//        - 리모컨이 수신할 수 있는 메세지
//        1. 전원 켜라
//        2. 소리 키움 버튼을 눌러라
//        3. 음소거 버튼을 눌러라
//        4. 전원 꺼라
//
//        - 티비가 수신할 수 있는 메세지
//        1. 전원을 켜라
//        2. 소리를 키워라
//        3. 음소거를 해라
//        4. 전원 꺼라


        Remocon rm = new Remocon();
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("------------Tv의 소리를 조절하는 프로그램-----------");
            System.out.println("1. 전원 켜기");
            System.out.println("2. 소리를 키우기");
            System.out.println("3. 음소거 하기");
            System.out.println("4. 전원 끄기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("메뉴 선택 : ");
            int nu =sc.nextInt();

            if(nu ==1){
                rm.on();
            }else if(nu ==2){
                rm.up();
            }else if(nu ==3){
                rm.mute();
            }else if(nu ==4){
                rm.off();
            }else if(nu ==9){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }

        sc.close();

    }
}
