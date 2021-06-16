import java.nio.charset.Charset;

public class Qus_0011_Removing_white_spaces {

    public static void main(String[] args) {

        String ss = "a b c d e";

        StringBuilder sb = new StringBuilder();

        char[] charArray = ss.toCharArray();

        for(char c : charArray) {
            if(!Character.isWhitespace(c))  {
                sb.append(c);
            }
        }
            System.out.println(sb);


    }


}
