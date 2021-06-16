
// if after dividing a number we get a reminder then it is a Prime number, if no reminder then not a Prime number
public class Qus_0007_Check_Prime_number {

    public static void main(String[] args) {

        System.out.println(isPrime(5));
    }


    public static boolean isPrime(int n){
        if(n == 0 || n == 1 ){ return  false; }

        if (n == 2 ){return  true; }

        for(int i = 2; i <= n/2; i++) {
            System.out.println(5/2);
            if(n %i ==0) {
                return  false;
            }
        }
        return true;
    }
}
/*
Note 2 is a prime number
Even means that a number is divisible by 2. As it happens, we don’t have a common word
 for the concept of numbers divisible by 3. But clearly it is pretty much the same
 property as being divisible by 2; the only difference is the specific base number
 chosen. So, isn’t it also weird that 3 is the only prime number divisible by 3? Or,
  did you know! 5 is the only prime that is divisible by 5!
 */

