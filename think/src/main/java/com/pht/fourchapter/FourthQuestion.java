package com.pht.fourchapter;

import java.util.Random;

public class FourthQuestion {
    public static void main(String[] args) {
        int num =  new Random().nextInt(50);
        int sunum = 0;
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <i ; j++) {
                if(i%j==0&&j!=1){
                    sunum=0;
                    break;//不是素数
                }else{
                    sunum=i;
                }
            }
            if(sunum !=0){
                System.out.println(sunum);
            }
        }
    }
}
