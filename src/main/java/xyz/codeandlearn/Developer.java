package xyz.codeandlearn;

public class Developer {

//    private Laptop laptop;
    private int age;

//    public Developer(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Developer constructor is called");
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void buildSoftware() {
        System.out.println("I am a developer and I am building software");
    }
}
