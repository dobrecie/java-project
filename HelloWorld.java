public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is the main branch!");
        System.out.println("This is a feature branch!");
        System.out.println("Update in main after bugfix branched off!");
        System.out.println("Fixing a bug!");
        printHello();
        printWorld();
    }

    public static void printHello() {
        System.out.println("Hello from method A!");
    }

    public static void printWorld() {
        System.out.println("Hello from method B!");
    }

}