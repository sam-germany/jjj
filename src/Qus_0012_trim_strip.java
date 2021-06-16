
public class Qus_0012_trim_strip {

    public static void main(String[] args) {


        String ss = " a b c d ";

        System.out.println(ss);
        ss = ss.trim();           //  "a b c d"
        System.out.println(ss);


        String s2 = " abc ";

        System.out.println(s2);
        s2 = s2.strip();         //  "abcd"
        System.out.println(s2);
    }
}
