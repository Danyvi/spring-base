package xyz.codeandlearn;

public class Developer {

    private Laptop laptop;
//    private int age;



    public Developer() {
        System.out.println("Developer constructor is called");
    }

    public Developer(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Developer constructor is called");
    }

//    public Developer(int age) {
//        this.age = age;
//        System.out.println("Developer constructor is called");
//    }


//    public void setAge(int age) {
//        this.age = age;
//    }

//    public int getAge() {
//        return age;
//    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }



    public void buildSoftware() {
        laptop.compile();
        System.out.println("I am a developer and I am building software");
    }
}
