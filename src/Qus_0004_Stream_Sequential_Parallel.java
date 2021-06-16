import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Qus_0004_Stream_Sequential_Parallel{

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        Stream<Integer> sequentialStream = myList.stream();

        Stream<Integer> parallelStream = myList.parallelStream();

        Stream<Integer> highNumSeq = sequentialStream.filter( x-> x > 90);
        highNumSeq.forEach( x -> System.out.println("High num Sequential -- "+x));

        System.out.println("-------------------------");

        Stream<Integer> highNums = parallelStream.filter( p -> p > 90);
        highNums.forEach( x -> System.out.println("High nums Parallel --  " +x));

        System.out.println("#+111111111111111111111");
        System.out.println("child branch- new update-222");
        System.out.println("3333333333333333333333333333333sss3333");

    }
}
