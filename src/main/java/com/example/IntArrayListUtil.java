package com.example;

import java.util.ArrayList;

public class IntArrayListUtil {
    /**getGCDOf(20,24) -> 4 /**getGCDOf(0,24) -> 1 (正:24)*/
    public static int getGCDOf(int int1,int int2) {
        if(int1 == 0 && int2 != 0) {
            return int2;
        }else if(int2 == 0 && int1 != 0){
            return int1;
        }else if(int1 == 0 && int2 == 0) {
            return 0;
        }else {
            ArrayList<Integer> primeFactors1 = getPrimeFactorsOf(int1);
            ArrayList<Integer> primeFactors2 = getPrimeFactorsOf(int2);
            ArrayList<Integer> GCDList = ArrayListUtil.getIntersectOf(primeFactors1, primeFactors2);
            int GCD = getAllProductOf(GCDList);
            return GCD;
        }
    }


    //getPrimeFactorsOf(20) -> [2,2,5] //getPrimeFactorsOf(24) -> [2,2,2,3]
    public static ArrayList<Integer> getPrimeFactorsOf(int int1){
        ArrayList<Integer> PrimeFactors = new ArrayList<Integer>();
        int1 = Math.abs(int1);
        for(int i=2;i<=int1;i++) {
            if(int1%i==0) {
                PrimeFactors.add(i);
                int1 = int1 / i;
                i=1;
            }
        }
        return PrimeFactors;
    }


    /**getAllProductOf([2,2,2,3,5]) -> 120*/
    public static int getAllProductOf(ArrayList<Integer> primeFactors) {
        int number = 1;
        for(int i=0;i<primeFactors.size();i++) {
            number = number * primeFactors.get(i);
        }
        return number;
    }
}
