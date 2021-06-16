
public class Qus_0005_String_Reverse {

    public static void main(String[] args) {

//------------------------    way 1  ---------------

        String blogName1 = "java2blog";
        String reverse1 = "";
        for (int i = blogName1.length() - 1; i >= 0; i--) {
            reverse1 = reverse1 + blogName1.charAt(i);
        }
        System.out.println("Reverse of java2blog is: " + reverse1);


//------------------------    way 2  ---------------

        Qus_0005_String_Reverse rsr = new Qus_0005_String_Reverse();
        String blogName = "java2blog";
        String reverse = rsr.recursiveReverse(blogName);
        System.out.println("Reverse of java2blog is:" + reverse);
    }

    public String recursiveReverse(String orig) {
        if (orig.length() == 1)
            return orig;
        else
            return orig.charAt(orig.length() - 1) +
                    recursiveReverse(orig.substring(0, orig.length() - 1));


    }


}
