package D_BM23AI058;
import java.util.Scanner;
public class String_Handling {
    public static void main(String[]args){
        StringBuffer sb1=new StringBuffer();
        System.out.println("Capacity of String Buffer object sb1 :"+sb1.capacity());
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println("Capacity of String Buffer object sb1 :"+sb2.capacity());
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string :");
        String sb3in= s.nextLine();
        StringBuffer sb3in2= new StringBuffer(sb3in);
        System.out.println("reverse string in upper case "+ sb3in2.reverse().toString().toUpperCase());
        System.out.println("enter the string :");
        String ins= s.nextLine();
        sb3in2.append(ins);
        System.out.println("concatenate string :"+sb3in2);

    }

}
