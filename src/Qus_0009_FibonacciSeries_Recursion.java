
public class Qus_0009_FibonacciSeries_Recursion {

  static  int n1 = 0;
  static  int n2 = 1;
  static  int n3 = 0;

    public static void fab(int count) {  // here on every recursive call of this method it get a new "count value"

        if (count > 0) {
            System.out.print(" -("+count+")- ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
            fab(count - 1);           // main point is form here we are sending a new int value directly
        }                                  // we are not storing or updating the "int count", but we are
    }                                      // directly putting the  integer value here.

    public static void main(String[] args) {

     int  count = 10;
     System.out.print(n1 + " "+ n2);  // printing  0  and 1

     fab(count - 2);
    }





}
