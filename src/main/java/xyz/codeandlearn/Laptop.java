package xyz.codeandlearn;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop constructor is called");
    }
    public void compile() {
        System.out.println("Laptop Compiling...");
    }
}
