package lesson1;

public class BooleanExamples {
    public static void main(String[] args) {
        //boolean hasShoes = true;
        //boolean isHappy = false;
        // boolean is our 3rd primitive type and can only store the values of true and false



        // comparing primitives
        System.out.println(6<7);        // 6 < 7 is a logical expression that evaluates to boolean
        System.out.println(6>7);
        System.out.println(6>=7);
        System.out.println(6<=7);
        System.out.println(6!=7);



        // comparing non-primitives
        String str = new String("Hello");
        System.out.println("Hello".equals(str));
        System.out.println(!"Hello".equals(str));

        System.out.println("Hello".compareTo(str));
        
        

    }
}
