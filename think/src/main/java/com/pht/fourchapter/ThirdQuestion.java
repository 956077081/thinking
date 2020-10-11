package com.pht.fourchapter;

import java.util.Random;

public class ThirdQuestion {
    public static void main(String[] args) {
        Random random = new Random();
        int i1 = random.nextInt(50);
        int  i2 = 0;
        System.out.print(i1);
        while (true) {
            i2 = random.nextInt(10000);
            if(i1 >i2){
                System.out.print(">"+i2);
            }else if(i1 <i2){
                System.out.print("<"+i2);
            }else{
                System.out.print("="+i2);
            }
            i1 = i2;
        }
    }

}
