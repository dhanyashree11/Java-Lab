package D_BM23AI058;

public class String_Operations {
    public static boolean Comapre(String s1, String s2) {
        return s1.equals(s2);

    }
    public static String copy(String o){
        return new String(o);

    }
    public static String concatenate(String s1,String s2){
        return s1+s2;
    }
    public static void main(String[]args){
        String s1="Hello";
        String s2="world";
        String s3=" Dishna";
        System.out.println(Comapre(s1,s2));
        System.out.println(copy(s1));
        System.out.println(concatenate(s1,s3));
    }
}
