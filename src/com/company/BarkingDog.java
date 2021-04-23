package com.company;

public class BarkingDog {
    public static void shouldWakeUp(boolean barking, int hourOfDay){

        if (barking == true){
            if (hourOfDay<8){
                System.out.println(true);
            }else if(hourOfDay>8){
                System.out.println(false);;
            }
        }else if (barking == false){
            if (hourOfDay<8){
                System.out.println(false);;
            }

        }

    }

    public static void main(String[] args) {
        BarkingDog.shouldWakeUp(true,8);
    }
}
