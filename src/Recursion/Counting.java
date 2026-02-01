package Recursion;

public class Counting{
    public void fun1(int n){
        if(n>0){
            fun1(n-1);
            System.out.println(n);

        }
    }
}