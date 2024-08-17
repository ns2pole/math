package com.example.math.controller;

import com.example.Ratio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Map;
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

   @ResponseBody@PostMapping("/getAddedRatio")public String getAddedRatio(
        @RequestBody Map<String, Map<String, Integer>> fractions) {
        Map<String, Integer> fraction1 = fractions.get("fraction1");
        Map<String, Integer> fraction2 = fractions.get("fraction2");
        Ratio r1 = new Ratio(fraction1.get("denominator"), fraction1.get("numerator"));
        Ratio r2 = new Ratio(fraction2.get("denominator"), fraction2.get("numerator"));
        return r1.getAddedRatio(r2).toString();
    }

}