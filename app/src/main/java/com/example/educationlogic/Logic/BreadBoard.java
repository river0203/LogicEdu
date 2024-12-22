package com.example.educationlogic.Logic;

public class BreadBoard {
    public static final boolean plusPole = true;
    public static final boolean minusPole = false;

    //배열은 있는데 찾아갈 값이 필요
    private int plusPoleArea[][] = new int[30][2];
    private int minusPoleArea[][] = new int[30][2];
    // 0~9 -> a~j 인코딩
    private int aryTerminalArea1[][] = new int[30][5];
    private int aryTerminalArea2[][] = new int[30][5];

}
