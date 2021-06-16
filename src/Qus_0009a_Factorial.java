public class Qus_0009a_Factorial {

    // Factorial of 4  =  1*2*3*4 = 24
    // Factorial of 5  =  1*2*3*4*5 = 120

    public static void main(String[] args) {

        int number = 5;
        int endNumber = 1;     //as the Factorial of  zero = 1 , this is also a reason that we are taking endNumber = 1

        for( int i = 1; i <= number; i++){
            endNumber = endNumber * i;       // we also take endNumber =1 becuase if we take  endNumber =0  anything
        }                                    // multiply with zero is zero

        System.out.println(endNumber);

    }

}
