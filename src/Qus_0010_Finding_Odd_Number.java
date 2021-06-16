import java.util.Arrays;
import java.util.List;

public class Qus_0010_Finding_Odd_Number {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);

// searching even numbers
        l.stream()
         .filter( x -> x %2 == 0)
         .forEach(System.out::println);

// searching odd numbers
        l.stream()
         .filter( x -> x % 2 != 0)
         .forEach(System.out::println);


// searching if any odd number is in the list

    List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9);

    boolean b =  l2.stream()
                   .anyMatch(x -> x %2 != 0);
        System.out.println(b);



    }

}
