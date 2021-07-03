package com.whatch.uwon;

import java.util.ArrayList;

public class Worker_3 implements Worker {

    public String working(ArrayList<Integer> lst) {
        int sum = 0;
        for (int i: lst){
            sum += i;
        }
        return String.valueOf(sum);
    }
}
