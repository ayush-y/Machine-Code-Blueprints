package TernayProgram;

public class JDK_JRE_JVM_Demo {

    // JVM Demonstration: Executes this main method
    public static void main(String[] args) {
        System.out.println("JDK, JRE, and JVM Demonstration");

        // JDK: Provides tools for compiling Java code
        compileTimeExample();

        // JRE: Provides the environment to run the compiled Java code
        runTimeExample();
    }

    // This method represents JDK because it requires the Java compiler (javac) to compile it.
    public static void compileTimeExample() {
        System.out.println("JDK: This method was compiled using javac.");
    }

    // This method represents JRE because it is executed by the Java Virtual Machine (JVM).
    public static void runTimeExample() {
        System.out.println("JRE: This method runs inside the JVM.");

        // JVM: Handles memory management, garbage collection, and execution
        int a = 5;
        int b = 10;
        System.out.println("JVM: Performing addition: " + a + " + " + b + " = " + (a + b));
    }
}
