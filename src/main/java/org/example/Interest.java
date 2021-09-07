/*
 *  UCF COP3330 Fall 2021 Interest Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Interest
{
    private final int pAmt;
    private final double rate;
    private final int years;
    private final int freq;

    public Interest()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        this.pAmt = input.nextInt();

        System.out.print("What is the rate? ");
        this.rate = input.nextDouble();

        System.out.print("What is the number of years? ");
        this.years = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        this.freq = input.nextInt();
    }

    public void CmpInt()
    {
        float percent = (float) this.rate/100;
        double monies =  Math.pow((1+(percent/this.freq)),(this.freq*this.years));
        monies = this.pAmt*monies;

        DecimalFormat round = new DecimalFormat("###.##");

        System.out.print("$"+this.pAmt+" invested at "+this.rate+"% for "+this.years+" years compounded "+this.freq+" times per year is $"+round.format(monies));
    }
}
