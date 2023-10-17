package lesson2;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "alphabet soup";

        int len = s1.length();
        System.out.println("the length of s1 is: " + len);
        System.out.println("the length of s1 is: " + s1.length());

        

        int index = s1.indexOf("bet");
        System.out.println("the index of bet in s1 is: " + index);


        String s2 = "happy";
        System.out.println("the index of s2 in s1 is: " + s1.indexOf(s2));


        String subString1 = s1.substring(5, 8);
        String subString2 = s2.substring(1);


        System.out.println(subString1);
        System.out.println(subString2);
        System.out.println("desk".length());

    }
}
