package mypackage;

public class myclass {
    public int publicMember = 10;
    protected int protectedMember = 20;
    int defaultMember = 30; // package-private
    private int privateMember = 40;

    public void display() {
        System.out.println("Public Member: " + publicMember);
        System.out.println("Protected Member: " + protectedMember);
        System.out.println("Default Member: " + defaultMember);
        System.out.println("Private Member: " + privateMember);
    }
    public static void main(String[] args) {
        System.out.println("Hello from MyClass in mypackage!");
    }
}
