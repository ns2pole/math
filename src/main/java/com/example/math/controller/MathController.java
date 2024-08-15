package com.example.math.controller;

import com.example.Ratio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.service.IntegerServiceImpl;
import java.util.ArrayList;

@Controller
public class MathController {
    
    @ResponseBody
    @RequestMapping("/EulerPhiFunction")
    public String getEulerFunctionValStr(int integer) {
        IntegerServiceImpl impl = new IntegerServiceImpl();
        int eulerPhiFunctionVal = impl.getEulerPhiFunctionValOf(integer);
        return new Integer(eulerPhiFunctionVal).toString();
    }

    @ResponseBody
    @RequestMapping("/primeNumsUnderSetVal")
    public String getPrimeNumsStrUnderSetVal(int integer) {
        IntegerServiceImpl impl = new IntegerServiceImpl();
        ArrayList<Integer> primeNumsUnderSetVal = impl.getPrimeNumsUnder(integer);
        return primeNumsUnderSetVal.toString();
    }

    @ResponseBody
    @RequestMapping("/isPrime")
    public String getIsPrimeStr(int integer) {
        IntegerServiceImpl impl = new IntegerServiceImpl();
        boolean isPrime = impl.isPrime(integer);
        return String.valueOf(isPrime);
    }
    
    @ResponseBody
    @RequestMapping("/primeFactors")
    public String getPrimeFactorsStr(int integer) {
        IntegerServiceImpl impl = new IntegerServiceImpl();
        ArrayList<Integer> primeFactors = impl.getPrimeFactorsOf(integer);
        return String.valueOf(primeFactors);
    }

    @ResponseBody
    @RequestMapping("/getAddedRatio")
    public String getAddedRatio(
            @RequestParam("denominator1") Integer denominator1,
            @RequestParam("numerator1") Integer numerator1,
            @RequestParam("denominator2") Integer denominator2,
            @RequestParam("numerator2") Integer numerator2) {
        IntegerServiceImpl impl = new IntegerServiceImpl();
        Ratio r1 = new Ratio(denominator1, numerator1);
        Ratio r2 = new Ratio(denominator2, numerator2);
        return r1.getAddedRatio(r2).toString();
    }



}