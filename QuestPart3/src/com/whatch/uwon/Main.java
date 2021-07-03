package com.whatch.uwon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Worker_1 a = new Worker_1();
    Worker_2 b = new Worker_2();
    Worker_3 c = new Worker_3();

        ArrayList<Integer> ranNum = new ArrayList<Integer>(5);

            for (int i = 0; i < 5; i++) {
                ranNum.add(b.working());
                System.out.println(a.working());
            }
            System.out.println(c.working(ranNum));
       }
    }

