public class StringHandlingDemo {

    public static void main(String[] args) {
        // Define two strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        // Length of a string
        System.out.println("Length of str1: " + str1.length());

        // Concatenation of strings
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenation of str1 and str2: " + concatenatedString);

        // Comparison of strings (using equals method)
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);

        // Comparison of strings (using equals method)
        boolean isEqual2 = str1.equals(str3);
        System.out.println("str1 equals str3: " + isEqual2);

        // Comparison of strings (using compareTo method)
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult == 0) {
            System.out.println("str1 is equal to str2");
        } else if (comparisonResult > 0) {
            System.out.println("str1 is greater than str2");
        } else {
            System.out.println("str1 is less than str2");
        }
    }
}

