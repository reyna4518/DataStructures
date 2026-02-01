class Counting{
    public void fun1(int n){
        if(n>0){
            fun1(n-1);
            System.out.println(n);

        }
    }
}

class StaticInRecursion{
    static int y = 0;
    public int fun2(int n){

        if(n>0){
            y++;
            return fun2(n-1) + y;
        }
        return 0;
    }
}

class TreeRecursion{
    public void fun3(int n){
        if(n>0){
            System.out.print(n + ",");
            fun3(n-1);
            fun3(n-1);
        }
    }
}

class IndirectRecursion{
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

class NestedRecursion{
    public int fun4(int n){
        if(n>100)
            return n-10;
        else
            return fun4(fun4(n+11));
    }
}
public class Recursion {
    public static void main(String args[]){
        //Counting obj = new Counting();
        int x = 95;
        //obj.fun1(x);

        //StaticInRecursion obj1 = new StaticInRecursion();
        //System.out.println(obj1.fun2(x));

        //TreeRecursion obj2 = new TreeRecursion();
        //obj2.fun3(3);

        //IndirectRecursion obj3 = new IndirectRecursion();
        //obj3.A(x);

        NestedRecursion obj4 = new NestedRecursion();
        System.out.println(obj4.fun4(x));
    }
}
