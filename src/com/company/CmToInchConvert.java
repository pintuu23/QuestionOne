package com.company;

public class CmToInchConvert {

    public void inchtoCm(double inch){

        double cm = inch * 2.54;
        System.out.println("CM is : " +cm);
    }

    public void cmToInch(double cm)  {
        double inch = cm *0.393701;
        System.out.println("Inch is : " +inch);
    }
    public static void main(String[] args) {
        double x= 20;
        CmToInchConvert cmToInchConvert = new CmToInchConvert();
        cmToInchConvert.inchtoCm(x);
        cmToInchConvert.cmToInch(x);
    }
}
