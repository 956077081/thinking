package com.pht.fourchapter;

import java.util.Random;

public class TwoQuestion {
    public static void main(String[] args) {
        Random random = new Random();
        int i1 = random.nextInt(50);
        int  i2 = 0;
        System.out.print(i1);
        for (int i = 1; i <25 ; i++) {
             i2 = random.nextInt(50);
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
