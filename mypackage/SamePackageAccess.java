package mypackage;

public class SamePackageAccess {
    public static void main(String[] args) {
        myclass obj = new myclass();
        System.out.println("Accessing members from the same package:");
        System.out.println("Public Member: " + obj.publicMember);
        System.out.println("Protected Member: " + obj.protectedMember);
        System.out.println("Default Member: " + obj.defaultMember);
        // System.out.println("Private Member: " + obj.privateMember); // Not accessible
    }
}
