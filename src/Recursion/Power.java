package Recursion;

public class Power{
    public int pow(int m, int n){
        if(n==0)
            return 1;
        else
            return pow(m,n-1) * m;
    }
}