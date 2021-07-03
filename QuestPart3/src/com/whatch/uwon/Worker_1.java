package com.whatch.uwon;

import java.math.BigDecimal;
import java.util.Date;

public class Worker_1 implements Worker{

    public String working() {
        Date date = new Date();
        return "worker_1" + ' ' + date.toString() + ' ' + "Milliseconds" + ' ' + getMs(date);
    }

    private String getMs(Date date){


        BigDecimal bigD = new BigDecimal(date.getTime() / (double) 60);
        String ms = String.valueOf(bigD.subtract(new BigDecimal(bigD.toBigInteger())));
        int index = ms.indexOf('.') + 1;

        return ms.substring(index);
    }



}
