public class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalize method called");
            // Cleanup code here
        } finally {
            super.finalize(); // Always call the superclass's finalize method
        }
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null; // Make the object eligible for garbage collection

        // Request garbage collection
        System.gc();
    }
}
