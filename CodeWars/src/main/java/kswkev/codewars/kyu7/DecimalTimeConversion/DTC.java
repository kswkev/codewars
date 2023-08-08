package kswkev.codewars.kyu7.DecimalTimeConversion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DTC {
    public static double toIndustrial(String time){

        double hours = Double.parseDouble(time.split(":")[0]);
        double mins = Double.parseDouble(time.split(":")[1]);

        BigDecimal decMins = new BigDecimal(mins);
        decMins = decMins.divide(new BigDecimal(60), 2, RoundingMode.HALF_UP);

        return hours + decMins.doubleValue();
    }

    public static double toIndustrial(int time){

        int hours = 0;
        if (time >= 60) {
            hours = (time / 60);
        }

        int mins = (time % 60);

        return toIndustrial(hours + ":" + mins);
    }

    public static String toNormal(double time){

        int hours = (int) time;
        BigDecimal decMins = new BigDecimal((time - hours) * 60);
        decMins = decMins.setScale(0, RoundingMode.HALF_UP);
        int mins = (int) decMins.doubleValue();

        return hours + ":" + mins;
    }
}
