import java.util.*;

class Math {

    private int a;
    private int b;

    void show()
    {
        System.out.println("a is :"+ a);
        System.out.println("b is :"+ b);
    }
    Math(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        System.out.println( a+ b);
    }
    public void subtract()
    {
        if( a- b<0)
            System.out.println( b- a);
        else
            System.out.println( a- b);
    }
    public void multiply()
    {
        System.out.println( a* b);
    }
    public void divide()
    {
        if( b==0)
            System.out.println("Zero division Error");
        else
            System.out.println( a/b );
    }
    public int conditionalOperation()
    {
        if( a< b)
        {
            return ( a+b);
        }
        else if ( a>b )
    {
        return( a-b );
    }
    else if( a ==  b)
    {
        return ( a* b );
    }
    else if ( ( a> b) &&   ( b!=0))
    {
        return ( a/ b);
    }

        /*int i=-1;
        if( a< b) i=1;
        if( a> b)i=2;
        if( a== b)i=3;
        if( a> b && ( b!=0))i=4;

        switch(i)
        {
            case 1:return  a+ b;
            case 2:return  a- b;
            case 3:return  a* b;
            case 4:return  a/ b;
        }*/
        return -1;
    }
    public int Sum()
    {
        int sum=0;
        for(int i= a;i<= b;i++)
        {
            sum+=i;
        }
        /*int i= a;
        while(i<= b)
        {
            sum+=i;
            i++;
        }*/
        return sum;
    }
}
public class Main{
    public static void main(String [] args)
    {
        Math obj=new Math(10,1);
        obj.show();
        obj.add();
        obj.subtract();
        obj.divide();
        obj.multiply();
        System.out.println(obj.conditionalOperation());
        System.out.println(obj.Sum());

    }
}