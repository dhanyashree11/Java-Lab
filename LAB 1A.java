package BM23AI058;

import java.util.Scanner;
public class Gym {
    int age;
    String name;
    boolean active;
    int duration;
    double fee;
    void calc(){
        fee=duration*50.0;
    }
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scanner=new Scanner(System.in);
        Gym g1=new Gym();
        System.out.print("Enter name:");
        g1.name=scanner.nextLine();
        System.out.print("Enter age:");
        g1.age=scanner.nextInt();
        System.out.print("Enter active status(true/false):");
        g1.active=scanner.nextBoolean();
        System.out.print("Enter duration:");
        g1.duration=scanner.nextInt();
        g1.calc();
        System.out.println("Name:"+g1.name);
        System.out.println("Age:"+g1.age);
        System.out.println("Status:"+(g1.active?"Active":"Not Active"));
        System.out.println("Fees:"+g1.fee);
        //System.out.print("\n");

        //second member
        Gym g2=new Gym();
        Scanner scanner2=new Scanner(System.in);
        System.out.print("Enter name:");
        g2.name=scanner2.nextLine();
        System.out.print("Enter age:");
        g2.age=scanner2.nextInt();
        System.out.print("Enter active status(true/false):");
        g2.active=scanner2.nextBoolean();
        System.out.print("Enter duration:");
        g2.duration=scanner2.nextInt();
        g2.calc();
        System.out.println("Name:"+g2.name);
        System.out.println("Age:"+g2.age);
        System.out.println("Status:"+(g2.active?"Active":"Not Active"));
        System.out.println("Fees:"+g2.fee);
    }
}
