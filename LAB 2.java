package D_BM23AI058;

public class wrapper {
    public static void main(String[] args){
        Integer boxedInt=Integer.valueOf(10);
        Double boxedDouble= Double.valueOf(20.5);
        Float boxedFloat=Float.valueOf(20.3f);
        Boolean boxedBoolean=Boolean.valueOf(true);
        Character boxedCharacter=Character.valueOf('a');
        System.out.println("\nBOXED VALUES:");
        System.out.println("boxed int : "+boxedInt);
        System.out.println("boxed Double : "+boxedDouble);
        System.out.println("boxed Character : "+boxedCharacter);
        System.out.println("boxed Float : "+boxedFloat);
        System.out.println("boxed Boolean : "+boxedBoolean);
        int unboxint= boxedInt;
        double unboxdouble= boxedDouble;
        char unboxchar= boxedCharacter;
        float unboxfloat= boxedFloat;
        boolean unboxboo= boxedBoolean;
        System.out.println("\nUNBOXED VALUES : ");
        System.out.println(unboxint);
        System.out.println(unboxdouble);
        System.out.println(unboxchar);
        System.out.println(unboxfloat);
        System.out.println(unboxboo);


    }
}
