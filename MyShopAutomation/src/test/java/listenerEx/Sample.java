package listenerEx;

import org.testng.annotations.Test;

public class Sample {

    @Test
    public void sum(){
        int a=10;
        int b=20;
        int total = a+b;
        System.out.println("sum is "+total);

    }
    @Test
    public void sub(){
        int a=10;
        int b=20;
        int total = a-b;
        System.out.println("subtraction  is "+total);

    }
}
