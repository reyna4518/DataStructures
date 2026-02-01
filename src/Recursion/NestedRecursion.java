package Recursion;

public class NestedRecursion{
    public int fun4(int n){
        if(n>100)
            return n-10;
        else
            return fun4(fun4(n+11));
    }
}