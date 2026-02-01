package Recursion;

public class TreeRecursion{
    public void fun3(int n){
        if(n>0){
            System.out.print(n + ",");
            fun3(n-1);
            fun3(n-1);
        }
    }
}