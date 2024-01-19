package Revision;

public class StaticExample {
    // Static variable
    static int staticVariable;

    // Static block (Static Initialization Block)
    static {
        System.out.println("Static block is executed.");
        staticVariable = 42; // Initialize the static variable in the static block
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method is called.");
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        System.out.println("Main method is called.");
        
        // Call the static method
        staticMethod();
    }
}
