import java.util.*;
class Main
{
    public static void main(String[] argc)
    {
        int f1=0,f2=1,f3=0,i=1,temp=0;
    while(i!=10)  
    {
        f3=f1+f2;
        System.out.println(f3);
        f1=f2;
        f2=f3;
        i++;
    }
    }
}