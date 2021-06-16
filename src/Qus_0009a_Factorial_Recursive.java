public class Qus_0009a_Factorial_Recursive {

    // Factorial of 4  =  4*3*2*1 = 24
    // Factorial of 5  =  5*4*3*2*1 = 120

    static int factorial22(int n) {
        if(n == 0) {
            return 1;              // as Factorial of  zero = 1,  so we are returning here 1
        }else {
            return (n * factorial22(n-1));
        }
    }

    public static void main(String[] args) {


      int number = 5;

      int endValue = factorial22(number);

        System.out.println(endValue);

    }

}
