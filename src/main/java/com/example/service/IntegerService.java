package com.example.service;
import com.example.Ratio;

import java.util.ArrayList;

public interface IntegerService {
    ArrayList<Integer> getPrimeNumsUnder(int integer);
    ArrayList<Integer> convertToArrayListFrom(int[] arr);
    ArrayList<Integer> getNaturalNumsLowerThan(int integer);
    ArrayList<Integer> getSievedNumsFor(int sieve, ArrayList<Integer> nums);
    ArrayList<Integer> getCoprimeNumsLowerThan(int integer);
    Ratio addBetweenRatio(Ratio r1, Ratio r2);
    boolean isPrime(int integer);
    ArrayList<Integer> getPrimeFactorsOf(int integer);
    int getEulerPhiFunctionValOf(int integer);
    int[] convertIntsFrom(ArrayList<Integer> arr);
}
