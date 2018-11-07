package com.tigorworks.uts_41818110087;

public class CSuhu {
    final int TEMPERATURE_CELCIUS       = 1;
    final int TEMPERATURE_FAHRENHEIT    = 2;
    final int TEMPERATURE_KELVIN        = 3;



    public double convertTemperature(float valueFrom, int temperatureFrom, int temperatureTo){
        double ret = 0;
        int _cond = Integer.valueOf(String.format("%d%d",temperatureFrom,temperatureTo));

        switch (_cond){
            case 12: // celcius - fahrenheit
                ret = ((double)valueFrom * 9/5) + 32;
                break;

            case 13: // celcius kelvin
                ret = (float) (valueFrom + 273.15);
                break;

            case 21: // fahrenheit - celcius
                ret = ((double)valueFrom - 32) * ((double)5/9);
                break;

            case 23: // fahrenheit - kelvin
                ret =  (((double)valueFrom - 32) * ((double)5/9) + 273.15);
                break;

            case 31: // kelvin - celcius
                ret =  ((double)valueFrom - 273.15);
                break;

            case 32: // kelvin - fahrenheit
                ret =  (((double)valueFrom - 273.15) * ((double)9/5) + 32);
                break;

            default:
                ret = valueFrom;

        }

        return ret;
    }
}
