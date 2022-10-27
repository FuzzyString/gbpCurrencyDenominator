package org.example;

import java.text.DecimalFormat;

public class Main
{


    public static void main(String[] args)
    {
        cashConverter(149.57);
    }



    public static void cashConverter(double amount)
    {
        double[] currencyValues = {5000, 2000,1000,500,200, 100, 50, 20, 10, 5, 2, 1};
        String[] currencyPrintValues = {"£50:","£20:","£10:","£5:","£2:","£1:","50p:", "20p:","10p:","5p:","2p:","1p:"};
        double cumulativeAmount = amount * 100;

        for (int i = 0; i < currencyValues.length; i++)
        {
            if(((int)(cumulativeAmount / currencyValues[i])) > 0 )
            {
                System.out.println(currencyPrintValues[i] + ((int)(cumulativeAmount / currencyValues[i])));
                cumulativeAmount -= ((int)(cumulativeAmount / currencyValues[i])) * currencyValues[i];
            }
        }
    }
}