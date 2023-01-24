package main;


interface demo2{
    static void show() {
        System.out.println("This is a demo method of interface");
    }
}
interface demo1{
    static void call() {
        System.out.println("Call me");
    }
}
public class Interface28 implements demo2{
    public static void m1() {
        System.out.println("Main class method");
    }
    public static void main(String[] args) {
    
    demo2.show();
    demo1.call();
    Interface28.m1();
    }
}