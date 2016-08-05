package com.anjibei.app.framework.uitls;

import java.math.BigDecimal;

/**
 * Created by MEX on 15/1/15.
 */
public class DigitalProcess {

    public static float decimal2(float source) {
        BigDecimal bd = new BigDecimal(source);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
