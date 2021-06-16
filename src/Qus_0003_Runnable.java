interface Interface3 {

    void method1(String str);

    default void log(String str){
        System.out.println("I1  logging --" + str);
    }

    static  void print(String str){
        System.out.println("Printing -- "+ str);
    }
}

public class Qus_0003_Runnable {

    public static void main(String[] args) {

//---------------------
    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("My Runnable 1");
        }
    };

//----------------------

    Runnable r1  = () -> {   System.out.println("My Runnable");  };

//----------------------

   Interface3 i1 = (x) -> System.out.println(x);
   i1.method1("abccccc");

    }

}
