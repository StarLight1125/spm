package com.tju.grp3.spm_homew;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new App().welcome("Qu Xingming") );
        System.out.println(new App().welcome("Wu Zhenyao") );
        System.out.println(new App().welcome("Wu Xinyi") );
        System.out.println(new App().welcome("Hu Meng") );
    }
    
    public String welcome(String name)
    {
    	return "hello, " ;
    }
}
