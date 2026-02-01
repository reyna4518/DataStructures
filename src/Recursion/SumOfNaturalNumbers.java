package Recursion;

public class SumOfNaturalNumbers{
    public int SumNatural(int n){
        int sum = 0;
        if(n==0)
            return 0;
        else
            return SumNatural(n-1) + n;
    }
}