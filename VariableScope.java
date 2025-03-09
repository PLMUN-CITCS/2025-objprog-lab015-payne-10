public class VariableScope {
    // Declare the global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print globalCount from main
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call the showScope method
        showScope();
    }

    public static void showScope() {
        // Declare the local variable
        int localCount = 50;
        
        // Print globalCount from showScope
        System.out.println("Global Count (from showScope): " + globalCount);
        
        // Print localCount from showScope
        System.out.println("Local Count (from showScope): " + localCount);
    }
}