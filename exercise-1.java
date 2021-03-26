import java.util.*;

class Math {

    private int a;
    private int b;

    void show()
    {
        System.out.println("a is :"+this.a);
        System.out.println("b is :"+this.b);
    }
    Math(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        System.out.println(this.a+this.b);
    }
    public void subtract()
    {
        if(this.a-this.b<0)
            System.out.println(this.b-this.a);
        else
            System.out.println(this.a-this.b);
    }
    public void multiply()
    {
        System.out.println(this.a*this.b);
    }
    public void divide()
    {
        if(this.b==0)
            System.out.println("Zero division Error");
        else
        System.out.println(this.a/this.b);
    }
    public int conditionalOperation()
    {
        if(this.a<this.b)
        {
            return (this.a+this.b);
        }
        else if (this.a>this.b)
        {
            return(this.a-this.b);
        }
        else if(this.a == this.b)
        {
            return (this.a*this.b);
        }
        else if ( (this.a>this.b) &&   (this.b!=0))
        {
            return (this.a/this.b);
        }
      
        /*int i=-1;
        if(this.a<this.b) i=1;
        if(this.a>this.b)i=2;
        if(this.a==this.b)i=3;
        if(this.a>this.b && (this.b!=0))i=4;

        switch(i)
        {
            case 1:return this.a+this.b;
            case 2:return this.a-this.b;
            case 3:return this.a*this.b;
            case 4:return this.a/this.b;
        }*/
     return -1;
    }
    public int Sum()
    {
        int sum=0;
        for(int i=this.a;i<=this.b;i++)
        {
            sum+=i;
        }
        /*int i=this.a;
        while(i<=this.b)
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
        Math obj=new Math(5,10);
        obj.show();
        //obj.add();
        //obj.subtract();
        //obj.divide();
        //obj.multiply();
        //System.out.println(obj.conditionalOperation());
        System.out.println(obj.Sum());

    }
}