package com.mycompany.app;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = new App().tinhtong(4,2);
        System.out.println( "Hello World!" + a );
    }

    public int tinhtong(int a, int b){
        return a+b;
    }
}
