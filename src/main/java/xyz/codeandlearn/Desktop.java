package xyz.codeandlearn;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop constructor is called");
    }
    public void compile() {
        System.out.println("Desktop Compiling...");
    }
}
