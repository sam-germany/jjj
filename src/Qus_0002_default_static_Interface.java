import java.sql.SQLOutput;

interface Interface1 {

    void method1(String str);

    default void log(String str){
        System.out.println("I1  logging --" + str);
    }
    static  void print(String str){
        System.out.println("Printing -- "+ str);
    }
}

 interface  Interface2 {
     void method2();

//     default  void log(String str) {
//         System.out.println("I2 logging --" + str);
//     }
}


public class Qus_0002_default_static_Interface implements  Interface1, Interface2 {

    @Override
    public void method1(String str) {
    }



    @Override
    public void method2() {
    }


    public static void main(String[] args) {
    }

}
