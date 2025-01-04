package xyz.codeandlearn;

public class Developer {

    private Computer computer;


    public Developer() {
        System.out.println("Developer constructor is called");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    public void buildSoftware() {
        computer.compile();
        System.out.println("I am a developer and I am building software");
    }
}
