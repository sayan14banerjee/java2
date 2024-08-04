package anotherPackage;

import mypackage.myclass;

public class otherFile {
    public static void main(String[] args) {
        myclass obj = new myclass();
        System.out.println("Accessing members from a different package:");
        System.out.println("Public Member: " + obj.publicMember);
        // System.out.println("Protected Member: " + obj.protectedMember); // Not accessible
        // System.out.println("Default Member: " + obj.defaultMember); // Not accessible
        // System.out.println("Private Member: " + obj.privateMember); // Not accessible
    }
}
