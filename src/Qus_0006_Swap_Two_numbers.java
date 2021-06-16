

public class Qus_0006_Swap_Two_numbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swapNumbers(a, b);
    }

    static void swapNumbers(int a , int b){
        b = a + b;

        a = b - a;

        b = b - a;

        System.out.println("a = "+ a +" -- b = "+b);
    }

}
