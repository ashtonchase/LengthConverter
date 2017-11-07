package com.ashtonchase.lengthconverter;

/**
 * Created by johnsoas on 10/26/2017.
 */

public class UnitConverter {


    private static final float toMile = (float)0.000621371;
    private static final float toNautMile = (float)0.000539957;
    private static final float toFeet = (float)3.28084;

    //1meter = 0.000621371miles = 0.000539957nmi = 3.28084feet

    public static float fromMileToMeter(float meter){
        return meter/toMile;
    }
    public static float fromNautMileToMeter(float meter){
        return meter/toNautMile;
    }

    public static float fromFeetToMeter(float meter){
        return meter/toFeet;
    }


    public static float fromMeterToMile(float meter){
        return meter*toMile;
    }

    public static float fromMeterToNautMile(float meter){
        return meter*toNautMile;
    }

    public static float fromMeterToFeet(float meter){
        return meter*toFeet;
    }

    public static float fromNautMileToFeet(float nautMile){
        return fromMeterToFeet(fromNautMileToMeter(nautMile));
    }
    public static float fromNautMileToMile(float nautMile){
        return  fromMeterToMile(fromNautMileToMeter(nautMile));
    }
    public static float fromMileToFeet(float mile){
        return fromMeterToFeet(fromMileToMeter(mile));
    }
    public static float fromMileToNautMile(float mile){
        return fromMeterToNautMile(fromMileToMeter(mile));
    }

    public static float fromFeetToMile(float feet){
        return fromMeterToMile(fromFeetToMeter(feet));
    }

    public static float fromFeetToNautMile(float feet){
        return fromMeterToNautMile(fromFeetToMeter(feet));
    }

}
