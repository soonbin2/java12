package com.ohgiraffers.practice;

public class Tv {
    private boolean ison;
    private int volume;

    public void on(){
        if(ison){
            System.out.println("이미 전원이 켜져있습니다.");
        }else{
            this.ison =true;
            System.out.println("전원이 켜졌습니다. 소리를 키울 준비가 완료되었습니다.");
        }
    }

    public void up(){
        if(ison){
            System.out.println("소리가 올라갑니다.");
            this.volume +=10;
            System.out.println("현재 티비의 소리는 " + this.volume + "입니다.");
        }else{
            System.out.println("티비가 안켜져있습니다. 티비를 먼져 켜주세요.");
        }
    }
    public void mute(){
        if(ison){
            if(this.volume>0){
                this.volume=0;
                System.out.println("현재 티비의 소리는 " + this.volume + "입니다.");
                System.out.println("음소거 버튼을 눌렀습니다. 소리가 안들립니다.");
            }else{
                System.out.println("음소거가 이미 되어있습니다.");
            }

        }else{
            System.out.println("전원이 꺼져있습니다. 전원을 먼저 켜주세요.");
        }
    }

    public void off(){
        if(ison){
            if(volume>0){
                System.out.println("소리가 켜져 있는 상태에서는 티비를 끌 수 없습니다. 우선 음소거를 해주세요.");
            }else{
                this.ison =false;
                System.out.println("전원을 끕니다. 다시 실행하려면 전원을 켜주세요.");
            }
        }else{
            System.out.println("전원이 이미 꺼져있습니다.");
        }
    }
}


