public class Main {
    public static void main(String[] args) {
        methodA("B");
        methodB("B");
        methodC("L");
        methodD(methodC("R"));

    }



    public static void methodA(String input) {


        if (input.equals("B")) {
            System.out.println("J");

        } else if (input.equals("D")) {

            System.out.println("V");
        } else {

            System.out.println("A");
        }
    }

    public static void methodB(String input){
        System.out.println("A");
        methodA("D");
        methodA("sjovt");

    }

    public static int methodC(String input){
     if (!input.equals("R")) {
         System.out.println("E");
     } else {
         System.out.println("R");
     }
        return 2*7;
    }

    public static void methodD(int number){
        System.out.println("S");
        if (number%2==0) {
            methodA("B");
        }
        if(number>12) {
            System.out.println("O");
            methodA("D");
        }
        System.out.println("T");
    }


    }



