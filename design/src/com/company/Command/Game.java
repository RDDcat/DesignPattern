package com.company.Command;

public class Game {
    private boolean isStarted;

    public void start(){
        System.out.println("게임 시작");
        this.isStarted = true;
    }

    public void end(){
        System.out.println("게임 종료");
        this.isStarted = false;
    }

    public boolean isStarted(){
        return isStarted;
    }
}
