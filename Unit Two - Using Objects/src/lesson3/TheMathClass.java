package lesson3;

public class TheMathClass {
    public static void main(String[] args) {
        int radius = 3;
        
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println(area);

        int x = -56;
        double y = -67.36367;

        System.out.println(x);
        System.out.println(Math.abs(x));    // using the math class, WE DO NOT CREATE A MATH OBJECT
        
        System.out.println(y);
        System.out.println(Math.abs(y));

        System.out.println(Math.pow(8, 1.0/3)); // cube root of 8

        System.out.println(Math.sqrt(2));
    }
}
