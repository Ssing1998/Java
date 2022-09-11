public class StringReverse {
    public static void main(String[] args) {

        //Example 1. using a hard-coded string

        String str="subrata is good boy";

        String strRev= "";

        System.out.println("String Reverse Example 1:\n");

        System.out.println("Original string: "+str);


        for (int i = 0; i < str.length(); i++) {

            char c=str.charAt(i);

            strRev=c+strRev;

        }

        //Display the value of strRev

        System.out.println("Reverse of the string: "+strRev);

        System.out.println("");

    }

}
