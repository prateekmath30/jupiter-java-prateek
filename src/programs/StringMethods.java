package programs;

public class StringMethods {

    public static void main(String[] args) {

        StringMethods obj = new StringMethods();
        obj.StringManipulation();
    }
    public void StringManipulation(){
        String str = "avengers assemble!";
        System.out.println(str.toUpperCase());   // coverts string to uppercase

        str = str.toLowerCase();     // coverts string to lowercase
        System.out.println(str);

        String str1 = "Thanos is coming";

        str1 = str.concat(str1);  // concats string 2 after 1
        System.out.println(str1);

        System.out.println(str1.length());   // check length of string
        System.out.println(str1.charAt(7));   // check character present at index provided

        String str3 = "Bring me Thanos";
                if(str3.startsWith("Bring")) {   // checks if string starts with said word
                    System.out.println("True");
                } else {
            System.out.println("false");
        }
                if(str3.contains("me")){        // checks if string has said word
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }

        String str4 = "Dwight K Schrute";
        String str5 = "Dwight K Schrute";

            if(str4.equals(str5)){              // checks if two strings are equal or not
                System.out.println("Both strings are equal");
            } else {
                System.out.println("Both strings are not equal");
            }

        String str12 = "Dwight K Schrute";
        String str13 = "Dwight k Schrute";

        if(str12.equalsIgnoreCase(str13)){              // checks if two strings are equal or not IGNORING CASES
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }

        String str6 = "At Jupiter";
        System.out.println(str6.substring(3,5));   // prints string from the index provided


    }
}
