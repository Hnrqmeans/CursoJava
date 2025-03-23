public class SobreString {
    public static void main(String[] args) {


        String original = "abcde FGHIJ ABC abc DEFG   ";
        /*
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        */
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println("Original: -" + original + "-");
        System.out.println("ToLowerCase: -" + original.toLowerCase() + "-");
        System.out.println("ToUpperCase: -" + original.toUpperCase() + "-");
        System.out.println("Trim: -" + original.trim() + "-");
        System.out.println("Substring(2): -" + original.substring(2) + "-");
        System.out.println("Substring(2, 9): -" + original.substring(2, 9) + "-");
        System.out.println("Replace('a', 'x'): -" + original.replace('a', 'x') + "-");
        System.out.println("Replace('abc', 'xy'): -" + original.replace("abc", "xy") + "-");
        
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);


    }
}
