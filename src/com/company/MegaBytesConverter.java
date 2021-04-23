package com.company;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int KiloBytes){

        if(KiloBytes<-1024){
            System.out.println("Invalid value");
        }
        else {

            int megaBytes = KiloBytes / 1024;
            int remainingKB = KiloBytes % 1024;

            System.out.println(KiloBytes +"KB  = " +megaBytes +"MB and "+remainingKB+ "KB");

        }
    }

    public static void main(String[] args) {
        MegaBytesConverter megaBytesConverter = new MegaBytesConverter();
        megaBytesConverter.printMegaBytesAndKiloBytes(-1025);
    }
}
