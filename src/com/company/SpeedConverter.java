package com.company;

class GFG {
    // bhai tue 2 main method banaya hua thahaan dekha maineok
//    har class me sirf 1 main method hota hai ok bro
//ab 1 kaam kar jo static method hai unko public method bana ke program run kar
// public static is same as static method
    //public methos se jab karte hai pehel hume class ka object banan padta hai ... fir us object se hum class ke method ko call karte hai
// abi bata hu kaise karte hai
    // function to convert speed
    // in km/hr to m/sec
    public int kmph_to_mps(double kmph) {
        return (int) (0.277778 * kmph);
    }

    // function to convert speed
    // in m/sec to km/hr
    public  int mps_to_kmph(double mps) {
        return (int) (3.6 * mps);
    }

    // Driver function
    public static void main(String[] args) {
        GFG gfg = new GFG();
        // yaha humne new keyword se GFG class ka obect banaya aur object name hai "gfg"
        // variable to store
        // speed in kmph
        double kmph = 72.0;

        // variable to store      ruk min
        // speed in mps
        double mps = 10.0;

        //yaha hum gfg.methodname se hum class ke mathod ko call kar rahe hai
        System.out.println("speed_in_mps = " + gfg.kmph_to_mps(kmph)
                + " speed_in_kmph = " + gfg.mps_to_kmph(mps));
        // samajh gaya? soo gaya kya be??nahi bhai
//        jaga hu samah aaya ki nahi
//        haan main krke dekhta hu // ok'
        //ruk

    }

}
// This code is contributed by vt_m.