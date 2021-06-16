import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Qus_0001_forEach_Iterable {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

// way -1
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value -- "+ i);
        }

        // way-2
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        });

        MyConsumer22 action = new MyConsumer22();
        myList.forEach(action);
    }
}
class MyConsumer22 implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println("consumer extra class-- " + t);
    }
}



