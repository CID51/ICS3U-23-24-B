package lesson1;

public class IfStatementExample {
    public static void main(String[] args) {
        boolean hasRedShoes = false;
        boolean isHappy = true;

        if(isHappy){
            System.out.println("I am glad you are happy!");
            System.out.println("Even when it is raining.");
        
        }

        System.out.println("It is raining today.");

        if (hasRedShoes)
            System.out.println("I like your red shoes!"); // if we do not put the {} the next line is the only line that is part of the if statement
        
        System.out.println("Shoes keep your feet warm");

        if(!isHappy){
            System.out.println("Sorry you are not happy!");
            System.out.println("Sometimes rain does that!");
            
        }
    }
}
