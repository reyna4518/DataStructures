package Recursion;

public class IndirectRecursion{
    public void A(int n){
        if(n>0){
            System.out.print(n + ",");
            B(n-1);
        }
    }

    public void B(int n){
        if(n>1){
            System.out.print(n + ",");
            A(n/2);
        }
    }
}