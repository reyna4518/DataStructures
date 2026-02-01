package Recursion;

public class StaticInRecursion{
    static int y = 0;
    public int fun2(int n){

        if(n>0){
            y++;
            return fun2(n-1) + y;
        }
        return 0;
    }
}